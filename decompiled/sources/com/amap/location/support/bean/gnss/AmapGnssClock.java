package com.amap.location.support.bean.gnss;

/* loaded from: classes11.dex */
public class AmapGnssClock {
    public double biasNanos = Double.MAX_VALUE;
    public double biasUncertaintyNanos = Double.MAX_VALUE;
    public double driftNanosPerSecond = Double.MAX_VALUE;
    public double driftUncertaintyNanosPerSecond = Double.MAX_VALUE;
    public long elapsedRealtimeNanos = -1;
    public double elapsedRealtimeUncertaintyNanos = Double.MAX_VALUE;
    public long fullBiasNanos = Long.MAX_VALUE;
    public int hardwareClockDiscontinuityCount = -1;
    public int leapSecond = -1;
    public long timeNanos = -1;
    public double timeUncertaintyNanos = -1.0d;
}
