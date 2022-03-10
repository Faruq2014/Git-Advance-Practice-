package gitMergeDevelop;

public class DeveloperTwo extends DeveloperOne{

	public static void main(String[] args) {
		DeveloperOne dev=new DeveloperTwo();
		dev.abstractMethodOne("Fabiha");
		dev.m1();
		
	}

	@Override
	public String abstractMethodOne(String firstName) {
		 System.out.println(firstName);
		return null;
	}

}
