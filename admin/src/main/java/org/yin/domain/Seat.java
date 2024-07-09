package org.yin.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 座位信息表
 * @TableName t_seat
 */
@TableName(value ="t_seat")
@Data
public class Seat implements Serializable {
    /**
     * 座位ID，非自增
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 列车ID，与t_train表中的id对应
     */
    @TableField(value = "train_id")
    private Long trainId;

    /**
     * 车厢ID
     */
    @TableField(value = "carriage_id")
    private Long carriageId;

    /**
     * 座位号
     */
    @TableField(value = "seat_number")
    private String seatNumber;

    /**
     * 车厢座位数
     */
    @TableField(value = "number_carriage_seats")
    private Integer numberCarriageSeats;

    /**
     * 列车座位数（可能需要累加所有车厢的座位数）
     */
    @TableField(value = "number_train_seats")
    private Long numberTrainSeats;

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
        Seat other = (Seat) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTrainId() == null ? other.getTrainId() == null : this.getTrainId().equals(other.getTrainId()))
            && (this.getCarriageId() == null ? other.getCarriageId() == null : this.getCarriageId().equals(other.getCarriageId()))
            && (this.getSeatNumber() == null ? other.getSeatNumber() == null : this.getSeatNumber().equals(other.getSeatNumber()))
            && (this.getNumberCarriageSeats() == null ? other.getNumberCarriageSeats() == null : this.getNumberCarriageSeats().equals(other.getNumberCarriageSeats()))
            && (this.getNumberTrainSeats() == null ? other.getNumberTrainSeats() == null : this.getNumberTrainSeats().equals(other.getNumberTrainSeats()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTrainId() == null) ? 0 : getTrainId().hashCode());
        result = prime * result + ((getCarriageId() == null) ? 0 : getCarriageId().hashCode());
        result = prime * result + ((getSeatNumber() == null) ? 0 : getSeatNumber().hashCode());
        result = prime * result + ((getNumberCarriageSeats() == null) ? 0 : getNumberCarriageSeats().hashCode());
        result = prime * result + ((getNumberTrainSeats() == null) ? 0 : getNumberTrainSeats().hashCode());
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
        sb.append(", trainId=").append(trainId);
        sb.append(", carriageId=").append(carriageId);
        sb.append(", seatNumber=").append(seatNumber);
        sb.append(", numberCarriageSeats=").append(numberCarriageSeats);
        sb.append(", numberTrainSeats=").append(numberTrainSeats);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}