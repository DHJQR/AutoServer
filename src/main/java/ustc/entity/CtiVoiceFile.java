package ustc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class CtiVoiceFile {
    //主键
    @Id
    @GeneratedValue
    //上述注解用来标识主键和主键的生成策略
    private Integer id;
    //文件名称
    private String file_name;
    //文件路径
    private String file_path;
    //描述
    private String file_describe;
    //录音文件类型（0--ivr录音文件，1--彩铃文件）
    private Integer voice_type;
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

    public String getFile_name() {
        return file_name;
    }

    public String getFile_path() {
        return file_path;
    }

    public String getFile_describe() {
        return file_describe;
    }

    public Integer getVoice_type() {
        return voice_type;
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

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public void setFile_describe(String describe) {
        this.file_describe = describe;
    }

    public void setVoice_type(Integer voice_type) {
        this.voice_type = voice_type;
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
