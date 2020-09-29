package week13;

public class human2 {
	void work() {
		System.out.println("Facebook");
	}
	void eat() {
		System.out.println("Instagram");
	}
}
class engineer extends human2{
	void run() {
		System.out.println("Say Hi");
	}
}
class student extends human2{
	public static void main(String[]args) {
		student st = new student();
		engineer en = new engineer();
		st.work();
		en.run();
	}
}
