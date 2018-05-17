package edu.hanover.joke;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.app.IntentService;

public class MainActivity extends Activity {

    public DelayedMessageService() {
        super("DelayedMessageService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //CODE HERE
    }
}
