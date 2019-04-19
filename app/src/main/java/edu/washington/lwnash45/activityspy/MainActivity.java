package edu.washington.lwnash45.activityspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate event fired");
        if (savedInstanceState != null) {
            Log.i(TAG, savedInstanceState.toString());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "We're going down, Captian!");
    }
}
