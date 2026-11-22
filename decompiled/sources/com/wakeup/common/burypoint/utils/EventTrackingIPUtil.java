package com.wakeup.common.burypoint.utils;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.wakeup.common.storage.CacheManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes2.dex */
public class EventTrackingIPUtil {
    private static final String TAG = "EventTrackingIPUtil";
    private static Handler mainHandler = new Handler(Looper.getMainLooper());

    public interface IpAddressListener {
        void onIpAddressReceived(String ipAddress);
    }

    public static void geIpv4NetIP(final IpAddressListener listener) {
        Log.i(TAG, "start to get ip");
        new Thread(new Runnable() { // from class: com.wakeup.common.burypoint.utils.EventTrackingIPUtil.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://checkip.amazonaws.com/").openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    String readLine = bufferedReader.readLine();
                    Log.i(EventTrackingIPUtil.TAG, "IP Address before regex: " + readLine);
                    bufferedReader.close();
                    httpURLConnection.disconnect();
                    Matcher matcher = Pattern.compile("\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b").matcher(readLine);
                    if (matcher.find()) {
                        Log.i(EventTrackingIPUtil.TAG, "IP Address: " + matcher.group());
                        IpAddressListener.this.onIpAddressReceived(readLine);
                        CacheManager.INSTANCE.saveString("IPAddress", matcher.group());
                    }
                } catch (Exception e) {
                    Log.e(EventTrackingIPUtil.TAG, "Exception occurred while creating URL", e);
                }
            }
        }).start();
    }
}
