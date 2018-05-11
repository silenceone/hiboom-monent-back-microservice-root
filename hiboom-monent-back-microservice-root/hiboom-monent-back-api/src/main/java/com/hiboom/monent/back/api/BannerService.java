package com.hiboom.monent.back.api;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.form.BannerForm;
import com.hiboom.monent.back.vo.BannerVO;
import com.parent.common.restsupport.RestResponse;

import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 10:59
 */
public interface BannerService {
    /**
     * banner列表
     *
     * @return
     * @param pageNum
     * @param pageSize
     */
    RestResponse<PageInfo<BannerVO>> bannerList(Integer pageNum, Integer pageSize);

    /**
     * banner新增
     *
     * @return
     */
    RestResponse<Integer> bannerAdd(BannerForm bannerForm);

    /**
     * banner修改
     *
     * @param bannerForm
     * @return
     */
    RestResponse<Integer> bannerEdit(BannerForm bannerForm);

    /**
     * banner删除
     *
     * @param id
     * @return
     */
    RestResponse<Integer> bannerDelte(Integer id);
}
