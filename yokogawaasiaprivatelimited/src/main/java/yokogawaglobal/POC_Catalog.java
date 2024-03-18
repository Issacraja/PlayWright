package yokogawaglobal;
import com.microsoft.playwright.Page;

public class POC_Catalog {

    public void RequesterLoginPRCreate(String mailId, String pass, Page page) {
    //Login Page
    page.locator("input[name='Input_Email']").type(mailId);
    page.locator("#Input_Password").type(pass);
    page.locator("#login-submit").click();

    //Create Button
    page.locator("btn").click();

    //Type - Catalog
    page.locator("//tbody/tr[1]/td[1]/a[1]").click();
    }

    public void Title(String TRNTitle, Page page) {
        page.locator("title").type(TRNTitle);
    }

    public void ShipToYokogawa(Page page) {
        page.locator("type_checkbox").click();
    }

    public void Project(String Project, Page page) {
        page.locator("select2-projectId-container").click();
        page.locator("select2-search__field").type(Project);
        page.locator("select2-results__option").click();
    }

    public void WBS(String wbs, Page page) {
        page.locator("select2-wbsId-container").click();
        page.locator("select2-search__field").type(wbs);
        page.locator("select2-results__option").click();
    }
    public void Vendor(String vendorname, Page page) {
        page.locator("select2-vendorId-container").click();
        page.locator("select2-search__field").type(vendorname);
        page.locator("select2-results__option").click();
    }
    public void RateContract(String ratecontract, Page page) {
        page.locator("select2-rateContractId-container").click();
        page.locator("select2-search__field").type(ratecontract);
        page.locator("select2-results__option").click();
    }
    public void ShippingAddress(Page page) {
        page.locator("select2-shippingaddressId-container").click();
        page.locator("select2-results__option").click();
    }
    public void ShippingMode(String mode, Page page) {
        page.locator("select2-shippingModeId-container").click();
        page.locator("select2-search__field").type(mode);
        page.locator("select2-results__option").click();
        //Scroll
        // JavascriptExecutor scroll = (JavascriptExecutor) page;
        // scroll.executeScript("window.scrollBy(0,300)", "");
    }
    public void ExpectedPOIssue(Page page) {
        page.locator("//*[@id=\"dates\"]/div[1]/input[2]").click();
        page.locator("flatpickr-monthDropdown-months").selectText();
        page.locator("/html/body/div[4]/div[2]/div/div[2]/div/span[26]").click();
    }
    public void ExpectedDelivery(Page page) {
        page.locator("//*[@id=\"dates\"]/div[2]/input[2]").click();
        // Select months = new Select(page.locator("/html/body/div[5]/div[1]/div/div/select"));
        // months.selectByVisibleText("December");
        // WebElement day = page.locator("/html/body/div[5]/div[2]/div/div[2]/div/span[32]");
        // day.click();
    }
    public void InspectionRequired(Page page) {
        page.locator("inspectRequired").click();
    }
    public void Checker(String checkerid, Page page) {
        page.locator("select2-checkerId-container").click();
        page.locator("select2-search__field").type(checkerid);
        page.locator("select2-results__option").click();
        //Scroll
        // JavascriptExecutor scroll = (JavascriptExecutor) page;
        // scroll.executeScript("window.scrollBy(0,700)", "");
    }
    // public void TCAS(Page page) throws InterruptedException {
    //     page.locator(By.id("tcasApplicable")).click();
    //     page.locator(By.id("q1")).click();
    //     page.locator(By.id("q2")).click();
    //     page.locator(By.id("q3")).click();
    //     page.locator(By.id("q4")).click();
    //     page.locator(By.id("q5")).click();
    //     page.locator(By.id("q6")).click();
    //     page.locator(By.id("q7")).click();
    //     page.locator(By.id("q8")).click();
    //     page.locator(By.id("tcasSubmit")).click();
    // }

    // public void TCASNumber(int number, Page page) throws InterruptedException {
    //     page.locator(By.id("tcasNumber")).type(String.valueOf(number));
    // }

//     public void TCASFile(Page page) throws InterruptedException, IOException {
//         WebElement file = page.locator("btnFileUpload");
//         file.click();
// //        file.type("C:\\Users\\Abhijith\\OneDrive - Cormorant Engineering India Pvt Ltd\\Desktop\\Attachments.jpg");
//         Runtime.getRuntime().exec("C:\\AutoIt\\FileUpload1.exe");
//     }

