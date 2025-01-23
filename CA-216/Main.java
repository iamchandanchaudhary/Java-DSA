class Student {
	int id = 101;
	int rollno = 23211;
	String name = "Chandan Chaudhary";
	String program = "BCA";

	public void getInfo() {
		System.out.println(this.id);
		System.out.println(this.rollno);
		System.out.println(this.name);
		System.out.println(this.program);
	}
	public static void main(String[] agrs) {
	
	Student s1 = new Student();
	s1.getInfo();
	}
}