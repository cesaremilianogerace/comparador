package com.example.comparador

//import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

import androidx.test.ext.junit.rules.ActivityScenarioRule

import org.junit.Rule

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.assertion.ViewAssertions.*

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testUI_equalStrings() {
        onView(withId(R.id.editText1)).perform(typeText("Hello"))
        onView(withId(R.id.editText2)).perform(typeText("Hello"))
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son iguales")))
    }

    @Test
    fun testUI_differentStrings() {
        onView(withId(R.id.editText1)).perform(typeText("Hello"))
        onView(withId(R.id.editText2)).perform(typeText("World"))
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son diferentes")))
    }
}
