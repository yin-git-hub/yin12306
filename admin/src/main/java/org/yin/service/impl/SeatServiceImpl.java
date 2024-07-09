package org.yin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yin.domain.Seat;
import org.yin.mapper.SeatMapper;
import org.yin.service.SeatService;

/**
* @author yin82
* @description 针对表【t_seat(座位信息表)】的数据库操作Service实现
* @createDate 2024-07-09 19:56:17
*/
@Service
public class SeatServiceImpl extends ServiceImpl<SeatMapper, Seat>
    implements SeatService {

}




