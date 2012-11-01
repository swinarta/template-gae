package main.java.com.swinarta.appengine.controller;

import com.swinarta.appengine.data.RestRequestAdd;
import com.swinarta.appengine.data.RestResponse;
import com.swinarta.appengine.data.SampleRestRequest;
import com.swinarta.appengine.manager.SampleService;
import com.swinarta.appengine.model.Child;
import com.swinarta.appengine.model.Person;
import com.swinarta.appengine.util.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
public class SampleController {
	
	@Autowired(required=true)
	private SampleService service;
	
	@RequestMapping(value="/persons", method=RequestMethod.POST)
	@ResponseBody
	public void add(
			@RequestBody RestRequestAdd body
			) throws Exception{
				
		System.out.println("SampleController add()");
		service.addSomething();
	}

	@RequestMapping(value="/person/{id}", method=RequestMethod.GET)
	@ResponseBody
	public RestResponse get(
			@PathVariable("id") Integer id
			) throws Exception{
		
		Person p = service.getSomething(id);
		Set<Child> children = p.getChildren();
		for (Child child : children) {
			System.out.println("child id:" + child.getId() + " text: " + child.getText());
		}
		
		return RestUtil.convertResponse(p);
				
	}

	
	@RequestMapping(value = "/sample", method = RequestMethod.POST)
	@ResponseBody
	public RestResponse updateNoteAndTag(
			@RequestBody SampleRestRequest<Person> body
			) throws Exception{

		Person p = body.getData();
		
		System.out.println("name:"+body.getData().getName());
		
		return null;
	}
}
