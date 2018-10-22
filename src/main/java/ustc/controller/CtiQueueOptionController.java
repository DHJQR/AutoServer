package ustc.controller;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ustc.entity.CtiQueueOption;
import ustc.repository.CtiQueueOptionRepository;

import java.util.List;

/**
 * @author 陈桢秀
 * 队列配置表
 * 2018-10-22
 */
@RestController
public class CtiQueueOptionController {
    @Autowired
    CtiQueueOptionRepository ctiQueueOptionRepository;

    @GetMapping(value = "/CtiQueueOptions")
    public List<CtiQueueOption> ctiQueueOptionList(){
        return ctiQueueOptionRepository.findAll();
    }

    /**
     * 新增一条队列配置
     * @param name
     * @param mohsound
     * @param maxwaittime
     * @return
     */
    @PostMapping(value = "/CtiQueueOptions")
    public CtiQueueOption ctiQueueOptionAdd(@RequestParam("name") String name,
                                            @RequestParam("mohsound") String mohsound,
                                            @RequestParam("maxwaittime") Integer maxwaittime){
        CtiQueueOption ctiQueueOption = new CtiQueueOption();
        ctiQueueOption.setName(name);
        ctiQueueOption.setMoh_sound(mohsound);
        ctiQueueOption.setMax_wait_time(maxwaittime);
        return ctiQueueOptionRepository.save(ctiQueueOption);
    }

    /**
     * 查询一条队列配置
     * @param id
     * @return
     */
    @GetMapping(value = "/CtiQueueOptions{id}")
    public CtiQueueOption ctiQueueOptionFindOne(@PathVariable("id") Integer id){
        return ctiQueueOptionRepository.findOne(id);
    }

    @PutMapping(value = "/CtiQueueOptions/{id}")
    public CtiQueueOption ctiQueueOptionUpdate(@PathVariable("id") Integer id,
                                               @RequestParam("name") String name,
                                               @RequestParam("mohsound") String mohsound,
                                               @RequestParam("maxwaittime") Integer maxwaittime){
        CtiQueueOption ctiQueueOption = new CtiQueueOption();
        ctiQueueOption.setId(id);
        ctiQueueOption.setName(name);
        ctiQueueOption.setMoh_sound(mohsound);
        ctiQueueOption.setMax_wait_time(maxwaittime);
        return ctiQueueOptionRepository.save(ctiQueueOption);
    }

    @DeleteMapping(value = "/CtiQueueOptions/{id}")
    public void ctiQueueOptionDelete(@PathVariable("id") Integer id){
        ctiQueueOptionRepository.delete(id);
    }

}
