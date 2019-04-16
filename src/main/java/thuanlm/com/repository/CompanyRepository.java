package thuanlm.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import thuanlm.com.entity.Company;

@Transactional
@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer>{
	
	@Override
	@Query("FROM Company")
	List<Company> findAll();
	
}
