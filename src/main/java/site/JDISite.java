package site;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import site.pages.HomePage;
import site.pages.MetalAndColorsPage;
import site.sections.Header;
import site.sections.Result;

import static enums.Users.PITER_CHAILOVSKII;

@JSite(domain = "https://epam.github.io/JDI/")
public class JDISite extends WebSite {

    public static HomePage homePage;

    public static Header header;

    public static MetalAndColorsPage metalAndColorsPage;

    public static Result result;

    public static void login() {
        header.profilePhoto.click();
        header.loginForm.loginAs(PITER_CHAILOVSKII);
    }
}