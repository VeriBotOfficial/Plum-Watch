package io.livekit.android.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MapDiffUtil.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u001aS\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0007\u001a\u0002H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"diffMapChange", "", "K", "V", "newMap", "", "oldMap", "defaultValue", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapDiffUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> diffMapChange(Map<K, ? extends V> newMap, Map<K, ? extends V> oldMap, V v) {
        Intrinsics.checkNotNullParameter(newMap, "newMap");
        Intrinsics.checkNotNullParameter(oldMap, "oldMap");
        Set plus = SetsKt.plus((Set) newMap.keySet(), (Iterable) oldMap.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : plus) {
            if (!Intrinsics.areEqual(newMap.get(obj), oldMap.get(obj))) {
                V v2 = newMap.get(obj);
                if (v2 == null) {
                    v2 = v;
                }
                linkedHashMap.put(obj, v2);
            }
        }
        return linkedHashMap;
    }
}
