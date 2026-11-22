package com.amap.location.collection;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.amap.location.collection.collector.FpsCollector;
import com.amap.location.collection.collector.TrackCollector;
import com.amap.location.collection.common.CollectionData;
import com.amap.location.collection.freshness.RssiManager;
import com.amap.location.collection.uploadsave.UploadSaveManager;
import com.amap.location.collection.utils.AESUtil;
import com.amap.location.collection.wrapper.SignalWrapper;
import com.amap.location.support.AmapContext;
import com.amap.location.support.bean.gnss.AmapSatellite;
import com.amap.location.support.bean.location.AmapLocation;
import com.amap.location.support.bean.location.AmapLocationGnss;
import com.amap.location.support.header.HeaderConfig;
import com.amap.location.support.log.ALLog;
import com.amap.location.support.signal.status.StatusChangeListener;
import com.amap.location.support.util.GZipUtil;
import java.util.List;

/* loaded from: classes11.dex */
public class CollectionManager {
    private static final String TAG = "CollectionManager";
    private CollectionConfig mConfig;
    private Context mContext;
    private volatile WorkHandler mHandler;
    private HandlerThread mHandlerThread;
    private Looper mLooper;
    private SignalWrapper mSignalWrapper;
    private TrackCollector mTrackCollector;
    private UploadSaveManager mUploadSaveManager;
    private boolean mHasDestroyed = false;
    private final Object mLock = new Object();
    private SignalWrapper.SignalListener mSignalListener = new SignalWrapper.SignalListener() { // from class: com.amap.location.collection.CollectionManager.2
        @Override // com.amap.location.collection.wrapper.SignalWrapper.SignalListener
        public void onGpsSatelliteChanged(int i, int i2, float f, List<AmapSatellite> list) {
            if (CollectionManager.this.mTrackCollector != null) {
                CollectionManager.this.mTrackCollector.onGpsStatusListener(i, i2, f, list);
            }
        }

        @Override // com.amap.location.collection.wrapper.SignalWrapper.SignalListener
        public void onLocationChanged(AmapLocationGnss amapLocationGnss, FpsCollector.Data data) {
            CollectionManager.this.onLocation(amapLocationGnss, data);
        }
    };
    private StatusChangeListener mScreenStateListener = new StatusChangeListener() { // from class: com.amap.location.collection.CollectionManager.3
        @Override // com.amap.location.support.signal.status.StatusChangeListener
        public int getAction() {
            return 6;
        }

        @Override // com.amap.location.support.signal.status.StatusChangeListener
        public void onChange(int i, boolean z, int i2, int i3) {
            if (i != getAction()) {
                return;
            }
            if (z) {
                if (CollectionManager.this.mConfig.isStopCollectionWhenScreenOff()) {
                    CollectionManager.this.startListenLocation();
                }
            } else if (CollectionManager.this.mConfig.isStopCollectionWhenScreenOff()) {
                CollectionManager.this.stopListenLocation();
            }
        }
    };

    class WorkHandler extends Handler {
        static final int MSG_DESTROY = 1;

        WorkHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            AmapContext.getSwitchManager().removeStatusListener(CollectionManager.this.mScreenStateListener);
            CollectionManager.this.stopListenLocation();
            removeCallbacksAndMessages(null);
            if (CollectionManager.this.mUploadSaveManager != null) {
                CollectionManager.this.mUploadSaveManager.destroy();
            }
            post(new Runnable() { // from class: com.amap.location.collection.CollectionManager.WorkHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        CollectionManager.this.mHandlerThread.quit();
                    } catch (Throwable th) {
                        ALLog.d(th);
                    }
                }
            });
        }
    }

    public CollectionManager(Context context, CollectionConfig collectionConfig) {
        this.mContext = context;
        this.mConfig = collectionConfig;
    }

    private boolean isCollectionEnabled() {
        ALLog.i(TAG, "fps open:" + this.mConfig.getFpsCollectorConfig().isEnabled() + " track open:" + this.mConfig.getTrackCollectorConfig().isEnabled());
        return this.mConfig.getFpsCollectorConfig().isEnabled() || this.mConfig.getTrackCollectorConfig().isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLocation(AmapLocationGnss amapLocationGnss, FpsCollector.Data data) {
        CollectionData build;
        try {
            if (this.mConfig.getFpsCollectorConfig().isEnabled() && (build = FpsCollector.getInstance().build(data)) != null && this.mUploadSaveManager != null) {
                build.setData(AESUtil.encrypt(HeaderConfig.getProcessName(), GZipUtil.compress(build.getData())));
                this.mUploadSaveManager.save(build);
            }
            if (this.mConfig.getTrackCollectorConfig().isEnabled()) {
                if (this.mTrackCollector == null) {
                    this.mTrackCollector = new TrackCollector(this.mConfig.getTrackCollectorConfig());
                }
                CollectionData build2 = this.mTrackCollector.build(amapLocationGnss);
                if (build2 == null || this.mUploadSaveManager == null) {
                    return;
                }
                build2.setData(AESUtil.encrypt(HeaderConfig.getProcessName(), GZipUtil.compress(build2.getData())));
                this.mUploadSaveManager.save(build2);
            }
        } catch (Throwable th) {
            ALLog.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startListenLocation() {
        if (this.mSignalListener != null) {
            return;
        }
        boolean isEnabled = this.mConfig.getFpsCollectorConfig().isEnabled();
        boolean isEnabled2 = this.mConfig.getTrackCollectorConfig().isEnabled();
        long j = isEnabled ? 1000L : 0L;
        if (isEnabled2) {
            j = isEnabled ? Math.min(j, 2000L) : 2000L;
        }
        try {
            if (this.mSignalWrapper == null) {
                this.mSignalWrapper = new SignalWrapper(this.mConfig.getFpsCollectorConfig(), this.mSignalListener, this.mLooper);
            }
            this.mSignalWrapper.requestGpsUpdates(AmapLocation.PASSIVE_PROVIDER, j);
        } catch (Throwable th) {
            ALLog.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopListenLocation() {
        SignalWrapper signalWrapper;
        try {
            if (this.mSignalListener == null || (signalWrapper = this.mSignalWrapper) == null) {
                return;
            }
            signalWrapper.stopWifiScan();
            this.mSignalWrapper.removeGpsUpdates();
            this.mSignalListener = null;
            RssiManager.clearData();
        } catch (Throwable th) {
            ALLog.d(th);
        }
    }

    void destroy() {
        synchronized (this.mLock) {
            if (this.mHandler != null) {
                this.mHandler.obtainMessage(1).sendToTarget();
            } else {
                this.mHasDestroyed = true;
            }
        }
    }

    CollectionData getNetworkLocatorUploadData() {
        UploadSaveManager uploadSaveManager;
        if (this.mHandler == null || (uploadSaveManager = this.mUploadSaveManager) == null) {
            return null;
        }
        return uploadSaveManager.getNetworkLocatorUploadData();
    }

    public void init() {
        if (isCollectionEnabled()) {
            HandlerThread handlerThread = new HandlerThread("collection") { // from class: com.amap.location.collection.CollectionManager.1
                @Override // android.os.HandlerThread
                protected void onLooperPrepared() {
                    try {
                        CollectionManager.this.mLooper = getLooper();
                        if (CollectionManager.this.mUploadSaveManager == null) {
                            CollectionManager collectionManager = CollectionManager.this;
                            collectionManager.mUploadSaveManager = new UploadSaveManager(collectionManager.mContext, CollectionManager.this.mLooper, CollectionManager.this.mConfig);
                        }
                        CollectionManager.this.mUploadSaveManager.init();
                        synchronized (CollectionManager.this.mLock) {
                            CollectionManager collectionManager2 = CollectionManager.this;
                            CollectionManager collectionManager3 = CollectionManager.this;
                            collectionManager2.mHandler = collectionManager3.new WorkHandler(collectionManager3.mLooper);
                            if (CollectionManager.this.mHasDestroyed) {
                                CollectionManager.this.mHasDestroyed = false;
                                CollectionManager.this.mHandler.obtainMessage(1).sendToTarget();
                            }
                        }
                        if (CollectionManager.this.mConfig.isStopCollectionWhenScreenOff()) {
                            AmapContext.getSwitchManager().addStatusListener(CollectionManager.this.mScreenStateListener);
                            if (!AmapContext.getSwitchManager().isScreenOn()) {
                                return;
                            }
                        }
                        CollectionManager.this.startListenLocation();
                    } catch (Throwable th) {
                        ALLog.d(th);
                    }
                }
            };
            this.mHandlerThread = handlerThread;
            handlerThread.start();
        }
    }

    void onNetworkLocatorUploadFinish(boolean z, CollectionData collectionData) {
        UploadSaveManager uploadSaveManager;
        if (collectionData == null || this.mHandler == null || (uploadSaveManager = this.mUploadSaveManager) == null) {
            return;
        }
        uploadSaveManager.onNetworkLocatorUploadFinish(z, collectionData);
    }
}
