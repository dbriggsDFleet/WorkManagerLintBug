package com.sample.workmanagerlintbug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkManagerWrapper wrapper = new WorkManagerWrapper(this);

        wrapper.enqueuePeriodicWorker(WorkerDetails.PERIODIC_JOB);
    }
}
