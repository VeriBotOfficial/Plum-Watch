package com.xmly.businesssdk.player.core.interceptor;

import com.baidu.mapapi.http.HttpClient;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.utils.Logger;

/* loaded from: classes3.dex */
public interface PlayRecordable {

    public static class DefaultPlayRecordable implements PlayRecordable {
        @Override // com.xmly.businesssdk.player.core.interceptor.PlayRecordable
        public void onRecordSave(int i, int i2, boolean z) {
            Logger.w("PlayRecordable", "onRecordSave() Not IMPL..." + i + HttpClient.ENDFLAG + i2);
        }

        @Override // com.xmly.businesssdk.player.core.interceptor.PlayRecordable
        public void onRecordStart(Playable playable, boolean z) {
            Logger.w("PlayRecordable", c.a("onRecordStart() Not IMPL...").append(playable.getTitle()).append(HttpClient.ENDFLAG).append(z).toString());
        }
    }

    void onRecordSave(int i, int i2, boolean z);

    void onRecordStart(Playable playable, boolean z);
}
