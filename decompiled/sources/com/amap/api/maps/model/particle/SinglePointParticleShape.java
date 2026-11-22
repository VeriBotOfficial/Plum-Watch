package com.amap.api.maps.model.particle;

/* loaded from: classes11.dex */
public class SinglePointParticleShape extends ParticleShapeModule {
    private float[] point_3;

    public SinglePointParticleShape(float f, float f2, float f3, boolean z) {
        this.point_3 = new float[]{f, f2, f3};
        this.isUseRatio = z;
        this.type = 0;
    }

    @Override // com.amap.api.maps.model.particle.ParticleShapeModule
    public float[] getPoint() {
        return this.point_3;
    }

    public SinglePointParticleShape(float f, float f2, float f3) {
        this(f, f2, f3, false);
    }
}
