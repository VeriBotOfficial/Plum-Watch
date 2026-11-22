package com.baidu.mapsdkplatform.comjni.map.basemap;

import android.os.Bundle;
import com.baidu.platform.comjni.map.basemap.a;

/* loaded from: classes13.dex */
public interface MapSDKLayerDataInterface extends a {
    @Override // com.baidu.platform.comjni.map.basemap.a
    boolean hasLayer(long j);

    @Override // com.baidu.platform.comjni.map.basemap.a
    int mapLayerDataReq(Bundle bundle, long j, int i);
}
