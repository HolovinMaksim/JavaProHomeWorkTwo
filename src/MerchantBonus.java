public class MerchantBonus extends Merchant implements Bonus {

    String email;

    public MerchantBonus(String name, String surname, String phone, String email) {
        super(name, surname, phone);
        this.email = email;
    }

    public String infoMerchant() {
        String name = getName();
        String phone = getPhone();
        return "\nMerchant: " + name + ", " + phone + ", " + email + "\n";
    }

    @Override
    public double calcBonus(double sales) {
        if (sales <= 10000) {
            return sales * 5 / 100;
        } else if (sales > 10000 && sales <= 30000) {
            return sales * 10 / 100;
        } else if (sales > 30000 && sales <= 100000) {
            return sales * 20 / 100;
        } else {
            return sales * 25 / 100;
        }
    }
}

