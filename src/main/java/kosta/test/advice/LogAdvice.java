package kosta.test.advice;

import java.io.File;
import java.io.FileWriter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LogAdvice {
	FileWriter fw = null;

	public LogAdvice() {}

	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		StopWatch sw = new StopWatch();
		sw.start();
		String methodName = joinPoint.getSignature().getName();
		Object[] params = joinPoint.getArgs();
		File file = new File("result.txt");
		fw = new FileWriter(file, true);
		fw.write(methodName + "호출  /  인수 개수 : "+params.length+" / ");

		Object obj = joinPoint.proceed();
		sw.stop();
		fw.write("리턴 값 : "+obj +" / 총 실행 시간 : "+sw.getTotalTimeMillis()+"ms\n");
		fw.flush();
		fw.close();
		return obj;
	}

}
