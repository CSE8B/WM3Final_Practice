
public class Recursive {
  public static void main(String[] args) {
		down_up(4);
	}

  public static void down_up(int n){
	  System.out.println("Level" + n);
	   if(n>1)
		   down_up(n-1);
	   System.out.println("LEVEL " + n);
  }
  
}
