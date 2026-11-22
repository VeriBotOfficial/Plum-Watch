package com.wakeup.commponent.module.ai;

import com.wakeup.common.network.entity.ai.AiLanguage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiOneTransCallback.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH&J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¨\u0006\u001d"}, d2 = {"Lcom/wakeup/commponent/module/ai/AiOneTransCallback;", "", "onEnergyLess", "", "onRecordStart", "isFromDevice", "", "onRecordSuccess", "result", "", "onRecordFail", "msg", "onRecordFinish", "onTranStart", "onTranSuccess", "source", "trans", "onTranFail", "onRecordCountDown", "second", "onTransSwitch", "onMutualTransSwitch", "onDisplayTransSwitch", "onBroadcastSwitch", "onWindowSwitch", "onRefreshLanguage", "sourceLan", "Lcom/wakeup/common/network/entity/ai/AiLanguage;", "transLan", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AiOneTransCallback {

    /* compiled from: AiOneTransCallback.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onBroadcastSwitch(AiOneTransCallback aiOneTransCallback) {
        }

        public static void onDisplayTransSwitch(AiOneTransCallback aiOneTransCallback) {
        }

        public static void onMutualTransSwitch(AiOneTransCallback aiOneTransCallback) {
        }

        public static void onRecordSuccess(AiOneTransCallback aiOneTransCallback, String result) {
            Intrinsics.checkNotNullParameter(result, "result");
        }

        public static void onRefreshLanguage(AiOneTransCallback aiOneTransCallback, AiLanguage sourceLan, AiLanguage transLan) {
            Intrinsics.checkNotNullParameter(sourceLan, "sourceLan");
            Intrinsics.checkNotNullParameter(transLan, "transLan");
        }

        public static void onTransSwitch(AiOneTransCallback aiOneTransCallback) {
        }

        public static void onWindowSwitch(AiOneTransCallback aiOneTransCallback) {
        }
    }

    void onBroadcastSwitch();

    void onDisplayTransSwitch();

    void onEnergyLess();

    void onMutualTransSwitch();

    void onRecordCountDown(String second);

    void onRecordFail(String msg);

    void onRecordFinish();

    void onRecordStart(boolean isFromDevice);

    void onRecordSuccess(String result);

    void onRefreshLanguage(AiLanguage sourceLan, AiLanguage transLan);

    void onTranFail();

    void onTranStart();

    void onTranSuccess(String source, String trans);

    void onTransSwitch();

    void onWindowSwitch();
}
