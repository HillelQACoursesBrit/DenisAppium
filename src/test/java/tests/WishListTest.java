package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WishListTest extends BaseTest {

    @Test
    public void addToWishListTest() {
        String nameText = mainPage.getProductName();
        mainPage.addToWishList();
        mainPage.goToWishList();
        Assert.assertTrue(nameText.equalsIgnoreCase(wishListPage.getProductName()));
    }

    @Test
    public void delFromWishListTest() {
        wishListPage.dellFromWishList();
        Assert.assertTrue(wishListPage.emptyListText().
                equalsIgnoreCase("Этот список пуст"));
    }
}
