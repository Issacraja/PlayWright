package yokogawaglobal;
import com.microsoft.playwright.Page;

public class Functions{

    public static void FunctionsForCatalog(Page page){
        String TRNTitle = "POC_Catalog";

        POC_Catalog catalog = new POC_Catalog();
        catalog.RequesterLoginPRCreate("requester@cormsquare.com", "Admin@123", page);

        //Requester PR Create
        catalog.Title(TRNTitle, page);
        catalog.ShipToYokogawa(page);
        catalog.Project("E143232Q00", page);
        catalog.WBS("WB3626", page);
        catalog.Vendor("Alpha Limited", page);
        catalog.RateContract("Alpha Rate Contract", page);
        catalog.ShippingAddress(page);
        catalog.ShippingMode("Air", page);
        catalog.ExpectedPOIssue(page);
        catalog.ExpectedDelivery(page);
        catalog.InspectionRequired(page);
        catalog.Checker("checker@cormsquare.com", page);
//        catalog.TCAS(page);
//        catalog.TCASNumber(63728, page);
//        catalog.TCASFile(page);
        catalog.AddLineRequisitionItems("Access Control System", "Cabinet with Smart Card Access", 150, page);
        catalog.Notes("Requisition Notes and Attachments", page);
        catalog.Attachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", page);

        //Checker PR Login
        catalog.CheckerLogin("checker@cormsquare.com","Admin@123", page);
        //Checker PR Approve
        catalog.CheckerApprove(TRNTitle, page);

        //GenPactLead PR Login
        catalog.GenPactLeadLogin("genpactlead@cormsquare.com","Admin@123", page);
        //GenPactLead PR Assign
        catalog.GenPactLeadAssign(TRNTitle, "genpactbuyer@cormsquare.com", page);

        //GenPactBuyer PR Login
        catalog.GenPactBuyerLogin("genpactbuyer@cormsquare.com","Admin@123", page);
        //GenPactBuyer POR Create
        catalog.GenPactBuyerPORCreate(TRNTitle, page);
        catalog.SpecialInstructions("Additional Terms and Conditions/Special Instructions - POR", page);
        catalog.PORNotes("Purchase Order Notes and Attachments", page);
        catalog.PORAttachments("C:\\Users\\Abhijith\\Downloads\\Attachments.zip", page);
    }
}
