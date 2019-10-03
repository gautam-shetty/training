package collection;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int marks;

	public Student(int i) {
		this.id = i;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student() {

	}

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student d) {
		return this.id - d.getId();
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + marks;
	}

}