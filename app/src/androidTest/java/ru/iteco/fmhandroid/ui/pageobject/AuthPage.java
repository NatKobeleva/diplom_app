package ru.iteco.fmhandroid.ui.pageobject;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import ru.iteco.fmhandroid.R;

public class AuthPage {

    public AuthPage enterLogin(String login) {
        Espresso.onView(ViewMatchers.withId(R.id.login_text_input_layout))
                .perform(ViewActions.typeText(login), ViewActions.closeSoftKeyboard());
        return this;
    }

    public AuthPage enterPassword(String password) {
        Espresso.onView(ViewMatchers.withId(R.id.password_text_input_layout))
                .perform(ViewActions.typeText(password), ViewActions.closeSoftKeyboard());
        return this;
    }

    public void tapLoginButton() {
        Espresso.onView(ViewMatchers.withId(R.id.enter_button)).perform(ViewActions.click());
    }

}