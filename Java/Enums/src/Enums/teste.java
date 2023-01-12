package Enums;

public class teste {
	
	public static void main(String[] args) {
		
		Thread t = new Thread (() -> System.out.println("Running..."));
		
		
		//When running threads we can establish priorities of the threads running, to do that we have the method setPriority that recives an int
		//Going to the documentation of Threads we can see that there are 3 defined priorities (MAX_PRIORITY, MIN_PRIORITY and NORM_PRIORITY)
		//we can use the class thread using numbers, but the intent of the ones who created is for us to use the names above 
		//Instead of => t.setPriority(1); we could use
		t.setPriority(Thread.MAX_PRIORITY);
		//We can see that MAX_PRIORITY is a int by printing it.
		System.out.println("MAX_PRIORITY is equal = " + Thread.MAX_PRIORITY);
		System.out.println("MIN_PRIORITY is equal = " + Thread.MIN_PRIORITY);
		System.out.println("NORM_PRIORITY is equal = " + Thread.NORM_PRIORITY);
		
		// Enums exists to define contstans, fixed values, like the one above... where we just have 3 values. 
		// Enums came from the word Enumeration. 
		
		
		
		t.start();
		
		
		
		
	}
	
	
	

}
