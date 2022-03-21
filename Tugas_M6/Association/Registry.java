package Association;

import java.util.ArrayList;
import java.util.List;

public class Registry {
	public static void main(String[] args) {
		People p1 = new People("Budi");
		People p2 = new People("Urizen");
		List<People> peoples = new ArrayList<People>();
		peoples.add(p1);
		peoples.add(p2);
		Community Artisan = new Community("Artisan",peoples);
	}
}
