package main.java.com.swinarta.appengine.dao.appengine;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.swinarta.appengine.dao.SampleDao;
import com.swinarta.appengine.model.Child;
import com.swinarta.appengine.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Set;

@Repository
public class SampleDaoAppEngineImpl implements SampleDao{

    @PersistenceContext
    private EntityManager entityManager;

    public void addSomething(){
    	
    	Person person = new Person();
    	person.setName("this is a person");
    	entityManager.persist(person);
    	entityManager.refresh(person);
    	
    	Child child = new Child();
    	child.setText("a child");
    	child.setParent(person);
    	entityManager.persist(child);
    	
    }
    
    public Person getSomething(Integer id){
    	Key key = KeyFactory.createKey(Person.class.getSimpleName(), id);
    	Person p = entityManager.find(Person.class, key);
    	Set<Child> children = p.getChildren();
    	System.out.println("children.size: "+children.size());
		return p;
    }
	
}
