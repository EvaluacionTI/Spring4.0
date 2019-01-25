package pe.inverfin.spring.entity;

import org.springframework.beans.factory.annotation.Required;

public class CEEmpleado  {
	private String name;
	private String designation;
	private String company;
	
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	@Required
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getCompany() {
		return company;
	}
	
	@Required
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return String.format("CEEmpleado [name=%s, designation=%s, company=%s]", name, designation, company);
	}
}
