package inheritanceForBeginnerscom.sta;

public class Dog extends Pet {
	
	private boolean isGuardDog;

	/**
	 * @return the isGuardDog
	 */
	public boolean isGuardDog() {
		return isGuardDog;
	}

	/**
	 * @param isGuardDog the isGuardDog to set
	 */
	public void setGuardDog(boolean isGuardDog) {
		this.isGuardDog = isGuardDog;
	}

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
	public Dog(int petID, String petfName, String dob, boolean licenceReq, double purchasePrice, boolean isGuardDog) {
		super(petID, petfName, dob, licenceReq, purchasePrice);
		this.isGuardDog = isGuardDog;
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
			boolean licenceReq, double sellingPrice, double purchasePrice, boolean isGuardDog) {
		super(petID, petfName, ownerfName, ownerlName, eircode, dob, licenceReq, sellingPrice, purchasePrice);
		this.isGuardDog = isGuardDog;
	}

	@Override
	public String toString() {
		return super.toString() + " Dog [isGuardDog=" + isGuardDog + "]";
	}
	
	


}
