package org.yin.controller;

import com.yin.common.BaseResponse;
import com.yin.utils.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test1")
    public BaseResponse test(){
        return ResultUtils.success("test1") ;
    }
}
