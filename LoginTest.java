package org.wikipedia.main;

import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;

import android.content.Context;
import android.content.Intent;

import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wikipedia.R;
import org.wikipedia.login.LoginActivity;
import org.wikipedia.settings.SettingsActivity;
import org.wikipedia.talk.TalkTopicActivity;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginTest {
    LoginPage loginPage;
    SettingsPage settingsPage;
    EditWiki editWiki;
    FontPage fontPage;
    GetActivity getActivity;
    Intent expectedIntent;
    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void skipBefore() throws InterruptedException {

        SkipPage skipPage = new SkipPage();
        skipPage.skipPlease();
        loginPage = new LoginPage();
        settingsPage = new SettingsPage();
        editWiki = new EditWiki();
        fontPage = new FontPage();
        getActivity = new GetActivity();
        expectedIntent = new Intent();
        Intents.init();
        Thread.sleep(500);

    }

    @Test
    public void LogInTest() throws InterruptedException {

      loginPage.toMoreBtn();

      loginPage.logBtn();

      loginPage.createLoginBtn();
//
//    loginPage.insertLoginField();
//
//    loginPage.insertPasswordField();
//
//    loginPage.acceptBtn();

      //loginPage.errorHandler();
      pressBack();

      Thread.sleep(500);

      Assert.assertEquals(getActivity.getActivityInstance().getClass(), MainActivity.class);



    }

    @Test
    public void changeSettingsActivity() throws InterruptedException {

        loginPage.toMoreBtn();

        settingsPage.clickSettingsBtn();

        settingsPage.fixLenta();

        pressBack();

        Assert.assertEquals(getActivity.getActivityInstance().getClass(), SettingsActivity.class);

    }

    @Test
    public void changeWiki() throws InterruptedException {

        editWiki.clickAnounce();

        pressBack();

        Thread.sleep(100);

        editWiki.goToPost();

        editWiki.settingsPost();

        editWiki.talkingOverflow();

        Thread.sleep(1000);

        editWiki.newTopic();

        editWiki.pickTheme();

        editWiki.pickMessage();

        editWiki.sendReplyMessage();

        Assert.assertEquals(getActivity.getActivityInstance().getClass(), TalkTopicActivity.class);

    }

    @Test
    public void changeFont() throws InterruptedException{

        loginPage.toMoreBtn();

        settingsPage.clickSettingsBtn();

        fontPage.changeFontActivity();

        fontPage.changeFont();

        pressBack();

        pressBack();

        Assert.assertEquals(getActivity.getActivityInstance().getClass(), MainActivity.class);

    }

    @After
    public void releaseIntends(){
        Intents.release();
    }


}
