package week13;

public class human {	
		void work() {
			System.out.println("Hi");
		}
	}
class engineer3 extends human{
		void eat() {
			System.out.println("Hey");
		}
}
class student3 extends engineer{
	public static void main(String[]args) {
	student3 std1 = new student3();
	std1.work();
	std1.eat();
	}
}
	

