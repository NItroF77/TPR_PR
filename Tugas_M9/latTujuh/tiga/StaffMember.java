package latTujuh.tiga;

abstract public class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	//countructors
	public StaffMember(String eName, String eAddress, String ePhone){
		name = eName;
		address = eAddress;
		phone = ePhone;
	}
	//return a string including basic employee information
	public String toString() {
		String result = "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result += "phone: " + phone;
		return result;
	}
	//defined within derived class
	public abstract double pay();
}
