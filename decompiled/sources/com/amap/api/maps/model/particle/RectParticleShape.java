package com.amap.api.maps.model.particle;

/* loaded from: classes11.dex */
public class RectParticleShape extends ParticleShapeModule {
    private final float bottom;
    private final float left;
    private final float right;

    /* renamed from: top, reason: collision with root package name */
    private final float f2063top;

    public RectParticleShape(float f, float f2, float f3, float f4, boolean z) {
        this.left = f;
        this.f2063top = f2;
        this.right = f3;
        this.bottom = f4;
        this.isUseRatio = z;
        this.type = 1;
    }

    @Override // com.amap.api.maps.model.particle.ParticleShapeModule
    public float[] getPoint() {
        return null;
    }
}
