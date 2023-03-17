package test;

import driver.driverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;

/*--------------TESTCASE08-------------------------/
        Test Steps:
        1. Go to https://heis.vn/
        2. Click on my account link
        3. Login in application using previously created credential
        4. Click on 'Giỏ Hàng' link , change The number of products
        Note Step:
            Bởi vì data web không thể lưu thông tin giỏ hàng. nên ta cần phải đặt
            hàng lại để kiểm tra
        5. Verify Giỏ Hàng is changed
        6. Click on"Thanh toán"
        7. Complete order information
        8. Click on" Đặt hàng "
        9. Verify order is generated and note the order number


*/
public class test08 {
    @Test
    public void testcase08() {
        WebDriver driver = driverFactory.getChromeDriver();

        //Debug only
        try {
            //1. Go to https://heis.vn/
            driver.get("https://heis.vn/");

            //2. Click on My Account
            driver.findElement(By.xpath("//span[contains(text(),'Tài khoản')]")).click();
            Thread.sleep(1000);

            //3.Login in application using previously created credential
            driver.findElement(By.xpath("//input[@id='phone_or_email']")).sendKeys("abc@gmail.com");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
            driver.findElement(By.cssSelector("input[value='Đăng nhập']")).click();
            Thread.sleep(1000);

            //Note: Order 1 more product to check
            driver.findElement(By.xpath("//a[@title='QUẦN JEAN NAM XƯỚC']")).click();
            driver.findElement(By.xpath("//span[normalize-space()='28']")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button[class='btn-style-add add_cart']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(text(),'Đến giỏ hàng')]")).click();
            Thread.sleep(1000);

            //4. Change The number of products

            String total1 = driver.findElement(By.xpath("//input[@name='cart_data[0]']")).getText();
            driver.findElement(By.xpath("//input[@name='cart_data[0]']")).clear();
            driver.findElement(By.xpath("//input[@name='cart_data[0]']")).sendKeys("10");


            //5. Verify Giỏ Hàng is changed
            String total2 = driver.findElement(By.xpath("//input[@name='cart_data[0]']")).getText();
            if (total2.equalsIgnoreCase(total1)){
                System.out.println("Is change");
            }else {
                System.out.println("Not Change");
            }


            //6. Click on "Thanh toán"
            driver.findElement(By.xpath("//a[@class='btn-checkout']")).click();
            Thread.sleep(1000);

            //7. Complete order information
            driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("aaaaa");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@name='street']")).sendKeys("Cười");
            Thread.sleep(1000);
            Select province = new Select(driver.findElement(By.xpath("//select[@name='province_id']")));
            province.selectByVisibleText("Hồ Chí Minh");
            Thread.sleep(1000);
            Select district = new Select(driver.findElement(By.xpath("//select[@name='district_id']")));
            district.selectByVisibleText("Quận 1");
            Thread.sleep(1000);
            Select ward = new Select(driver.findElement(By.xpath("//select[@name='ward_id']")));
            ward.selectByValue("26749");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//textarea[@placeholder='Nhập ghi chú']")).sendKeys("Đơn hàng ảo");
            driver.findElement(By.xpath("//label[@for='stylishRadio1']")).click();
            Thread.sleep(1000);

            //8. Click on "Đặt Hàng"
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(1000);

            //9. Verify order is generated and note the order number
            File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screen, new File("C:\\Users\\Admin\\IdeaProjects\\SELENIUM_HEIS_PHAMHOANGTUANANH\\ImageTest\\PRODUCT_INFORMATIOn.jpg"));

            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
//        driver.quit();
    }
}
