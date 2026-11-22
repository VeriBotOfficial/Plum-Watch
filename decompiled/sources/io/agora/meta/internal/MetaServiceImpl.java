package io.agora.meta.internal;

import android.content.Context;
import android.text.TextUtils;
import io.agora.meta.IMetaService;
import io.agora.meta.IMetaServiceEventHandler;
import io.agora.meta.MetaSceneConfig;
import io.agora.meta.MetaServiceConfig;
import io.agora.utils2.internal.Logging;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class MetaServiceImpl extends IMetaService {
    private static final String TAG = "MetaServiceImpl";
    private String mLauncherVersion;
    private long mNativeHandle = 0;
    private final AtomicBoolean mIsDestroying = new AtomicBoolean(false);

    private native int nativeAddEventHandler(long nativeMetaServiceAndroid, Object handler);

    private native int nativeCancelDownloadSceneAssets(long nativeMetaServiceAndroid, long sceneId);

    private native int nativeCleanSceneAssets(long nativeMetaServiceAndroid, long sceneId);

    private native int nativeCreateScene(long nativeMetaServiceAndroid, MetaSceneConfig config);

    private static native int nativeDestroy(long handle);

    private native int nativeDownloadSceneAssets(long nativeMetaServiceAndroid, long sceneId);

    private native int nativeGetSceneAssetsInfo(long nativeMetaServiceAndroid);

    private native int nativeIsSceneAssetsDownloaded(long nativeMetaServiceAndroid, long sceneId);

    private native long nativeObjectInit(MetaServiceConfig config, long rtcEngine);

    private native int nativeRemoveEventHandler(long nativeMetaServiceAndroid, Object handler);

    private native int nativeRenewToken(long nativeMetaServiceAndroid, String token);

    private void readLauncherVersion(Context context) {
        try {
            InputStream open = context.getAssets().open("LauncherVersion.txt", 3);
            byte[] bArr = new byte[open.available()];
            if (open.read(bArr) <= 0) {
                bArr = "unknown".getBytes();
            }
            open.close();
            this.mLauncherVersion = new String(bArr, "UTF-8");
        } catch (IOException e) {
            Logging.e(TAG, "get launcher version failed, " + e.getMessage());
        }
    }

    @Override // io.agora.meta.IMetaService
    public int addEventHandler(IMetaServiceEventHandler eventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(addEventHandler)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaService does not initialize or it may be destroyed (addEventHandler)");
                return -7;
            }
            return nativeAddEventHandler(j, eventHandler);
        }
    }

    @Override // io.agora.meta.IMetaService
    public int cancelDownloadSceneAssets(long sceneId) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(cancelDownloadSceneAssets)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaService does not initialize or it may be destroyed (cancelDownloadSceneAssets)");
                return -7;
            }
            return nativeCancelDownloadSceneAssets(j, sceneId);
        }
    }

    @Override // io.agora.meta.IMetaService
    public int cleanSceneAssets(long sceneId) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(cleanSceneAssets)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaService does not initialize or it may be destroyed (cleanSceneAssets)");
                return -7;
            }
            return nativeCleanSceneAssets(j, sceneId);
        }
    }

    @Override // io.agora.meta.IMetaService
    public int createScene(MetaSceneConfig config) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(createScene)");
            return -8;
        }
        synchronized (this) {
            if (this.mNativeHandle == 0) {
                Logging.e(TAG, "MetaService does not initialize or it may be destroyed (createScene)");
                return -7;
            }
            if (config.mActivityContext == null) {
                return -2;
            }
            return nativeCreateScene(this.mNativeHandle, config);
        }
    }

    @Override // io.agora.meta.IMetaService
    protected int doDestroy() {
        if (this.mNativeHandle == 0) {
            Logging.e(TAG, "MetaService does not initialize or it may be destroyed (doDestroy)");
            return -7;
        }
        this.mIsDestroying.set(true);
        nativeDestroy(this.mNativeHandle);
        this.mNativeHandle = 0L;
        this.mIsDestroying.set(false);
        return 0;
    }

    @Override // io.agora.meta.IMetaService
    public int downloadSceneAssets(long sceneId) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(downloadSceneAssets)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaService does not initialize or it may be destroyed (downloadSceneAssets)");
                return -7;
            }
            return nativeDownloadSceneAssets(j, sceneId);
        }
    }

    @Override // io.agora.meta.IMetaService
    public String getLauncherVersion(Context ctx) {
        if (ctx == null) {
            return "unknown";
        }
        if (TextUtils.isEmpty(this.mLauncherVersion)) {
            readLauncherVersion(ctx);
        }
        return this.mLauncherVersion;
    }

    @Override // io.agora.meta.IMetaService
    public int getSceneAssetsInfo() {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(getSceneAssetsInfo)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaService does not initialize or it may be destroyed (getSceneAssetsInfo)");
                return -7;
            }
            return nativeGetSceneAssetsInfo(j);
        }
    }

    @Override // io.agora.meta.IMetaService
    public int initialize(MetaServiceConfig config) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(initialize)");
            return -8;
        }
        synchronized (this) {
            if (config.mRtcEngine != null && !TextUtils.isEmpty(config.mAppId)) {
                if (config.mRtcEngine.loadExtensionProvider("agora_rtm_loader") != 0) {
                    Logging.e(TAG, "Rtm extension is not loaded");
                }
                long nativeObjectInit = nativeObjectInit(config, config.mRtcEngine.getNativeHandle());
                this.mNativeHandle = nativeObjectInit;
                return nativeObjectInit == 0 ? -7 : 0;
            }
            return -2;
        }
    }

    @Override // io.agora.meta.IMetaService
    public int isSceneAssetsDownloaded(long sceneId) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(isSceneAssetsDownloaded)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaService does not initialize or it may be destroyed (isSceneAssetsDownloaded)");
                return -7;
            }
            return nativeIsSceneAssetsDownloaded(j, sceneId);
        }
    }

    @Override // io.agora.meta.IMetaService
    public int removeEventHandler(IMetaServiceEventHandler eventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(removeEventHandler)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaService does not initialize or it may be destroyed (removeEventHandler)");
                return -7;
            }
            return nativeRemoveEventHandler(j, eventHandler);
        }
    }

    @Override // io.agora.meta.IMetaService
    public int renewToken(String token) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(renewToken)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaService does not initialize or it may be destroyed (renewToken)");
                return -7;
            }
            return nativeRenewToken(j, token);
        }
    }
}
