package com.hiboom.monent.back.microservice.service.impl;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.TopicService;
import com.hiboom.monent.back.entity.HbCustomerDynamic;
import com.hiboom.monent.back.entity.HbTopic;
import com.hiboom.monent.back.form.TopicForm;
import com.hiboom.monent.back.form.TopicVoiceForm;
import com.hiboom.monent.back.microservice.dao.mapper.HbCustomerDynamicMapper;
import com.hiboom.monent.back.microservice.dao.mapper.HbTopicMapper;
import com.hiboom.monent.back.vo.TopicVO;
import com.parent.common.restsupport.RestResponse;
import com.parent.common.utils.DateUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月01日 21:30
 */
@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private HbTopicMapper hbTopicMapper;
    @Autowired
    private HbCustomerDynamicMapper hbCustomerDynamicMapper;

    /**
     * 获取话题列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public RestResponse<PageInfo<TopicVO>> topicList(Integer pageNum, Integer pageSize) {
        RowBounds rowBounds = new RowBounds(pageNum * pageSize, pageSize);
        List<TopicVO> topicList = hbTopicMapper.findAllTopic(rowBounds);
        PageInfo<TopicVO> pageInfo = new PageInfo<>(topicList);
        Integer total = hbTopicMapper.countAll();
        pageInfo.setOrderBy("id");
        Integer pages;
        if (total % pageSize == 0) {
            pages = total / pageSize;
        } else {
            pages = total / pageSize + 1;
        }
        pageInfo.setTotal(total);
        pageInfo.setPages(pages);
        RestResponse<PageInfo<TopicVO>> response = new RestResponse(0, "", pageInfo);
        return response;
    }

    /**
     * 新增话题
     *
     * @param topicForm
     * @return
     */
    @Override
    public RestResponse<Integer> topicAdd(TopicForm topicForm) {
        HbTopic hbTopic = new HbTopic();
        hbTopic.setTopicName(topicForm.getTitle());
        hbTopic.setTopicContent(topicForm.getContent());
        hbTopic.setTopicPath(topicForm.getCoverImg());
        hbTopic.setCtime(DateUtil.toNowTimestamp());
        hbTopicMapper.insert(hbTopic);
        RestResponse<Integer> response = new RestResponse(0, "", hbTopic.getId());
        return response;
    }

    /**
     * 修改话题
     *
     * @param topicForm
     * @return
     */
    @Override
    public RestResponse<Integer> topicEdit(TopicForm topicForm) {
        HbTopic hbTopic = new HbTopic();
        hbTopic.setId(topicForm.getId());
        hbTopic.setTopicName(topicForm.getTitle());
        hbTopic.setTopicContent(topicForm.getContent());
        hbTopic.setTopicPath(topicForm.getCoverImg());
        hbTopic.setCtime((int) (System.currentTimeMillis() / 1000));
        hbTopicMapper.update(hbTopic);
        RestResponse<Integer> response = new RestResponse(0, "", hbTopic.getId());
        return response;
    }

    /**
     * 删除话题
     *
     * @param id
     * @return
     */
    @Override
    public RestResponse<Integer> topicDelete(Integer id) {
        hbTopicMapper.deleteById(id);
        RestResponse<Integer> response = new RestResponse(0, "", id);
        return response;
    }

    /**
     * 留言添加标签
     *
     * @param topicVoiceForm
     * @return
     */
    @Override
    public RestResponse<Integer> voiceLable(TopicVoiceForm topicVoiceForm) {
        HbCustomerDynamic hbCustomerDynamic = new HbCustomerDynamic();
        hbCustomerDynamic.setId(topicVoiceForm.getId());
        hbCustomerDynamic.setLabel(topicVoiceForm.getLabel());
        hbCustomerDynamicMapper.update(hbCustomerDynamic);
        RestResponse<Integer> response = new RestResponse(0, "", topicVoiceForm.getId());
        return response;
    }

    /**
     * 留言置顶
     *
     * @param tid
     * @param vid
     * @return
     */
    @Override
    public RestResponse<Integer> voiceTop(Integer tid, Integer vid) {
        HbCustomerDynamic hbCustomerDynamic = new HbCustomerDynamic();
        hbCustomerDynamic.setId(vid);
        hbCustomerDynamic.setIsTop(1);
        //把原来置顶标签置0
        hbCustomerDynamicMapper.updateNoTop(tid);
        //置顶现在留言
        hbCustomerDynamicMapper.update(hbCustomerDynamic);
        RestResponse<Integer> response = new RestResponse(0, "", vid);
        return response;
    }

    /**
     * 删除留言
     *
     * @param id
     * @return
     */
    @Override
    public RestResponse<Integer> voiceDelete(Integer id) {
        hbCustomerDynamicMapper.deleteById(id);
        RestResponse<Integer> response = new RestResponse(0, "", id);
        return response;
    }

}
