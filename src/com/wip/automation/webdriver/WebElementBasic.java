package com.wip.automation.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementBasic {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver",
        "//Users/nafiurrashid/Desktop/selenium/geckodriver");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://github.com/");
    WebElement linkElement = driver.findElement(By.linkText("Sign in"));
    linkElement.click();
    driver.get("https://github.com/login");
    WebElement userName = driver.findElement(By.id("login_field"));
    userName.sendKeys("githubtest456");
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys("githubtest123");
    WebElement linkElement1 = driver.findElement(By.className("btn"));
    linkElement1.click();
  }

}
