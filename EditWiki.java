package org.wikipedia.main;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import org.wikipedia.R;

public class EditWiki {

    public void clickAnounce(){
        onView(allOf(withId(R.id.view_announcement_action_positive), isDisplayed())).perform(click());
    }

    public void goToPost(){
        onView(allOf(withId(R.id.articleImage), isDisplayed())).perform(click());
    }

    public void settingsPost(){
        onView(allOf(withId(R.id.page_toolbar_button_show_overflow_menu), isDisplayed())).perform(click());
    }

    public void talkingOverflow(){
        onView(allOf(withId(R.id.overflow_talk), isDisplayed())).perform(click());
    }

    public void newTopic(){
        onView(allOf(withId(R.id.talkNewTopicButton), isDisplayed())).perform(click());
    }

    public void pickTheme(){
        onView(allOf(withId(R.id.replySubjectText))).perform(click(), typeText("Test theme"));
    }

    public void pickMessage(){
        onView(allOf(withId(R.id.replyEditText))).perform(click(), typeText("Test reply of theme"));
    }

    public void sendReplyMessage(){
        onView(allOf(withId(R.id.replySaveButton), isDisplayed())).perform(click());
    }

}
