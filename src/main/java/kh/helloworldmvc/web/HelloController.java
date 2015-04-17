package kh.helloworldmvc.web;

import kh.helloworldmvc.domain.Person;
import kh.helloworldmvc.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Simple Spring MVC controller with an injected service.
 * 
 * @author Kevin Hooke
 */
@Controller
public class HelloController {

	@Autowired
	private PersonService personService;
	
	 @ModelAttribute("person")
	 public Person getPersonModel() {
	  return new Person();
	 }
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	@RequestMapping("/createPerson")
	public String createPerson()
	{
		return "createPerson";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String helloPerson( @ModelAttribute("person") Person person )
	{	    
	    return "hello";
	}

	@RequestMapping(value = "/savePerson", method = RequestMethod.POST)
	public String savePerson( @ModelAttribute("person") Person person )
	{
	    
		this.personService.savePerson(person);
		
	    return "createPerson";
	}

	
}
