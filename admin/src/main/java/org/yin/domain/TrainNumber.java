package org.yin.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 车次信息表
 * @TableName train_number
 */
@TableName(value ="train_number")
@Data
public class TrainNumber implements Serializable {
    /**
     * 列车ID，非自增
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 列车唯一标识
     */
    @TableField(value = "train_id")
    private Long trainId;

    /**
     * 始发站ID
     */
    @TableField(value = "origin_id")
    private Long originId;

    /**
     * 终点站ID
     */
    @TableField(value = "terminal_id")
    private Long terminalId;

    /**
     * 始发时间
     */
    @TableField(value = "origin_time")
    private LocalDateTime originTime;

    /**
     * 终点站时间
     */
    @TableField(value = "terminal_time")
    private LocalDateTime terminalTime;

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
        TrainNumber other = (TrainNumber) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTrainId() == null ? other.getTrainId() == null : this.getTrainId().equals(other.getTrainId()))
            && (this.getOriginId() == null ? other.getOriginId() == null : this.getOriginId().equals(other.getOriginId()))
            && (this.getTerminalId() == null ? other.getTerminalId() == null : this.getTerminalId().equals(other.getTerminalId()))
            && (this.getOriginTime() == null ? other.getOriginTime() == null : this.getOriginTime().equals(other.getOriginTime()))
            && (this.getTerminalTime() == null ? other.getTerminalTime() == null : this.getTerminalTime().equals(other.getTerminalTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTrainId() == null) ? 0 : getTrainId().hashCode());
        result = prime * result + ((getOriginId() == null) ? 0 : getOriginId().hashCode());
        result = prime * result + ((getTerminalId() == null) ? 0 : getTerminalId().hashCode());
        result = prime * result + ((getOriginTime() == null) ? 0 : getOriginTime().hashCode());
        result = prime * result + ((getTerminalTime() == null) ? 0 : getTerminalTime().hashCode());
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
        sb.append(", originId=").append(originId);
        sb.append(", terminalId=").append(terminalId);
        sb.append(", originTime=").append(originTime);
        sb.append(", terminalTime=").append(terminalTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}