package ustc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author  范苏东
 * 2018-10-19
 * 语音导航节点策略动作表
 */
@Entity
public class CtiIvrNodeActionStrategyAction {
    //主键
    @Id
    @GeneratedValue
    private Integer id;
    //节点策略主键
    private String strategy;
    //动作值
    private String value;
    //动作类型
    private String action;
    //地区策略
    private String s_loacl;
    //时间策略
    private String s_time;
    //优先级排序
    private Integer level;
    //创建时间
    private Timestamp created_at;
    //更新时间
    private Timestamp updated_at;
    //创建人
    private Integer created_by;
    //更新人
    private Integer updated_by;
    //是否可用
    private  boolean available;

    public CtiIvrNodeActionStrategyAction() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getS_loacl() {
        return s_loacl;
    }

    public void setS_loacl(String s_loacl) {
        this.s_loacl = s_loacl;
    }

    public String getS_time() {
        return s_time;
    }

    public void setS_time(String s_time) {
        this.s_time = s_time;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
