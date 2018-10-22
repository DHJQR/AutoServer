package ustc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ustc.entity.CtiTenantTrunk;

import java.util.List;

public interface CtiTenantTrunkRepository extends JpaRepository<CtiTenantTrunk, Integer> {

//    //通过name进行查询
//    public List<CtiTenantTrunk> findByTrunk_type(String trunk_type);
}

