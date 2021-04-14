package calculator.CalculatorAssignment;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TmpSuiteListener implements ISuiteListener {
	
	 public void onFinish(ISuite suite) {
	    System.out.println("Finishing");
	  }
	 
	  public void onStart(ISuite suite) {
	    System.out.println("Starting");
	  }


}
