package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddressRepo;
import in.ashokit.repo.EmployeeRepo;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	
	private EmployeeRepo employeeRepo;
	
	private AddressRepo addressRepo;

	
	public EmployeeService(EmployeeRepo employeeRepo, AddressRepo addressRepo) {
		super();
		this.employeeRepo = employeeRepo;
		this.addressRepo = addressRepo;
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void saveData() 
	{
		Employee emp=new Employee();
		
		emp.setEmpId(202);
		emp.setEmpName("Ketan");
		emp.setEmpSal(25000.00);
		employeeRepo.save(emp);
		
		int i=10/0;
		
		Address add=new Address();
		add.setAddrId(502);
		add.setEmpId(202);
		add.setCity("Pune");
		add.setState("MH");
		add.setCountry("India");
		addressRepo.save(add);
		
	}
	
	
	
}
