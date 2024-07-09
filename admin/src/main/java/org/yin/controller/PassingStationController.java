package org.yin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.yin.domain.dto.PassingStationAddDTO;
import org.yin.result.BaseResponse;
import org.yin.result.ResultUtils;
import org.yin.service.PassingStationService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/passingStation")
public class PassingStationController {
    private final PassingStationService passingStationService;
    @PostMapping
    public BaseResponse add(@RequestBody PassingStationAddDTO passingStationAddDTO){
        passingStationService.add(passingStationAddDTO);
        return ResultUtils.success();
    }

    @DeleteMapping("/{id}")
    public BaseResponse remove(@PathVariable("id") Long id){
        passingStationService.removeById(id);
        return ResultUtils.success();
    }
}
