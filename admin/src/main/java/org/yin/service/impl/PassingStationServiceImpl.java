package org.yin.service.impl;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.yin.domain.PassingStation;
import org.yin.domain.dto.PassingStationAddDTO;
import org.yin.mapper.PassingStationMapper;
import org.yin.service.PassingStationService;

/**
* @author yin82
* @description 针对表【passing_station(途径车站信息表)】的数据库操作Service实现
* @createDate 2024-07-09 19:56:02
*/
@Service
@RequiredArgsConstructor
public class PassingStationServiceImpl extends ServiceImpl<PassingStationMapper, PassingStation>
    implements PassingStationService {

    final PassingStationMapper passingStationMapper;

    @Override
    public void add(PassingStationAddDTO passingStationAddDTO) {
        PassingStation passingStation = new PassingStation();
        BeanUtil.copyProperties(passingStationAddDTO,passingStation);
        passingStationMapper.insert(passingStation);
    }
}




