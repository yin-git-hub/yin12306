package org.yin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yin.domain.Station;
import org.yin.mapper.StationMapper;
import org.yin.service.StationService;

/**
* @author yin82
* @description 针对表【t_station(车站信息表)】的数据库操作Service实现
* @createDate 2024-07-09 19:56:26
*/
@Service
public class StationServiceImpl extends ServiceImpl<StationMapper, Station>
    implements StationService{

}




