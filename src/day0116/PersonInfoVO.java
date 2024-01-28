package day0116;

public class PersonInfoVO {
	
	private String name;
	private String address;
	private int age;
	
	public PersonInfoVO() {
		
	}	// PersonInfo
	
	public PersonInfoVO(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}	// PersonInfo

	public String getName() {
		return name;
	}	// getName

	public String getAddress() {
		return address;
	}	// getAddress

	public int getAge() {
		return age;
	}	// getAge
	
}	// class
