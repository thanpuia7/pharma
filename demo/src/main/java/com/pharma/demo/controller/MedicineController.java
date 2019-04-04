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

import com.pharma.demo.entity.Medicine;
import com.pharma.demo.repository.MedicineRepository;



@Controller
@RequestMapping("/medicine")
public class MedicineController {
	
	
	@Autowired
	private MedicineRepository medicineRepository;
	
	@Autowired
	public MedicineController(MedicineRepository theMedicineRepository) {
	 
		medicineRepository=theMedicineRepository;
	}

	
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listCompany(Model theModel,@RequestParam(defaultValue="0") int page ) {
		
	
	
		theModel.addAttribute("medicines", medicineRepository.findAll(PageRequest.of(page, 4)));
		
		
		theModel.addAttribute("currentPage", page);
		
		return "/form/list-medicine";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Medicine theMedicine = new Medicine();
		
		theModel.addAttribute("medicines", theMedicine);
		
		return "/form/medicine-form";
	}
	
	
	@PostMapping("/showFormForAdd")		
	public String showFormValidation(@Valid Medicine theMedicine, BindingResult bindingResult,Model theModel) {
	
	if(bindingResult.hasErrors())
	{
		return "/form/medicine-form";
	}
	
	
//if(employeeRepository.findByEmail(theEmployee.getEmail() !=null)) {
//		theModel.addAttribute("exist",true); 
		
//		return "employees/employee-form";
//	}

	medicineRepository.save(theMedicine);
	
	return "redirect:/medicine/list";
	
	}
	
	

	
	
	@PostMapping("/save")
	public String saveMedicine(@ModelAttribute("medicines") Medicine theMedicine) {
		
		// save the company
		medicineRepository.save(theMedicine);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/medicine/list";
	}
	
	
	
	
	
	


	@GetMapping("/findOne")
	@ResponseBody
	public Optional<Medicine> findOne(Integer id) {
		

		return medicineRepository.findById(id);
				
	}

	
	
	@GetMapping("/delete")
	public String delete(Integer id){
		
		 medicineRepository.deleteById(id);
		 
		return "redirect:/medicine/list";
	}
	
}
	












