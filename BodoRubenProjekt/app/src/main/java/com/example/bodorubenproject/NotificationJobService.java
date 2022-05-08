package com.example.bodorubenproject;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class NotificationJobService extends JobService {

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        new NotificationHandler(getApplicationContext()).send("Ideje vásárolni! :)");

        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
