package io.github.epam.vuetify.tests.common;

import com.epam.jdi.light.vuetify.elements.common.Avatar;
import io.github.epam.TestsInit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.avatarsPage;
import static io.github.com.pages.AvatarsPage.avatarsWithSize;
import static io.github.com.pages.AvatarsPage.profileCard;
import static io.github.com.pages.AvatarsPage.slotAvatars;
import static io.github.com.pages.AvatarsPage.tileAvatar;

public class AvatarsTests extends TestsInit {

    @BeforeClass
    public void before() {
        avatarsPage.open();
    }

    @Test
    public void avatarsWithSizeTests() {
        for(Avatar avatar: avatarsWithSize) {
            avatar.is().displayed();
        }
        avatarsWithSize.get(1).has().text("36");
        avatarsWithSize.get(2).has().text("48");
        avatarsWithSize.get(3).has().text("62");
        avatarsWithSize.get(1).has().size("36");
        avatarsWithSize.get(2).has().size("48");
        avatarsWithSize.get(3).has().size("62");
    }

    @Test
    public void tileAvatarTests() {
        tileAvatar.is().displayed();
        tileAvatar.has().icon();
        tileAvatar.has().size("48");
    }

    @Test
    public void slotAvatarsTests() {
        for(Avatar avatar: slotAvatars) {
            avatar.is().displayed();
        }
        slotAvatars.get(1).has().icon();
        slotAvatars.get(2).has().photo();
        slotAvatars.get(3).has().text("CJ");
    }

    @Test
    public void profileCardTests() {
        profileCard.is().displayed();
        profileCard.has().name("Marcus Obrien");
        profileCard.has().jobFunction("Network Engineer");
        profileCard.has().avatarImage();
        profileCard.has().backgroundImage();
    }
}
