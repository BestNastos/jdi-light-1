package io.github.epam.material.tests.displaydata;

import com.epam.jdi.light.material.elements.displaydata.Avatar;
import io.github.epam.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.avatarPage;
import static io.github.com.pages.displaydata.AvatarPage.avatarsWithIcon;
import static io.github.com.pages.displaydata.AvatarPage.avatarsWithPhoto;
import static io.github.com.pages.displaydata.AvatarPage.avatarsWithText;

public class AvatarTests extends TestsInit {

    @BeforeMethod
    public void beforeTest() {
        avatarPage.open();
    }

    @Test
    public void avatarsWithTextTests() {
        for(Avatar avatar : avatarsWithText) {
            avatar.is().displayed();
        }
        avatarsWithText.get(1).is().text("L");
        avatarsWithText.get(2).is().text("A");
    }

    @Test
    public void avatarsWithPhotoTests() {
        for(Avatar avatar : avatarsWithPhoto) {
            avatar.is().displayed();
            avatar.image().is().displayed();
            avatar.badge().is().displayed();
        }
    }

    @Test
    public void avatarsWithIconTests() {
        for(Avatar avatar : avatarsWithIcon) {
            avatar.is().displayed();
            avatar.icon().is().displayed();
            avatar.image().is().hidden();
        }
    }

}
