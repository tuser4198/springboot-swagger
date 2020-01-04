package com.demo.controller;

import com.demo.vo.TestParam;
import com.demo.vo.TestResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 云若
 * @date: 2018/8/30
 */
@RestController
@Api(value = "test相关接口", description = "test")
public class TestController {

    @ApiOperation(value = "test接口", notes = "test接口", response = TestResp.class)
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public TestResp test(@RequestBody TestParam testParam) {
        return new TestResp();
    }
}
