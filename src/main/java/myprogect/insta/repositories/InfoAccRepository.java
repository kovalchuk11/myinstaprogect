package myprogect.insta.repositories;

import myprogect.insta.entity.Infoacc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


//@Repository
@Transactional
public interface InfoAccRepository extends CrudRepository<Infoacc, Integer> {
    public Infoacc findByUsername(String username);


}