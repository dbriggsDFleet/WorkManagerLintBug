package com.sample.workmanagerlintbug;

import android.content.Context;

import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

public class WorkManagerWrapper {
    private final WorkManager workManager;

    public WorkManagerWrapper(Context context) {
        workManager = WorkManager.getInstance(context);
    }

    public void enqueuePeriodicWorker(WorkerDetails details) {

        PeriodicWorkRequest workRequest = null;
        switch (details) {
            case PERIODIC_JOB:
                workRequest = new PeriodicWorkRequest.Builder(TestPeriodicWorker.class,
                        details.interval, details.timeUnit).build();
                break;
        }

        workManager.enqueueUniquePeriodicWork(details.uniqueName, details.workPolicy,
                workRequest);
    }
}
