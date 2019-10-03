package collection;

import java.util.ArrayList;
import java.util.Collections;  
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class task1 {

	public static void main(String[] args) {

		Student stu1 = new Student(1, "abcsad", 10);
		Student stu2 = new Student(2, "abcsdfs", 11);
		Student stu3 = new Student(3, "abc324", 12);
		Student stu4 = new Student(4, "abc32", 13);
		Student stu5 = new Student(5, "abc2", 16);

		Students students = new Students();

		Vector<Student> stud = new Vector<>();
		stud.add(stu5);
		stud.add(stu4);
		stud.add(stu3);
		stud.add(stu2);
		stud.add(stu1);
		students.setStudList(stud);

		// user 2

		Students s2 = new Students();

		ArrayList<Student> stud1 = new ArrayList<>();

		stud1.add(stu5);
		stud1.add(stu4);
		stud1.add(stu3);
		stud1.add(stu2);
		stud1.add(stu1);
		s2.setStudList(stud1);
		
		
		List<Student> studList=s2.getStudList();

		
		for(Student stu:studList)
		{
			
			System.out.println(stu);
		}
		
		System.out.println("\n");
		
		Collections.sort(stud1, (d1, d2) -> {
			return d1.getId() - d2.getId();
		});
		
		for(Student stu:studList)
		{
			
			System.out.println(stu);
		}
		
//		System.out.println("Reverse Sorted List using Comparator::" + stud1);
	}

}
