package multiThreading;

public class TestJoinThread extends Thread {
	
	public void run(){
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		}
	}
	
	
	public static void main(String args[]){
		
		TestJoinThread t1 = new TestJoinThread();
		TestJoinThread t2 = new TestJoinThread();
		TestJoinThread t3 = new TestJoinThread();
	
		t1.start();
		try{
		t1.join(2000);
		}catch(Exception e){
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
	

}
