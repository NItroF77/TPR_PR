package Agregation;

import java.util.List;

public class Division {
	String DivisionName ;
	private List<Employee> employees;
	Division(String DivName,List<Employee> employees){
		this.DivisionName = DivName;
		this.employees = employees;
	}
	public List<Employee> getTotalEmployeeInDivision() {
		List<Employee> employs;
		employs = employees;
		return employs;
	}
}
