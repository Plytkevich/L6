package ru.spb.herzen.ivt3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.herzen.spb.ru/search/");

        WebElement field = driver.findElement(By.xpath("//form/*[@name='sval']"));
        field.sendKeys("Расписание");

        System.out.println("Page title was: " + driver.getTitle());

        WebElement button = driver.findElement(By.name("sval_send"));
        button.click();
        WebElement timetable = driver.findElement(By.linkText("Расписание занятий / экзаменов"));
        timetable.click();
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}
