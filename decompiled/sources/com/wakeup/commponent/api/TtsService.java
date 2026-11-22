package com.wakeup.commponent.api;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.base.BaseCallback;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TtsService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000fH&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&J4\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bH&J\b\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H&J \u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/wakeup/commponent/api/TtsService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "playText", "", "text", "", "isCallback", "", "stopPlay", "registerCallback", "callback", "Lcom/wakeup/common/base/BaseCallback;", "removeCallback", "startRecognition", "language", "Lcom/wakeup/commponent/api/AsrCallback;", "filePath", "isRecognitionWorking", "getRecognitionCode", "playTextSocket", "languageCode", "tag", "isTtsPaying", "releaseTextSocket", "isSupportTTS", "code", "lfaStart", "file", "Ljava/io/File;", "(Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TtsService extends IProvider {
    String getRecognitionCode(String language);

    boolean isRecognitionWorking();

    boolean isSupportTTS(String code);

    boolean isTtsPaying();

    Object lfaStart(File file, String str, Continuation<? super String> continuation);

    void playText(String text, boolean isCallback);

    void playTextSocket(String text, String languageCode, String tag, BaseCallback<String> callback);

    void registerCallback(BaseCallback<Boolean> callback);

    void releaseTextSocket();

    void removeCallback();

    void startRecognition(String language, AsrCallback callback);

    void startRecognition(String language, String filePath, AsrCallback callback);

    void stopPlay();

    /* compiled from: TtsService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void playText$default(TtsService ttsService, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playText");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            ttsService.playText(str, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void playTextSocket$default(TtsService ttsService, String str, String str2, String str3, BaseCallback baseCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playTextSocket");
            }
            if ((i & 4) != 0) {
                str3 = "tag";
            }
            if ((i & 8) != 0) {
                baseCallback = null;
            }
            ttsService.playTextSocket(str, str2, str3, baseCallback);
        }
    }
}
