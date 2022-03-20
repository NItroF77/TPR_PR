package Agregation;

import java.util.List;

public class Company {
	String CompanyName;
	private List<Division> Divisions;
	Company(String CompanyName,List<Division> Divisions){
		this.CompanyName = CompanyName;
		this.Divisions = Divisions;
	}
	public int getTotalEmployeesInCompany() {
		List<Employee> employees;
		int count = 0;
		for(Division Div : Divisions) {
			employees = Div.getTotalEmployeeInDivision();
			for(Employee emp : employees) {
				count++;
			}
		}
		return count;
	}
	public int getTotalDivisionsInCompany() {
		List<Division> Divs;
		int count = 0;
		for(Division Div : Divisions) {
			count++;
		}
		return count;
	}
}
