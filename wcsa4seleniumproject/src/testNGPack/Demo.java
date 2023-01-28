package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() {
	  System.out.println("ramling!!");
	  Reporter.log("ramling!!!!!!!",true);
  }
  @Test
  public void demo1()
  {
	 
	  Reporter.log("This is demo1 method",true);
  }
  @Test
  public void demo2()
  {
	  int a=10;
	  int b=2;
	  int res=a/b;
	  Reporter.log("This is demo1 method",true);
  }
}
