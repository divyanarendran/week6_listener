package week6_Listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer{
	public void transform( ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{
		if(testMethod.getName().contains("TestCase"))
		{
			annotation.setInvocationCount(4); 
		}
		
		annotation.setRetryAnalyzer(RetryTest.class);
	}

}

