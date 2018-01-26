import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jedduffey on 1/25/18.
 */
public class ProductTest {

    @Test
    public void productShouldHaveACurrentPrice(){
        Product product = new Product();
        Assert.assertEquals(100,product.getCurrentPrice());
    }

    @Test
    public void productShouldHaveAPreviousPrice(){
        Product product = new Product();
        product.setPrice(50);
        Assert.assertEquals(100,product.getPreviousPrice());
    }

    @Test
    public void promotionIsInactiveWhenProductIsInstantiated(){
        Product product = new Product();
        Assert.assertFalse(product.isPromotionActive());
    }

    @Test
    public void productShouldHaveAMostRecentPriceChangeAsARatioField(){
        Product product = new Product();
        product.setPrice(90);
        Assert.assertEquals(-.1,product.getMostRecentPriceChangeAsARatio(),.0001);
    }

}
