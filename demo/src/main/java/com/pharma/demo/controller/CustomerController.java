package  com.pharma.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.pharma.demo.entity.Customer;

import com.pharma.demo.repository.CustomerRepository;

import com.pharma.demo.services.CustomerService;



@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerController(CustomerRepository theCustomerRepository) {
	 
		customerRepository=theCustomerRepository;
	}

	
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listCompany(Model theModel,@RequestParam(defaultValue="0") int page ) {
		
	
	
		theModel.addAttribute("customers", customerRepository.findAll(PageRequest.of(page, 4)));
		
		
		theModel.addAttribute("currentPage", page);
		
		return "/form/list-customer";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		
	theModel.addAttribute("customers", theCustomer);
		
		return "/form/customer-form";
	}
	
	
	@PostMapping("/showFormForAdd")		
	public String showFormValidation(@Valid Customer theCustomer, BindingResult bindingResult,Model theModel) {
	
	if(bindingResult.hasErrors())
	{
		return "/form/customer-form";
	}
	
	
//if(employeeRepository.findByEmail(theEmployee.getEmail() !=null)) {
//		theModel.addAttribute("exist",true); 
		
//		return "employees/employee-form";
//	}

	customerRepository.save(theCustomer);
	
	return "redirect:/customer/list";
	
	}
	
	

	
	
	@PostMapping("/save")
	public String saveCompany(@ModelAttribute("customers") Customer theCustomer) {
		
		// save the company
		customerRepository.save(theCustomer);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/customer/list";
	}
	
	
	
	
	
	


	@GetMapping("/findOne")
	@ResponseBody
	public Optional<Customer> findOne(Integer id) {
		

		return customerRepository.findById(id);
				
	}

	
	
	@GetMapping("/delete")
	public String delete(Integer id){
		
		 customerRepository.deleteById(id);
		 
		return "redirect:/customer/list";
	}
	
	@GetMapping("/search")
	public String customerSearch(Model themodel, @RequestParam(defaultValue="")  String shop) {
		
		
		themodel.addAttribute("test",customerService.findByShop(shop));
		
		return "form/customer-search";
	}
	
	
}
	












