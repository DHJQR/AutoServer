package ustc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.awt.print.PrinterAbortException;
import java.sql.Timestamp;

/**
 * @author  范苏东
 * 2018-10-20
 * 租户号码表
 */
@Entity
public class CtiTenantNumbers {
    //主键
    @Id
    @GeneratedValue
    private Integer id;
    //号码
    private String number;
    //(0--不允许外呼，1--允许外呼）
    private Integer is_callout;
    //(0--不可呼入，1--企业IVR，2--企业总机，3--企业彩铃）
    private Integer is_callin;
    //语音导航主键
    private Integer ivr_id;
    //true--启用策略，false--不可启用策略
    private boolean is_strategy;
    //策略主键
    private Integer strategy;
    //租户主键
    private Integer tenant_id;
    //企业彩铃主键
    private Integer color_ring_id;
    //创建时间
    private Timestamp created_at;
    //更新时间
    private Timestamp updated_at;
    //创建人
    private Integer created_by;
    //更新人
    private Integer updated_by;

    public CtiTenantNumbers() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getIs_callout() {
        return is_callout;
    }

    public void setIs_callout(Integer is_callout) {
        this.is_callout = is_callout;
    }

    public Integer getIs_callin() {
        return is_callin;
    }

    public void setIs_callin(Integer is_callin) {
        this.is_callin = is_callin;
    }

    public Integer getIvr_id() {
        return ivr_id;
    }

    public void setIvr_id(Integer ivr_id) {
        this.ivr_id = ivr_id;
    }

    public boolean isIs_strategy() {
        return is_strategy;
    }

    public void setIs_strategy(boolean is_strategy) {
        this.is_strategy = is_strategy;
    }

    public Integer getStrategy() {
        return strategy;
    }

    public void setStrategy(Integer strategy) {
        this.strategy = strategy;
    }

    public Integer getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(Integer tenant_id) {
        this.tenant_id = tenant_id;
    }

    public Integer getColor_ring_id() {
        return color_ring_id;
    }

    public void setColor_ring_id(Integer color_ring_id) {
        this.color_ring_id = color_ring_id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public Integer getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(Integer updated_by) {
        this.updated_by = updated_by;
    }
}
