package org.wikipedia.main;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class FontPage {

    public void changeFontActivity(){
        onView(allOf(withText("Оформление приложения"), isDisplayed())).perform(click());
    }

    public void changeFont(){
        onView(allOf(withText("SERIF"), isDisplayed())).perform(click());
    }
}
