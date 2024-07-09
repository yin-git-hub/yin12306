package org.yin.controller;


import org.yin.result.BaseResponse;
import org.yin.result.ResultUtils;
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
