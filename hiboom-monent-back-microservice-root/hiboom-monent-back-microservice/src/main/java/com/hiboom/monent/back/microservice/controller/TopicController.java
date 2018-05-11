package com.hiboom.monent.back.microservice.controller;

import com.github.pagehelper.PageInfo;
import com.hiboom.monent.back.api.TopicService;
import com.hiboom.monent.back.form.TopicForm;
import com.hiboom.monent.back.form.TopicVoiceForm;
import com.hiboom.monent.back.vo.TopicVO;
import com.parent.common.restsupport.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wujj
 * @version 1.0
 * @Description:
 * @date 2018年05月01日 21:28
 */
@Api(tags = "TopicController", description = "话题管理")
@RestController
@RequestMapping("/topic")
public class TopicController {
    @Autowired
    private TopicService topicService;

    /**
     * 话题列表
     *
     * @return
     */
    @GetMapping(value = "/list", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "话题列表", notes = "话题列表", code = 200, produces = "application/json")
    public RestResponse<PageInfo<TopicVO>> topicList(@RequestParam(value = "p", defaultValue = "1") Integer pageNum,
                                                     @RequestParam(value = "ps", defaultValue = "10") Integer pageSize) {
        pageNum = pageNum - 1;
        return topicService.topicList(pageNum, pageSize);
    }

    /**
     * 新增话题
     *
     * @return
     */
    @PostMapping(value = "/add", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "新增话题", notes = "新增话题", code = 200, produces = "application/json")
    public RestResponse<Integer> topicAdd(@RequestBody TopicForm topicForm) {
        return topicService.topicAdd(topicForm);
    }

    /**
     * 修改话题
     *
     * @param topicForm
     * @return
     */
    @PutMapping(value = "/edit", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "修改话题", notes = "修改话题", code = 200, produces = "application/json")
    public RestResponse<Integer> topicEdit(@RequestBody TopicForm topicForm) {
        return topicService.topicEdit(topicForm);
    }

    /**
     * 删除话题
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "删除话题", notes = "删除话题", code = 200, produces = "application/json")
    public RestResponse<Integer> topicDelete(@PathVariable Integer id) {
        return topicService.topicDelete(id);
    }

    /**
     * 留言添加标签
     *
     * @param topicVoiceForm
     * @return
     */
    @PutMapping(value = "/voice/lable", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "留言添加标签", notes = "留言添加标签", code = 200, produces = "application/json")
    public RestResponse<Integer> voiceLable(@RequestBody TopicVoiceForm topicVoiceForm) {
        return topicService.voiceLable(topicVoiceForm);
    }

    /**
     * 留言置顶
     *
     * @param tid
     * @param vid
     * @return
     */
    @PutMapping(value = "/voice/{tid}/{vid}", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "留言置顶", notes = "留言置顶", code = 200, produces = "application/json")
    public RestResponse<Integer> voiceTop(@PathVariable("tid") Integer tid, @PathVariable("vid") Integer vid) {
        return topicService.voiceTop(tid, vid);
    }

    /**
     * 删除留言
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/voice/{id}", produces = "application/json; charset=utf-8")
    @ApiOperation(value = "删除留言", notes = "删除留言", code = 200, produces = "application/json")
    public RestResponse<Integer> voiceDelete(@PathVariable Integer id) {
        return topicService.voiceDelete(id);
    }

}
