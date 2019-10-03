//getters and setters part 1
public class day9four {

	private int studId;

	public int getStudId() {
		return studId;
	}
	
	public void setStudId(int studId) {
		if(studId < 100) {
			this.studId = studId;
		}
	}

	public day9four(int studId) {
		if(studId < 100) {
			this.studId=studId;
		}
	}

	void dispStudent()	{
		if(studId!=0) {
			System.out.println("Stud Id "+studId);
		} else {
		System.out.println("Invalid stud details");
		}
	}

}
