import controllers.UserController;
import models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestFollowerFollowing {
    private UserController userController;


    @Before
    public void SetUp() {
        userController = new UserController();
    }

    /**
     * This method check and print count of followers by Mak0
     * The test is passed if the correct number of followers is submitted
     */
    @Test
    public void TestFollowers() {
        User[] followers = userController.getFollowersByUser("Mak0");
        System.out.println(followers.length);
        assertTrue(followers.length == 17);
    }

    /**
     * This method check and print count of the people Mak0 following.
     * The test is passed if the correct number of people whom Mak0 is subscribed
     * Especially given invalid data
     */
    @Test
    public void TestFollowing() {
        User[] following = userController.getFollowingByUser("Mak0");
        System.out.println(following.length);
        assertTrue(following.length == 6);
    }
}

