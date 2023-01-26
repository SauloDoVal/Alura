package Pilha;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
       try { metodo1();
       } catch(ArithmeticException | NullPointerException  ex) {
    	   String msg = ex.getMessage(); // .getMessage = This is a method from the class ArihmeticException that give me the error message
    	   //System.out.println("Excessão Aritimética: " + msg);
    	   System.out.println("Excessão: " + msg);
    	   ex.printStackTrace(); // I can also ask for the path that the error/exception has pass...
       } 
//         catch(NullPointerException ex) { // instead of this block of code, I can put a | as "or" and put the 2 exceptions over the same method  
//    	   String msg = ex.getMessage(); 
//    	   System.out.println("Excessão de Apontador: " + msg);
//    	   ex.printStackTrace(); 
//       } 
       System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            
            //EX2:
            
            Conta c = null; 
//            c.deposita(); 
            
            
            // This will create a NullPointerException, as c is pointing at a object that does not exist. 
            // The catch that we have at line 8 is only for ArithmeticException, it wont take a NullPoiterException
            // So we will need to create a new catch for this exception at line 12
            
            
            
           //EX:1 
            //int a = i / 0; 
//            try {
//            	int a = i / 0; 
//            } catch(ArithmeticException ex) {
//            	System.out.println("Excessão Aritimética");
//            }
            
			// As we know, we cannot be divided a number by ZERO. this will throw a
			// exception
			// Exception in thread "main" java.lang.ArithmeticException: / by zero
			// the main will print things till this exception is reached.
			// The exceptions change the flow of methods at the stack
            // To overcome this problem we can use try/catch, we ask the code to try certain things... 
            // and if it happens, if it catches it... say something back. In our case "Excessão Aritimética"
            // That Will appear at the console, but the program (and the loop at the method) will keep running.
        }
        System.out.println("Fim do metodo2");
    }
}