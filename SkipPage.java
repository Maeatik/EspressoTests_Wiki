package org.wikipedia.main;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


import static org.hamcrest.Matchers.allOf;

import org.wikipedia.R;


public class SkipPage {

    public void skipPlease(){
        onView(allOf(withId(R.id.fragment_onboarding_skip_button), isDisplayed())).perform(click());
    }

}
