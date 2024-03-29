package rockwell.locators;

import org.openqa.selenium.By;

public class HomepageLocators {
    public static final By COOKIE_ACCEPT_BUTTON = By.xpath("//*[@id='rasp_cmp']/div/div[6]/button[2]");
    public static final By MORE_FILTERS_BUTTON = By.xpath("//*[@id='search']/div[5]/div/button");
    public static final By SEARCH_OPTION_BUTTON = By.xpath("//*[@id='search']/div[2]/div/button");
    public static final By PRICE_FROM_INPUT = By.id("price-from-id");
    public static final By PRICE_TO_INPUT = By.id("price-to-id");
    public static final By CITY_INPUT = By.id("search-location-input");
    public static final By SEARCH_BUTTON = By.xpath("//*[@id='search']/div[6]/div/button[@aria-label='Szukaj']");
    public static final By CITY_INPUT_EXPAND = By.xpath("//*[@id='search']/div[4]/div/div//button[@aria-label='Rozwiń']");
}
