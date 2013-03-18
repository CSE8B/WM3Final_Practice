public class ExceptionPractice {
  public static void main(String[] args)throws Exception {
    
	try{
	  //int i =0;
	  //int j= 1/i;
	  int[]a = new int[10];
	    System.out.println(a[10]);
	 }
	catch(ArithmeticException ex){
	  System.out.println(" 1/0 is meaningless");
	}
	catch(Exception ex){
	 System.out.println("Exception");
	 throw new NullPointerException();
	}
	finally
	{
	  System.out.println("Final clause is executed");
    	}
	System.out.println("The end");
    }
  }

