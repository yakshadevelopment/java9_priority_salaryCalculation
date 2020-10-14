package edu.yaksha.salaryCalculation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/**
 * Hello world!
 *
 */
public class Main 
{
	private static List<Employee> readEmployeesFromFile() throws Exception
	{
	List<Employee> employeeList=new ArrayList<Employee>();
	FileReader fileReader=new FileReader("Employee.txt");
	BufferedReader bufferedReader=new BufferedReader(fileReader);
	while(true)
	{
		String str=bufferedReader.readLine();
		if(str==null)
			break;
		String arr[]=str.split("-");
		Employee employee=new Employee(Integer.parseInt(arr[0]), arr[1], arr[2],Integer.parseInt(arr[3]));
		employeeList.add(employee);
	}
	
	return employeeList;
	}
	private static void  writePaymentsToFile(List<Payment> paymentList) throws Exception
	{
		FileWriter fileWriter=new FileWriter("Payment.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		for(Payment payment:paymentList)
		{
			String str=payment.getId()+"-"+payment.getName()+"-"+payment.getBasic()+"-"+payment.getAllowance()+"-"+payment.getGross()+"-"+payment.getTax()+"-"+payment.getNet();
			bufferedWriter.write(str);
			bufferedWriter.flush();
			bufferedWriter.newLine();
		}
		
	}

    public static void main( String[] args ) throws Exception
    {
       List<Employee> employeeList=readEmployeesFromFile();
       List<Payment>  paymentList=new ArrayList<Payment>();
       for(Employee employee:employeeList)
       {
    	   int id=employee.getId();
    	   String name=employee.getName();
    	   int basic=employee.getBasic();
    	   int allowance=new PayService().allowanceCalculation(employee);
    	   int gross=basic+allowance;
    	   int tax=new PayService().taxCalculation(gross);
    	   int net=gross-tax;
    	   Payment payment=new Payment(id, name, basic, allowance, gross, tax, net);
    	   paymentList.add(payment);
       }
       
       paymentList.forEach(System.out::println);
       writePaymentsToFile(paymentList);
       
    }
}
