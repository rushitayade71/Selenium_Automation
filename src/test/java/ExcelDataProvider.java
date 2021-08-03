import com.bridgelabz.ReadExcelData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
    WebDriver driver;

    public Object[][] testData(String excelPath, String sheetName) {
        ReadExcelData excel = new ReadExcelData();

        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();

        Object data[][] = new Object[rowCount - 1][colCount];
        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                String cellData = excel.getCellDataString(i, j);
                data[i - 1][j] = cellData;
            }
        }
        return data;
    }

    @DataProvider(name = "getData")
    public Object[][] getData() {
        String excelPath = "C:\\Users\\Hp\\eclipse-workspace\\Selenium\\TestData\\LoginData.xlsx";
        Object data[][] = testData(excelPath, "Sheet1");
        return data;
    }

    @BeforeTest
    public void browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Automation\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "getData")
    public void test(String username, String password) {
        System.out.println(username + " | " + password);
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
    }
}
