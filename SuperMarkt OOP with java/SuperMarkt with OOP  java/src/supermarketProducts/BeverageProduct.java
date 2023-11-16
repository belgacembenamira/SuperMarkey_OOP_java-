package supermarketProducts;

public class BeverageProduct extends GroceryProduct implements Drinkble {
	private SugarLevel SugarLevel;

	public BeverageProduct(String name, double price, double discount,SugarLevel SugarLevel) {
		super(name, price, discount);
		this.SugarLevel=SugarLevel;
	}

	public SugarLevel getSugarLevel() {
		return SugarLevel;
	}

	public void setSugarLevel(SugarLevel sugarLevel) {
		SugarLevel = sugarLevel;
	}
	/* Redéfinition de méthode.
	 * Redéfinition de méthode (Overriding) :

La redéfinition de méthode se produit
 lorsqu'une classe dérivée fournit 
 une implémentation spécifique
  d'une méthode qui est 
déjà définie dans sa classe de base.*/
    public String toString ()
    {
    	return super.toString()+ "Sugar Level " +SugarLevel +"\n";
    }
/*Overloading La surcharge de méthode se produit lorsqu'une 
 * classe a plusieurs méthodes du même nom mais
 *  avec des signatures différentes 
 * (types ou nombres de paramètres différents).*/
	@SuppressWarnings("static-access")
	@Override
	public boolean isHealthy() {
		// TODO Auto-generated method stub
		return SugarLevel!= SugarLevel.ADDED_SUGER;
	}
}
