package thuanlm.com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thuanlm.com.entity.Company;
import thuanlm.com.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	@GetMapping("/findAll")
	public ResponseEntity<List<Company>> findAll(){
		Optional<List<Company>> optional = Optional.of(companyService.findAll());
		if(optional.isPresent()) {
			return new ResponseEntity<List<Company>>(optional.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}
