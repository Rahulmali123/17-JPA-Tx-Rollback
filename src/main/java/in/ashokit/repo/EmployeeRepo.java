package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Serializable>
{

}
