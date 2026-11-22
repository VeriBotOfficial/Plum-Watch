package com.india.module.ai.chat;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WearFitAiCallback.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016¨\u0006\u001c"}, d2 = {"Lcom/india/module/ai/chat/WearFitAiCallback;", "", "onEnergyLess", "", "onConnectStatusChange", "status", "", "onTtsPlayChange", "isPlaying", "", "onAsrStart", "onAsrStream", "text", "", "onAsrResult", "onAsrTimeout", "onLLMStream", "onLLMResult", "onLLMTimeout", "onTtsTimeout", "onRecordStart", "onRecordSuccess", "result", "onRecordFail", "onRecordFinish", "onRecordCountDown", "second", "onRecordTimeout", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface WearFitAiCallback {

    /* compiled from: WearFitAiCallback.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAsrResult(WearFitAiCallback wearFitAiCallback, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public static void onAsrStart(WearFitAiCallback wearFitAiCallback) {
        }

        public static void onAsrStream(WearFitAiCallback wearFitAiCallback, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public static void onAsrTimeout(WearFitAiCallback wearFitAiCallback) {
        }

        public static void onConnectStatusChange(WearFitAiCallback wearFitAiCallback, int i) {
        }

        public static void onEnergyLess(WearFitAiCallback wearFitAiCallback) {
        }

        public static void onLLMResult(WearFitAiCallback wearFitAiCallback, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public static void onLLMStream(WearFitAiCallback wearFitAiCallback, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
        }

        public static void onLLMTimeout(WearFitAiCallback wearFitAiCallback) {
        }

        public static void onRecordCountDown(WearFitAiCallback wearFitAiCallback, String second) {
            Intrinsics.checkNotNullParameter(second, "second");
        }

        public static void onRecordFail(WearFitAiCallback wearFitAiCallback) {
        }

        public static void onRecordFinish(WearFitAiCallback wearFitAiCallback) {
        }

        public static void onRecordStart(WearFitAiCallback wearFitAiCallback) {
        }

        public static void onRecordSuccess(WearFitAiCallback wearFitAiCallback, String result) {
            Intrinsics.checkNotNullParameter(result, "result");
        }

        public static void onRecordTimeout(WearFitAiCallback wearFitAiCallback) {
        }

        public static void onTtsPlayChange(WearFitAiCallback wearFitAiCallback, boolean z) {
        }

        public static void onTtsTimeout(WearFitAiCallback wearFitAiCallback) {
        }
    }

    void onAsrResult(String text);

    void onAsrStart();

    void onAsrStream(String text);

    void onAsrTimeout();

    void onConnectStatusChange(int status);

    void onEnergyLess();

    void onLLMResult(String text);

    void onLLMStream(String text);

    void onLLMTimeout();

    void onRecordCountDown(String second);

    void onRecordFail();

    void onRecordFinish();

    void onRecordStart();

    void onRecordSuccess(String result);

    void onRecordTimeout();

    void onTtsPlayChange(boolean isPlaying);

    void onTtsTimeout();
}
