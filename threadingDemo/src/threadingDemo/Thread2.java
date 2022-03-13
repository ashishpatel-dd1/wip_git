package threadingDemo;

class Thread2 implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Thread2 is running");
			
		} catch (Exception e) {
			System.out.println("Exception raised in Thread2" + e);
		}
	}
}
