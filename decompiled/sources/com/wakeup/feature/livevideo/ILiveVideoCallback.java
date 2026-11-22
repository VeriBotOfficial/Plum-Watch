package com.wakeup.feature.livevideo;

import kotlin.Metadata;

/* compiled from: ILiveVideoCallback.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0013"}, d2 = {"Lcom/wakeup/feature/livevideo/ILiveVideoCallback;", "", "onJoinChannelSuccess", "", "onUserJoin", "uid", "", "onUserLeave", "onFirstRemoteVideo", "onEnergyLess", "durationMax", "onOneSelfAsrResult", "code", "index", "result", "", "onOneSelfTransResult", "onPersonAsrResult", "onPersonTransResult", "module-livevideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ILiveVideoCallback {

    /* compiled from: ILiveVideoCallback.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onFirstRemoteVideo(ILiveVideoCallback iLiveVideoCallback, int i) {
        }

        public static void onJoinChannelSuccess(ILiveVideoCallback iLiveVideoCallback) {
        }

        public static void onUserJoin(ILiveVideoCallback iLiveVideoCallback, int i) {
        }

        public static void onUserLeave(ILiveVideoCallback iLiveVideoCallback, int i) {
        }
    }

    void durationMax();

    void onEnergyLess();

    void onFirstRemoteVideo(int uid);

    void onJoinChannelSuccess();

    void onOneSelfAsrResult(int code, int index, String result);

    void onOneSelfTransResult(int code, int index, String result);

    void onPersonAsrResult(int code, int index, String result);

    void onPersonTransResult(int code, int index, String result);

    void onUserJoin(int uid);

    void onUserLeave(int uid);
}
