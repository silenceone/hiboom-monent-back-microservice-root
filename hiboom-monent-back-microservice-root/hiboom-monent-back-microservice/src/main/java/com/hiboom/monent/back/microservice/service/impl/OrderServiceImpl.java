package com.hiboom.monent.back.microservice.service.impl;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.OrderService;
import com.hiboom.monent.back.entity.HbActivityTemplate;
import com.hiboom.monent.back.microservice.dao.mapper.HbOrderMapper;
import com.hiboom.monent.back.vo.ActivityTemplateVO;
import com.hiboom.monent.back.vo.OrderVO;
import com.parent.common.restsupport.RestResponse;
import com.parent.common.utils.DateUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月10日 10:38
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private HbOrderMapper hbOrderMapper;

    /**
     * 订单列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public RestResponse<PageInfo<OrderVO>> orderList(Integer pageNum, Integer pageSize) {
        RowBounds rowBounds = new RowBounds(pageNum  * pageSize, pageSize);
        List<OrderVO> orderList = hbOrderMapper.findAllOrder(rowBounds);
        PageInfo<OrderVO> pageInfo = new PageInfo<>(orderList);
        Integer total = hbOrderMapper.countAll();
        pageInfo.setOrderBy("id");
        Integer pages;
        if (total % pageSize == 0) {
            pages = total / pageSize;
        } else {
            pages = total / pageSize + 1;
        }
        pageInfo.setTotal(total);
        pageInfo.setPages(pages);
        RestResponse<PageInfo<OrderVO>> response = new RestResponse(0, "", pageInfo);
        return response;
    }
}
