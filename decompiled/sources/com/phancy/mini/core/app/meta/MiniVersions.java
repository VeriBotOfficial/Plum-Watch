package com.phancy.mini.core.app.meta;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MiniVersions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/phancy/mini/core/app/meta/MiniVersions;", "", "version", "", "(Ljava/lang/String;)V", "values", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getValues", "()Ljava/util/ArrayList;", MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "compareTo", "", "other", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MiniVersions implements Comparable<MiniVersions> {
    private final ArrayList<Long> values;
    private final String version;

    public MiniVersions(String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.version = version;
        ArrayList<Long> arrayList = new ArrayList<>();
        Iterator it = StringsKt.split$default((CharSequence) version, new String[]{"."}, false, 0, 6, (Object) null).iterator();
        while (true) {
            long j = 0;
            if (!it.hasNext()) {
                break;
            }
            try {
                j = Long.parseLong((String) it.next());
            } catch (Exception e) {
                e.printStackTrace();
            }
            arrayList.add(Long.valueOf(j));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(0L);
        }
        this.values = arrayList;
    }

    public final String getVersion() {
        return this.version;
    }

    public final ArrayList<Long> getValues() {
        return this.values;
    }

    @Override // java.lang.Comparable
    public int compareTo(MiniVersions other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(this.values.size(), other.values.size());
        for (int i = 0; i < min; i++) {
            long longValue = this.values.get(i).longValue();
            Long l = other.values.get(i);
            Intrinsics.checkNotNullExpressionValue(l, "other.values[i]");
            long longValue2 = longValue - l.longValue();
            if (longValue2 != 0) {
                return longValue2 > 0 ? 1 : -1;
            }
        }
        int size = this.values.size() - other.values.size();
        if (size == 0) {
            return 0;
        }
        return size > 0 ? 1 : -1;
    }
}
