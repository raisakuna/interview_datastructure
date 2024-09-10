package bubbleSort;

import java.util.ArrayList;
import java.util.List;

public class StudentBubbleSort_List_Generic {
	public static int comparedByGrade(Student s1, Student s2) {
		// Integer.compare is a built in function that returns 0,1, -1
		return Integer.compare(s1.getGrade(), s2.getGrade());
		}
	
	public static void bubbleSort(List<Student> stu) {
		for (int i = 0; i < stu.size(); i++) {
			for(int j = 0; j < stu.size()-i-1; j++) {
				// compare adjacent students and swap if necessary but before it checks the condition
				if (comparedByGrade(stu.get(j), stu.get(j+1)) > 0) {
					Student tempStudent = stu.get(j);
					stu.set(j, stu.get(j+1));
					stu.set(j+1, tempStudent);
				}
			}
		}
	}
	public static void main(String [] args) {
		List<Student> studentList = new ArrayList<>();

        // Creating Student objects and adding them to the list
        studentList.add(new Student("John", 89));
        studentList.add(new Student("Alice", 92));
        studentList.add(new Student("Bob", 78));
        
        System.out.println("Before sorting...");
        for(Student s: studentList) {
        	System.out.println(String.format("%-12s: %d", s.getName(),s.getGrade()));
        }
        
        bubbleSort(studentList);
        System.out.println('\n' + "After Sorting ..");
        for(Student student : studentList) {
        	System.out.println(String.format("%-12s: %d", student.getName(), student.getGrade()));
        }
        
	}
}