package com.amap.location.support.bean.gnss;

/* loaded from: classes11.dex */
public class AmapGnssMeasurement {
    public double accumulatedDeltaRangeMeters;
    public int accumulatedDeltaRangeState;
    public double accumulatedDeltaRangeUncertaintyMeters;
    public double cn0DbHz;
    public int constellationType;
    public int multipathIndicator;
    public double pseudorangeRateMetersPerSecond;
    public double pseudorangeRateUncertaintyMetersPerSecond;
    public long receivedSvTimeNanos;
    public long receivedSvTimeUncertaintyNanos;
    public int state;
    public int svid;
    public double timeOffsetNanos;
    public double automaticGainControlLevelDb = -9999.0d;
    public float carrierFrequencyHz = 0.0f;
    public String codeType = "";
    public double snrInDb = -9999.0d;
}
