package com.sample.workmanagerlintbug;

import java.util.concurrent.TimeUnit;

import androidx.work.ExistingPeriodicWorkPolicy;

public enum WorkerDetails {
    PERIODIC_JOB("PERIODIC_JOB_V1", 30, TimeUnit.MINUTES, ExistingPeriodicWorkPolicy.KEEP);


    public final String uniqueName;
    public final long interval;
    public final TimeUnit timeUnit;
    public final ExistingPeriodicWorkPolicy workPolicy;

    WorkerDetails(String uniqueName, long interval, TimeUnit timeUnit, ExistingPeriodicWorkPolicy workPolicy) {
        this.uniqueName = uniqueName;
        this.interval = interval;
        this.timeUnit = timeUnit;
        this.workPolicy = workPolicy;
    }
    }
