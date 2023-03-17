package test;

import driver.driverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;

/*--------------TESTCASE07-------------------------
Test Steps:
1. Go to https://heis.vn/
2. Click on My Account
3. Login in application using previously created credential
4. Click on 'Quần Kaki' -> Chọn size 28 -> Đặt hàng
5. Click on 'Đến Giỏ Hàng'
6. Click on "Mua Thêm"
7. Order 1 more product
8. Check cart information
*/

public class test07 {
    @Test
    public void testcase07() {
        WebDriver driver = driverFactory.getChromeDriver();

        //Debug only
        try {
            //1. Go to https://heis.vn/
            driver.get("https://heis.vn/");
            Thread.sleep(1000);

            //2. Click on My Account
            driver.findElement(By.xpath("//span[contains(text(),'Tài khoản')]")).click();
            Thread.sleep(1000);

            //3.Login in application using previously created credential
            driver.findElement(By.xpath("//input[@id='phone_or_email']")).sendKeys("abc@gmail.com");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
            driver.findElement(By.cssSelector("input[value='Đăng nhập']")).click();
            Thread.sleep(1000);

            //4. Click on 'Quần Kaki' -> Chọn size 28 -> Đặt hàng
            driver.findElement(By.cssSelector("a[title='Quần kaki công sở']")).click();
            driver.findElement(By.xpath("//span[normalize-space()='28']")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button[class='btn-style-add add_cart']")).click();
            Thread.sleep(2000);

            //5. Click on 'Đến Giỏ Hàng'
            driver.findElement(By.xpath("//span[contains(text(),'Đến giỏ hàng')]")).click();
            Thread.sleep(1000);


            //Click on "Mua Thêm"
            driver.findElement(By.xpath("//a[@title='Mua tiếp']")).click();
            Thread.sleep(1000);

            //7. Order 1 more product
            driver.findElement(By.xpath("//a[@title='QUẦN JEAN NAM XƯỚC']")).click();
            driver.findElement(By.xpath("//span[normalize-space()='28']")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button[class='btn-style-add add_cart']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(text(),'Đến giỏ hàng')]")).click();
            Thread.sleep(1000);

            //8. Check cart information
            File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screen, new File("C:\\Users\\Admin\\IdeaProjects\\SELENIUM_HEIS_PHAMHOANGTUANANH\\ImageTest\\CART_INFORMATIOn.jpg"));


            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
