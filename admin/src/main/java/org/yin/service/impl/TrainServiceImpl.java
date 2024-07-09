package org.yin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yin.domain.Train;
import org.yin.mapper.TrainMapper;
import org.yin.service.TrainService;

/**
* @author yin82
* @description 针对表【t_train(列车信息表)】的数据库操作Service实现
* @createDate 2024-07-09 19:56:35
*/
@Service
public class TrainServiceImpl extends ServiceImpl<TrainMapper, Train>
    implements TrainService {

}




