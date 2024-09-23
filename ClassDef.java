class Student{
	int id;
	String name;
	String college;
	String course;
	int fee;
	@Override
	public String toString() {
		return "Student [id=" + id + "\n name=" + name + "\n college=" + college + 
				"\n course=" + course + "\n fee=" + fee
				+ "]";
	}

	
	Student(int id,	String name,
	String college,
	String course,
	int fee){
		
		this.id = id;
		this.name = name;
		this.college = college;
		this.course = course;
		this.fee = fee;
		
	}
	
}



public class ClassDef {

	public static void main(String[] args) {
	
		Student ramu = null;
		ramu = new Student(123, "Ramu", "AVANTHI", "EEE", 35000);
		
		Student shyam = null;
		shyam = new Student(124, "Shyam", "AVANTHI", "EEE", 45000);
		
		
		System.out.println(ramu);
		System.out.println(shyam);
	}

}

