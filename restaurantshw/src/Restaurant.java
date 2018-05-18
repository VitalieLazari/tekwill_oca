import java.util.ArrayList;
import java.util.List;

public abstract class Restaurant {
	public String name; 
	public List<Employee> employees = new ArrayList<>();
	public CEO ceo;
	
	abstract List<Employee> getEmployees();

	abstract void setEmployees(List<Employee> employees);

	abstract void getName();
	
}
