package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.media3.datasource.cache.ContentMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class es {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f15417a = new HashMap();
    private final ArrayList b = new ArrayList();

    public final List<String> b() {
        return Collections.unmodifiableList(new ArrayList(this.b));
    }

    public static void a(es esVar, long j) {
        esVar.f15417a.put(ContentMetadata.KEY_CONTENT_LENGTH, Long.valueOf(j));
        esVar.b.remove(ContentMetadata.KEY_CONTENT_LENGTH);
    }

    public static void a(es esVar, Uri uri) {
        if (uri == null) {
            esVar.b.add(ContentMetadata.KEY_REDIRECTED_URI);
            esVar.f15417a.remove(ContentMetadata.KEY_REDIRECTED_URI);
            return;
        }
        String uri2 = uri.toString();
        HashMap hashMap = esVar.f15417a;
        uri2.getClass();
        hashMap.put(ContentMetadata.KEY_REDIRECTED_URI, uri2);
        esVar.b.remove(ContentMetadata.KEY_REDIRECTED_URI);
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap(this.f15417a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
