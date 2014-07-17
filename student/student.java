class student{
	int age;
	String name;
	double gpa;
	public student() {
		age = 16;
		name = "Raashid";
		gpa = 1;
	}
	public student(int a, String n) {
		age = a;
		name = n;
		gpa = 1.43433434343;
	}
	public student(double g){
		age = 16;
		name = "Raashid";
		gpa = g;
	}
	public student(String n){
		name = n;
		gpa = 2.8;
		age = 16;
	}
	public student(int a, String n, double g){
		age = a;
		name = n;
		gpa = g;
	}
	//===============================================================================================================================
	//swegthod
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public double getGPA(){
		return gpa;
	}
	public boolean ageTest(){
		if (age == 16) {
			return true;
		}		 
		else {
			return false;
		}
	}

	public static void main(String[] args){
		student Raashid = new student();
		student Tianshi = new student(17,"Tianshi",2.9);
		student Kadi = new student("Kadi");
		if (Kadi.ageTest()) {
			System.out.println("True!");
		}
		else {
			System.out.println("Falsu!");
		}
		System.out.println(Raashid.getAge());
		System.out.println("His name is " + Raashid.getName() + " and he is " + Raashid.age + " years old.");
		System.out.println("He is 16. That is "+ Raashid.ageTest());
	}
}