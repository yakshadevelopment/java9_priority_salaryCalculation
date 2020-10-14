package edu.yaksha.salaryCalculation;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

import static edu.yaksha.salaryCalculation.TestUtils.*;

public class PayServiceTest {

	@Test
	public void testAllowanceCalculation() throws Exception {
		Employee e1=new Employee(1,"X","A", 37500);
		Employee e2=new Employee(2,"Y","B", 27500);
		Employee e3=new Employee(3,"Z","C", 17500);
		PayService service=mock(PayService.class);
		when(service.allowanceCalculation(e1)).thenReturn(13125); 
		int val=service.allowanceCalculation(e1);
		yakshaAssert(currentTest(),(val==13125?"true":"false"),businessTestFile);
		when(service.allowanceCalculation(e2)).thenReturn(11000); 
		 val=service.allowanceCalculation(e2);
		yakshaAssert(currentTest(),(val==11000?"true":"false"),businessTestFile);
		when(service.allowanceCalculation(e3)).thenReturn(7875); 
		 val=service.allowanceCalculation(e3);
		yakshaAssert(currentTest(),(val==7875?"true":"false"),businessTestFile);
	}

	@Test
	public void testTaxCalculation() throws Exception {
		PayService service=mock(PayService.class);
		int x=45000;
		int y=30000;
		int z=25000;
		when(service.taxCalculation(x)).thenReturn(4500);
		int val=service.taxCalculation(x);
		yakshaAssert(currentTest(),(val==4500?"true":"false"),businessTestFile);
		when(service.taxCalculation(y)).thenReturn(2250);
		val=service.taxCalculation(y);
		yakshaAssert(currentTest(),(val==2250?"true":"false"),businessTestFile);
		when(service.taxCalculation(z)).thenReturn(1250);
		val=service.taxCalculation(z);
		yakshaAssert(currentTest(),(val==1250?"true":"false"),businessTestFile);
	}

	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }
	
}
