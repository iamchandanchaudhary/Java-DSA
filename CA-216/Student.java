class Student {
	int id = 101;
	int rollno = 23211;
	String name = "Chandan Chaudhary";
	String program = "BCA";

	public void getInfo() {
		System.out.println("Id: " + this.id);
		System.out.println("Roll no.: " + this.rollno);
		System.out.println("Name: " + this.name);
		System.out.println("Program: " + this.program);
	}
	
	public static void main(String agrs[]) {
	
	Student s1 = new Student();
	s1.getInfo();
	}
	
}