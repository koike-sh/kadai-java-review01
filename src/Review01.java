
public class Review01 {

    public static void main(String[] args) {
        System.out.println(tax(1500));
    }

    public static String tax(int price) {
        // 消費税率の初期化
        int tax_rate = 10;

        // 消費税額を算出
        int tax_price = price / tax_rate;

        // 税込価格を算出
        int total_price = price + tax_price;

        String result = price+ "円の商品の税込価格は"+total_price+"円(消費税は"+tax_price+"円)です。";
        return result;
    }
}
