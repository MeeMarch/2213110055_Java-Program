
public class PattanakarnBranch extends Product{
	
	private int payUnit() {
		return super.getUnit();
	}
	
	private int freeUnit() {
		return super.getUnit()-this.payUnit();
	}
	
	public int getTotalprice() {
		return this.payUnit()*100;
	}
	
	//@Override
	public String toString() {
		return "You buy "+this.payUnit()+" units, get free"+this.freeUnit()+" units ("+this.getTotalprice()+")"; 
	}
}
