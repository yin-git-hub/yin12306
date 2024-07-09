package org.yin.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 途径车站信息表
 * @TableName passing_station
 */
@TableName(value ="passing_station")
@Data
public class PassingStation implements Serializable {
    /**
     * 途径车站ID，非自增
     */
    @TableId(value = "id")
    private Long id;

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

    /**
     * 0-未删 1-已删
     */
    @TableLogic
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
        PassingStation other = (PassingStation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTrainNumberId() == null ? other.getTrainNumberId() == null : this.getTrainNumberId().equals(other.getTrainNumberId()))
            && (this.getStationNumber() == null ? other.getStationNumber() == null : this.getStationNumber().equals(other.getStationNumber()))
            && (this.getStationId() == null ? other.getStationId() == null : this.getStationId().equals(other.getStationId()))
            && (this.getEntryTime() == null ? other.getEntryTime() == null : this.getEntryTime().equals(other.getEntryTime()))
            && (this.getDepartureTime() == null ? other.getDepartureTime() == null : this.getDepartureTime().equals(other.getDepartureTime()))
            && (this.getResidenceTime() == null ? other.getResidenceTime() == null : this.getResidenceTime().equals(other.getResidenceTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTrainNumberId() == null) ? 0 : getTrainNumberId().hashCode());
        result = prime * result + ((getStationNumber() == null) ? 0 : getStationNumber().hashCode());
        result = prime * result + ((getStationId() == null) ? 0 : getStationId().hashCode());
        result = prime * result + ((getEntryTime() == null) ? 0 : getEntryTime().hashCode());
        result = prime * result + ((getDepartureTime() == null) ? 0 : getDepartureTime().hashCode());
        result = prime * result + ((getResidenceTime() == null) ? 0 : getResidenceTime().hashCode());
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
        sb.append(", trainNumberId=").append(trainNumberId);
        sb.append(", stationNumber=").append(stationNumber);
        sb.append(", stationId=").append(stationId);
        sb.append(", entryTime=").append(entryTime);
        sb.append(", departureTime=").append(departureTime);
        sb.append(", residenceTime=").append(residenceTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}