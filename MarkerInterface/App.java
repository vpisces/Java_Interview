public class App {
	public static void main(String[] args) {
		DiscountUtils discountUtils = new DiscountUtils();
		boolean returnVal = discountUtils.isDiscountEligible(new Student());
		System.out.println(returnVal);
	}
}
