package com.xmly.businesssdk.trace.time;

import com.autonavi.aps.amapapi.config.Const;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.umeng.analytics.AnalyticsConfig;
import com.xmly.businesssdk.trace.config.TraceConfiguration;
import com.xmly.businesssdk.utils.Logger;
import com.yandex.div.core.timer.TimerController;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: TimeProvider.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xmly/businesssdk/trace/time/TimeProvider;", "", "()V", "MAX_TIME_DIFF_MS", "", "TAG", "", "isSync", "Ljava/util/concurrent/atomic/AtomicBoolean;", "serverTime", "Ljava/util/concurrent/atomic/AtomicLong;", AnalyticsConfig.RTD_START_TIME, "currentTimeMillis", "isSynced", "", TimerController.RESET_COMMAND, "", "syncTime", "timeServiceUrl", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeProvider {
    private static final long MAX_TIME_DIFF_MS = 120000;
    private static final String TAG = "TimeProvider";
    public static final TimeProvider INSTANCE = new TimeProvider();
    private static final AtomicBoolean isSync = new AtomicBoolean(false);
    private static final AtomicLong startTime = new AtomicLong(0);
    private static final AtomicLong serverTime = new AtomicLong(0);

    private TimeProvider() {
    }

    public static /* synthetic */ void syncTime$default(TimeProvider timeProvider, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = TraceConfiguration.DEFAULT_TIME_SERVICE_URL;
        }
        timeProvider.syncTime(str);
    }

    public final long currentTimeMillis() {
        long j = serverTime.get();
        long j2 = startTime.get();
        if (j <= 0 || j2 <= 0) {
            return System.currentTimeMillis();
        }
        long currentTimeMillis = (System.currentTimeMillis() - j2) + j;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - currentTimeMillis2) < 120000) {
            return currentTimeMillis;
        }
        Logger.w(TAG, "服务器时间差异过大，使用本地时间");
        return currentTimeMillis2;
    }

    public final boolean isSynced() {
        return serverTime.get() > 0 && startTime.get() > 0;
    }

    public final void reset() {
        isSync.set(false);
        startTime.set(0L);
        serverTime.set(0L);
    }

    public final void syncTime(String timeServiceUrl) {
        Intrinsics.checkNotNullParameter(timeServiceUrl, "timeServiceUrl");
        if (isSync.compareAndSet(false, true)) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient build = builder.connectTimeout(15L, timeUnit).readTimeout(15L, timeUnit).build();
            Request build2 = new Request.Builder().url(timeServiceUrl).get().build();
            final long currentTimeMillis = System.currentTimeMillis();
            build.newCall(build2).enqueue(new Callback() { // from class: com.xmly.businesssdk.trace.time.TimeProvider$syncTime$1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e) {
                    AtomicBoolean atomicBoolean;
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e, "e");
                    atomicBoolean = TimeProvider.isSync;
                    atomicBoolean.set(false);
                    Logger.e("TimeProvider", "时间同步失败", e);
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    AtomicBoolean atomicBoolean;
                    String string;
                    AtomicLong atomicLong;
                    AtomicLong atomicLong2;
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    try {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long j = (currentTimeMillis2 - currentTimeMillis) / 2;
                        ResponseBody body = response.body();
                        if (body == null || (string = body.string()) == null) {
                            return;
                        }
                        long asLong = ((JsonObject) new Gson().fromJson(string, JsonObject.class)).get("data").getAsLong();
                        long currentTimeMillis3 = System.currentTimeMillis();
                        long j2 = (currentTimeMillis3 - currentTimeMillis2) + asLong + j;
                        atomicLong = TimeProvider.startTime;
                        atomicLong.set(currentTimeMillis3);
                        atomicLong2 = TimeProvider.serverTime;
                        atomicLong2.set(j2);
                        Logger.d("TimeProvider", "时间同步成功, 网络延迟: " + j + "ms, 服务器时间差: " + (j2 - currentTimeMillis3) + Const.SP_KEY_GSM_UPLOAD_MXSIZE);
                    } catch (Exception e) {
                        atomicBoolean = TimeProvider.isSync;
                        atomicBoolean.set(false);
                        Logger.e("TimeProvider", "解析服务器时间失败", e);
                    }
                }
            });
        }
    }
}
