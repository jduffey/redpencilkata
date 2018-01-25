/**
 * Created by jedduffey on 1/25/18.
 */
public class Product {

    private int currentPrice = 100;
    private int previousPrice;

    public int getCurrentPrice() {

        return currentPrice;
    }

    public void setPrice(int newPrice) {
        previousPrice = currentPrice;
        currentPrice = newPrice;
    }

    public int getPreviousPrice() {
        return previousPrice;
    }
}
