package site.pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import site.sections.MetalsAndColorsForm;

@JPage(url = "/metals-colors.html", title = "Metal and Colors")
public class MetalAndColorsPage extends WebPage {

    public MetalsAndColorsForm metalsAndColorsForm;
}
