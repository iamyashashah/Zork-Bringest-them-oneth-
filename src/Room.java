import java.util.ArrayList;



public class Room extends Message {
	private String name;
	private boolean isvisited;
	private long money;
	private int count =0; //counting number of rooms
	
	private String message; //used abstract class
	private String items;


	public Room()
	{
super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getIsvisited() {
		return isvisited;
	}
	public void setIsvisited() {
		this.isvisited = true;
		count++;

	}
	public long getMoney() {
		return money;
	}
	public void addMoney(long money) {
		this.money = money;
	}
	
	public String getItems() {
		return items;
	}
	public void addItems(String items) {
		this.items=items;
	}
	
	

}
