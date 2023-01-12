package Enums;


//We are creating this class to setup our priorities... for this case lets use 3... min, norm, max. 
public enum Priority {
	
		// MIN,NORM,MAX ==> Works perfectly, but we can customize the values ourselves. 
		
		MIN(1),NORM(5),MAX(10);
	
		// Those 3 values are instancies of Priority.
		// Priority is a Class, MIN,NORM,MAX are objects of this class that are automatically created to you. 
		
		
		//Besides the methods already in place at the ENUM class, we can create other methods. 
		
		
		private int value; 
		
		
		Priority(int value){
			this.value = value;
		}
		
		
		public int getValue() {
			return this.value;
		}
		

}
