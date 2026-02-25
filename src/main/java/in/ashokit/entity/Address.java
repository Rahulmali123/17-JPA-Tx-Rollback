package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMP_ADDR_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address 
{
	@Id
	@Column(name = "ADDR_ID")
	private Integer addrId;
	
	private String city;
	private String state;
	private String country;
	
	@Column(name = "EMP_ID")
	private Integer empId;
	
}
