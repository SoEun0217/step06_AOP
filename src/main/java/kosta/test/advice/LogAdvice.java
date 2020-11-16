package kosta.test.advice;

import java.io.File;
import java.io.FileWriter;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	FileWriter fw = null;
	public LogAdvice() {}
	
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		String methodName = joinPoint.getSignature().getName();
		Object [] params = joinPoint.getArgs();
		File file = new File("result/result.txt");
		fw = new FileWriter(file,true);
		fw.write(methodName+"호출");
		
		
		Object obj = joinPoint.proceed();
		
		return obj;
	}
	
}
