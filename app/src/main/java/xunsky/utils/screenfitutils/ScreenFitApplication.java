package xunsky.utils.screenfitutils;

import android.app.Application;

public class ScreenFitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ScreenFitUtils.init();
    }
}
