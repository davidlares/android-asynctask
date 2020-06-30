package com.davidlares.asynctaskapp;

import android.os.AsyncTask;
import android.util.Log;

public class MyTask extends AsyncTask<String, String, String> {

    private static final String TAG = "AsyncTask";

    @Override
    protected String doInBackground(String... strings) {
        for(String value: strings) {
            // check if cancelled is sent
            if(isCancelled()) {
                publishProgress("Cancelled");
                break;
            }
            Log.i(TAG, "DoInBackground: " + value);
            publishProgress(value);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "thread all done!";
    }

    @Override
    // receiving on the main thread
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        Log.d("Receiving", values[0]); // array sent - logging first value
    }

    @Override
    // handling thread return
    protected void onPostExecute(String s) {
        Log.d("Retuning thread: ", s);
    }

    @Override
    protected void onCancelled() {
        Log.d("Cancelled","Task cancelled");
    }

    @Override
    protected void onCancelled(String s) {
        Log.d("Cancelled","Task cancelled with result: " + s);
    }
}
