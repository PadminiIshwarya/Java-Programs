package reflectionpackage;

interface Age{
	void age(int age);
}

public class ReflectionDemo implements Age {
	public int num;
	public int id;
	private String name;
	ReflectionDemo()
	{
		System.out.println("in constructor");
	}
	public void registerMem(String memName)
	{
		//memName=name;
		System.out.println("In registerMem() having parameter " + memName);
	}
	private void displayDetails(int id,String memName) {
		System.out.println("In displayDetails()");
		System.out.println("Id :" + id);
		System.out.println("Name :" + memName);
	}
	public void age(int age)
	{
		System.out.println("Age :" + age);
	}
}
