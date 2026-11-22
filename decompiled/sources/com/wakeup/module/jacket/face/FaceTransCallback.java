package com.wakeup.module.jacket.face;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;

/* compiled from: FaceTransCallback.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/jacket/face/FaceTransCallback;", "", "onEnergyLess", "", "onRecordStart", "onRecordSuccess", "id", "", "result", "", "languageCode", "onRecordFail", "onRecordFinish", "onTranStart", "onTranSuccess", "trans", HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, "", "onTranFail", "onTranFinish", "onTtsState", "code", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FaceTransCallback {
    void onEnergyLess();

    void onRecordFail();

    void onRecordFinish();

    void onRecordStart();

    void onRecordSuccess(long id2, String result, String languageCode);

    void onTranFail();

    void onTranFinish();

    void onTranStart();

    void onTranSuccess(String trans, int transId);

    void onTtsState(int code);

    void onTtsState(long id2, int code);

    /* compiled from: FaceTransCallback.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onTtsState(FaceTransCallback faceTransCallback, int i) {
        }

        public static void onTtsState(FaceTransCallback faceTransCallback, long j, int i) {
            faceTransCallback.onTtsState(i);
        }
    }
}
