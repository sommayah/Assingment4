package com.udacity.gradle.builditbigger;

import android.test.InstrumentationTestCase;
import android.text.TextUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by sommayahsoliman on 12/16/15.
 */
public class FreeTaskAndroidTest extends InstrumentationTestCase{
    public void testAsyncTask() throws Exception{
        try {
            EndpointsAsyncTask jokeTask = new EndpointsAsyncTask();
            jokeTask.execute(getInstrumentation().getContext());
            String joke = jokeTask.get(30, TimeUnit.SECONDS);
            assertFalse(TextUtils.isEmpty(joke));
        } catch (Exception e){
            fail("Timed out");
        }
    }


}
