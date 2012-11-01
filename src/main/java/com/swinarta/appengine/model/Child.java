package main.java.com.swinarta.appengine.model;

import com.google.appengine.api.datastore.Key;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties("parent")
public class Child implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -112209600992513676L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Key id;
	
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Person.class)
    private Person parent;

	private String text;

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public Person getParent() {
		return parent;
	}

	public void setParent(Person parent) {
		this.parent = parent;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
