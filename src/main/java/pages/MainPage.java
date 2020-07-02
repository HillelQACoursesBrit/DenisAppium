package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {
    AndroidDriver driver;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView\n")
    MobileElement nameProduct;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]\n")
    MobileElement upButton;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Ещё\"])[1]")
    MobileElement yetButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[8]")
    MobileElement wishListLink;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    protected MobileElement addToWishLink;


    public MainPage addToWishList() {
        yetButton.click();
        addToWishLink.click();
        return this;
    }

    public WishListPage goToWishList() {
        upButton.click();
        wishListLink.click();
        return new WishListPage(driver);
    }

    public String getProductName() {
        return nameProduct.getText();
    }

    public MainPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
