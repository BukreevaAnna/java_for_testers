package tests;

import org.junit.jupiter.api.Test;

public class GroupRemovalTests extends TestBase {


    @Test
    public void canRemoveGroup() {
        TestBase.app.removeGroup();
    }
}
