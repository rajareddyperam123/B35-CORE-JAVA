package org.tnsindia.builtinannotationdemo;

import java.lang.annotation.Documented;
import java.lang.reflect.Method;
@Documented
@interface MyCustom
{
	//abstract method
	String print();
	
}
class MyCustomAnnotation
{
	@MyCustom(print="C2TC-JFS")
	public void display()
	{
		System.out.println("Hey, today is the thursday.....");
	}
}
//driver class
public class CustomAnnotationDemo {

	public static void main(String[] args) throws NoSuchMethodException, Exception {
		MyCustomAnnotation m=new MyCustomAnnotation();
		m.display();
		Method m1=m.getClass().getMethod("display");
		MyCustom obj=m1.getAnnotation(MyCustom.class);
		System.out.println(obj.print());

	}

}


