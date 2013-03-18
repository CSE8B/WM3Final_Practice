
public class Q5 {
	protected int cool = 3;
	protected String cookie = "cookie";
	public Q5(){System.out.print(cookie);}
	public Q5(int n, int p){
	cool = ++n-p;
	System.out.println(cool);
	}
	public Q5(String s){
	  this(1,10);	 
	  }
	
	protected void unfinished(){
	  System.out.println(cool);
		}
	public static void main(String[] args) {
		  Q5 p1;
		  B cc;
		  cc = new B("a");
		  cc.unfinished();
		  cc.finished();
		  p1 = new Q5(2,3);
		  p1.unfinished();
		  p1 = cc;
		  p1.unfinished();
		  
		  }
}
	
	class B extends Q5{
		String yummy = "Y";
		public B(){super("A");}
		public B(String s){super();System.out.println(yummy);}
		
		protected void unfinished(){
			yummy = "Good";
			System.out.println(yummy);
		}
		public int finished(){
	      return 1; 
		}
		
		
	}
	

