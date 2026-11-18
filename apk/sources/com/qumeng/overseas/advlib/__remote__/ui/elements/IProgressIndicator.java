package com.qumeng.overseas.advlib.__remote__.ui.elements;

/* JADX INFO: loaded from: classes2.dex */
public interface IProgressIndicator {

    public enum ProgressIndicatorState {
        Countdown,
        Running,
        Pending,
        Error,
        Pause,
        Finished,
        Installed,
        Canceled
    }

    void asyncSetProgress(float f);

    void asyncSetProgressAndState(ProgressIndicatorState progressIndicatorState, float f);

    void setProgress(float f);

    void setProgressAndState(ProgressIndicatorState progressIndicatorState, float f);
}
