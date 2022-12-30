package br.com.lsborges;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lsborges.model.Person;
import br.com.lsborges.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired 
	private PersonServices service;
	
	@RequestMapping(value = "{id}",
			method=RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE) //coding for manutacion, that's why @RequestMapping
	
	public Person findById(@PathVariable(value = "id") String id) throws Exception{
		return service.findById(id);
	}
	
	@RequestMapping(
			method=RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE) //coding for manutacion, that's why @RequestMapping
	public List<Person> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(
			method=RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE, //coding for manutacion, that's why @RequestMapping
	        consumes = MediaType.APPLICATION_JSON_VALUE) //coding for manutacion, that's why @RequestMapping

	public Person create(@RequestBody Person person){
		return service.create(person);
	}
	@RequestMapping(
			method=RequestMethod.PUT, 
			produces = MediaType.APPLICATION_JSON_VALUE, //coding for manutacion, that's why @RequestMapping
			consumes = MediaType.APPLICATION_JSON_VALUE) //coding for manutacion, that's why @RequestMapping
	
	public Person put(@RequestBody Person person){
		return service.uptade(person);
	}
	
	
	@RequestMapping(value = "/{id}",
			method=RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") String id){
		service.delete(id);
	}
	

	
}