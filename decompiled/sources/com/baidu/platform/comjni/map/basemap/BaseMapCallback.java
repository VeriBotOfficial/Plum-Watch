package com.baidu.platform.comjni.map.basemap;

import android.os.Bundle;
import com.baidu.mapsdkplatform.comjni.map.basemap.MapSDKLayerDataInterface;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public class BaseMapCallback {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<Long, a> f8978a = new ConcurrentHashMap<>(2);
    private static final ConcurrentHashMap<Long, MapSDKLayerDataInterface> b = new ConcurrentHashMap<>(2);

    public static void release(long j) {
        f8978a.remove(Long.valueOf(j));
        b.remove(Long.valueOf(j));
    }

    public static int reqLayerData(Bundle bundle, long j, int i) {
        ConcurrentHashMap<Long, a> concurrentHashMap = f8978a;
        if (concurrentHashMap.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<Long, a>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (value != null && value.hasLayer(j)) {
                return value.mapLayerDataReq(bundle, j, i);
            }
        }
        Iterator<Map.Entry<Long, MapSDKLayerDataInterface>> it2 = b.entrySet().iterator();
        while (it2.hasNext()) {
            MapSDKLayerDataInterface value2 = it2.next().getValue();
            if (value2 != null && value2.hasLayer(j)) {
                return value2.mapLayerDataReq(bundle, j, i);
            }
        }
        return 0;
    }

    public static boolean setMapCallback(long j, a aVar) {
        if (aVar == null || j == 0) {
            return false;
        }
        f8978a.put(Long.valueOf(j), aVar);
        return true;
    }

    public static boolean setMapSDKCallback(long j, MapSDKLayerDataInterface mapSDKLayerDataInterface) {
        if (mapSDKLayerDataInterface == null || j == 0) {
            return false;
        }
        b.put(Long.valueOf(j), mapSDKLayerDataInterface);
        return true;
    }
}
