package com.hiboom.monent.back.api;

import com.hiboom.monent.back.entity.HbSystemUser;
import com.hiboom.monent.back.vo.SystemUserVO;
import com.parent.common.restsupport.RestResponse;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月02日 15:33
 */
public interface SystemUserService {
    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return
     */
    RestResponse<SystemUserVO> login(String username, String password);

    /**
     * 新增用户
     *
     * @param adminUser
     * @return
     */
    RestResponse<Integer> userAdd(HbSystemUser adminUser);
}
