package org.tnsindia.Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ConcurrentThreadDemo {

	public static void main(String[] args) {
        MultiplyingTask task1= new  MultiplyingTask(10,20,1000);
        MultiplyingTask task2= new  MultiplyingTask(15,10,2000);
        
        @SuppressWarnings({ "unchecked", "rawtypes" })
		FutureTask<Integer>f1=new FutureTask((Callable) task1);
        @SuppressWarnings({ "unchecked", "rawtypes" })
		FutureTask<Integer>f2=new FutureTask((Callable) task2);

        
        ExecutorService excecutor=Executors.newFixedThreadPool(2);
        excecutor.execute(f1);
   excecutor.execute(f2);
        
        
        while(true)
        {
       	 try
       	 {
       		 if(!f1.isDone())
       		 {
       			 System.out.println("FutureTask1 output="+f1.get());
       		 }
       		 if(!f2.isDone())
       		 {
         			 System.out.println("FutureTask2 output="+f1.get()); 
       		 }
       		 if(!f1.isDone() && f2.isDone())
       		 {
       			 System.out.println("Completed both the FutureTask,Shutting down the excecutor");
       			 excecutor.shutdown();
       			 return;
       		 }
       	 }
       	 catch(InterruptedException e)
       	 {
       		 System.out.println("Exception handled" +e);
       	 }
       	 catch(ExecutionException e)
       	 {
       		 System.out.println("Exception handled" +e);
       	 }
        }
	}
}

