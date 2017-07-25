package come.hhj.entity;

public class User {
	private String hello;
	private String world;
	public User(String hello,String world) {
		this.hello=hello;
		this.world=world;
		
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address.getTarget() + "]";
	}
	public String getHello() {
		return hello;
	}
	public String getWorld() {
		return world;
	}
	private String name;
	private int age;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
