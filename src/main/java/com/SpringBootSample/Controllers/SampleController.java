package com.SpringBootSample.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootSample.Models.Person;

@Controller
public class SampleController {

	    @RequestMapping("/person")
	    public ModelAndView helloWorld() {

	        ModelAndView model = new ModelAndView("personview");
	        Person person = new Person();
	        person.setFirstName("Krishna");
	        person.setLastName("Sharma");
	        person.setAge(2);
	        model.addObject("person", person);
	        return model;
	    }

}
