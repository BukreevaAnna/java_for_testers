package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void canCreateGroup() {
        TestBase.app.groups().createGroup(new GroupData("New Group", "Group header", "footer"));
    }

    @Test
    public void canCreateGroupWithEmptyName() {
        TestBase.app.groups().createGroup(new GroupData());
    }

    @Test
    public void canCreateGroupWithNameOnly() {
        TestBase.app.groups().createGroup(new GroupData().withName("some name"));
    }
}
