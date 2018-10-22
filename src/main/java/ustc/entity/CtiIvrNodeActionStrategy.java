package ustc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CtiIvrNodeActionStrategy {
    //主键
    @Id
    @GeneratedValue
    //上述注解用来标识主键和主键的生成策略
    private Integer id;
    //策略名称
    private String name;
    //租户主键
    private Integer tenant_id;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTenant_id() {
        return tenant_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTenant_id(Integer tenant_id) {
        this.tenant_id = tenant_id;
    }
}
