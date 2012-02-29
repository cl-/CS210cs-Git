import java.util.*;

public class activity {
	//data fields
	private String name;
	private String desc;
	private ArrayList<item> itemList;
	private int timeStart; //in the form of hhmm, no restriction on digit
	private int timeEnd; //in the form of hhmm, no digit restriction

	//constructors
	public activity(){}
	public activity(String n){name = n;}
	public activity(String n, int ts, int te){
		name = n;
		timeStart = ts;
		timeEnd = te;
	}
	public activity(String n, String d, ArrayList<item> il, int ts, int te){
		name = n;
		desc = d;
		itemList = il;
		timeStart = ts;
		timeEnd = te;
	}
	
	//setters and gettters
	public String setName(String n){name = n; return name;}
	public String setDesc(String d){desc = d; return desc;}
	public ArrayList<item> setItemList(ArrayList<item> il){itemList = il; return itemList;}
	public int setTimeStart(int ts){timeStart = ts; return timeStart;}
	public int setTimeEnd(int te){timeEnd = te; return timeEnd;}
	
	public String getName(){return name;}
	public String getDesc(){return desc;}
	public ArrayList<item> getItemList(){return itemList;}
	public int getTimeStart(){return timeStart;}
	public int getTimeEnd(){return timeEnd;}
	
	public int getTotalPrice(){
		int ans=0;
		for(int i=0;i< getItemList().size();i++){
			ans += getItemList().get(i).getPrice();
		}
		return ans;
	}
	
	
	//
	
}