    public void AddLineRequisitionItems(String category, String item, int quantity, Page page) {
        page.locator("addLineRequisitionItems").click();
        //Category
        page.locator("select2-categoryId-container").click();
        page.locator("select2-search__field").type(category);
        page.locator("select2-results__option").click();
        //Items
        page.locator("select2-itemId-container").click();
        page.locator("select2-search__field").type(item);
        page.locator("select2-results__option").click();
        //Quantity
        page.locator("quantity").type(String.valueOf(quantity));
        //Add Button
        page.locator("saveRequisitionItem").click();
    }

    public void Notes(String notes, Page page) {
        page.locator("notes").type(notes);
    }

    public void Attachments(String file, Page page) {
        page.locator("attachDocs").click();
        // WebElement file1 = page.locator("formFilePreupload");
        // file1.type(file);
        page.locator("saveAttachments").click();
        page.locator("//button[contains(text(),'Continue')]").click();
        //Scroll
        // JavascriptExecutor scroll = (JavascriptExecutor) page;
        // scroll.executeScript("window.scrollBy(0,200)", "");
        

        //Create Draft Button
        page.locator("btnCreate").click();
        page.locator("//button[contains(text(),'Yes')]").click();
        //Send For Approval button
        page.locator("btnSendApproval").click();
        page.locator("//button[contains(text(),'Yes')]").click();
        //Login Avatar Button
        page.locator("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]").click();
        page.locator("//a[@onclick='user_logout()']").click();
    }

    public void CheckerLogin(String mailId, String pass, Page page) {
        //Login Page
        page.locator("Input_Email").type(mailId);
        page.locator("Input_Password").type(pass);
        page.locator("login-submit").click();
    }

    public void CheckerApprove(String TRNTitle, Page page) {
        page.locator("//*[contains(text(),'"+ TRNTitle +"')]").click();
        //Scroll
        // WebElement button = page.locator("//button[contains(text(), 'Approve')]");
        // button.click();
        //Approve Button
        page.locator("btnApprove").click();
        page.locator("/html/body/div[4]/div/div/div[2]/div/form/input").type("Approved");
        page.locator("//body[1]/div[4]/div[1]/div[1]/div[3]/button[1]").click();

        //Login Avatar Button
        page.locator("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]").click();
        page.locator("//a[@onclick='user_logout()']").click();
    }

    public void GenPactLeadLogin(String mailId, String pass, Page page) {
        //Login Page
        page.locator("Input_Email").type(mailId);
        page.locator("Input_Password").type(pass);
        page.locator("login-submit").click();
    }
    public void GenPactLeadAssign(String TRNTitle, String genpactbuyer, Page page) {
        page.locator("//*[contains(text(),'"+ TRNTitle +"')]").click();
        //Assign Buyer
        page.locator("btnAssignUser").click();
        page.locator("select2-bgUser-container").click();
        page.locator("select2-search__field").type(genpactbuyer);
        page.locator("//li[contains(text(),'genpactbuyer@cormsquare.com')]").click();
        page.locator("saveBuyerUser").click();

        //Login Avatar Button
        page.locator("//header/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/div[1]/img[1]").click();
        page.locator("//a[@onclick='user_logout()']").click();
    }

    public void GenPactBuyerLogin(String mailId, String pass, Page page) {
        //Login Page
        page.locator("Input_Email").type(mailId);
        page.locator("Input_Password").type(pass);
        page.locator("login-submit").click();
    }
    public void GenPactBuyerPORCreate(String TRNTitle, Page page) {
        page.locator("//*[contains(text(),'"+ TRNTitle +"')]").click();
        //POR Create
        page.locator("btnCreatePOR").click();
        //Scroll
        // JavascriptExecutor scroll = (JavascriptExecutor) page;
        // scroll.executeScript("window.scrollBy(0,800)", "");
    }
    public void SpecialInstructions(String instructions, Page page) {
        page.locator("specialInstructions").type(instructions);
    }
    public void PORNotes(String notes, Page page) {
        page.locator("notes").type(notes);
    }

    public void PORAttachments(String file, Page page) {
        page.locator("attachDocs").click();
        // WebElement file1 = page.locator("formFilePreupload");
        // file1.type(file);
        page.locator("savePORAttachments").click();
        page.locator("//button[contains(text(),'Continue')]").click();

        //Create POR Button
        page.locator("btnCreate").click();
        page.locator("//button[contains(text(),'Yes')]").click();
        page.close();
    }
}
