package abc;


public class Calculator {
	 Library lib = new Library(200);
	 
  public int add(int a, int b) {
    return a + b;
  }
  public int extract(int a,int b){
	  return a-b;
  }
  public int combine(int a, int b){
	  
	 return lib.someMethod1()+a+b;
	 
  }
}