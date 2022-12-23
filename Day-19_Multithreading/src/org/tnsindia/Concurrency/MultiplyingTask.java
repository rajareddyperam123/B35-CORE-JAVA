package org.tnsindia.Concurrency;
//callable interfce
public class MultiplyingTask {

	int x,y;
    long sleeptime;
    
    //constructor
    public MultiplyingTask(int x,int y, long sleeptime) {
   	 super();
   	 this.x=x;
   	 this.y=y;
   	 this.sleeptime=sleeptime;
    }
    

	public Object call() throws Exception {
	Thread.sleep(sleeptime);
		return x*y;
	}

}
