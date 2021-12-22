package org.wikipedia.main;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;


public class SettingsPage {

    public void clickSettingsBtn(){
        onView(allOf(withText("Настройки"), isDisplayed())).perform(click());

    }
   public void fixLenta(){
       onView(allOf(withText("Настроить ленту"), isDisplayed())).perform(click());
   }

}
