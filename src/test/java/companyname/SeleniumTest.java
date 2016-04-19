package companyname;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.BeforeClass;
import org.junit.ComparisonFailure;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SeleniumTest {

       @BeforeClass
       public static void BeforeClass01() throws Exception  {
       }

       // Test data generator
       @Parameters(name = "Iteration # {index} : act: {2};  exp: {1}")
       public static Collection<String[]> data() throws IOException 
       {
        companyname.Selenium selenuim = new companyname.Selenium();
       return Arrays.asList(selenuim.csvDataArray());
       }

     // @Parameter for Field injection instead of Constructor

    @Parameter(value = 0)
    public String test_id;

    @Parameter(value = 1)
     public String actual_Result;
   @Parameter(value = 2)
  public String expected_Result;

     @Test

     public void test_Title_Validation()  throws ComparisonFailure 
     {
    	 System.out.println("Test Case: " + test_id + " Actual Result: " + actual_Result +  " Expected Result: " + expected_Result );
       assertEquals("FAILED", actual_Result, expected_Result);

       }


}

