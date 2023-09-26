package code;

import java.util.Date;



public class HistoryItem {
	private int amount;
	private Date date;
	private String description;
	
	public HistoryItem(int amount, Date date, String description) {
		this.amount = amount;
		this.date = date;
		this.description = description;
	}
	
	
	public int getAmount() {
		return amount;
	}
	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Amount: "+ amount);
		return sb.toString();
	}
}
