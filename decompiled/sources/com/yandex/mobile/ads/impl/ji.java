package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class ji {

    /* renamed from: a, reason: collision with root package name */
    public final int f15911a = 0;
    public final float b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ji.class == obj.getClass()) {
            ji jiVar = (ji) obj;
            if (this.f15911a == jiVar.f15911a && Float.compare(jiVar.b, this.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + ((this.f15911a + 527) * 31);
    }
}
