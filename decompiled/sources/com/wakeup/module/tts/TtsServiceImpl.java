package com.wakeup.module.tts;

import android.content.Context;
import android.os.Bundle;
import com.anythink.expressad.video.dynview.a.a;
import com.blankj.utilcode.util.CollectionUtils;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.SynthesizerListener;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.utils.AdvConstance;
import com.wakeup.commponent.api.AsrCallback;
import com.wakeup.commponent.api.TtsService;
import com.wakeup.module.tts.ali.AliAsrMgr;
import com.wakeup.module.tts.asr.AsrManger;
import com.wakeup.module.tts.lfa.LfaMgr;
import com.wakeup.module.tts.socket.TtsManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TtsServiceImpl.kt */
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\u0016\u0010\u001d\u001a\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\"H\u0016J \u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020\fH\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0016J0\u0010&\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eH\u0016J\b\u0010)\u001a\u00020\fH\u0016J\b\u0010*\u001a\u00020\u0016H\u0016J\u0010\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0005H\u0016J \u0010-\u001a\u0004\u0018\u00010\u00052\u0006\u0010.\u001a\u00020/2\u0006\u0010!\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00100R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\tj\b\u0012\u0004\u0012\u00020\f`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/wakeup/module/tts/TtsServiceImpl;", "Lcom/wakeup/commponent/api/TtsService;", "<init>", "()V", "TAG", "", "mTts", "Lcom/iflytek/cloud/SpeechSynthesizer;", "textArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "callbackArray", "", "callback", "Lcom/wakeup/common/base/BaseCallback;", "listener", "com/wakeup/module/tts/TtsServiceImpl$listener$1", "Lcom/wakeup/module/tts/TtsServiceImpl$listener$1;", "ttsCodeList", "", "hasInit", "init", "", "context", "Landroid/content/Context;", "playText", "text", "isCallback", "stopPlay", "registerCallback", "removeCallback", "startPlayText", "startRecognition", "language", "Lcom/wakeup/commponent/api/AsrCallback;", "filePath", "isRecognitionWorking", "getRecognitionCode", "playTextSocket", "languageCode", "tag", "isTtsPaying", "releaseTextSocket", "isSupportTTS", "code", "lfaStart", "file", "Ljava/io/File;", "(Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module-tts_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TtsServiceImpl implements TtsService {
    private BaseCallback<Boolean> callback;
    private volatile boolean hasInit;
    private SpeechSynthesizer mTts;
    private final String TAG = "TtsServiceImpl";
    private final ArrayList<String> textArray = new ArrayList<>();
    private final ArrayList<Boolean> callbackArray = new ArrayList<>();
    private final TtsServiceImpl$listener$1 listener = new SynthesizerListener() { // from class: com.wakeup.module.tts.TtsServiceImpl$listener$1
        @Override // com.iflytek.cloud.SynthesizerListener
        public void onBufferProgress(int p0, int p1, int p2, String p3) {
        }

        @Override // com.iflytek.cloud.SynthesizerListener
        public void onEvent(int p0, int p1, int p2, Bundle p3) {
        }

        @Override // com.iflytek.cloud.SynthesizerListener
        public void onSpeakBegin() {
        }

        @Override // com.iflytek.cloud.SynthesizerListener
        public void onSpeakProgress(int p0, int p1, int p2) {
        }

        @Override // com.iflytek.cloud.SynthesizerListener
        public void onSpeakResumed() {
        }

        @Override // com.iflytek.cloud.SynthesizerListener
        public void onSpeakPaused() {
            ArrayList arrayList;
            ArrayList arrayList2;
            SpeechSynthesizer speechSynthesizer;
            ArrayList arrayList3;
            ArrayList arrayList4;
            arrayList = TtsServiceImpl.this.callbackArray;
            if (CollectionUtils.isNotEmpty(arrayList)) {
                arrayList4 = TtsServiceImpl.this.callbackArray;
                arrayList4.remove(0);
            }
            arrayList2 = TtsServiceImpl.this.textArray;
            if (CollectionUtils.isNotEmpty(arrayList2)) {
                arrayList3 = TtsServiceImpl.this.textArray;
                arrayList3.remove(0);
            }
            speechSynthesizer = TtsServiceImpl.this.mTts;
            if (speechSynthesizer != null) {
                speechSynthesizer.stopSpeaking();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
        
            r4 = r3.this$0.mTts;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        
            r4 = r3.this$0.callback;
         */
        @Override // com.iflytek.cloud.SynthesizerListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCompleted(com.iflytek.cloud.SpeechError r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L1e
                com.wakeup.module.tts.TtsServiceImpl r0 = com.wakeup.module.tts.TtsServiceImpl.this
                java.lang.String r0 = com.wakeup.module.tts.TtsServiceImpl.access$getTAG$p(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "TTS error = "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                java.lang.Object[] r4 = new java.lang.Object[]{r4}
                com.wakeup.common.log.LogUtils.e(r0, r4)
            L1e:
                com.wakeup.module.tts.TtsServiceImpl r4 = com.wakeup.module.tts.TtsServiceImpl.this
                java.util.ArrayList r4 = com.wakeup.module.tts.TtsServiceImpl.access$getCallbackArray$p(r4)
                r0 = 0
                java.lang.Object r4 = r4.get(r0)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L41
                com.wakeup.module.tts.TtsServiceImpl r4 = com.wakeup.module.tts.TtsServiceImpl.this
                com.wakeup.common.base.BaseCallback r4 = com.wakeup.module.tts.TtsServiceImpl.access$getCallback$p(r4)
                if (r4 == 0) goto L41
                r1 = 1
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r4.callback(r0, r1)
            L41:
                com.wakeup.module.tts.TtsServiceImpl r4 = com.wakeup.module.tts.TtsServiceImpl.this
                java.util.ArrayList r4 = com.wakeup.module.tts.TtsServiceImpl.access$getCallbackArray$p(r4)
                r4.remove(r0)
                com.wakeup.module.tts.TtsServiceImpl r4 = com.wakeup.module.tts.TtsServiceImpl.this
                java.util.ArrayList r4 = com.wakeup.module.tts.TtsServiceImpl.access$getTextArray$p(r4)
                r4.remove(r0)
                com.wakeup.module.tts.TtsServiceImpl r4 = com.wakeup.module.tts.TtsServiceImpl.this
                java.util.ArrayList r4 = com.wakeup.module.tts.TtsServiceImpl.access$getTextArray$p(r4)
                int r4 = r4.size()
                if (r4 <= 0) goto L6c
                com.wakeup.module.tts.TtsServiceImpl r4 = com.wakeup.module.tts.TtsServiceImpl.this
                com.iflytek.cloud.SpeechSynthesizer r4 = com.wakeup.module.tts.TtsServiceImpl.access$getMTts$p(r4)
                if (r4 == 0) goto L6c
                com.wakeup.module.tts.TtsServiceImpl r0 = com.wakeup.module.tts.TtsServiceImpl.this
                com.wakeup.module.tts.TtsServiceImpl.access$startPlayText(r0, r4)
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.tts.TtsServiceImpl$listener$1.onCompleted(com.iflytek.cloud.SpeechError):void");
        }
    };
    private final List<String> ttsCodeList = CollectionsKt.listOf((Object[]) new String[]{"zh", "en", a.X, a.Y, "fr"});

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.hasInit) {
            return;
        }
        SpeechUtility.createUtility(context, "appid=7dd8be5c");
        this.mTts = SpeechSynthesizer.createSynthesizer(context, new InitListener() { // from class: com.wakeup.module.tts.TtsServiceImpl$$ExternalSyntheticLambda0
            @Override // com.iflytek.cloud.InitListener
            public final void onInit(int i) {
                TtsServiceImpl.init$lambda$1(TtsServiceImpl.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(TtsServiceImpl ttsServiceImpl, int i) {
        if (i != 0) {
            LogUtils.i(ttsServiceImpl.TAG, "init fail: code: " + i);
            return;
        }
        LogUtils.i(ttsServiceImpl.TAG, "init success");
        SpeechSynthesizer speechSynthesizer = ttsServiceImpl.mTts;
        if (speechSynthesizer != null) {
            speechSynthesizer.setParameter(SpeechConstant.ENGINE_TYPE, "cloud");
            speechSynthesizer.setParameter(SpeechConstant.VOICE_NAME, "xiaoyan");
            speechSynthesizer.setParameter("speed", AdvConstance.AI_ROBOT);
            speechSynthesizer.setParameter(SpeechConstant.PITCH, AdvConstance.AI_ROBOT);
            speechSynthesizer.setParameter(SpeechConstant.VOLUME, "100");
        }
        ttsServiceImpl.hasInit = true;
    }

    @Override // com.wakeup.commponent.api.TtsService
    public void playText(String text, boolean isCallback) {
        SpeechSynthesizer speechSynthesizer;
        Intrinsics.checkNotNullParameter(text, "text");
        this.textArray.add(text);
        this.callbackArray.add(Boolean.valueOf(isCallback));
        SpeechSynthesizer speechSynthesizer2 = this.mTts;
        if ((speechSynthesizer2 == null || !speechSynthesizer2.isSpeaking()) && (speechSynthesizer = this.mTts) != null) {
            startPlayText(speechSynthesizer);
        }
    }

    @Override // com.wakeup.commponent.api.TtsService
    public void stopPlay() {
        AliAsrMgr.release();
        TtsManager.INSTANCE.stop();
        SpeechSynthesizer speechSynthesizer = this.mTts;
        if (speechSynthesizer != null) {
            speechSynthesizer.stopSpeaking();
        }
        this.textArray.clear();
        this.callbackArray.clear();
    }

    @Override // com.wakeup.commponent.api.TtsService
    public void registerCallback(BaseCallback<Boolean> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @Override // com.wakeup.commponent.api.TtsService
    public void removeCallback() {
        this.callback = null;
        this.textArray.clear();
        this.callbackArray.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPlayText(SpeechSynthesizer mTts) {
        if (!this.hasInit) {
            LogUtils.e(this.TAG, "TTS 尚未初始化完成，无法朗读");
        } else {
            mTts.startSpeaking(this.textArray.get(0), this.listener);
        }
    }

    @Override // com.wakeup.commponent.api.TtsService
    public void startRecognition(String language, AsrCallback callback) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AsrManger.startRecognition(language, callback);
    }

    @Override // com.wakeup.commponent.api.TtsService
    public void startRecognition(String language, String filePath, AsrCallback callback) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AsrManger.startRecognition(language, filePath, callback);
    }

    @Override // com.wakeup.commponent.api.TtsService
    public boolean isRecognitionWorking() {
        return AsrManger.INSTANCE.isWorking();
    }

    @Override // com.wakeup.commponent.api.TtsService
    public String getRecognitionCode(String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        String lowerCase = language.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case 3121:
                return !lowerCase.equals(a.X) ? "zh_cn" : "ar_il";
            case 3141:
                return !lowerCase.equals("bg") ? "zh_cn" : "bg_bg";
            case 3201:
                return !lowerCase.equals("de") ? "zh_cn" : "de_DE";
            case 3241:
                return !lowerCase.equals("en") ? "zh_cn" : "en_us";
            case 3246:
                return !lowerCase.equals("es") ? "zh_cn" : "es_es";
            case 3276:
                return !lowerCase.equals("fr") ? "zh_cn" : "fr_fr";
            case 3355:
                return !lowerCase.equals("id") ? "zh_cn" : "id_ID";
            case 3365:
                return !lowerCase.equals("in") ? "zh_cn" : "hi_in";
            case 3383:
                return !lowerCase.equals(a.T) ? "zh_cn" : "ja_jp";
            case 3428:
                return !lowerCase.equals(a.V) ? "zh_cn" : "ko_kr";
            case 3651:
                return !lowerCase.equals(a.Y) ? "zh_cn" : "ru-ru";
            case 3700:
                return !lowerCase.equals("th") ? "zh_cn" : "th_TH";
            case 3763:
                return !lowerCase.equals("vi") ? "zh_cn" : "vi_VN";
            case 3886:
                lowerCase.equals("zh");
                return "zh_cn";
            default:
                return "zh_cn";
        }
    }

    @Override // com.wakeup.commponent.api.TtsService
    public void playTextSocket(String text, String languageCode, String tag, BaseCallback<String> callback) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(tag, "tag");
        TtsManager.INSTANCE.release();
        AliAsrMgr.release();
        if (callback != null) {
            callback.callback(0, tag);
        }
        if (Intrinsics.areEqual(languageCode, "en") || Intrinsics.areEqual(languageCode, "zh")) {
            AliAsrMgr.startTts(languageCode, text, callback);
        } else {
            TtsManager.startTts(text, languageCode, callback);
        }
    }

    @Override // com.wakeup.commponent.api.TtsService
    public boolean isTtsPaying() {
        return AliAsrMgr.isPlaying() || TtsManager.isPlaying();
    }

    @Override // com.wakeup.commponent.api.TtsService
    public void releaseTextSocket() {
        TtsManager.INSTANCE.release();
        AliAsrMgr.release();
    }

    @Override // com.wakeup.commponent.api.TtsService
    public boolean isSupportTTS(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.ttsCodeList.contains(code);
    }

    @Override // com.wakeup.commponent.api.TtsService
    public Object lfaStart(File file, String str, Continuation<? super String> continuation) {
        return LfaMgr.INSTANCE.start(file, str, continuation);
    }
}
