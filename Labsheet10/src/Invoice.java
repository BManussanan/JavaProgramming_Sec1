
public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id,Customer customer,double amount) {
		this.id=id;
		this.customer = customer;
		this.amount=amount;
	}
	public int getID() {
		return this.id;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public void setCustomer(Customer customer) {
		this.customer= customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount=amount;
	}
	public int getCustomerID() {
		return this.id;
	}
	public String getCustomerName() {
		return getCustomer().getName();
	}
	public int getCustomerDiscount() {
		return getCustomer().getDiscount();
	}
	public double getAmountafterDiscount() {
		return (getAmount()*(100-getCustomerDiscount()))/100;
	}
	public String toString() {
		return "Invoice[id="+this.id+",customer="+customer.toString()+",amount="+getAmountafterDiscount()+"]";
	}
}
