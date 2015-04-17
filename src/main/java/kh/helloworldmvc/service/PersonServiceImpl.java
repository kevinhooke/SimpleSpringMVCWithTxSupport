package kh.helloworldmvc.service;

import javax.persistence.EntityManager;

import kh.helloworldmvc.domain.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private EntityManager em;
	
	public void savePerson(Person person){
		
		this.em.persist(person);

	}
}
