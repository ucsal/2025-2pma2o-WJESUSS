import br.com.mariojp.solid.ocp.*;

public class Main {
	public static void main(String[] args) {

		DiscountCalculator regularCalc = new DiscountCalculator(new RegularCustomerDiscount());
		System.out.println("REGULAR 100 -> " + regularCalc.apply(100));

		DiscountCalculator premiumCalc = new DiscountCalculator(new PremiumCustomerDiscount());
		System.out.println("PREMIUM 100 -> " + premiumCalc.apply(100));

		DiscountCalculator partnerCalc = new DiscountCalculator(new PartnerCustomerDiscount());
		System.out.println("PARTNER 100 -> " + partnerCalc.apply(100));
	}
}