import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Restaurant> restaurants = new ArrayList<>();
		restaurants.add(new LaPlacinte("LaPlacinte Ciocana #2"));
		restaurants.add(new Tratorria("Tratorria Rascani #4"));
				

		for (Restaurant restaurant2 : restaurants) {
				restaurant2.employees.add(new CEO());
				restaurant2.employees.add(new Manager());
				restaurant2.employees.add(new Cooker());
		}

		for (Restaurant restaurant2 : restaurants) {
			restaurant2.getName();
			for (Employee employee : restaurant2.getEmployees()) {
				employee.saySmth();
			}
		}
	}

}
