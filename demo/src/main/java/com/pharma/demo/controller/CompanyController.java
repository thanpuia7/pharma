package  com.pharma.demo.controller;

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

import com.pharma.demo.entity.Company;
import com.pharma.demo.repository.CompanyRepository;



@Controller
@RequestMapping("/company")
public class CompanyController {
	
	
	@Autowired
	private CompanyRepository companyRepository;
	
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
		
		theModel.addAttribute("company", theCompany);
		
		return "/form/company-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("companies") Company theCompany) {
		
		// save the employee
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
		 
		return "redirect:/employees/list";
	}
	
}
	












