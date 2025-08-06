package testCasesSF;

import org.testng.annotations.Test;

import baseSF.BaseClassSF;
import pagesSF.T1_LoginSF;

public class RunLoginSF extends BaseClassSF{
	@Test
	public void runloginSF() throws InterruptedException {
		System.out.println("RunLoginSF Driver");
		T1_LoginSF Lsf = new T1_LoginSF();
		Lsf.username().pswrd().login().Applauncher().ViewAll().Sales().Accounts().clicknewbutton().AccName().clicksave().clickAccount().searchbox().showActions().edit().rating().type().ownership().Billingst().Shippingst().customerPriority().SLA().upsellOpportunity().active().editSave().delSearch().actions().delDD().clickdelete();
	}
}
