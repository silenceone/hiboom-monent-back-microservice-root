package com.hiboom.monent.back.api;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.form.TopicForm;
import com.hiboom.monent.back.form.TopicVoiceForm;
import com.hiboom.monent.back.vo.TopicVO;
import com.parent.common.restsupport.RestResponse;

import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月01日 21:28
 */
public interface TopicService {
    /**
     * 获取话题列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    RestResponse<PageInfo<TopicVO>> topicList(Integer pageNum, Integer pageSize);

    /**
     * 新增话题
     *
     * @param topicForm
     * @return
     */
    RestResponse<Integer> topicAdd(TopicForm topicForm);

    /**
     * 修改话题
     *
     * @param topicForm
     * @return
     */
    RestResponse<Integer> topicEdit(TopicForm topicForm);

    /**
     * 删除话题
     *
     * @param id
     * @return
     */
    RestResponse<Integer> topicDelete(Integer id);

    /**
     * 留言添加标签
     *
     * @param topicVoiceForm
     * @return
     */
    RestResponse<Integer> voiceLable(TopicVoiceForm topicVoiceForm);

    /**
     * 留言置顶
     *
     * @param tid
     * @param vid
     * @return
     */
    RestResponse<Integer> voiceTop(Integer tid, Integer vid);

    /**
     * 删除留言
     *
     * @param id
     * @return
     */
    RestResponse<Integer> voiceDelete(Integer id);
}
