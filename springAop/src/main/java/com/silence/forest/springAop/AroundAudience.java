package com.silence.forest.springAop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAudience {
	public void watchPerformance(ProceedingJoinPoint joinpoint){
		try{
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones");
			long start = System.currentTimeMillis();
			
			joinpoint.proceed();
			
			long end = System.currentTimeMillis();
			System.out.println("clap clap clap");
			System.out.println("the performance toke "+(end-start)+" milliseconds.");
		}catch(Throwable t){
			System.out.println("Boo! We want our money back!");
		}
	}

}
