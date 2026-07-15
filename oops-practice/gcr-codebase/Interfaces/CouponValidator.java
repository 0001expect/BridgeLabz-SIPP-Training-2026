interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        if (!CouponValidator.isLengthValid(code))
            return false;

        return code.startsWith("SAVE");
    }
}

public class Main {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "ABC",
                "SAVE50",
                "OFF20",
                "SAVE100"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String c : coupons) {

            if (cart.validateCoupon(c))
                System.out.println(c + " -> Valid");
            else
                System.out.println(c + " -> Invalid");
        }
    }
}