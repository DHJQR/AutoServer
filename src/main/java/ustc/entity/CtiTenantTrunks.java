package ustc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CtiTenantTrunks {
    //主键
    @Id
    @GeneratedValue
    private Integer id;
    //租户主键
    private Integer tenant_id;
    //线路主键
    private String trunk_id;
    //匹配类型
    private String trunk_type;
    //线路限制，0为不限制
    private Integer line_limit;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTenant_id(Integer tenant_id) {
        this.tenant_id = tenant_id;
    }

    public void setTrunk_id(String trunk_id) {
        this.trunk_id = trunk_id;
    }

    public void setTrunk_type(String trunk_type) {
        this.trunk_type = trunk_type;
    }

    public void setLine_limit(Integer line_limit) {
        this.line_limit = line_limit;
    }

    public Integer getId() {
        return id;
    }

    public Integer getTenant_id() {
        return tenant_id;
    }

    public String getTrunk_id() {
        return trunk_id;
    }

    public String getTrunk_type() {
        return trunk_type;
    }

    public Integer getLine_limit() {
        return line_limit;
    }
}
