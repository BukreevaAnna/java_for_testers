import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class GroupCreationTests extends TestBase {


    @Test
    public void canCreateGroup() {
        openGroupsPage();
        createGroup("New Group", "Group header", "footer");
    }

    @Test
    public void canCreateGroupWithEmptyName() {
        if (isElementPresent(By.name("new"))) {
            driver.findElement(By.linkText("groups")).click();
        }
        createGroup("", "", "");
    }
}
