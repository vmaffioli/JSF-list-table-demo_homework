import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	
	private List<Student> students;
	
	public StudentDataUtil() {
		loadSampleData();
		
	}
	
	public void loadSampleData() {
		students = new ArrayList<>();
		
		students.add(new Student("Mary","Public","mary@vm.com"));
		students.add(new Student("John","Doe","john@vm.com"));
		students.add(new Student("Ajay","Rao","ajay@vm.com"));

	}
	
	public List<Student> getStudents(){
		return students;
	}

}
