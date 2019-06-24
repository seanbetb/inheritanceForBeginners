package inheritanceForBeginnerscom.sta;

import java.util.Objects;

public class Pet {

	
		private int petID;
		private String petfName;
		private String ownerfName;
		private String ownerlName;
		/**
		 * 
		 */
		public Pet() {
			super();
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
		public Pet(int petID, String petfName, String ownerfName, String ownerlName, String eircode, String dob,
				boolean licenceReq, double sellingPrice, double purchasePrice) {
			super();
			this.petID = petID;
			this.petfName = petfName;
			this.ownerfName = ownerfName;
			this.ownerlName = ownerlName;
			this.eircode = eircode;
			this.dob = dob;
			this.licenceReq = licenceReq;
			this.sellingPrice = sellingPrice;
			this.purchasePrice = purchasePrice;
		}
		/**
		 * @param petID
		 * @param petfName
		 * @param dob
		 * @param licenceReq
		 * @param purchasePrice
		 */
		public Pet(int petID, String petfName, String dob, boolean licenceReq, double purchasePrice) {
			super();
			this.petID = petID;
			this.petfName = petfName;
			this.dob = dob;
			this.licenceReq = licenceReq;
			this.purchasePrice = purchasePrice;
		}
		private String eircode;
		private String dob;
		private boolean licenceReq;
		private double sellingPrice;
		private double purchasePrice;
		/**
		 * @return the petID
		 */
		public int getPetID() {
			return petID;
		}
		/**
		 * @param petID the petID to set
		 */
		public void setPetID(int petID) {
			this.petID = petID;
		}
		/**
		 * @return the petfName
		 */
		public String getPetfName() {
			return petfName;
		}
		/**
		 * @param petfName the petfName to set
		 */
		public void setPetfName(String petfName) {
			this.petfName = petfName;
		}
		/**
		 * @return the ownerfName
		 */
		public String getOwnerfName() {
			return ownerfName;
		}
		/**
		 * @param ownerfName the ownerfName to set
		 */
		public void setOwnerfName(String ownerfName) {
			this.ownerfName = ownerfName;
		}
		/**
		 * @return the ownerlName
		 */
		public String getOwnerlName() {
			return ownerlName;
		}
		/**
		 * @param ownerlName the ownerlName to set
		 */
		public void setOwnerlName(String ownerlName) {
			this.ownerlName = ownerlName;
		}
		/**
		 * @return the eircode
		 */
		public String getEircode() {
			return eircode;
		}
		/**
		 * @param eircode the eircode to set
		 */
		public void setEircode(String eircode) {
			this.eircode = eircode;
		}
		/**
		 * @return the dob
		 */
		public String getDob() {
			return dob;
		}
		/**
		 * @param dob the dob to set
		 */
		public void setDob(String dob) {
			this.dob = dob;
		}
		@Override
		public int hashCode() {
			return Objects.hash(dob, eircode, licenceReq, ownerfName, ownerlName, petID, petfName, purchasePrice,
					sellingPrice);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Pet))
				return false;
			Pet other = (Pet) obj;
			return Objects.equals(dob, other.dob) && Objects.equals(eircode, other.eircode)
					&& licenceReq == other.licenceReq && Objects.equals(ownerfName, other.ownerfName)
					&& Objects.equals(ownerlName, other.ownerlName) && petID == other.petID
					&& Objects.equals(petfName, other.petfName)
					&& Double.doubleToLongBits(purchasePrice) == Double.doubleToLongBits(other.purchasePrice)
					&& Double.doubleToLongBits(sellingPrice) == Double.doubleToLongBits(other.sellingPrice);
		}
		@Override
		public String toString() {
			return "Pet [petID=" + petID + ", petfName=" + petfName + ", ownerfName=" + ownerfName + ", ownerlName="
					+ ownerlName + ", eircode=" + eircode + ", dob=" + dob + ", licenceReq=" + licenceReq
					+ ", sellingPrice=" + sellingPrice + ", purchasePrice=" + purchasePrice + "]";
		}
		/**
		 * @return the licenceReq
		 */
		public boolean isLicenceReq() {
			return licenceReq;
		}
		/**
		 * @param licenceReq the licenceReq to set
		 */
		public void setLicenceReq(boolean licenceReq) {
			this.licenceReq = licenceReq;
		}
		/**
		 * @return the sellingPrice
		 */
		public double getSellingPrice() {
			return sellingPrice;
		}
		/**
		 * @param sellingPrice the sellingPrice to set
		 */
		public void setSellingPrice(double sellingPrice) {
			this.sellingPrice = sellingPrice;
		}
		/**
		 * @return the purchasePrice
		 */
		public double getPurchasePrice() {
			return purchasePrice;
		}
		
		   String feedingInstructions() {
		    	return "Feed me Seymour";
		    }



	}
  
