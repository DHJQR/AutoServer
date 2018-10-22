package ustc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ustc.repository.CtiIvrNodeRepository;

@Service
public class CtiIvrNodeService {
    @Autowired
    public CtiIvrNodeRepository ctiIvrNodeRepository;

}
