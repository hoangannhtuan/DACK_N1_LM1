package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
/*
    1. Go to https://heis.vn/
    2. Click on my account link
    3.Login in application using previously created credential
    4. Click order list
    5. Enter Coupon Code -- Skip: Because no discount code
    6. Verify the discount generated -- Skip
*/
public class test09 {
    @Test
    public void testcase09() {
        WebDriver driver = driverFactory.getChromeDriver();

        //debug purpose only
        try{
            //1. Go to https://heis.vn/
            driver.get("https://heis.vn/");

            //2. Click on my account link
            driver.findElement(By.xpath("//span[contains(text(),'Tài khoản')]")).click();
            Thread.sleep(1000);

            //3.Login in application using previously created credential
            driver.findElement(By.xpath("//input[@id='phone_or_email']")).sendKeys("abc@gmail.com");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
            driver.findElement(By.cssSelector("input[value='Đăng nhập']")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Tài khoản')]")).click();
            Thread.sleep(1000);

            //4. Click order list
            driver.findElement(By.xpath("//a[contains(text(),'Danh sách đơn hàng')]")).click();
            Thread.sleep(1000);

            //5. Enter Coupon Code
            driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]")).click();



            //6. Verify the discount generated


        }catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
