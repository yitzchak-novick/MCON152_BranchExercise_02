package code;

public class HistoryItem {
	private int amount;
	
	public HistoryItem(int amount) {
		this.amount = amount;
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
