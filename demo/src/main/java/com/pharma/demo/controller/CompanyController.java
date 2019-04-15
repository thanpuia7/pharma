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

import com.pharma.demo.entity.Company;
import com.pharma.demo.repository.CompanyRepository;
import com.pharma.demo.services.CompanyServices;



@Controller
@RequestMapping("/company")
public class CompanyController {
	
	
	@Autowired
	private CompanyRepository companyRepository;

	
	private CompanyServices companyService;
	
	
	
	@Autowired
	public CompanyController(CompanyRepository theCompanyRepository) {
	 
		companyRepository=theCompanyRepository;
	}

	
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listCompany(Model theModel,@RequestParam(defaultValue="0") int page ) {
		
	
	
		theModel.addAttribute("companies", companyRepository.findAll(PageRequest.of(page, 4)));
		
		
		theModel.addAttribute("currentPage", page);
		
		return "/form/list-company";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Company theCompany = new Company();
		
		theModel.addAttribute("companies", theCompany);
		
		return "/form/company-form";
	}
	
	
	@PostMapping("/showFormForAdd")		
	public String showFormValidation(@Valid Company theCompany, BindingResult bindingResult,Model theModel) {
	
	if(bindingResult.hasErrors())
	{
		return "/form/company-form";
	}
	
	
//if(employeeRepository.findByEmail(theEmployee.getEmail() !=null)) {
//		theModel.addAttribute("exist",true); 
		
//		return "employees/employee-form";
//	}

	companyRepository.save(theCompany);
	
	return "redirect:/company/list";
	
	}
	
	

	
	
	@PostMapping("/save")
	public String saveCompany(@ModelAttribute("companies") Company theCompany) {
		
		// save the company
		companyRepository.save(theCompany);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/company/list";
	}
	
	
	
	
	
	


	@GetMapping("/findOne")
	@ResponseBody
	public Optional<Company> findOne(Integer id) {
		

		return companyRepository.findById(id);
				
	}

	
	
	@GetMapping("/delete")
	public String delete(Integer id){
		
		 companyRepository.deleteById(id);
		 
		return "redirect:/company/list";
	}
	
	@GetMapping("/search")
	public String listCompany(Model model, @RequestParam(defaultValue="")  String title) {
		model.addAttribute("test", companyService.findByTitle(title));
		
		return "/form/company-search";
	}
	
	
}
	












