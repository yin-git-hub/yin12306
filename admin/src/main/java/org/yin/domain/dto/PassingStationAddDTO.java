package org.yin.domain.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PassingStationAddDTO {

    /**
     * 车次ID，与train_number表中的train_id对应
     */
    @TableField(value = "train_number_id")
    private Long trainNumberId;

    /**
     * 站序
     */
    @TableField(value = "station_number")
    private Integer stationNumber;

    /**
     * 车站ID
     */
    @TableField(value = "station_id")
    private Long stationId;

    /**
     * 驶入时间
     */
    @TableField(value = "entry_time")
    private LocalDateTime entryTime;

    /**
     * 驶出时间
     */
    @TableField(value = "departure_time")
    private LocalDateTime departureTime;

    /**
     * 停留时间
     */
    @TableField(value = "residence_time")
    private LocalDateTime residenceTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
