package com.amap.location.collection;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public class CollectionCloud {
    private static boolean isEnabled(JSONObject jSONObject, String str, boolean z) {
        return jSONObject.optInt(str, z ? 1 : 0) == 1;
    }

    public static void update(JSONObject jSONObject, CollectionConfig collectionConfig) {
        JSONObject optJSONObject;
        if (jSONObject == null || collectionConfig == null || (optJSONObject = jSONObject.optJSONObject("c")) == null) {
            return;
        }
        boolean optBoolean = optJSONObject.optBoolean("cls", collectionConfig.getFpsCollectorConfig().isEnabled());
        if (optBoolean != collectionConfig.getFpsCollectorConfig().isEnabled()) {
            collectionConfig.getFpsCollectorConfig().setEnabled(optBoolean);
        }
        boolean optBoolean2 = optJSONObject.optBoolean("cts", collectionConfig.getTrackCollectorConfig().isEnabled());
        if (optBoolean2 != collectionConfig.getTrackCollectorConfig().isEnabled()) {
            collectionConfig.getTrackCollectorConfig().setEnabled(optBoolean2);
        }
        boolean isEnabled = isEnabled(optJSONObject, "cnwuss", collectionConfig.getUploadConfig().isNonWifiUploadEnabled());
        if (isEnabled != collectionConfig.getUploadConfig().isNonWifiUploadEnabled()) {
            collectionConfig.getUploadConfig().setNonWifiUploadEnabled(isEnabled);
        }
        boolean optBoolean3 = optJSONObject.optBoolean("cfup", collectionConfig.getFpsCollectorConfig().isWifiFilterByUpdated());
        if (optBoolean3 != collectionConfig.getFpsCollectorConfig().isWifiFilterByUpdated()) {
            collectionConfig.getFpsCollectorConfig().setWifiFilterByUpdated(optBoolean3);
        }
    }
}
