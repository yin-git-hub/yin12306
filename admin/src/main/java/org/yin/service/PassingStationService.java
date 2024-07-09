package org.yin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.yin.domain.PassingStation;
import org.yin.domain.dto.PassingStationAddDTO;

/**
* @author yin82
* @description 针对表【passing_station(途径车站信息表)】的数据库操作Service
* @createDate 2024-07-09 19:56:02
*/
public interface PassingStationService extends IService<PassingStation> {

    void add(PassingStationAddDTO passingStationAddVO);
}
