package main.java.com.swinarta.appengine.manager.impl;

import com.swinarta.appengine.dao.SampleDao;
import com.swinarta.appengine.manager.SampleService;
import com.swinarta.appengine.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService{

	@Autowired(required=true)
	private SampleDao dao;
	
	@Override
	public void addSomething() {
		dao.addSomething();		
	}

	@Override
	public Person getSomething(Integer id) {
		return dao.getSomething(id);
	}
	
}
