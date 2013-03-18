import java.io.*;

public class InputOutput {
  public static void main(String[] args) throws IOException {
	  int i =0;	
do{
	int num;
	String str = null;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a number: ");
	str = in.readLine();
	try{
		num = Integer.parseInt(str);
		i++;
    }
	catch(NumberFormatException e){
		System.err.println("BAD: " + str);
		i++;
	}
	
  }while(i<3);
}
}