package com.demo.hello;

import com.demo.test.TestResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "hello相关接口", description = "hello")
public class HelloController {

    @ApiOperation(value = "欢迎接口", notes = "欢迎接口",response = TestResp.class)
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public TestResp hello(@ApiParam(value = "hello", required = true)
            @RequestParam(required = true)String index,@ApiParam(value = "hello", required = true)
    @RequestParam(required = true)String index2) {
        return new TestResp();
    }

}