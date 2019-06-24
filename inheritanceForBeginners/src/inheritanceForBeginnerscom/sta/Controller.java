package inheritanceForBeginnerscom.sta;

public class Controller {
	/**
	 * @param petID
	 * @param petfName
	 * @param dob
	 * @param licenceReq
	 * @param purchasePrice
	 */

	public static void main(String[] args) {
		
		Pet myPet = new Pet(1, "Flash", "21/06/2019", false, 300);
		Dog myDog = new Dog(2, "Flash", "21/06/2019", false, 300);
		System.out.println(myPet.toString());
		System.out.println(myDog.toString());
		System.out.println(myDog.feedingInstructions());
		
		myDog.feedingInstructions();

         

	}

}
