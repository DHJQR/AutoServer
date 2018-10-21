package ustc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author  范苏东
 * 2018-10-19
 * 坐席表
 */
@Entity
public class CtiSeats {
    //主键
    @Id
    @GeneratedValue
    private Integer id;
    //用户表主键
    private int user_id;
    //租户表主键
    private int tenant_id;
    //座席代理主键
    private int agent_id;
    //座席名字
    private String agent_name;
    //手动呼叫外显号码
    private String show_number;
    //座席绑定电话
    private String contact_number;
    //座席私人号码
    private String private_number;
    //座席编号
    private String seat_number;
    //创建人
    private Integer created_by;
    //更新人
    private Integer updated_by;
    //座席类型（0---软电话，1---无线话机）
    private Integer agents_type;
    //座席月租
    private BigDecimal hire_price;
    //座席保底消费
    private BigDecimal mini_price;
    //使用状态（0--启用，1--禁用，2--删除）
    private Integer status;
    //创建时间
    private Timestamp created_at;
    //更新时间
    private Timestamp updated_at;


    public CtiSeats() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(int tenant_id) {
        this.tenant_id = tenant_id;
    }

    public int getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getShow_number() {
        return show_number;
    }

    public void setShow_number(String show_number) {
        this.show_number = show_number;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getPrivate_number() {
        return private_number;
    }

    public void setPrivate_number(String private_number) {
        this.private_number = private_number;
    }

    public String getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(String seat_number) {
        this.seat_number = seat_number;
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

    public Integer getAgents_type() {
        return agents_type;
    }

    public void setAgents_type(Integer agents_type) {
        this.agents_type = agents_type;
    }

    public BigDecimal getHire_price() {
        return hire_price;
    }

    public void setHire_price(BigDecimal hire_price) {
        this.hire_price = hire_price;
    }

    public BigDecimal getMini_price() {
        return mini_price;
    }

    public void setMini_price(BigDecimal mini_price) {
        this.mini_price = mini_price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}
