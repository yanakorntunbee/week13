package week13;

public class son implements father,mather{

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("FB: Bestieliu Chairungrot");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("IG: bestieliu");
	}
	public static void main(String[]args) {
		son st = new son();
		st.cook();
		st.eat();
	}
	
}