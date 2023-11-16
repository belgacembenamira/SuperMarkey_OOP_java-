package supermarketProducts;

public class DairyProduct  extends GroceryProduct{
	private Fat Fat ;

	public DairyProduct(String name, double price, double discount ,  Fat Fat) {
		super(name, price, discount);
		this.Fat =Fat; 
	}

	public Fat getFat() {
		return Fat;
	}

	public void setFat(Fat fat) {
		Fat = fat;
	}
	/* Overriding*/
	public String toString ()
	{
		return  super.toString()+" Fat Level " + Fat + "\n";
	}


}
