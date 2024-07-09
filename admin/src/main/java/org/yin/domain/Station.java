package org.yin.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 车站信息表
 * @TableName t_station
 */
@TableName(value ="t_station")
@Data
public class Station implements Serializable {
    /**
     * 车站ID，主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 城市ID，外键引用cities表的id字段
     */
    @TableField(value = "city_id")
    private Long cityId;

    /**
     * 城市名称
     */
    @TableField(value = "city_name")
    private String cityName;

    /**
     * 车站名
     */
    @TableField(value = "station_name")
    private String stationName;

    /**
     * 候车厅ID，外键引用waiting_halls表的id字段（如果有的话）
     */
    @TableField(value = "waiting_hall_id")
    private Long waitingHallId;

    /**
     * 候车厅名称
     */
    @TableField(value = "waiting_hall_name")
    private String waitingHallName;

    /**
     * 站台ID，外键引用platforms表的id字段（如果有的话）
     */
    @TableField(value = "platform_id")
    private Long platformId;

    /**
     * 站台名称
     */
    @TableField(value = "platform_name")
    private String platformName;

    /**
     * 0-未删 1-已删
     */
    @TableField(value = "deleted")
    private Integer deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Station other = (Station) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getStationName() == null ? other.getStationName() == null : this.getStationName().equals(other.getStationName()))
            && (this.getWaitingHallId() == null ? other.getWaitingHallId() == null : this.getWaitingHallId().equals(other.getWaitingHallId()))
            && (this.getWaitingHallName() == null ? other.getWaitingHallName() == null : this.getWaitingHallName().equals(other.getWaitingHallName()))
            && (this.getPlatformId() == null ? other.getPlatformId() == null : this.getPlatformId().equals(other.getPlatformId()))
            && (this.getPlatformName() == null ? other.getPlatformName() == null : this.getPlatformName().equals(other.getPlatformName()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getStationName() == null) ? 0 : getStationName().hashCode());
        result = prime * result + ((getWaitingHallId() == null) ? 0 : getWaitingHallId().hashCode());
        result = prime * result + ((getWaitingHallName() == null) ? 0 : getWaitingHallName().hashCode());
        result = prime * result + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        result = prime * result + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cityId=").append(cityId);
        sb.append(", cityName=").append(cityName);
        sb.append(", stationName=").append(stationName);
        sb.append(", waitingHallId=").append(waitingHallId);
        sb.append(", waitingHallName=").append(waitingHallName);
        sb.append(", platformId=").append(platformId);
        sb.append(", platformName=").append(platformName);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}