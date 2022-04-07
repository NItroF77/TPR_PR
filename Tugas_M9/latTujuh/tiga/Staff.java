package latTujuh.tiga;

public class Staff {
	StaffMember[] staffList;
	public Staff() {
		staffList = new StaffMember[8];
		staffList[0] = new Executive ("Sam", "123 Main Line",
						"555-0469", "123-45-6789", 2423.07);
		staffList[1] = new Executive ("Sam", "123 Main Line",
				"555-0469", "123-45-6789", 2423.07);
		staffList[2] = new Executive ("Sam", "123 Main Line",
				"555-0469", "123-45-6789", 2423.07);
		staffList[3] = new Hourly ("Sam", "123 Main Line",
				"555-0469", "123-45-6789", 2423.07);
		staffList[4] = new Executive ("Sam", "123 Main Line",
				"555-0469", "123-45-6789", 2423.07);
		staffList[5] = new Executive ("Sam", "123 Main Line",
				"555-0469", "123-45-6789", 2423.07);
		staffList[6] = new Commission ("Udin", "123 Main Line",
				"192-1689", "123-45-6789", 6.25, 0.2);
		staffList[7] = new Commission ("Ucok", "123 Main Line",
				"333-4519", "123-45-6789", 9.75, 0.15);
		((Executive)staffList[0]).awardBonus(500.00);
		((Hourly)staffList[3]).addHours(40);
		((Commission)staffList[6]).addHours(35);
		((Commission)staffList[6]).addSales(400);
		((Commission)staffList[7]).addHours(40);
		((Commission)staffList[7]).addSales(950);
	}
	//pays all staff members
	public void payday() {
		double amount;
		for(int count = 0;count <staffList.length;count++) {
			System.out.println(staffList[count]);
			amount = staffList[count].pay(); //polymorphic
			if(amount == 0.0)
				System.out.println("Thanks!");
			else
				System.out.println("Paid: "+amount);
			System.out.println("------------------------------");
		}
	}
}
