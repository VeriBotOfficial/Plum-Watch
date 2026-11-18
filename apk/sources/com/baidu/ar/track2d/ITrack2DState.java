package com.baidu.ar.track2d;

/* JADX INFO: loaded from: classes16.dex */
public interface ITrack2DState {

    public enum DistanceState {
        NORMAL,
        TOO_FAR,
        TOO_NEAR,
        UNKNOWN
    }

    DistanceState distanceState();

    boolean isModelAppear();

    boolean isShowImmediately();

    boolean isTrackFound();
}
