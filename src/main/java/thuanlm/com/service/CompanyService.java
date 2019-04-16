package thuanlm.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thuanlm.com.entity.Company;
import thuanlm.com.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company> findAll(){
		return companyRepository.findAll();
	}
}
