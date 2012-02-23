public class item {
	//data fields
	private String name;
	private int qty;
	private int price;
	
	//constructors
	public item(){}
	public item(String n, int q, int p){
		name = n;
		qty = q;
		price = p;
	}
	public item(String n, int p){
		name = n;
		price = p;
		qty = 1;
	}
	
	//setter as getter methods
	public String setName(String n){name = n; return name;}
	public int setQty(int q){qty = q; return qty;}
	public int setPrice(int p){price = p; return price;}
	public String getName(){return name;}
	public int getQty(){return qty;}
	public int getPrice(){return price;}
	public int getTotalPrice(){return price*qty;}
	
	//toString methods
	public String getQtyToString() {Integer i = new Integer(getQty()); return i.toString();}
	public String getPriceToString() {Integer i = new Integer(getPrice()); return i.toString();}
	
	//merging 2 items of same name and price (case insensitive)
	//param: 2 items of same name and price (case insensitive)
	//return: an item class of the name and price and combined quantity
	//precond: must be same name and price, an item instance is not needed, static method
	//post cond: the new item instance is returned, returns null if items are not of same name and price (case insensitive)
	public static item mergeItem(item a, item b){
		if( (a.getPrice() == b.getPrice()) && (a.getName().equalsIgnoreCase(b.getName())) ){
			item newItem = new item(a.getName(), a.getQty()+b.getQty(), a.getPrice());
			return newItem;
		}
		else return null;
	}
	
}
