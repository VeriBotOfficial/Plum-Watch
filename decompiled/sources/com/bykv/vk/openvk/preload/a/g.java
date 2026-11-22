package com.bykv.vk.openvk.preload.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* loaded from: classes13.dex */
public final class g extends i implements Iterable<i> {

    /* renamed from: a, reason: collision with root package name */
    private final List<i> f9151a = new ArrayList();

    public final void a(i iVar) {
        if (iVar == null) {
            iVar = k.f9152a;
        }
        this.f9151a.add(iVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<i> iterator() {
        return this.f9151a.iterator();
    }

    @Override // com.bykv.vk.openvk.preload.a.i
    public final Number a() {
        if (this.f9151a.size() == 1) {
            return this.f9151a.get(0).a();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.i
    public final String b() {
        if (this.f9151a.size() == 1) {
            return this.f9151a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.i
    public final boolean c() {
        if (this.f9151a.size() == 1) {
            return this.f9151a.get(0).c();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof g) && ((g) obj).f9151a.equals(this.f9151a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f9151a.hashCode();
    }
}
