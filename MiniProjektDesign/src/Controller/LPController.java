package Controller;
import model.LoanContainer;
import model.LPContainer;

import java.util.ArrayList;

import model.Copy;
import model.LP;
//Actually CBT
public class LPController {
	
	
	public Copy findCopy(int serialNumber) {
		LPContainer lpc = LPContainer.getInstance();
		Copy res = null;
		res = lpc.searchLPCopies(serialNumber);
		return res;
	}
}