package come.hhj.entity;

public class Address {
	
	private String target;

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	private void show() {
		// TODO Auto-generated method stub
		System.out.println("我的住址是"+this.target);
	}

}
