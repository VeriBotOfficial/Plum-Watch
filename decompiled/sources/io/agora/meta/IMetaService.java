package io.agora.meta;

import android.content.Context;
import io.agora.meta.internal.MetaServiceImpl;

/* loaded from: classes6.dex */
public abstract class IMetaService {
    private static IMetaService mInstance;

    public static synchronized IMetaService create() {
        IMetaService iMetaService;
        synchronized (IMetaService.class) {
            if (mInstance == null) {
                mInstance = new MetaServiceImpl();
            }
            iMetaService = mInstance;
        }
        return iMetaService;
    }

    public static synchronized void destroy() {
        synchronized (IMetaService.class) {
            IMetaService iMetaService = mInstance;
            if (iMetaService == null) {
                return;
            }
            iMetaService.doDestroy();
            mInstance = null;
        }
    }

    public abstract int addEventHandler(IMetaServiceEventHandler eventHandler);

    public abstract int cancelDownloadSceneAssets(long sceneId);

    public abstract int cleanSceneAssets(long sceneId);

    public abstract int createScene(MetaSceneConfig config);

    protected abstract int doDestroy();

    public abstract int downloadSceneAssets(long sceneId);

    public abstract String getLauncherVersion(Context ctx);

    public abstract int getSceneAssetsInfo();

    public abstract int initialize(MetaServiceConfig cfg);

    public abstract int isSceneAssetsDownloaded(long sceneId);

    public abstract int removeEventHandler(IMetaServiceEventHandler eventHandler);

    public abstract int renewToken(String token);
}
