package com.amap.location.collection;

import android.content.Context;
import com.amap.location.collection.common.CollectionData;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class CollectionManagerProxy {
    private static final String TAG = "CollectionManagerProxy";
    private CollectionManager mCollectionManager;
    private CollectionConfig mConfig;
    private Context mContext;
    private boolean mIsInit;

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private void reset() {
        if (this.mIsInit) {
            this.mCollectionManager.destroy();
            CollectionManager collectionManager = new CollectionManager(this.mContext, this.mConfig);
            this.mCollectionManager = collectionManager;
            collectionManager.init();
        }
    }

    public synchronized void destroy() {
        if (this.mIsInit) {
            this.mCollectionManager.destroy();
            this.mIsInit = false;
        }
    }

    public synchronized CollectionData getNetworkLocatorUploadData() {
        return this.mIsInit ? this.mCollectionManager.getNetworkLocatorUploadData() : null;
    }

    public synchronized void init(Context context, CollectionConfig collectionConfig) {
        if (!this.mIsInit) {
            this.mIsInit = true;
            Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext;
            this.mConfig = collectionConfig;
            CollectionManager collectionManager = new CollectionManager(applicationContext, collectionConfig);
            this.mCollectionManager = collectionManager;
            collectionManager.init();
        }
    }

    public synchronized void onNetworkLocatorUploadFinish(boolean z, CollectionData collectionData) {
        if (this.mIsInit) {
            this.mCollectionManager.onNetworkLocatorUploadFinish(z, collectionData);
        }
    }

    public synchronized void updateCloud(JSONObject jSONObject) {
        if (this.mIsInit) {
            boolean isEnabled = this.mConfig.getFpsCollectorConfig().isEnabled();
            boolean isEnabled2 = this.mConfig.getTrackCollectorConfig().isEnabled();
            CollectionCloud.update(jSONObject, this.mConfig);
            if (this.mConfig.getFpsCollectorConfig().isEnabled() != isEnabled || this.mConfig.getTrackCollectorConfig().isEnabled() != isEnabled2) {
                reset();
            }
        }
    }

    public synchronized void updateConfig(CollectionConfig collectionConfig) {
        if (this.mIsInit) {
            boolean isEnabled = this.mConfig.getFpsCollectorConfig().isEnabled();
            boolean isEnabled2 = this.mConfig.getTrackCollectorConfig().isEnabled();
            this.mConfig = collectionConfig;
            if (collectionConfig.getFpsCollectorConfig().isEnabled() != isEnabled || this.mConfig.getTrackCollectorConfig().isEnabled() != isEnabled2) {
                reset();
            }
        }
    }
}
