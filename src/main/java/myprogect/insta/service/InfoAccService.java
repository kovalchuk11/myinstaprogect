package myprogect.insta.service;

import myprogect.insta.repositories.InfoAccRepository;
import myprogect.insta.entity.Infoacc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class InfoAccService {
    @Autowired
    InfoAccRepository infoAccRepository;


    public List<Infoacc> getAll() {
        List<Infoacc> allAcc = new ArrayList<>();
        allAcc.addAll((List<Infoacc>) infoAccRepository.findAll());
        return allAcc;
    }

    public void update(Infoacc infoacc) {
        infoAccRepository.save(infoacc);
    }

    public void save(Infoacc infoacc) {
        infoAccRepository.save(infoacc);
    }
}
