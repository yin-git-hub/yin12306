package org.yin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yin.result.BaseResponse;
import org.yin.result.ResultUtils;

@RestController
public class TTest {
    @GetMapping("/test")
    public BaseResponse test(){
        return ResultUtils.success();
    }
}
