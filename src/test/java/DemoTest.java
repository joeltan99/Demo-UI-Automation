//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class DemoTest {
//    public static ChromeOptions options;
//
//    public static WebDriver driver;
//
//    @BeforeTest
//    void Setup() {
//        options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
//
////        driver = new ChromeDriver(options);
////
////        // URL
////        driver.get("https://distance3.sg.digipen.edu/2021sg-fall/login/index.php");
//    }
//
//
//    //----- Step Definition -----//
//
//    // Login Page //
//    // Scenario: User login with VALID credentials
//    @Test
//    void valid_login() throws InterruptedException{
//
//        driver = new ChromeDriver(options);
//        // URL
//        driver.get("https://distance3.sg.digipen.edu/2021sg-fall/login/index.php");
//
//        // user enters valid username
//        driver.findElement(By.id("username")).sendKeys("<username>");
//
//        // user enters valid password
//        driver.findElement(By.id("password")).sendKeys("<password>");
//
//        // user clicks on login button
//        driver.findElement(By.id("loginbtn")).click();
//
//        // validate user enters home page
//        WebElement textHeader = driver.findElement(By.id("instance-15100-header"));
//
//        if (textHeader.isDisplayed()) {
//            System.out.println("[VALIDATION] Home Page Text Header is displayed.");
//        } else {
//            System.out.println("[VALIDATION] Home Page Text Header is not displayed.");
//        }
//
//        // Close Driver
//        driver.close();
//    }
//
//    // Scenario: User login with INVALID credentials
//    @Test
//    void invalid_login() throws InterruptedException{
//        driver = new ChromeDriver(options);
//        // URL
//        driver.get("https://distance3.sg.digipen.edu/2021sg-fall/login/index.php");
//
//        // user enters valid username
//        driver.findElement(By.id("username")).sendKeys("unknown");
//
//        // user enters valid password
//        driver.findElement(By.id("password")).sendKeys("unknown");
//
//        // user clicks on login button
//        driver.findElement(By.id("loginbtn")).click();
//
//        // validate user enters home page
//        WebElement errMessage = driver.findElement(By.id("loginerrormessage"));
//
//        if (errMessage.isDisplayed()) {
//            System.out.println("[VALIDATION] Error Message is displayed.");
//        } else {
//            System.out.println("[VALIDATION] Error Message is not displayed.");
//        }
//
//        // Close Driver
//        driver.close();
//    }
//
//    // Scenario: User download all homework submitted in PDF
//    @Test
//    void download_all_hw() throws InterruptedException{
//        driver = new ChromeDriver(options);
//        // URL
//        driver.get("https://distance3.sg.digipen.edu/2021sg-fall/login/index.php");
//
//        // user enters valid username
//        driver.findElement(By.id("username")).sendKeys("<username>");
//
//        // user enters valid password
//        driver.findElement(By.id("password")).sendKeys("<password>");
//
//        // user clicks on login button
//        driver.findElement(By.id("loginbtn")).click();
//
//        // validate user enters home page
//        WebElement textHeader = driver.findElement(By.id("instance-15100-header"));
//
//        if (textHeader.isDisplayed()) {
//            System.out.println("[VALIDATION] Home Page Text Header is displayed.");
//        } else {
//            System.out.println("[VALIDATION] Home Page Text Header is not displayed.");
//        }
//
//        Thread.sleep(3000);
//
//        // user clicks on csd-1240-e
//        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/section[1]/div/aside/section/div/div/div[1]/div[2]/div/div/div[1]/div/div/div[2]/div/div/div[1]/a/span[3]")).click();
//
//        Thread.sleep(3000);
//
//        // user clicks on HW 4 - E
//        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/section/div/div/ul/li[7]/div[3]/ul/li[1]/div/div/div[2]/div/a/span")).click();
//
//        Thread.sleep(3000);
//
//        // user clicks on "View all submissions"
//        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/section/div[2]/div[2]/center/div/a[1]")).click();
//
//        Thread.sleep(3000);
//
//        // Replace the table, row, and column identifiers with the actual values in your HTML
//        WebElement table = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/section/div[1]/div[2]/div[4]/table"));
//
//        // Specify Student Name Column
//        int columnIndexName = 2;
//
//        // Specify the Submission Timing Column
//        int columnIndexTime = 4;
//
//        // Specify the PDF Homework Column
//        int columnIndexToClick = 8;
//
//        // Student Name
//        String studentName = null;
//
//        // Iterate through each row in the table
//        for (WebElement row : table.findElements(By.xpath("//tr[contains(@class, 'user')]"))) {
//            // Get the cells in the current row
//            java.util.List<WebElement> cells = row.findElements(By.tagName("td"));
//
//            // Get Student Name
//            if (columnIndexName < cells.size()) {
//                try {
//                    studentName = cells.get(columnIndexName).findElement(By.tagName("a")).getText();
//                } catch (Exception e) {
//                    System.out.println("[VALIDATION] End of List");
//                    break;
//                }
//            }
//
//
//            // Check if the current row has the expected number of columns
//            if (columnIndexToClick < cells.size()) {
//                try {
//                    // Get the element in the specified column
//                    WebElement linkElement = cells.get(columnIndexToClick).findElement(By.xpath(".//a[contains(@href,'.pdf')]"));
//                    // Click on the href element
//                    linkElement.click();
//
//                } catch (Exception e) {
//                    System.out.println("[VALIDATION] " + studentName + " - No submission");
//                    continue;
//                }
//            }
//
//            // Check if the current row has the expected number of columns
//            if (columnIndexTime < cells.size()) {
//                // Check if submission is late
//                try {
//                    WebElement latesub = cells.get(columnIndexTime).findElement(By.className("latesubmission"));
//                    System.out.println("[VALIDATION]" + studentName + " - Late Submission");
//
//                } catch (Exception e) {
//                    System.out.println("[VALIDATION]" + studentName + " - Assignment Downloaded");
//                }
//            }
//
//        }
//
//        // Close Driver
//        driver.close();
//    }
//}
