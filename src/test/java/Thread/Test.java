package Thread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try{
			MyThread mythread = new MyThread();
			mythread.setName("myThread");
			mythread.start();
			for(int i=0; i<10; i++){
				int time = (int)(Math.random()*1000);
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			}
		}catch(Exception e){
			e.printStackTrace();
		}*/
		
		final StringBuffer str = new StringBuffer("sd");
		str.append("123");
		System.out.println(str);
		
	}

}
