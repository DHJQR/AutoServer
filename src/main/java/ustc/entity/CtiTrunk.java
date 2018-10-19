package ustc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CtiTrunk {
    //主键
    @Id
    @GeneratedValue
    //上述注解用来标识主键和主键的生成策略
    private Integer id;
    //网关名称
    private String name;
    //网关名称
    private String value;
    //网关类型
    private Integer kind;
    //对接ip
    private Integer ip;

    public CtiTrunk() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public Integer getKind() {
        return kind;
    }

    public Integer getIp() {
        return ip;
    }
}
