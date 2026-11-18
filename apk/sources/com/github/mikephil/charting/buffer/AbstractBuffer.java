package com.github.mikephil.charting.buffer;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractBuffer<T> {
    public final float[] buffer;
    protected float phaseX = 1.0f;
    protected float phaseY = 1.0f;
    protected int mFrom = 0;
    protected int mTo = 0;
    protected int index = 0;

    public abstract void feed(T t);

    public AbstractBuffer(int r2) {
        this.buffer = new float[r2];
    }

    public void limitFrom(int r1) {
        if (r1 < 0) {
            r1 = 0;
        }
        this.mFrom = r1;
    }

    public void limitTo(int r1) {
        if (r1 < 0) {
            r1 = 0;
        }
        this.mTo = r1;
    }

    public void reset() {
        this.index = 0;
    }

    public int size() {
        return this.buffer.length;
    }

    public void setPhases(float f, float f2) {
        this.phaseX = f;
        this.phaseY = f2;
    }
}
