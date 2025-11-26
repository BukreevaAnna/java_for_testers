package tests;

import manager.ApplicationManager;
import model.GroupData;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;

public class TestBase {

    protected static ApplicationManager app;

    @BeforeEach
    public void setUp() {
        if (app == null) {
            app = new ApplicationManager();

        }
        app.init();
        if (app.isElementPresent(By.name("new"))) {
            ApplicationManager.driver.findElement(By.linkText("groups")).click();
        }
        if (app.isElementPresent(By.name("selected[]"))){
            app.createGroup(new GroupData("New Group", "Group header", "footer"));

        }
    }

}
