// package com.example;



// import java.io.FileInputStream;

// import org.apache.poi.xssf.usermodel.XSSFRow;
// import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// // import org.checkerframework.checker.units.qual.t;
// // import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.AfterTest;
// import org.testng.annotations.BeforeTest;

// import io.github.bonigarcia.wdm.WebDriverManager;

// public class AppTestXL
//  {
//     WebDriver driver;
//     @BeforeTest
//     public void Testsetup() throws Exception
//     {
//         WebDriverManager.chromedriver().setup();
//         ChromeDriver driver = new ChromeDriver();
//         driver.manage().window().maximize();
//         driver.get("https://dbankdemo.com/bank/login");
//        // FileInputStream fs=new FileInputStream("sachu");
//     }
//     @SuppressWarnings("resource")
//     @Test
//     public void Test() throws Exception
//     {
//         FileInputStream fs=new FileInputStream("E:\\ST\\testngfile.xlsx");
//         XSSFWorkbook workbook = new XSSFWorkbook(fs);
//         XSSFSheet sheet1= workbook.getSheet("login");
//         XSSFRow row1 = sheet1.getRow(1); 
//         @SuppressWarnings("unused")
//         String username=row1.getCell(0).getStringCellValue();
//         @SuppressWarnings("unused")
//         String password=row1.getCell(2).getStringCellValue();
//         Thread.sleep(3000);
//         driver.findElement(By.id("username")).sendKeys("t@gmail.com");
//         driver.findElement(By.id("password")).sendKeys("P@ssword12");
//         driver.findElement(By.id("submit")).click();
//         Thread.sleep(3000);
//     }
//     @AfterTest
//     public void Testquit()
//     {
//         driver.quit();
//     }

//  }