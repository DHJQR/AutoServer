package ustc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ustc.entity.CtiTenantTrunk;
import ustc.repository.CtiTenantTrunkRepository;

@Service
public class CtiTenantTrunkService {

    @Autowired
    public CtiTenantTrunkRepository ctiTenantTrunkRepository;

    public void insertTwo(){
        CtiTenantTrunk ctiTenantTrunk3 = new CtiTenantTrunk();
        ctiTenantTrunk3.setTenant_id(1);
        ctiTenantTrunk3.setTrunk_id("xianlu1");
        ctiTenantTrunk3.setTrunk_type("leixing1");
        ctiTenantTrunk3.setLine_limit(1);
        ctiTenantTrunkRepository.save(ctiTenantTrunk3);

        CtiTenantTrunk ctiTenantTrunk4 = new CtiTenantTrunk();
        ctiTenantTrunk4.setTenant_id(2);
        ctiTenantTrunk4.setTrunk_id("xianlu2");
        ctiTenantTrunk4.setTrunk_type("leixing2");
        ctiTenantTrunk4.setLine_limit(2);
        ctiTenantTrunkRepository.save(ctiTenantTrunk4);
    }
}