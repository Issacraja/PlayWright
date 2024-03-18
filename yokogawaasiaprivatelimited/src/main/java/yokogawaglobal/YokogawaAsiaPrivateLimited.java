package yokogawaglobal;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;


public class YokogawaAsiaPrivateLimited 
{
    public static void main( String[] args ){
        Playwright playwright = Playwright.create();
            LaunchOptions options = new LaunchOptions().setChannel("chrome").setHeadless(false);
            Browser browser = playwright.chromium().launch(options);
            Page page = browser.newPage();
            page.navigate("https://yea-test.cormsquare.com/Identity/Account/Login");

    Functions.FunctionsForCatalog(page);
        
    }
}
