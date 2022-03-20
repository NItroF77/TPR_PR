package Agregation;

import java.util.ArrayList;
import java.util.List;

import Composition.SavingAccount;

public class Management {
	public static void main(String[] args) {
		Employee e1 = new Employee("Udin",21);
		Employee e2 = new Employee("Andi",24);
		Employee e3 = new Employee("Zakar",20);
		Employee e4 = new Employee("Firza",25);
		Employee e5 = new Employee("Nazir",21);
		Employee e6 = new Employee("Ehsan",22);
		List<Employee> HR_Employees = new ArrayList<Employee>();
		HR_Employees.add(e1);
		HR_Employees.add(e3);
		List<Employee> MNG_Employees = new ArrayList<Employee>();
		MNG_Employees.add(e5);
		MNG_Employees.add(e6);
		List<Employee> SuperVisors = new ArrayList<Employee>();
		SuperVisors.add(e2);
		SuperVisors.add(e4);
		Division HR = new Division("HumanRecources",HR_Employees);
		Division MNGR = new Division("Manager",MNG_Employees);
		Division SV = new Division("SuperVisors",SuperVisors);
		List<Division> Divisions = new ArrayList<Division>();
		Divisions.add(MNGR);
		Divisions.add(SV);
		Divisions.add(HR);
		Company Tech = new Company("TenologyPath",Divisions);
		System.out.println("Company   : "+Tech.CompanyName);
		System.out.println("Divisions : "+Tech.getTotalDivisionsInCompany());
		System.out.println("Employees : "+Tech.getTotalEmployeesInCompany());
	}

}
