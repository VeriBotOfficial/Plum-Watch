package com.yandex.mobile.ads.impl;

import androidx.media3.datasource.cache.ContentMetadata;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class nz {
    public static final nz c = new nz(Collections.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    private int f16393a;
    private final Map<String, byte[]> b;

    public final long b() {
        byte[] bArr = this.b.get(ContentMetadata.KEY_CONTENT_LENGTH);
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public final String c() {
        byte[] bArr = this.b.get(ContentMetadata.KEY_REDIRECTED_URI);
        if (bArr != null) {
            return new String(bArr, lo.c);
        }
        return null;
    }

    public nz() {
        this(Collections.emptyMap());
    }

    public final nz a(es esVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.b);
        List<String> b = esVar.b();
        for (int i = 0; i < b.size(); i++) {
            hashMap.remove(b.get(i));
        }
        for (Map.Entry<String, Object> entry : esVar.a().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bArr = ((String) value).getBytes(lo.c);
            } else if (value instanceof byte[]) {
                bArr = (byte[]) value;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(key, bArr);
        }
        Map<String, byte[]> map = this.b;
        if (map.size() == hashMap.size()) {
            for (Map.Entry<String, byte[]> entry2 : map.entrySet()) {
                if (!Arrays.equals(entry2.getValue(), (byte[]) hashMap.get(entry2.getKey()))) {
                }
            }
            return this;
        }
        return new nz(hashMap);
    }

    public nz(Map<String, byte[]> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nz.class != obj.getClass()) {
            return false;
        }
        Map<String, byte[]> map = this.b;
        Map<String, byte[]> map2 = ((nz) obj).b;
        if (map.size() == map2.size()) {
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f16393a == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.b.entrySet()) {
                i += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f16393a = i;
        }
        return this.f16393a;
    }

    public final Set<Map.Entry<String, byte[]>> a() {
        return this.b.entrySet();
    }
}
