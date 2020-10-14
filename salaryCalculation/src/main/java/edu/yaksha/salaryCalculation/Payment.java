package edu.yaksha.salaryCalculation;

public class Payment {
	private Integer id;
	private String name;
	private Integer basic;
	private Integer allowance;
	private Integer gross;
	private Integer tax;
	private Integer net;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Payment(Integer id, String name, Integer basic, Integer allowance, Integer gross, Integer tax, Integer net) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.allowance = allowance;
		this.gross = gross;
		this.tax = tax;
		this.net = net;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBasic() {
		return basic;
	}
	public void setBasic(Integer basic) {
		this.basic = basic;
	}
	public Integer getAllowance() {
		return allowance;
	}
	public void setAllowance(Integer allowance) {
		this.allowance = allowance;
	}
	public Integer getGross() {
		return gross;
	}
	public void setGross(Integer gross) {
		this.gross = gross;
	}
	public Integer getTax() {
		return tax;
	}
	public void setTax(Integer tax) {
		this.tax = tax;
	}
	public Integer getNet() {
		return net;
	}
	public void setNet(Integer net) {
		this.net = net;
	}
	@Override
	public String toString() {
		return String.format("%-5s %-10s %-10s %-10s %-10s %-10s %-10s",id,name,basic,allowance,gross,tax,net);
	}
    

}
