package ustc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author 陈桢秀
 * 队列配置表
 */
@Entity
public class CtiQueueOption {
    //主键
    @Id
    @GeneratedValue
    private Integer id;
    //配置名称
    private String name;
    //等待音路径
    private String moh_sound;
    //在队列中最大等待时长，这个时间之后没有转接到座席就踢出队列，一般设置为50s，如果为0，永远不主动踢出
    private Integer max_wait_time;
    //队列在没有可用座席之后间隔这个时间，会踢出队列中所有的呼叫，一般可以设置为30s
    private Integer max_wait_time_with_no_agent;
    //新的呼叫到达没有座席接听的队列之后，等待这个时间会被踢出，一般30s
    private Integer max_wait_time_with_no_time_reached;
    //呼叫策略，根据FS的队列策略配置
    private String strategy;
    //租户主键
    private Integer tenant_id;
    //创建时间
    private Timestamp created_at;
    //更新时间
    private Timestamp update_at;
    //创建人
    private Integer created_by;
    //更新人
    private Integer updated_by;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMoh_sound() {
        return moh_sound;
    }

    public Integer getMax_wait_time() {
        return max_wait_time;
    }

    public Integer getMax_wait_time_with_no_agent() {
        return max_wait_time_with_no_agent;
    }

    public Integer getMax_wait_time_with_no_time_reached() {
        return max_wait_time_with_no_time_reached;
    }

    public String getStrategy() {
        return strategy;
    }

    public Integer getTenant_id() {
        return tenant_id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public Integer getUpdated_by() {
        return updated_by;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoh_sound(String moh_sound) {
        this.moh_sound = moh_sound;
    }

    public void setMax_wait_time(Integer max_wait_time) {
        this.max_wait_time = max_wait_time;
    }

    public void setMax_wait_time_with_no_agent(Integer max_wait_time_with_no_agent) {
        this.max_wait_time_with_no_agent = max_wait_time_with_no_agent;
    }

    public void setMax_wait_time_with_no_time_reached(Integer max_wait_time_with_no_time_reached) {
        this.max_wait_time_with_no_time_reached = max_wait_time_with_no_time_reached;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void setTenant_id(Integer tenant_id) {
        this.tenant_id = tenant_id;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public void setUpdated_by(Integer updated_by) {
        this.updated_by = updated_by;
    }
}
