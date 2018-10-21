package ustc.entity;

import javax.jnlp.IntegrationService;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author  范苏东
 * 2018-10-20
 * 语音导航节点动作表
 */
@Entity
public class CtiIvrNodeActions {
    //主键
    @Id
    @GeneratedValue
    private Integer id;
    //按键
    private String digits;
    //动作
    private String action;
    //动作值
    private String value;
    //对应的节点主键
    private Integer node_id;

    public CtiIvrNodeActions() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDigits() {
        return digits;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNode_id() {
        return node_id;
    }

    public void setNode_id(Integer node_id) {
        this.node_id = node_id;
    }
}
