package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.HbOrder;
import com.hiboom.monent.back.vo.OrderVO;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface HbOrderMapper extends BaseMapper<HbOrder, Integer> {

    /**
     * 查询所有订单
     *
     * @param rowBounds
     * @return
     */
    List<OrderVO> findAllOrder(RowBounds rowBounds);

    /**
     * 我租过的人
     *
     * @param uid
     * @return
     */
    List<Integer> findRents(Integer uid);

    /**
     * 租过我的人
     * @param uid
     * @return
     */
    List<Integer> findbeRents(Integer uid);
}