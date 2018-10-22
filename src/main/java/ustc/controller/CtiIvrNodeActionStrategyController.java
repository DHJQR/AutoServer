package ustc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ustc.entity.CtiIvrNodeActionStrategy;
import ustc.repository.CtiIvrNodeActionStrategyRepository;

import java.util.List;

/**
 * @author 陈桢秀
 * 语音导航节点动作策略表
 */
@RestController
public class CtiIvrNodeActionStrategyController {
    @Autowired
    private CtiIvrNodeActionStrategyRepository ctiIvrNodeActionStrategyRepository;

    /**
     * 查询语音导航节点动作策略表
     * @return
     */
    @GetMapping(value = "/CtiIvrNodeActionStrategies")
    public List<CtiIvrNodeActionStrategy> ctiIvrNodeActionStrategyList(){
        return ctiIvrNodeActionStrategyRepository.findAll();
    }

    /**
     * 增加一条语音导航节点动作策略
     * @param name
     * @param tenentid
     * @return
     */
    @PostMapping(value = "/CtiIvrNodeActionStrategies")
    public CtiIvrNodeActionStrategy ctiIvrNodeActionStrategyAdd(@RequestParam("name") String name,
                                       @RequestParam("tenantid") Integer tenentid){
        CtiIvrNodeActionStrategy ctiIvrNodeActionStrategy = new CtiIvrNodeActionStrategy();
        ctiIvrNodeActionStrategy.setName(name);
        ctiIvrNodeActionStrategy.setTenant_id(tenentid);
        return ctiIvrNodeActionStrategyRepository.save(ctiIvrNodeActionStrategy);
    }

    /**
     * 查询一条语音导航节点动作策略
     * @param id
     * @return
     */
    @GetMapping(value = "/CtiIvrNodeActionStrategies/{id}")
    public CtiIvrNodeActionStrategy ctiIvrNodeActionStrategyFindOne(@PathVariable("id") Integer id){
        return ctiIvrNodeActionStrategyRepository.findOne(id);
    }

    /**
     * 更新一条语音导航节点动作策略
     * @param id
     * @param name
     * @param tenantid
     * @return
     */
    @PutMapping(value = "/CtiIvrNodeActionStrategies/{id}")
    public CtiIvrNodeActionStrategy ctiIvrNodeActionStrategyUpdate(@PathVariable("id") Integer id,
                                                                   @RequestParam("name") String name,
                                                                   @RequestParam("tenantid") Integer tenantid){
        CtiIvrNodeActionStrategy ctiIvrNodeActionStrategy = new CtiIvrNodeActionStrategy();
        ctiIvrNodeActionStrategy.setId(id);
        ctiIvrNodeActionStrategy.setName(name);
        ctiIvrNodeActionStrategy.setTenant_id(tenantid);
        return ctiIvrNodeActionStrategyRepository.save(ctiIvrNodeActionStrategy);
    }

    /**
     * 删除一条语音导航节点动作策略
     * @param id
     */
    @DeleteMapping(value = "/CtiIvrNodeActionStrategies/{id}")
    public void ctiIvrNodeActionStrategyDelete(@PathVariable("id") Integer id){
        ctiIvrNodeActionStrategyRepository.delete(id);
    }
}
