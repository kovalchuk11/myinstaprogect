package myprogect.insta.dao;

import myprogect.insta.entity.Infoacc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;



@Repository
public interface InfoAccDao extends CrudRepository<Infoacc, Integer> {


}