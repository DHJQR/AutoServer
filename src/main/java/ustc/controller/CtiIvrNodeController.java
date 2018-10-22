package ustc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ustc.entity.CtiIvrNode;
import ustc.repository.CtiIvrNodeRepository;
import ustc.repository.CtiTrunkRepository;
import ustc.service.CtiIvrNodeService;
import ustc.service.CtiTrunkService;
import ustc.entity.CtiTrunk;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * @author 陈桢秀
 * 语音导航节点表
 * 2018-10-17
 */
@RestController
public class CtiIvrNodeController {

    @Autowired
    private CtiIvrNodeRepository ctiIvrNodeRepository;

    @Autowired
    private CtiIvrNodeService ctiIvrNodeService;

    /**
     * 查询列表
     * @return
     */
    @GetMapping(value = "/CtiIvrNodes")
    public List<CtiIvrNode> ctiIvrNodesList(){
        return ctiIvrNodeRepository.findAll();
    }

    /**
     * 插入一个语音导航节点
     * @param ivr_id
     * @param father_node
     * @param text
     * @return
     */
    @PostMapping(value = "/CtiIvrNodes")
    public CtiIvrNode ctiIvrNodeAdd(@RequestParam("ivr_id") Integer ivr_id,
                                    @RequestParam("father_node") Integer father_node,
                                    @RequestParam("text") String text
//                                    @RequestParam("timeout") Integer timeout,
//                                    @RequestParam("action") Integer actino,
//                                    @RequestParam("value") String value,
//                                    @RequestParam("min_digits") Integer min_digits,
//                                    @RequestParam("max_digits") Integer max_digits,
//                                    @RequestParam("bad_input_audio_files") String bad_input_audio_files,
//                                    @RequestParam("max_tries")Integer max_tries,
//                                    @RequestParam("audio_files") String audio_files,
//                                    @RequestParam("terminators") String terminators
                                        ){
        CtiIvrNode ctiIvrNode = new CtiIvrNode();
        ctiIvrNode.setIvr_id(ivr_id);
        ctiIvrNode.setFather_node(father_node);
        ctiIvrNode.setText(text);
//        ctiIvrNode.setTimeout(timeout);
//        ctiIvrNode.setAction(actino);
//        ctiIvrNode.setValue(value);
//        ctiIvrNode.setMin_digits(min_digits);
//        ctiIvrNode.setMax_digits(max_digits);
//        ctiIvrNode.setBad_input_audio_files(bad_input_audio_files);
//        ctiIvrNode.setMax_tries(max_tries);
//        ctiIvrNode.setAudio_files(audio_files);
//        ctiIvrNode.setTerminators(terminators);
        return ctiIvrNodeRepository.save(ctiIvrNode);
    }

    /**
     * 查询一个语音节点
     * @param id
     * @return
     */
    @GetMapping(value = "/CtiIvrNodes/{id}")
    public CtiIvrNode ctiIvrNodeFindOne(@PathVariable("id") Integer id){
        return ctiIvrNodeRepository.findOne(id);
    }

    /**
     * 更新一个语音导航节点
     * @param ivr_id
     * @param father_node
     * @param text
     * @return
     */
    @PutMapping(value = "/CtiIvrNodes/{id}")
    public CtiIvrNode ctiIvrNodeUpdate(@PathVariable("id") Integer id,
            @RequestParam("ivr_id") Integer ivr_id,
            @RequestParam("father_node") Integer father_node,
            @RequestParam("text") String text
//                                    @RequestParam("timeout") Integer timeout,
//                                    @RequestParam("action") Integer actino,
//                                    @RequestParam("value") String value,
//                                    @RequestParam("min_digits") Integer min_digits,
//                                    @RequestParam("max_digits") Integer max_digits,
//                                    @RequestParam("bad_input_audio_files") String bad_input_audio_files,
//                                    @RequestParam("max_tries")Integer max_tries,
//                                    @RequestParam("audio_files") String audio_files,
//                                    @RequestParam("terminators") String terminators
    ){
        CtiIvrNode ctiIvrNode = new CtiIvrNode();
        ctiIvrNode.setId(id);
        ctiIvrNode.setIvr_id(ivr_id);
        ctiIvrNode.setFather_node(father_node);
        ctiIvrNode.setText(text);
//        ctiIvrNode.setTimeout(timeout);
//        ctiIvrNode.setAction(actino);
//        ctiIvrNode.setValue(value);
//        ctiIvrNode.setMin_digits(min_digits);
//        ctiIvrNode.setMax_digits(max_digits);
//        ctiIvrNode.setBad_input_audio_files(bad_input_audio_files);
//        ctiIvrNode.setMax_tries(max_tries);
//        ctiIvrNode.setAudio_files(audio_files);
//        ctiIvrNode.setTerminators(terminators);
        return ctiIvrNodeRepository.save(ctiIvrNode);
    }

    /**
     * 删除一个语音导航节点
     * @param id
     */
    @DeleteMapping(value = "/CtiIvrNodes/{id}")
    public void ctiIvrNodeDelete(@PathVariable("id") Integer id){
        ctiIvrNodeRepository.delete(id);
    }



}
