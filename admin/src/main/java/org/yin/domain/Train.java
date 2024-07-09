package org.yin.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 列车信息表
 * @TableName t_train
 */
@TableName(value ="t_train")
@Data
public class Train implements Serializable {
    /**
     * 列车ID，非自增
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 列车名
     */
    @TableField(value = "train_name")
    private String trainName;

    /**
     * 列车类型
     */
    @TableField(value = "train_type")
    private String trainType;

    /**
     * 列车编号
     */
    @TableField(value = "train_code")
    private String trainCode;

    /**
     * 车厢ID
     */
    @TableField(value = "carriage_id")
    private Long carriageId;

    /**
     * 车厢名称
     */
    @TableField(value = "carriage_name")
    private String carriageName;

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
        Train other = (Train) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTrainName() == null ? other.getTrainName() == null : this.getTrainName().equals(other.getTrainName()))
            && (this.getTrainType() == null ? other.getTrainType() == null : this.getTrainType().equals(other.getTrainType()))
            && (this.getTrainCode() == null ? other.getTrainCode() == null : this.getTrainCode().equals(other.getTrainCode()))
            && (this.getCarriageId() == null ? other.getCarriageId() == null : this.getCarriageId().equals(other.getCarriageId()))
            && (this.getCarriageName() == null ? other.getCarriageName() == null : this.getCarriageName().equals(other.getCarriageName()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTrainName() == null) ? 0 : getTrainName().hashCode());
        result = prime * result + ((getTrainType() == null) ? 0 : getTrainType().hashCode());
        result = prime * result + ((getTrainCode() == null) ? 0 : getTrainCode().hashCode());
        result = prime * result + ((getCarriageId() == null) ? 0 : getCarriageId().hashCode());
        result = prime * result + ((getCarriageName() == null) ? 0 : getCarriageName().hashCode());
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
        sb.append(", trainName=").append(trainName);
        sb.append(", trainType=").append(trainType);
        sb.append(", trainCode=").append(trainCode);
        sb.append(", carriageId=").append(carriageId);
        sb.append(", carriageName=").append(carriageName);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}