package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.HbTopic;
import com.hiboom.monent.back.vo.TopicVO;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface HbTopicMapper extends BaseMapper<HbTopic, Integer> {

    /**
     * 根据id删除，标记位删除
     *
     * @param id
     */
    void deleteById(Integer id);


    /**
     * 分页查找
     *
     * @param rowBounds
     * @return
     */
    List<TopicVO> findAllTopic(RowBounds rowBounds);
}