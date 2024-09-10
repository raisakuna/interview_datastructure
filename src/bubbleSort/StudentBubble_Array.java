package bubbleSort;

import java.util.List;

public class StudentBubble_Array {
	
	// compare two students based on their grades
	public static int compareByGrade(Student s1, Student s2) {
		// Integer.compare is a built in function of Integer class that returns 0,1, -1
		// Comparing (s1's grade) and (s2's grade)
		return Integer.compare(s1.getGrade(),s2.getGrade()); 
	}
	
	// Passing an array of Student object
	public static void bubbleSort(Student[]  student) {
		for (int i =0; i < student.length; i++) {
			
			// iterates over the remaining unsorted elements.
			for (int j = 0; j < student.length -i-1; j++) {
				// compare two adjacent students and swap if needed
				if(compareByGrade(student[j], student[j+1])>0) {
					// swap student
					Student tempStudent =  student[j];
					student[j] = student[j+1];
					student[j+1] = tempStudent;
					
				}
			}
		
		
		}
	}
	public static void main (String [] args) {
		Student[] students = {
				new Student("John", 75),
				new Student("Adam", 89),
				new Student("Bob", 65),};
		
		System.out.println("Before sorting ...");
		for(Student student : students) {
			System.out.println(String.format("%-12s: %d", student.getName(), student.getGrade()));
			
		}
		
		bubbleSort(students);
		System.out.println('\n' + "After sorting ...");
		for(Student stu: students) {
			System.out.println(String.format("%-12s: %d", stu.getName(),stu.getGrade()));
		}
	}

}
