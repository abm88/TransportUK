package com.example.abdulbasith.transportuk.ui.util.rx;

import io.reactivex.Scheduler;

/**
 * Created by AbdulBasit on 18/10/2017.
 */

public interface SchedulerProvider {
    Scheduler ui();
    Scheduler computation();
    Scheduler io();


}