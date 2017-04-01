
public class ThreadAdd extends Thread{
	
	private long start;
	private long end;
	
	public ThreadAdd(long start, long end){
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run(){
		super.run();
		long startTime = System.currentTimeMillis();
		long ans = 0;
		for (long i = start; i<= end; i++){
			ans += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken from " + getName() +" Thread: "
				+ (endTime - startTime) + "\nSum from " + getName() +" thread: " + ans);
	}
}
