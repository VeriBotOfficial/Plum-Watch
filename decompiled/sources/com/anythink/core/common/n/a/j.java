package com.anythink.core.common.n.a;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class j<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private int f4045a;

    public j() {
        this((byte) 0);
    }

    private j(byte b) {
        super(256, 1.0f, true);
        this.f4045a = 256;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.f4045a;
    }
}
