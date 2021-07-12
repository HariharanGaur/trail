package threadsPrac;
import java.util.*;
public class Threads extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		System.out.println("Threads thread "+i);
	}

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Threads thread1=new Threads(); hello thread2=new hello();
		 * 
		 * thread2.setName("news"); thread2.setPriority(MAX_PRIORITY);
		 * 
		 * thread1.start(); thread2.start(); thread1.join();
		 * 
		 * 
		 * System.out.println(thread1.getState());
		 */
		
		
		EmpService empService = new EmpService();

        // START : THREAD 1
        
        Thread empThread1 = new Thread(empService);

        // START : THREAD 2
       
        Thread empThread2 = new Thread(empService);

        // start the thread
        empThread1.start();
        empThread2.start();
        
        empService.getIntegers().forEach(in-> System.out.println("INT "+in));

	}

}

class hello extends Thread{
	@Override
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println("Hello thread "+i);
		}
	}
}



class EmpService implements Runnable{

    private List<Integer> integers = Collections.emptyList();

    @Override
    public void run() {
        integers = new ArrayList<>();

        for (int i = 100; i > 0 ; i--) {
        	if(!integers.contains(i))
        		integers.add(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException inEx){
                System.err.println(inEx);
            }

            System.out.println(Thread.currentThread().getName() + " ---- "+i);
        }
    }

    public List<Integer> getIntegers() {
        return integers;
    }
}
