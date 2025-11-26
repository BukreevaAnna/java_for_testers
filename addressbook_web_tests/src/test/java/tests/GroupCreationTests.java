package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void canCreateGroup() {
        TestBase.app.openGroupsPage();
        TestBase.app.createGroup(new GroupData("New Group", "Group header", "footer"));
    }

    @Test
    public void canCreateGroupWithEmptyName() {
        TestBase.app.openGroupsPage();
        TestBase.app.createGroup(new GroupData());
    }

    @Test
    public void canCreateGroupWithNameOnly() {
        TestBase.app.openGroupsPage();
        var emptyGroup = new GroupData();
        var groupWithName = emptyGroup.withName("some name");
        TestBase.app.createGroup(groupWithName);
    }
}
