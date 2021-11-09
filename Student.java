class Student {

	int roll;
	String name, stream, college;

	Student(int roll, String name, String stream, String college) {

		this.roll = roll;
		this.name = name;
		this.stream = stream;
		this.college = college;
	} // end of constructor

	void show() {

		System.out.println("roll = " + roll);
		System.out.println("name = " + name);
		System.out.println("stream = " + stream);
		System.out.println("college = " + college);
	} // end of show()

	public static void main(String args[]) {

		Student ob1 = new Student(Integer.parseInt(args[0]), args[1], args[2], args[3]);
		Student ob2 = new Student(Integer.parseInt(args[4]), args[5], args[6], args[7]);

		System.out.println("Student1 :-");
		ob1.show();
		System.out.println();
		System.out.println("Student2 :-");
		ob2.show();
	} // end of main()
} // end of class Student
//java Student 52 Mainak CSE IIT 53 Bhargav Arts CUDS
