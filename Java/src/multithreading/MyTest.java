package multithreading;

class TestT extends Thread{
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+"Hitesh");
			i++;
		}
	}
}

public class MyTest implements Runnable {
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+"hello");
			i++;
		}
	}
	public static void main(String[] args) {
		MyTest t = new MyTest();
		Thread th = new Thread(t);
		th.setDaemon(true);
		th.start();
		TestT t1 = new TestT();
		t1.start();
		
		int i=1;
		while(true) {
			System.out.println(i+"world");
			i++;
		}
		
	}

}
