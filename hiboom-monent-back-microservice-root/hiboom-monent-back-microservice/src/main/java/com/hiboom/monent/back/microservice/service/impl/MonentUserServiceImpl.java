package com.hiboom.monent.back.microservice.service.impl;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.MonentUserService;
import com.hiboom.monent.back.microservice.dao.mapper.HbCustomerLikeMapper;
import com.hiboom.monent.back.microservice.dao.mapper.HbOrderMapper;
import com.hiboom.monent.back.microservice.dao.mapper.TpUserinfoMapper;
import com.hiboom.monent.back.microservice.exceptionhandler.MonentBackExceptionConstant;
import com.hiboom.monent.back.vo.*;
import com.parent.common.exception.BIException;
import com.parent.common.restsupport.RestResponse;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月07日 21:39
 */
@Service
public class MonentUserServiceImpl implements MonentUserService {

    @Autowired
    private TpUserinfoMapper tpUserinfoMapper;
    @Autowired
    private HbCustomerLikeMapper hbCustomerLikeMapper;
    @Autowired
    private HbOrderMapper hbOrderMapper;

    /**
     * 用户列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public RestResponse<PageInfo<MonentUserVO>> monentUserList(Integer pageNum, Integer pageSize) {
        RowBounds rowBounds = new RowBounds(pageNum * pageSize, pageSize);
        List<MonentUserVO> monentUserVOList = tpUserinfoMapper.findAll(rowBounds);

        PageInfo<MonentUserVO> pageInfo = new PageInfo<>(monentUserVOList);
        Integer total = tpUserinfoMapper.countAll();
        pageInfo.setOrderBy("id");
        Integer pages;
        if (total % pageSize == 0) {
            pages = total / pageSize;
        } else {
            pages = total / pageSize + 1;
        }
        pageInfo.setTotal(total);
        pageInfo.setPages(pages);
        RestResponse<PageInfo<MonentUserVO>> response = new RestResponse(0, "", pageInfo);
        return response;

    }

    /**
     * 用户基本信息
     *
     * @param uid
     * @return
     */
    @Override
    public RestResponse<MonentUserDetailVO> monentUserDetail(Integer uid) {
        if (uid == null) {
            throw new BIException(BIException.DATA_EMPTY);
        }
        MonentUserDetailVO monentUserDetailVO = tpUserinfoMapper.getUserDetail(uid);
        if (monentUserDetailVO == null) {
            throw new BIException(MonentBackExceptionConstant.USER_NOT_EXIST);
        }
        RestResponse<MonentUserDetailVO> response = new RestResponse(0, "", monentUserDetailVO);
        return response;
    }

    /**
     * hi币交易明细
     *
     * @param uid
     * @return
     */
    @Override
    public RestResponse<List<BalanceVO>> hiBalanceList(Integer uid) {
        List orderList = tpUserinfoMapper.findOrderDetail(uid);
        return null;
    }

    /**
     * 账户明细
     *
     * @param uid
     * @return
     */
    @Override
    public RestResponse<List<BalanceVO>> balanceList(Integer uid) {
        return null;
    }

    /**
     * 用户关联信息
     *
     * @param uid
     * @return
     */
    @Override
    public RestResponse<RelatedUserVO> relatedUser(Integer uid) {
        if (uid == null || uid == 0) {
            throw new BIException(BIException.DATA_EMPTY);
        }
        RelatedUserVO relatedUserVO = new RelatedUserVO();
        //关注我的人
        List<Integer> beCareAboutList = hbCustomerLikeMapper.findbeCares(uid);
        relatedUserVO.setBeCareAboutList(beCareAboutList);

        //我关注的人
        List<Integer> careAboutList = hbCustomerLikeMapper.findCares(uid);
        relatedUserVO.setCareAboutList(careAboutList);

        //我租过的人
        List<Integer> rentList = hbOrderMapper.findRents(uid);
        relatedUserVO.setRentList(rentList);

        //租过我的人
        List<Integer> beRentList=hbOrderMapper.findbeRents(uid);
        relatedUserVO.setBeRentList(beRentList);

        RestResponse<RelatedUserVO> response = new RestResponse(0, "", relatedUserVO);
        return response;
    }

    /**
     * hi币充值
     *
     * @param uid
     * @param amount
     * @return
     */
    @Override
    public RestResponse<Integer> recharge(Integer uid, Float amount) {
        tpUserinfoMapper.recharge(uid, amount);
        RestResponse<Integer> response = new RestResponse(0, "", uid);
        return response;
    }
}
