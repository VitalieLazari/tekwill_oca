import java.util.List;

public class LaPlacinte extends Restaurant {
	
	public LaPlacinte(String name) {
		this.name = name;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void getName() {
		System.out.println(name);
	}
}
