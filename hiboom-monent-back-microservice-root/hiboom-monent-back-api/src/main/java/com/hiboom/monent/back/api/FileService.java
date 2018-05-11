package com.hiboom.monent.back.api;

import com.parent.common.restsupport.RestResponse;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月07日 13:18
 */
public interface FileService {
    RestResponse<String> uploadFile(MultipartFile file);
}
