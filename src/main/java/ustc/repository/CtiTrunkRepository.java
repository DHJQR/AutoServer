package ustc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ustc.entity.CtiTrunk;

import java.util.List;

public interface CtiTrunkRepository extends JpaRepository<CtiTrunk, Integer> {

    //通过name进行查询
    public List<CtiTrunk> findByName(String name);
}
