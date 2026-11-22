package com.wakeup.common.burypoint.monitor;

import android.app.Activity;
import android.os.SystemClock;
import com.wakeup.common.burypoint.monitor.ListenerMgr;
import com.wakeup.common.log.LogUtils;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class AppEventMonitor {
    private static final String TAG = "AppEventMonitor";
    private boolean isAppForeground;
    private boolean isAppStart;
    private boolean isFirstTime;
    private int mActivityCount;
    private final HashSet<Integer> mActivityHashCode;
    private boolean mAppForegroundReported;
    private long mAppForegroundTime;
    private long mColdUsStamp;
    private boolean mFirstActivityResumed;
    private boolean mIsColdStart;
    private boolean mIsNeedInterceptForegroundSession;
    private long mLastGenerateTime;
    private final ListenerMgr<IAppEventListener> mListenerMgr;
    private boolean mNoForegroundActivity;
    private String mUsId;
    private long mUsStamp;

    public interface IAppEventListener {
        void onAppIn();

        void onAppOut(long duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void init() {
    }

    public void register(IAppEventListener listener) {
        this.mListenerMgr.register(listener);
    }

    public void unregister(IAppEventListener listener) {
        this.mListenerMgr.unregister(listener);
    }

    public static AppEventMonitor getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private AppEventMonitor() {
        this.mActivityCount = 0;
        this.mAppForegroundTime = 0L;
        this.mLastGenerateTime = -1L;
        this.mIsNeedInterceptForegroundSession = false;
        this.mNoForegroundActivity = true;
        this.mFirstActivityResumed = false;
        this.mAppForegroundReported = false;
        this.mIsColdStart = true;
        this.mUsId = "";
        this.mUsStamp = System.currentTimeMillis();
        this.mColdUsStamp = -1L;
        this.mListenerMgr = new ListenerMgr<>();
        this.mActivityHashCode = new HashSet<>();
        this.isAppStart = true;
        this.isFirstTime = true;
        this.isAppForeground = false;
    }

    private static class InstanceHolder {
        private static final AppEventMonitor INSTANCE;

        private InstanceHolder() {
        }

        static {
            AppEventMonitor appEventMonitor = new AppEventMonitor();
            INSTANCE = appEventMonitor;
            appEventMonitor.init();
        }
    }

    public boolean isAppForeground() {
        return this.isAppForeground;
    }

    public void onActivityStarted(Activity activity) {
        this.mActivityCount++;
        this.mActivityHashCode.add(Integer.valueOf(activity.hashCode()));
        appInDataSender();
        this.isAppStart = false;
    }

    public void onActivityStopped(Activity activity) {
        if (!this.mActivityHashCode.remove(Integer.valueOf(activity.hashCode()))) {
            LogUtils.e(TAG, "检测到 activity[" + activity.toString() + "].onStop()事件，但没有检测到该activity对应的onStart事件");
            return;
        }
        int i = this.mActivityCount - 1;
        this.mActivityCount = i;
        if (i <= 0) {
            appOutDataSender(false);
        }
    }

    private void appInDataSender() {
        if (this.mAppForegroundReported) {
            return;
        }
        this.mAppForegroundReported = true;
        this.mAppForegroundTime = SystemClock.elapsedRealtime();
        this.isAppForeground = true;
        AppEventReport.reportAppForeground();
        this.mListenerMgr.startNotify(new ListenerMgr.INotifyCallback<IAppEventListener>() { // from class: com.wakeup.common.burypoint.monitor.AppEventMonitor.1
            @Override // com.wakeup.common.burypoint.monitor.ListenerMgr.INotifyCallback
            public void onNotify(IAppEventListener listener) {
                listener.onAppIn();
            }
        });
    }

    private void appOutDataSender(final boolean isMainThread) {
        if (this.mAppForegroundReported) {
            this.mAppForegroundReported = false;
            this.mNoForegroundActivity = true;
            this.mLastGenerateTime = SystemClock.elapsedRealtime();
            final long elapsedRealtime = SystemClock.elapsedRealtime() - this.mAppForegroundTime;
            this.isAppForeground = false;
            AppEventReport.reportAppBackground(elapsedRealtime);
            this.mListenerMgr.startNotify(new ListenerMgr.INotifyCallback<IAppEventListener>() { // from class: com.wakeup.common.burypoint.monitor.AppEventMonitor.2
                @Override // com.wakeup.common.burypoint.monitor.ListenerMgr.INotifyCallback
                public void onNotify(IAppEventListener listener) {
                    listener.onAppOut(elapsedRealtime);
                }
            });
        }
    }
}
