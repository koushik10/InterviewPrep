package multiThreading;

	/*Java program showing what happens when a run() method is started directly before start()*/
	public class TestCallRun extends Thread{

		public void run(){
			for(int i=0;i<5;i++){
				try{
					Thread.sleep(500);
				}
				catch(InterruptedException e){
					System.out.println(e);
				}
				System.out.println(i);
			}
		}
		
	/* Here the run() method is treated as a normal objct and not a thread object*/
		public static void main(String args[]){
			TestCallRun t1 = new TestCallRun();
			TestCallRun t2 = new TestCallRun();
			t1.run();
			t2.run();
		}

}
