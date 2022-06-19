package homework.opp_homework;

public class DiscountRate {

    private static double serviceDiscountPremium = 0.2d;
    private static double serviceDiscountGold = 0.15d;
    private static double serviceDiscountSilver = 0.1d;
    private static double productDiscountPremium = 0.1d;
    private static double productDiscountGold = 0.1d;
    private static double productDiscountSilver = 0.1d;

    public static double getServiceDiscountRate(String serviceDiscountRate) {

        switch (serviceDiscountRate) {
            case "Premium":
                return serviceDiscountPremium;
            case "Gold":
                return serviceDiscountGold;
            case "Silver":
                return serviceDiscountSilver;
            default:
                return 0;
        }
    }

    public static double getProductDiscountRate(String productDiscountRate) {
        switch (productDiscountRate) {
            case "Premium":
                return productDiscountPremium;
            case "Gold":
                return productDiscountGold;
            case "Silver":
                return productDiscountSilver;
            default:
                return 0;
        }
    }
}
