package ustc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ustc.repository.CtiTrunkRepository;
import ustc.entity.CtiTrunk;


@Service
public class CtiTrunkService {

    @Autowired
    public CtiTrunkRepository ctiTrunkRepository;

    public void insertTwo(){
        CtiTrunk ctiTrunk3 = new CtiTrunk();
        ctiTrunk3.setName("网关3");
        ctiTrunk3.setValue("网关3的value");
        ctiTrunk3.setKind(3);
        ctiTrunk3.setIp(3);
        ctiTrunkRepository.save(ctiTrunk3);

        CtiTrunk ctiTrunk4 = new CtiTrunk();
        ctiTrunk4.setName("网关4");
        ctiTrunk4.setValue("网关4的value");
        ctiTrunk4.setKind(444);
        ctiTrunk4.setIp(4444);
        ctiTrunkRepository.save(ctiTrunk4);
    }
}

