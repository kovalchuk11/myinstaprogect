package myprogect.insta.service;

import myprogect.insta.dao.InfoAccDao;
import myprogect.insta.entity.Infoacc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoAccService {
    @Autowired
    private InfoAccDao infoAccDao;

    public List<Infoacc> getAll() {
        List<Infoacc> allAcc = (List<Infoacc>) infoAccDao.findAll();
        return allAcc;
    }

}
