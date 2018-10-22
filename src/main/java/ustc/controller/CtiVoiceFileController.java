package ustc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ustc.entity.CtiIvrNode;
import ustc.entity.CtiVoiceFile;
import ustc.repository.CtiVoiceFileRepository;

import java.util.List;

/**
 * @author 陈桢秀
 * 2018-10-22
 */
@RestController
public class CtiVoiceFileController {
    @Autowired
    private CtiVoiceFileRepository ctiVoiceFileRepository;

    /**
     * 查询录音文件列表
     * @return
     */
    @GetMapping(value = "/CtiVoiceFiles")
    public List<CtiVoiceFile> ctiVoiceFileList(){
        return ctiVoiceFileRepository.findAll();
    }

    /**
     * 插入一条录音文件记录
     * @param file_name
     * @param file_path
     * @param describe
     * @return
     */
    @PostMapping(value = "/CtiVoiceFiles")
    public CtiVoiceFile ctiVoiceFileAdd(@RequestParam("file_name") String file_name,
                                        @RequestParam("file_path") String file_path,
                                        @RequestParam("describe") String describe){
        CtiVoiceFile ctiVoiceFile = new CtiVoiceFile();
        ctiVoiceFile.setFile_name(file_name);
        ctiVoiceFile.setFile_path(file_path);
        ctiVoiceFile.setFile_describe(describe);
        return ctiVoiceFileRepository.save(ctiVoiceFile);
    }

    /**
     * 查询一个录音文件记录
     * @param id
     * @return
     */
    @GetMapping(value = "/CtiVoiceFiles/{id}")
    public CtiVoiceFile ctiVoiceFileFineOne(@PathVariable("id") Integer id){
        return ctiVoiceFileRepository.findOne(id);
    }

    /**
     *更新一条录音文件记录
     * @param id
     * @param file_name
     * @param file_path
     * @param describe
     * @return
     */
    @PutMapping(value = "/CtiVoiceFiles/{id}")
    public CtiVoiceFile ctiVoiceFileUpdate(@PathVariable("id") Integer id,
                                           @RequestParam("file_name") String file_name,
                                           @RequestParam("file_path") String file_path,
                                           @RequestParam("describe") String describe){
        CtiVoiceFile ctiVoiceFile = new CtiVoiceFile();
        ctiVoiceFile.setId(id);
        ctiVoiceFile.setFile_name(file_name);
        ctiVoiceFile.setFile_path(file_path);
        ctiVoiceFile.setFile_describe(describe);
        return ctiVoiceFileRepository.save(ctiVoiceFile);
    }

    /**
     * 删除一条录音文件记录
     * @param id
     */
    @DeleteMapping(value = "/CtiVoiceFiles/{id}")
    public void ctiVoiceFileDelete(@PathVariable("id") Integer id){
        ctiVoiceFileRepository.delete(id);
    }

}
