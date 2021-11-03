package org.utilities;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.Base;

public class FBloginPagePojo extends Base {
	
	
	public FBloginPagePojo() {

	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(name="pass")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnLogin;
	
	public WebElement getTxtUser() {
		return txtUser;
	}


	public void setTxtUser(WebElement txtUser) {
		this.txtUser = txtUser;
	}


	public WebElement getTxtPass() {
		return txtPass;
	}


	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}


	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}

	
	
	

}
