package com.baidu.ar.track2d;

import com.baidu.ar.track2d.ITrack2DState;

/* loaded from: classes12.dex */
public class b implements ITrack2DState {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7233a;
    public boolean b;
    public boolean c;
    public ITrack2DState.DistanceState d;

    @Override // com.baidu.ar.track2d.ITrack2DState
    public ITrack2DState.DistanceState distanceState() {
        return this.d;
    }

    @Override // com.baidu.ar.track2d.ITrack2DState
    public boolean isModelAppear() {
        return this.f7233a;
    }

    @Override // com.baidu.ar.track2d.ITrack2DState
    public boolean isShowImmediately() {
        return this.c;
    }

    @Override // com.baidu.ar.track2d.ITrack2DState
    public boolean isTrackFound() {
        return this.b;
    }
}
