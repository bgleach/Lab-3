package pokerEnums;

public enum eHand {
	ShortHand(1);
	
	private eHand(final int Nbr){
		this.Nbr = Nbr;
	}
	
	private int Nbr;
	
	public int getNbr(){
		return Nbr;
	}
}
