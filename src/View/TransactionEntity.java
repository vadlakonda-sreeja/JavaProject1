package View;

public class TransactionEntity {
	private double dept;
	private double with;
	private double balance;
	
	public TransactionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public double getDept() {
		return dept;
	}
	public void setDept(double dept) {
		this.dept = dept;
	}
	public double getWith() {
		return with;
	}
	public void setWith(double with) {
		this.with = with;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "TransactionEntity [dept=" + dept + ", with=" + with
				+ ", balance=" + balance + "]";
	}
	
	

}
