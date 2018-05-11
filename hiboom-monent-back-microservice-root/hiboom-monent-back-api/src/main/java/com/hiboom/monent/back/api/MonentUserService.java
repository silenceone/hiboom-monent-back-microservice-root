package com.hiboom.monent.back.api;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.vo.BalanceVO;
import com.hiboom.monent.back.vo.MonentUserDetailVO;
import com.hiboom.monent.back.vo.MonentUserVO;
import com.hiboom.monent.back.vo.RelatedUserVO;
import com.parent.common.restsupport.RestResponse;

import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月07日 21:39
 */
public interface MonentUserService {
    /**
     * 用户列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    RestResponse<PageInfo<MonentUserVO>> monentUserList(Integer pageNum, Integer pageSize);

    /**
     * 用户基本信息
     *
     * @param uid
     * @return
     */
    RestResponse<MonentUserDetailVO> monentUserDetail(Integer uid);

    /**
     * hi币余额
     *
     * @param uid
     * @return
     */
    RestResponse<List<BalanceVO>> hiBalanceList(Integer uid);

    /**
     * 账户余额
     *
     * @param uid
     * @return
     */
    RestResponse<List<BalanceVO>> balanceList(Integer uid);

    /**
     * 用户关联信息
     *
     * @param uid
     * @return
     */
    RestResponse<RelatedUserVO> relatedUser(Integer uid);

    /**
     * hi币充值
     *
     * @param uid
     * @param amount
     * @return
     */
    RestResponse<Integer> recharge(Integer uid, Float amount);
}
