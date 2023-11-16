package supermarketProducts;

public class GroceryProduct {
	//Concepte Encapsulation 
	/*L'encapsulation est le concept qui consiste � regrouper les donn�es (variables) 
	 * et les m�thodes qui les manipulent au sein d'une m�me unit�, appel�e classe. 
	 * L'objectif principal de l'encapsulation est de restreindre l'acc�s aux d�tails internes de l'objet et
	 *  de prot�ger les donn�es sensibles en les cachant � l'ext�rieur de la classe.
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
