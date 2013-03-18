abstract class B{
  protected int num = 2;
  public void add(){add(num);}
  public void add(int n){}
}//end of class

class C{
  int c;
  public C(int n){c++;}
  public void add(int n){++n;}
}//end of class
public class D3 extends C{
  public D3(){super(3);}
  public int add(int n){return 3;}
}//end of class D3