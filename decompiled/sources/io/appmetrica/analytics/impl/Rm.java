package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Rm implements TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f18055a;
    public final String b;
    public final long c;
    public final byte[] d;

    public Rm(long j, String str, long j2, byte[] bArr) {
        this.f18055a = j;
        this.b = str;
        this.c = j2;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(Rm.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        Rm rm = (Rm) obj;
        if (this.f18055a == rm.f18055a && Intrinsics.areEqual(this.b, rm.b) && this.c == rm.c) {
            return Arrays.equals(this.d, rm.d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f18055a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + ((Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.f18055a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TempCacheEntry(id=" + this.f18055a + ", scope='" + this.b + "', timestamp=" + this.c + ", data=array[" + this.d.length + "])";
    }
}
