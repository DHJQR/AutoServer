package ustc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ustc.repository.CtiTrunkRepository;
import ustc.service.CtiTrunkService;
import ustc.entity.CtiTrunk;

import java.util.List;

/**
 * @author 陈桢秀
 * 2018-10-16
 */
@RestController
public class CtiTrunkController {
    @Autowired
    private CtiTrunkRepository ctiTrunkRepository;

    @Autowired
    private CtiTrunkService ctiTrunkService;
    /**
     * 查询列表
     * @return
     */
    @GetMapping(value = "/ctitrunks")
    public List<CtiTrunk> ctiTrunkList(){

        return ctiTrunkRepository.findAll();
    }

    /**
     * 添加一条线路
     * @param name
     * @param value
     * @param kind
     * @param ip
     * @return
     */
    @PostMapping(value = "/ctitrunks")
    public CtiTrunk ctiTrunkAdd(@RequestParam("name") String name,
                                @RequestParam("value")  String value,
                                @RequestParam("kind") Integer kind,
                                @RequestParam("ip") Integer ip){
        CtiTrunk ctiTrunk = new CtiTrunk();
        ctiTrunk.setName(name);
        ctiTrunk.setValue(value);
        ctiTrunk.setKind(kind);
        ctiTrunk.setIp(ip);

        return ctiTrunkRepository.save(ctiTrunk);
    }

    /**
     * 查询一条线路
     * @param id
     * @return
     */
    @GetMapping(value = "/ctitrunks/{id}")
    public CtiTrunk ctiTrunkFindOne(@PathVariable("id") Integer id){
        return ctiTrunkRepository.findOne(id);
    }

    @GetMapping(value = "/ctitrunks/name/{name}")
    public List<CtiTrunk> ctiTrunksListByName(@PathVariable("name") String name){
        return ctiTrunkRepository.findByName(name);
    }

    /**
     * 更新一条线路
     * @param id
     * @param name
     * @param value
     * @param kind
     * @param ip
     * @return
     */
    @PutMapping(value = "/ctitrunks/{id}")
    public CtiTrunk ctiTrunkUpdate(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("value") String value,
                               @RequestParam("kind") Integer kind,
                               @RequestParam("ip") Integer ip){
        CtiTrunk ctiTrunk = new CtiTrunk();
        ctiTrunk.setId(id);
        ctiTrunk.setName(name);
        ctiTrunk.setValue(value);
        ctiTrunk.setKind(kind);
        ctiTrunk.setIp(ip);

        return ctiTrunkRepository.save(ctiTrunk);
    }

    /**
     * 删除一条数据
     * @param id
     */
    @DeleteMapping(value = "/ctitrunks/{id}")
    public void ctiTrunkDelete(@PathVariable("id") Integer id){
        ctiTrunkRepository.delete(id);
    }

    @PostMapping(value = "/ctitrunks/two")
    public void ctiTrunkTwo(){
        ctiTrunkService.insertTwo();
    }
}
