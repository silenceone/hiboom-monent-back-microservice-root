package com.hiboom.monent.back.microservice.controller;

import com.hiboom.monent.back.api.FileService;
import com.hiboom.monent.back.api.LabelService;
import com.hiboom.monent.back.api.VoiceTemplateService;
import com.hiboom.monent.back.excel.ExcelLabel;
import com.hiboom.monent.back.excel.ExcelVoiceTemplate;
import com.parent.common.excel.ExcelUtil;
import com.parent.common.excel.IRowCallback;
import com.parent.common.exception.BIException;
import com.parent.common.restsupport.RestResponse;
import com.parent.common.utils.FileUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月07日 13:12
 */
@Api(tags = "FileController", description = "上传文件管理")
@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileService fileService;
    @Autowired
    private LabelService labelService;
    @Autowired
    private VoiceTemplateService voiceTemplateService;

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    @PostMapping("/upload")
    @ApiOperation(value = "上传文件", notes = "上传文件", code = 200, produces = "application/json")
    public RestResponse<String> uploadFile(@RequestParam("file") MultipartFile file) {
        System.out.println(file.getOriginalFilename());
        if (StringUtils.isEmpty(file.getOriginalFilename())) {
            throw new BIException(BIException.DATA_EMPTY);
        }
        return fileService.uploadFile(file);
    }

    /**
     * 标签导入
     *
     * @param multipart
     * @param request
     * @param response
     * @return
     */
    @PostMapping(value = "/import/label")
    @ResponseBody
    @ApiOperation(value = "标签导入", notes = "标签导入", code = 200, produces = "application/json")
    public RestResponse<String> importLabelExcel(@RequestParam("file") MultipartFile multipart,
                                                 HttpServletRequest request, HttpServletResponse response) {
        if (multipart == null) {
            throw new BIException(BIException.LESS_PARAMETERS, "文件为空");
        }
        // 判断文件是否为空
        File file = null;
        if (!multipart.isEmpty()) {
            try {
                String fileName = multipart.getOriginalFilename();
                String extension = FileUtil.getExtensionName("." + fileName);
                String filePath = UUID.randomUUID().toString().replace("-", "")
                        + ((extension != null) ? "." + extension : "");
                file = new File(filePath);
                FileUtils.copyInputStreamToFile(multipart.getInputStream(), file);

                List<ExcelLabel> list = ExcelUtil.importList(filePath, 3, ExcelLabel.class, new IRowCallback<ExcelLabel>() {
                    @Override
                    public void doCallback(Row row, ExcelLabel excelLabel) {

                    }
                });
                labelService.importExcel(list);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                file.delete();
            }
        }
        RestResponse<String> successResponse = new RestResponse<>(0, "", "");
        return successResponse;
    }


    /**
     * 标签导出
     *
     * @param response
     * @throws Exception
     */
    @GetMapping(value = "/export/label")
    @ApiOperation(value = "标签导出", notes = "标签导出", code = 200, produces = "application/json")
    public void exportLabel(HttpServletResponse response) throws Exception {
        List<ExcelLabel> list = labelService.exportExcel();
        OutputStream outputStream = null;
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + new String("label.xls".getBytes("utf-8"), "ISO8859-1"));
            outputStream = response.getOutputStream();
            ExcelUtil.export(new String[]{"标签列表"}, ExcelLabel.class, list, outputStream, "zh");
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 标签导出模版
     *
     * @param response
     * @throws Exception
     */
    @GetMapping(value = "/export/label/model")
    @ApiOperation(value = "标签导出模版", notes = "标签导出模版", code = 200, produces = "application/json")
    public void exportLabelModel(HttpServletResponse response) throws Exception {
        OutputStream outputStream = null;
        try {
            List<ExcelLabel> list = new ArrayList<>();
            ExcelLabel excelLabel = new ExcelLabel();
            excelLabel.setLabel("我是测试模版");
            list.add(excelLabel);
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + new String("label.xls".getBytes("utf-8"), "ISO8859-1"));
            outputStream = response.getOutputStream();
            ExcelUtil.export(new String[]{"标签列表"}, ExcelLabel.class, list, outputStream, "zh");
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 语言提醒导入
     *
     * @param multipart
     * @param request
     * @param response
     * @return
     */
    @PostMapping(value = "/import/voice")
    @ResponseBody
    @ApiOperation(value = "语言提醒导入", notes = "语言提醒导入", code = 200, produces = "application/json")
    public RestResponse<String> importVoiceExcel(@RequestParam("file") MultipartFile multipart,
                                                 HttpServletRequest request, HttpServletResponse response) {
        if (multipart == null) {
            throw new BIException(BIException.LESS_PARAMETERS, "文件为空");
        }
        // 判断文件是否为空
        File file = null;
        if (!multipart.isEmpty()) {
            try {
                String fileName = multipart.getOriginalFilename();
                String extension = FileUtil.getExtensionName("." + fileName);
                String filePath = UUID.randomUUID().toString().replace("-", "")
                        + ((extension != null) ? "." + extension : "");
                file = new File(filePath);
                FileUtils.copyInputStreamToFile(multipart.getInputStream(), file);

                List<ExcelVoiceTemplate> list = ExcelUtil.importList(filePath, 3, ExcelVoiceTemplate.class, new IRowCallback<ExcelVoiceTemplate>() {
                    @Override
                    public void doCallback(Row row, ExcelVoiceTemplate excelVoiceTemplate) {

                    }
                });
                voiceTemplateService.importExcel(list);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                file.delete();
            }
        }
        RestResponse<String> successResponse = new RestResponse<>(0, "", "");
        return successResponse;
    }


    /**
     * 语音提醒导出
     *
     * @param response
     * @throws Exception
     */
    @GetMapping(value = "/export/voice")
    @ApiOperation(value = "语音提醒导出", notes = "语音提醒导出", code = 200, produces = "application/json")
    public void exportVoice(HttpServletResponse response) throws Exception {
        List<ExcelVoiceTemplate> list = voiceTemplateService.exportExcel();
        OutputStream outputStream = null;
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + new String("voice.xls".getBytes("utf-8"), "ISO8859-1"));
            outputStream = response.getOutputStream();
            ExcelUtil.export(new String[]{"语音列表"}, ExcelVoiceTemplate.class, list, outputStream, "zh");
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 语音提醒导出模版
     *
     * @param response
     * @throws Exception
     */
    @GetMapping(value = "/export/voice/model")
    @ApiOperation(value = "语音提醒导出模版", notes = "语音提醒导出模版", code = 200, produces = "application/json")
    public void exportVoiceModel(HttpServletResponse response) throws Exception {
        OutputStream outputStream = null;
        try {
            List<ExcelVoiceTemplate> list = new ArrayList<>();
            ExcelVoiceTemplate excelVoiceTemplate = new ExcelVoiceTemplate();
            excelVoiceTemplate.setContent("我是测试语音模版");
            list.add(excelVoiceTemplate);
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition",
                    "attachment;filename=" + new String("voice.xls".getBytes("utf-8"), "ISO8859-1"));
            outputStream = response.getOutputStream();
            ExcelUtil.export(new String[]{"语音列表"}, ExcelVoiceTemplate.class, list, outputStream, "zh");
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
