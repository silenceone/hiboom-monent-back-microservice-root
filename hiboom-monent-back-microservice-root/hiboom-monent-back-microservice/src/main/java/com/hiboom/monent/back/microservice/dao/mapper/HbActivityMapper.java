package com.hiboom.monent.back.microservice.dao.mapper;


import com.hiboom.monent.back.entity.HbActivity;
import com.hiboom.monent.back.vo.ActivityVO;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface HbActivityMapper extends BaseMapper<HbActivity, Integer> {
    /**
     * 活动列表
     *
     * @param rowBounds
     * @return
     */
    List<ActivityVO> findAllActivity(RowBounds rowBounds);

    /**
     * 把状态修改成删除状态
     *
     * @param id
     */
    void deleteById(Integer id);
}