package com.tramini.plugin.a.h.a;

/* loaded from: classes2.dex */
public final class a implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f13740a;

    public a(CharSequence charSequence) {
        this.f13740a = charSequence;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (Thread.currentThread().isInterrupted()) {
            throw new RuntimeException("Interrupted!");
        }
        return this.f13740a.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13740a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new a(this.f13740a.subSequence(i, i2));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f13740a.toString();
    }
}
