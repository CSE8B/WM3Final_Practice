

  class Bird{
		protected int tweet;
		
		public Bird(){
			tweet = 1;
			System.out.println(tweet);
		 }
		
		public Bird(int b1){
			tweet = b1;
			System.out.println(tweet);
		}
		
		public void song(){
			System.out.println(tweet);
		}
	}
	
	public class Q3 extends Bird{
		protected int hoot;
		
		public Q3(){
		    this(3);
			//hoot = 2;
		}
		
		public Q3(int h1){
			super(h1);
			hoot = 3;
			System.out.println(tweet+ hoot);
		}
		
		public void song(){
			System.out.println(hoot);
		}
		
		public void song(int s){
			System.out.println(s);
		}
		
		public void test(Bird a){
		  System.out.println(hoot);
		}
		
		public static void main(String[] args) {
			Bird b; 
			Q3 ow;
			b = new Bird();
			b.song();
			ow = new Q3();
			//b.song();
			ow.song(6);
			b = new Q3();
			b.song();
		 }
		}
