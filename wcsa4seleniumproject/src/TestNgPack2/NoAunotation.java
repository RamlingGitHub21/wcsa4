package TestNgPack2;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAunotation {
  @Test
  public void test() {
	  Reporter.log("@Test Anotation",true);
  }
  @BeforeSuite
  public void beforeSuit() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("@beforeTest Annotation",true);
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("@beforeMethod Annotation",true);
  }
  @AfterSuit
  public void AfterSuit() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @BeforeSuite
  public void beforeSuit() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @BeforeSuite
  public void beforeSuit() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @BeforeSuite
  public void beforeSuit() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @BeforeSuite
  public void beforeSuit() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @BeforeSuite
  public void beforeSuit() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @BeforeSuite
  public void beforeSuit() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @BeforeSuite
  public void beforeSuit() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("@beforeSuit Annotation",true);
  }
}
