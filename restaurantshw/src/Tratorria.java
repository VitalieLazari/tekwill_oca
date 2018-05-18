import java.util.List;

public class Tratorria extends Restaurant {
	
	public Tratorria(String name) {
		this.name = name;
	}
	
	public List<Employee> getEmployees() {
		return this.employees;
	}
	
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void getName() {
		System.out.println(name);
	}
}
