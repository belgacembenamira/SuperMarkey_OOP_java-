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
	/* Red�finition de m�thode.
	 * Red�finition de m�thode (Overriding) :

La red�finition de m�thode se produit
 lorsqu'une classe d�riv�e fournit 
 une impl�mentation sp�cifique
  d'une m�thode qui est 
d�j� d�finie dans sa classe de base.*/
    public String toString ()
    {
    	return super.toString()+ "Sugar Level " +SugarLevel +"\n";
    }
/*Overloading La surcharge de m�thode se produit lorsqu'une 
 * classe a plusieurs m�thodes du m�me nom mais
 *  avec des signatures diff�rentes 
 * (types ou nombres de param�tres diff�rents).*/
	@SuppressWarnings("static-access")
	@Override
	public boolean isHealthy() {
		// TODO Auto-generated method stub
		return SugarLevel!= SugarLevel.ADDED_SUGER;
	}
}
