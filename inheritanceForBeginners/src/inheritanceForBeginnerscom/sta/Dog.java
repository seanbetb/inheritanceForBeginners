package inheritanceForBeginnerscom.sta;

public class Dog extends Pet {

	/**
	 * 
	 */
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param petID
	 * @param petfName
	 * @param dob
	 * @param licenceReq
	 * @param purchasePrice
	 */
	public Dog(int petID, String petfName, String dob, boolean licenceReq, double purchasePrice) {
		super(petID, petfName, dob, licenceReq, purchasePrice);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param petID
	 * @param petfName
	 * @param ownerfName
	 * @param ownerlName
	 * @param eircode
	 * @param dob
	 * @param licenceReq
	 * @param sellingPrice
	 * @param purchasePrice
	 */
	public Dog(int petID, String petfName, String ownerfName, String ownerlName, String eircode, String dob,
			boolean licenceReq, double sellingPrice, double purchasePrice) {
		super(petID, petfName, ownerfName, ownerlName, eircode, dob, licenceReq, sellingPrice, purchasePrice);
		// TODO Auto-generated constructor stub
	}

}
