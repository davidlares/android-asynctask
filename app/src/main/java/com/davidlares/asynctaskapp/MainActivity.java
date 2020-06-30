 package com.davidlares.asynctaskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AsyncTask";
    private Button mButton;
    private MyTask myTask; // this will be generated after field transformation
    private boolean mTaskRunning;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customThread();
            }
        });
    }

    public void customThread() {

        Log.d(TAG, "Button clicked");
        // canceling
        //MyTask myTask = new MyTask(); // set to field (Refactor - Extract - Field)

        // evaluating
        if (mTaskRunning && myTask != null) {
            myTask.cancel(true);
            mTaskRunning = false;
        } else {
            myTask = new MyTask();
            myTask.execute("red", "blue", "green");
            mTaskRunning = true;
        }


        // before canceling

        // MyTask myTask = new MyTask();
        // myTask.execute("Red","Blue","Green");
        // MyTask myTask2 = new MyTask();
        // myTask2.execute("Orange","White","Black");

    }

}
