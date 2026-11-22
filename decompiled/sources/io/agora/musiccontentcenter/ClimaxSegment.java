package io.agora.musiccontentcenter;

/* loaded from: classes6.dex */
public class ClimaxSegment {
    public int endTimeMs;
    public int startTimeMs;

    public ClimaxSegment(int startTimeMs, int endTimeMs) {
        this.startTimeMs = startTimeMs;
        this.endTimeMs = endTimeMs;
    }

    public int getEndTimeMs() {
        return this.endTimeMs;
    }

    public int getStartTimeMs() {
        return this.startTimeMs;
    }
}
