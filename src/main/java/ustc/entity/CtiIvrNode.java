package ustc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 陈桢秀
 * 语音导航节点表
 */
@Entity
public class CtiIvrNode {
    //主键
    @Id
    @GeneratedValue
    private Integer id;
    //语音导航主键
    private Integer ivr_id;
    //父节点
    private Integer father_node;
    //文本内容
    private String text;
    //按键超时时长
    private Integer timeout;
    //按键超时后执行的动作
    private Integer action;
    //按键超时后执行的动作值
    private String value;
    //最短按键数
    private Integer min_digits;
    //最长按键数
    private Integer max_digits;
    //按键失败的时候播放的语音文件
    private String bad_input_audio_files;
    //最大可尝试次数
    private Integer max_tries;
    //播放的语音文件
    private String audio_files;
    //打断符号，如#号
    private String terminators;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIvr_id(Integer ivr_id) {
        this.ivr_id = ivr_id;
    }

    public void setFather_node(Integer father_node) {
        this.father_node = father_node;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setMin_digits(Integer min_digits) {
        this.min_digits = min_digits;
    }

    public void setMax_digits(Integer max_digits) {
        this.max_digits = max_digits;
    }

    public void setBad_input_audio_files(String bad_input_audio_files) {
        this.bad_input_audio_files = bad_input_audio_files;
    }

    public void setMax_tries(Integer max_tries) {
        this.max_tries = max_tries;
    }

    public void setAudio_files(String audio_files) {
        this.audio_files = audio_files;
    }

    public void setTerminators(String terminators) {
        this.terminators = terminators;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIvr_id() {
        return ivr_id;
    }

    public Integer getFather_node() {
        return father_node;
    }

    public String getText() {
        return text;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public Integer getAction() {
        return action;
    }

    public String getValue() {
        return value;
    }

    public Integer getMin_digits() {
        return min_digits;
    }

    public Integer getMax_digits() {
        return max_digits;
    }

    public String getBad_input_audio_files() {
        return bad_input_audio_files;
    }

    public Integer getMax_tries() {
        return max_tries;
    }

    public String getAudio_files() {
        return audio_files;
    }

    public String getTerminators() {
        return terminators;
    }
}
