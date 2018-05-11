package com.hiboom.monent.back.api;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.vo.OrderVO;
import com.parent.common.restsupport.RestResponse;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月10日 10:38
 */
public interface OrderService {
    /**
     * 订单列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    RestResponse<PageInfo<OrderVO>> orderList(Integer pageNum, Integer pageSize);
}
