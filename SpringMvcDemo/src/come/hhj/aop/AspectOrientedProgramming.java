package come.hhj.aop;


public class AspectOrientedProgramming {
	
	public void after() {
		// TODO Auto-generated method stub
		System.out.println("after");
	}
	public void before(){
		System.out.println("before:"+System.currentTimeMillis());
		
	}
	public void around() {
		System.out.println("-------------");

	}

}
