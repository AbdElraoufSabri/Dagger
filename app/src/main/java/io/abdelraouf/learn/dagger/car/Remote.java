package io.abdelraouf.learn.dagger.car;

import android.util.Log;

import javax.inject.Inject;

class Remote {
    private static final String TAG = "Remote_XManoO";
    private Car car;

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
