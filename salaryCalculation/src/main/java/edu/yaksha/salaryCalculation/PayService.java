package edu.yaksha.salaryCalculation;

public class PayService {
	public int allowanceCalculation(Employee emp)
	{
		String grade=emp.getGrade();
		int basic=emp.getBasic();
		double val=0.0;
		if(grade.equalsIgnoreCase("A"))
			val=(double)basic*0.35;
		else if(grade.equalsIgnoreCase("B"))
			val=(double)basic*0.4;
		else if(grade.equalsIgnoreCase("C"))
			val=(double)basic*0.45;
		int allowance=(int)val;
		return allowance;
	}
	public int taxCalculation(int gross)
	{
		
		double val=0.0;
		if(gross>=45000)
			val=(double)gross*0.1;
		else if(gross>=30000)
			val=(double)gross*0.075;
		else 
			val=(double)gross*0.05;
		int tax=(int)val;
		return tax;
	}
	
	

}
