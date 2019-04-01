package  com.pharma.demo.controller

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pharma.demo.CompanyRepository;
import com.puipuia.thymeleaf.helloworld1.entity.Employee;


@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeController(EmployeeRepository theEmployeeRepository) {
		
		employeeRepository=theEmployeeRepository;
		
	}

	
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel,@RequestParam(defaultValue="0") int page ) {
		
	
	
		theModel.addAttribute("employees", employeeRepository.findAll(PageRequest.of(page, 4)));
		
		
		theModel.addAttribute("currentPage", page);
		
		return "/employees/list-employees";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Employee theEmployee = new Employee();
		
		theModel.addAttribute("employee", theEmployee);
		
		return "/employees/employee-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
		
		// save the employee
		employeeRepository.save(theEmployee);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/employees/list";
	}
	


	@GetMapping("/findOne")
	@ResponseBody
	public Optional<Employee> findOne(Integer id) {
		
		
		
		return employeeRepository.findById(id);
				
	}

	
	
	@GetMapping("/delete")
	public String delete(Integer id){
		
		 employeeRepository.deleteById(id);
		 
		return "redirect:/employees/list";
	}
	
}
	












