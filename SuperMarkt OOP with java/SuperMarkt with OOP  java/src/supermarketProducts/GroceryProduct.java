package supermarketProducts;

public class GroceryProduct {
	//Concepte Encapsulation 
	/*L'encapsulation est le concept qui consiste à regrouper les données (variables) 
	 * et les méthodes qui les manipulent au sein d'une même unité, appelée classe. 
	 * L'objectif principal de l'encapsulation est de restreindre l'accès aux détails internes de l'objet et
	 *  de protéger les données sensibles en les cachant à l'extérieur de la classe.
	 */
	 private String name ;
	 private double price ;
	 private double discount ;
		public GroceryProduct(String name, double price, double discount) {
			this.name = name;
			this.price = price;
			this.discount = discount;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getActualPrice ()
	{
		return (price -(price * discount/100));
	}
	public String toString ()
	{
		return ("Name : "+name + "\n"+ "discount : " +discount  + "\n"+ "price : "+price  + "\n");
	}

	

}
