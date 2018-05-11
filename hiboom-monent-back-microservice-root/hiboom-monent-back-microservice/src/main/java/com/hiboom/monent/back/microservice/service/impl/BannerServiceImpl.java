package com.hiboom.monent.back.microservice.service.impl;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.BannerService;
import com.hiboom.monent.back.entity.HbBanners;
import com.hiboom.monent.back.form.BannerForm;
import com.hiboom.monent.back.microservice.dao.mapper.HbBannersMapper;
import com.hiboom.monent.back.microservice.exceptionhandler.MonentBackExceptionConstant;
import com.hiboom.monent.back.vo.BannerVO;
import com.parent.common.exception.BIException;
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
 * @date 2018年05月02日 10:59
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private HbBannersMapper hbBannersMapper;

    /**
     * banner列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public RestResponse<PageInfo<BannerVO>> bannerList(Integer pageNum, Integer pageSize) {
        RowBounds rowBounds = new RowBounds(pageNum * pageSize, pageSize);
        List<HbBanners> hbBannersList = hbBannersMapper.findAll(null, rowBounds);
        List<BannerVO> bannerList = new ArrayList<>();
        for (HbBanners hbBanners : hbBannersList) {
            BannerVO bannerVO = new BannerVO();
            bannerVO.setCtime(DateUtil.convertIntDateTimeToString(hbBanners.getCtime()));
            BeanUtils.copyProperties(hbBanners, bannerVO);
            if (hbBanners.getDetailImg() != null && !"".equals(hbBanners.getDetailImg())) {
                String[] detailImg = hbBanners.getDetailImg().split(";");
                bannerVO.setDetailImg(detailImg);
            }

            bannerList.add(bannerVO);
        }
        PageInfo<BannerVO> pageInfo = new PageInfo<>(bannerList);
        Integer total = hbBannersMapper.countAll();
        pageInfo.setOrderBy("id");
        Integer pages;
        if (total % pageSize == 0) {
            pages = total / pageSize;
        } else {
            pages = total / pageSize + 1;
        }
        pageInfo.setTotal(total);
        pageInfo.setPages(pages);
        RestResponse<PageInfo<BannerVO>> response = new RestResponse(0, "", pageInfo);
        return response;
    }

    /**
     * banner新增
     *
     * @param bannerForm
     * @return
     */
    @Override
    public RestResponse<Integer> bannerAdd(BannerForm bannerForm) {
        if (bannerForm == null) {
            throw new BIException(BIException.DATA_EMPTY);
        }
        //标题为空
        if (bannerForm.getTitle() == null || "".equals(bannerForm.getTitle())) {
            throw new BIException(MonentBackExceptionConstant.BANNER_TITLE_EMPTY);
        }
        //图片为空
        if (bannerForm.getImg() == null || "".equals(bannerForm.getImg())) {
            throw new BIException(MonentBackExceptionConstant.BANNER_IMG_EMPTY);
        }
        //详情为空
        if ((bannerForm.getDetailImg() == null || "".equals(bannerForm.getDetailImg()))
                && (bannerForm.getJumpUrl() == null || "".equals(bannerForm.getJumpUrl()))) {
            throw new BIException(MonentBackExceptionConstant.BANNER_CONTEN_EMPTY);
        }
        HbBanners hbBanner = new HbBanners();
        StringBuffer detailImg = new StringBuffer();
        if (bannerForm.getDetailImg() != null && bannerForm.getDetailImg().length > 0) {
            for (String s : bannerForm.getDetailImg()) {
                detailImg.append(s);
                detailImg.append(";");
            }
        }
        hbBanner.setDetailImg(detailImg.substring(0, detailImg.length() - 1).toString());
        BeanUtils.copyProperties(bannerForm, hbBanner);
        hbBanner.setCtime(DateUtil.toNowTimestamp());
        try {
            hbBannersMapper.insert(hbBanner);
        } catch (Exception e) {
            e.printStackTrace();
        }

        RestResponse<Integer> response = new RestResponse(0, "", hbBanner.getId());
        return response;
    }

    /**
     * banner修改
     *
     * @param bannerForm
     * @return
     */
    @Override
    public RestResponse<Integer> bannerEdit(BannerForm bannerForm) {
        HbBanners hbBanner = new HbBanners();
        StringBuffer detailImg = new StringBuffer();
        if (bannerForm.getDetailImg() != null && bannerForm.getDetailImg().length > 0) {
            for (String s : bannerForm.getDetailImg()) {
                detailImg.append(s);
                detailImg.append(";");
            }
        }
        hbBanner.setDetailImg(detailImg.substring(0, detailImg.length() - 1).toString());
        BeanUtils.copyProperties(bannerForm, hbBanner);
        hbBannersMapper.update(hbBanner);
        RestResponse<Integer> response = new RestResponse(0, "", hbBanner.getId());
        return response;
    }

    /**
     * banner删除
     *
     * @param id
     * @return
     */
    @Override
    public RestResponse<Integer> bannerDelte(Integer id) {
        hbBannersMapper.deleteById(id);
        RestResponse<Integer> response = new RestResponse(0, "", id);
        return response;
    }
}
