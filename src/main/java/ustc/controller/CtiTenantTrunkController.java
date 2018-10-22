package ustc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ustc.entity.CtiTenantTrunk;
import ustc.repository.CtiTenantTrunkRepository;
import ustc.repository.CtiTenantTrunkRepository;
import ustc.service.CtiTenantTrunkService;
import ustc.service.CtiTenantTrunkService;

import java.util.List;
/**
 * @author 陈桢秀
 * 2018-10-16
 */
@RestController
public class CtiTenantTrunkController {
    @Autowired
    private CtiTenantTrunkRepository ctiTenantTrunkRepository;

    @Autowired
    private CtiTenantTrunkService ctiTenantTrunkService;
    /**
     * 查询列表
     * @return
     */
    @GetMapping(value = "/CtiTenantTrunks")
    public List<CtiTenantTrunk> ctiTenantTrunkList(){

        return ctiTenantTrunkRepository.findAll();
    }

    /**
     * 添加一条租户线路匹配
     * @param tenant_id
     * @param trunk_id
     * @param trunk_type
     * @param line_limit
     * @return
     */
    @PostMapping(value = "/CtiTenantTrunks")
    public CtiTenantTrunk ctiTenantTrunkAdd(@RequestParam("tenant_id") Integer tenant_id,
                                @RequestParam("trunk_id")  String trunk_id,
                                @RequestParam("trunk_type") String trunk_type,
                                @RequestParam("line_limit") Integer line_limit){
        CtiTenantTrunk ctiTenantTrunk = new CtiTenantTrunk();
        ctiTenantTrunk.setTenant_id(tenant_id);
        ctiTenantTrunk.setTrunk_id(trunk_id);
        ctiTenantTrunk.setTrunk_type(trunk_type);
        ctiTenantTrunk.setLine_limit(line_limit);

        return ctiTenantTrunkRepository.save(ctiTenantTrunk);
    }

    /**
     * 查询一条租户线路匹配
     * @param id
     * @return
     */
    @GetMapping(value = "/CtiTenantTrunks/{id}")
    public CtiTenantTrunk ctiTenantTrunkFindOne(@PathVariable("id") Integer id){
        return ctiTenantTrunkRepository.findOne(id);
    }
//
//    @GetMapping(value = "/CtiTenantTrunks/trunktype/{trunktype}")
//    public List<CtiTenantTrunk> CtiTenantTrunksListByName(@PathVariable("trunktype") String trunktype){
//        return ctiTenantTrunkRepository.findByTrunk_type(trunktype);
//    }

    /**
     * 更新一条租户线路匹配
     * @param id
     * @param tenant_id
     * @param trunk_id
     * @param trunk_type
     * @param line_limit
     * @return
     */
    @PutMapping(value = "/CtiTenantTrunks/{id}")
    public CtiTenantTrunk ctiTenantTrunkUpdate(@PathVariable("id") Integer id,
                                   @RequestParam("tenant_id") Integer tenant_id,
                                   @RequestParam("trunk_id")  String trunk_id,
                                   @RequestParam("trunk_type") String trunk_type,
                                   @RequestParam("line_limit") Integer line_limit){
        CtiTenantTrunk ctiTenantTrunk = new CtiTenantTrunk();
        ctiTenantTrunk.setId(id);
        ctiTenantTrunk.setTenant_id(tenant_id);
        ctiTenantTrunk.setTrunk_id(trunk_id);
        ctiTenantTrunk.setTrunk_type(trunk_type);
        ctiTenantTrunk.setLine_limit(line_limit);

        return ctiTenantTrunkRepository.save(ctiTenantTrunk);
    }

    /**
     * 删除一条数据
     * @param id
     */
    @DeleteMapping(value = "/CtiTenantTrunks/{id}")
    public void ctiTenantTrunkDelete(@PathVariable("id") Integer id){
        ctiTenantTrunkRepository.delete(id);
    }

    /**
     * 插入两条数据，来自Service的insertTwo函数
     */
    @PostMapping(value = "/CtiTenantTrunks/two")
    public void ctiTenantTrunkTwo(){
        ctiTenantTrunkService.insertTwo();
    }
}
