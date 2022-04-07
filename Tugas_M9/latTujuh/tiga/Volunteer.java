package latTujuh.tiga;

public class Volunteer extends StaffMember{
	public Volunteer (String eName, String eAddress, String ePhone) {
		super(eName,eAddress,ePhone);
	}
	//return zero pay value for volunteer
	public double pay() {
		return 0.0;
	}
}
