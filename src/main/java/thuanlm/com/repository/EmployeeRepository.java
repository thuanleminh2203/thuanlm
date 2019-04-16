package thuanlm.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import thuanlm.com.entity.Employee;

@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
