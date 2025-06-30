package sauceDemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("//*[@id=\"login_button_container\"]");

    public void setUsername(String username){
        set(usernameField, username);
    }

    public void setPassword(String password){
        set(passwordField, password);
    }

//    transition method
    public ProductsPage clickLoginButton(){
        click(loginButton);
        return new ProductsPage();
    }

//    convinence method
    public ProductsPage loginIntoApplication(String username, String password){
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage(){
        return find(errorMessage).getText();
    }
}


















