package come.hhj.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspectjj {
	
	@After("execution(* come.hhj.aop.AnimalServiceImplement2.*(..))")
	public void after (JoinPoint jp) {	//JoinPoint表示正在执行的方法，而对于环绕ProceedingJoinPoint表示正在执行的方法
		String name=jp.getSignature().getName();
		System.out.println(name+"方法执行之后");
	}
	/*@Before("execution(*  come.hhj.aop.AnimalServiceImplement2.*(..))")
	public void before(){
		System.out.println("方法执行之前");
	}
	@Around("execution(*  come.hhj.aop.AnimalServiceImplement2.*(..))")//你想要环绕的类的地址
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("还绕前");
		Object obj=pjp.proceed();//执行目标方法
		System.out.println("还绕后");
		return obj;
	}
	@Around("execution(*  come.hhj.aop.AnimalServiceImplement2.*(..))")//你想要环绕的类的地址
	public void another(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("-----------------------");
		pjp.proceed();//执行目标方法
		System.out.println("---------------");
		
	}*/

}
