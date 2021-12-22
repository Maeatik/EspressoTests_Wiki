package org.wikipedia.main;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import static org.hamcrest.Matchers.allOf;

import org.wikipedia.R;

public class LoginPage {


    public void toMoreBtn() {
        onView(allOf(withId(R.id.nav_more_container), isDisplayed())).perform(click());
    }

    public void logBtn() {
        onView(allOf(withId(R.id.main_drawer_login_button), isDisplayed())).perform(click());
    }

    public void createLoginBtn() {
        onView(allOf(withId(R.id.create_account_login_button), isDisplayed())).perform(click());
    }

    public void insertLoginField() {
        onView(allOf(withHint(R.string.login_username_hint))).perform(click(), typeText(ConfProperties.getProperty("login")));
    }

    public void insertPasswordField(){
        onView(allOf(withHint(R.string.login_password_hint))).perform(click(), typeText(ConfProperties.getProperty("password")));
    }

    public void acceptBtn(){
        onView(withId(R.id.login_button)).perform(scrollTo(), click());
    }

    public void errorHandler() {
        onView(allOf(withId(R.id.view_login_error), isDisplayed())).perform(click());
    }
}
