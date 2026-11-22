package com.wakeup.commponent.module.tts.record;

import com.iflytek.cloud.SpeechConstant;
import kotlin.Metadata;

/* compiled from: RecordListener.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/wakeup/commponent/module/tts/record/RecordListener;", "", "onRecordStart", "", "onRecordData", "data", "", "size", "", SpeechConstant.VOLUME, "onRecordSComplete", "onRecordSErr", "message", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RecordListener {
    void onRecordData(byte[] data, int size, int volume);

    void onRecordSComplete();

    void onRecordSErr(String message);

    void onRecordStart();
}
