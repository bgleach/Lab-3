package pokerExceptions;
import pokerBase.Hand;
import pokerEnums.eHand;

public class HandException extends Exception {
	Hand h;
	eHand nbr;
	public HandException(Hand h, eHand nbr) {
		super();
	}
}
