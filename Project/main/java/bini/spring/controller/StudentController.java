package bini.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bini.spring.model.Students;
import bini.spring.repository.StudentRepository;


@Controller
public class StudentController {

	
	  @Autowired StudentRepository studentRepo;
	 	
	@GetMapping("/getAllStudents")
	public String getAllStudents(Model model){
		List<Students> list=(List<Students>) studentRepo.findAll(); 
		model.addAttribute("list",list);
        return "Students";
	}
	
	@RequestMapping(value="/deleteemp/{id}")    
    public String delete(@PathVariable long id){    
		studentRepo.deleteById(id);    
        return "Form";    
    }   
	
	 @RequestMapping(value="/editemp/{id}")    
	    public String edit(@PathVariable long id, Model m){    
	        Students emp=studentRepo.getById(id);
	        m.addAttribute("student",emp);  
	        return "empeditform";    
	    }   
	 
	@RequestMapping(value="/editsave", method = RequestMethod.POST)
	public String editsave(Students student) {
		studentRepo.save(student);
		//Students s = studentRepo.getById(Integer.parseInt(id));
		//s.setName(cname);
		//studentRepo.save(s);
		//studentRepo.updateAddress(cname,id);
		return "redirect:/getAllStudents";
	}  
	
	 @RequestMapping(value="/saveView", method = RequestMethod.GET)
	    public ModelAndView showLoginPage(ModelMap model){
	        return new ModelAndView("saveform");
	    }

	 
	    @PostMapping("/savedata")
		public String savesample(@RequestParam(value="std_no", required= true)String billno,
				@RequestParam(value="std_name", required= true)String cname,
				Model model) {

			 Students obj=new Students(billno,cname);
			 studentRepo.save(obj);		
			return "fileupload";
			 
		 }
	 
	 @GetMapping({"/", "/hello"})
	    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
	        model.addAttribute("name", name);
	        return "hello";
	    }
	
}
