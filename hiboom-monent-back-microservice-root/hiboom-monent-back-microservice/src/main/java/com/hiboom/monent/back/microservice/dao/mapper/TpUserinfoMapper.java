package com.hiboom.monent.back.microservice.dao.mapper;

import com.hiboom.monent.back.entity.TpUserinfo;
import com.hiboom.monent.back.vo.MonentUserDetailVO;
import com.hiboom.monent.back.vo.MonentUserVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TpUserinfoMapper extends BaseMapper<TpUserinfo, Integer> {

    /**
     * 用户列表分页
     *
     * @param rowBounds
     * @return
     */
    List<MonentUserVO> findAll(RowBounds rowBounds);

    /**
     * 用户基本信息
     *
     * @param uid
     * @return
     */
    MonentUserDetailVO getUserDetail(Integer uid);

    /**
     * 邀请人hi明细列表
     *
     * @param uid
     * @return
     */
    List findOrderDetail(Integer uid);

    /**
     * 充值
     *
     * @param uid
     * @param amount
     */
    void recharge(@Param("uid") Integer uid,@Param("amount") Float amount);
}