package com.iflytek.cloud.c.a;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SynthesizerListener;
import com.iflytek.cloud.a.h.c;
import com.iflytek.cloud.msc.util.log.DebugLog;

/* loaded from: classes17.dex */
public class g extends com.iflytek.cloud.a.f.e implements c.f {
    private Context e;
    private com.iflytek.cloud.a.h.c f;
    private com.iflytek.cloud.a.h.c g;

    public g(Context context) {
        super(context);
        this.e = null;
        this.f = null;
        this.g = null;
        this.e = context.getApplicationContext();
    }

    private int a(String str, SynthesizerListener synthesizerListener, String str2) {
        DebugLog.LogD("new Session Start");
        com.iflytek.cloud.a.h.c cVar = new com.iflytek.cloud.a.h.c(this.e);
        this.f = cVar;
        cVar.a(this);
        int a2 = this.f.a(str, this.mSessionParams, synthesizerListener, true, this.mSessionParams.a(SpeechConstant.TTS_AUDIO_PATH));
        if (!TextUtils.isEmpty(str2)) {
            com.iflytek.cloud.a.h.c cVar2 = new com.iflytek.cloud.a.h.c(this.e);
            this.g = cVar2;
            cVar2.a(this);
            this.g.a(str2, this.mSessionParams);
        }
        return a2;
    }

    @Override // com.iflytek.cloud.a.f.e, com.iflytek.cloud.a.f.d
    public boolean destroy() {
        a(false);
        super.destroy();
        return true;
    }

    public int f() {
        int f;
        DebugLog.LogD("getState enter");
        synchronized (this) {
            com.iflytek.cloud.a.h.c cVar = this.f;
            f = cVar != null ? cVar.f() : 4;
        }
        DebugLog.LogD("getState leave");
        return f;
    }

    public boolean isSpeaking() {
        boolean isSpeaking;
        DebugLog.LogD("isSpeaking enter");
        synchronized (this) {
            com.iflytek.cloud.a.h.c cVar = this.f;
            isSpeaking = cVar != null ? cVar.isSpeaking() : false;
        }
        DebugLog.LogD("isSpeaking leave");
        return isSpeaking;
    }

    public void pauseSpeaking() {
        DebugLog.LogD("pauseSpeaking enter");
        synchronized (this) {
            com.iflytek.cloud.a.h.c cVar = this.f;
            if (cVar != null) {
                cVar.pauseSpeaking();
            }
        }
        DebugLog.LogD("pauseSpeaking leave");
    }

    public void resumeSpeaking() {
        DebugLog.LogD("resumeSpeaking enter");
        synchronized (this) {
            com.iflytek.cloud.a.h.c cVar = this.f;
            if (cVar != null) {
                cVar.resumeSpeaking();
            }
        }
        DebugLog.LogD("resumeSpeaking leave");
    }

    public int startSpeaking(String str, SynthesizerListener synthesizerListener) {
        int i;
        int a2;
        DebugLog.LogD("startSpeaking enter");
        synchronized (this) {
            String e = this.mSessionParams.e(SpeechConstant.NEXT_TEXT);
            com.iflytek.cloud.a.h.c cVar = this.f;
            i = 0;
            if (cVar != null && cVar.isSpeaking()) {
                this.f.cancel(this.mSessionParams.a(SpeechConstant.TTS_INTERRUPT_ERROR, false));
            }
            com.iflytek.cloud.a.h.c cVar2 = this.g;
            if (cVar2 == null) {
                a2 = a(str, synthesizerListener, e);
            } else if (str.equals(cVar2.n)) {
                com.iflytek.cloud.a.h.c cVar3 = this.g;
                if (cVar3.o == null && cVar3.l) {
                    this.g = null;
                    if (!TextUtils.isEmpty(e)) {
                        com.iflytek.cloud.a.h.c cVar4 = new com.iflytek.cloud.a.h.c(this.e);
                        this.g = cVar4;
                        cVar4.a(this);
                        this.g.a(e, this.mSessionParams);
                    }
                    this.f = cVar3;
                    cVar3.a(synthesizerListener);
                    this.f.resumeSpeaking();
                    if (this.f.m) {
                        a();
                        DebugLog.LogD("startSpeaking NextSession pause");
                    }
                }
                cVar3.cancel(false);
                this.g = null;
                a2 = a(str, synthesizerListener, e);
            } else {
                this.g.cancel(false);
                this.g = null;
                a2 = a(str, synthesizerListener, e);
            }
            i = a2;
        }
        DebugLog.LogD("startSpeaking leave");
        return i;
    }

    public int synthesizeToUri(String str, String str2, SynthesizerListener synthesizerListener) {
        int a2;
        DebugLog.LogD("synthesizeToUri enter");
        synchronized (this) {
            com.iflytek.cloud.a.h.c cVar = this.f;
            if (cVar != null && cVar.isSpeaking()) {
                this.f.cancel(this.mSessionParams.a(SpeechConstant.TTS_INTERRUPT_ERROR, false));
            }
            com.iflytek.cloud.a.h.c cVar2 = new com.iflytek.cloud.a.h.c(this.e);
            this.f = cVar2;
            a2 = cVar2.a(str, str2, this.mSessionParams, synthesizerListener);
        }
        DebugLog.LogD("synthesizeToUri leave");
        return a2;
    }

    @Override // com.iflytek.cloud.a.h.c.f
    public void a() {
        synchronized (this) {
            com.iflytek.cloud.a.h.c cVar = this.g;
            if (cVar != null) {
                cVar.g();
            }
        }
    }

    public void a(boolean z) {
        DebugLog.LogD("stopSpeaking enter:" + z);
        synchronized (this) {
            if (this.f != null) {
                DebugLog.LogD("-->stopSpeaking cur");
                this.f.cancel(z);
                this.f = null;
            }
            if (this.g != null) {
                DebugLog.LogD("-->stopSpeaking cur next");
                this.g.cancel(false);
                this.g = null;
            }
        }
        DebugLog.LogD("stopSpeaking leave");
    }
}
