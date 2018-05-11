package com.hiboom.monent.back.microservice.service.impl;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.hiboom.monent.back.api.FileService;
import com.parent.common.restsupport.RestResponse;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月07日 13:18
 */
@Service
public class FileServiceImpl implements FileService {
    /**
     * 图片上传阿里云域名前缀
     */
    private final static String url = "test/";
    private static final String bucketName = "hiboom";
    /**
     * 阿里云上传地址
     */
    private static final String endpoint = "http://oss-cn-beijing.aliyuncs.com";
    /**
     * 阿里云账户accessKeyId
     */
    private static final String accessKeyId = "LTAIDa6uns1FjNpB";
    /**
     * 阿里云账户secretAccessKey
     */
    private static final String secretAccessKey = "iVl9ywnVZegLPUyXBHCY82i15lGod4";
    private static final OSSClient ossClient;

    static {
        ossClient = new OSSClient(endpoint, accessKeyId, secretAccessKey);
    }

    @Override
    public RestResponse<String> uploadFile(MultipartFile file) {
        String originalName = file.getOriginalFilename();
        String newName = getFileName(FilenameUtils.getExtension(originalName));
        String path = "http://hiboom.oss-cn-beijing.aliyuncs.com/" + url + newName;
        InputStream inputStream = null;
        RestResponse<String> response = null;
        try {
            inputStream = file.getInputStream();
            ossClient.putObject(bucketName, url + newName, inputStream);
            response = new RestResponse<>(0, "", path);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return response;
    }

    /**
     * 通过原始名称获取随机名称的图片名
     */
    public static String getFileName(String ext) {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String name = simpleDateFormat.format(date);
        return name + getSixNumStr() + "." + ext;
    }

    /**
     * 获取六位数字随机数
     */
    public static String getSixNumStr() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
