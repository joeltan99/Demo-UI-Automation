package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWSubmissionPage {
    WebDriver driver;
    // Locators
    private By table_xpath = By.xpath("/html/body/div[2]/div[3]/div/div/section/div[1]/div[2]/div[4]/table");
    private By user_xpath = By.xpath("//tr[contains(@class, 'user')]");
    private By hw_xpath = By.xpath(".//a[contains(@href,'.pdf')]");
    private By time_class = By.className("latesubmission");


    // Constructor
    public HWSubmissionPage (WebDriver driver) {
        this.driver = driver;
    }

    // Functions
    public void download_all_hw() {
        // Replace the table, row, and column identifiers with the actual values in your HTML
        WebElement table = driver.findElement(table_xpath);

        // Specify Student Name Column
        int columnIndexName = 2;

        // Specify the Submission Timing Column
        int columnIndexTime = 4;

        // Specify the PDF Homework Column
        int columnIndexToClick = 8;

        // Student Name
        String studentName = null;

        // Iterate through each row in the table
        for (WebElement row : table.findElements(user_xpath)) {
            // Get the cells in the current row
            java.util.List<WebElement> cells = row.findElements(By.tagName("td"));

            // Get Student Name
            if (columnIndexName < cells.size()) {
                try {
                    studentName = cells.get(columnIndexName).findElement(By.tagName("a")).getText();
                } catch (Exception e) {
                    System.out.println("[VALIDATION] End of List");
                    break;
                }
            }


            // Check if the current row has the expected number of columns
            if (columnIndexToClick < cells.size()) {
                try {
                    // Get the element in the specified column
                    WebElement linkElement = cells.get(columnIndexToClick).findElement(hw_xpath);
                    // Click on the href element
                    linkElement.click();

                } catch (Exception e) {
                    System.out.println("[VALIDATION] " + studentName + " - No submission");
                    continue;
                }
            }

            // Check if the current row has the expected number of columns
            if (columnIndexTime < cells.size()) {
                // Check if submission is late
                try {
                    WebElement latesub = cells.get(columnIndexTime).findElement(time_class);
                    System.out.println("[VALIDATION]" + studentName + " - Late Submission");

                } catch (Exception e) {
                    System.out.println("[VALIDATION]" + studentName + " - Assignment Downloaded");
                }
            }
        }
    }
}
