package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

    AndroidDriver driver;

    @FindBy(id = "ua.com.rozetka.shop:id/tv_title")
    MobileElement nameProduct;

    @FindBy(id = "ua.com.rozetka.shop:id/item_wishlist_offer_iv_menu")
    MobileElement yetButton;

    @FindBy(id = "ua.com.rozetka.shop:id/title")
    MobileElement delLink;

    @FindBy(id = "ua.com.rozetka.shop:id/empty_base_tv_title")
    MobileElement emptyListText;


    public String getProductName() {
        return nameProduct.getText();
    }

    public String emptyListText() {
        return emptyListText.getText();
    }

    public WishListPage dellFromWishList() {
        yetButton.click();
        delLink.click();
        return this;
    }



    public WishListPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
