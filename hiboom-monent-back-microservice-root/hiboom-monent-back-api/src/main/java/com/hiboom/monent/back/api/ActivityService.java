package com.hiboom.monent.back.api;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.vo.ActivityDetailVO;
import com.hiboom.monent.back.vo.ActivityVO;
import com.parent.common.restsupport.RestResponse;

/**
 * @author wujj
 * @version 3.0
 * @Description:
 * @date 2018年04月28日 16:46
 */
public interface ActivityService {

    /**
     * 活动列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    RestResponse<PageInfo<ActivityVO>> activityList(Integer pageNum, Integer pageSize);

    /**
     * 活动详情
     *
     * @param id
     * @return
     */
    RestResponse<ActivityDetailVO> activityDetail(Integer id);

    /**
     * 活动删除
     *
     * @param id
     * @return
     */
    RestResponse<Integer> activityDelete(Integer id);
}
