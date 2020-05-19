package artifactsproject;

public class Payment {
	private int payment_id;
	private String cut_name;
	
	public Payment(int payment_id, String cut_name) {
		this.payment_id = payment_id;
		this.cut_name = cut_name;
	}
	
	public void dis()
	{
		System.out.println("cust_name:"+cut_name+"payment id:"+payment_id);
	}
	
	

	}


