package Week3.Day2;

public class Automation extends Abstraction implements TestTool,Language{

	public static void main(String[] args) {
		Automation a =new Automation();
		a.java();
		a.selenium();
		a.ruby();
		a.python();
	}

	public void java() {
		System.out.println("I am from Language Interface");
	}

	public void selenium() {
		System.out.println("I am from TEstTool Interface");
	}

	@Override
	void ruby() {
		System.out.println("I am Ruby from Abstract class");
		
	}

	@Override
	void python() {
		System.out.println("I am Python from Abstract class");
		
	}

}
