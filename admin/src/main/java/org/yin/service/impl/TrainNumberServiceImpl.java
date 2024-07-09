package org.yin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yin.domain.TrainNumber;
import org.yin.mapper.TrainNumberMapper;
import org.yin.service.TrainNumberService;

/**
* @author yin82
* @description 针对表【train_number(车次信息表)】的数据库操作Service实现
* @createDate 2024-07-09 19:56:49
*/
@Service
public class TrainNumberServiceImpl extends ServiceImpl<TrainNumberMapper, TrainNumber>
    implements TrainNumberService {

}




