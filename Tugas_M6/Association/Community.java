package Association;

import java.util.List;

public class Community {
	String name;
	List<People> Peoples;
	Community(String name, List<People> Peoples){
		this.name = name;
		this.Peoples = Peoples;
	}
}
