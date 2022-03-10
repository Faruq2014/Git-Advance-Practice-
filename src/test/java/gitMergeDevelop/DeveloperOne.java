package gitMergeDevelop;

public abstract class DeveloperOne extends HelloDevelop{

	public static void main(String[] args) {
		HelloDevelop dev=new HelloDevelop();
		dev.m1();

	}
	public abstract String abstractMethodOne(String firstName);

}
