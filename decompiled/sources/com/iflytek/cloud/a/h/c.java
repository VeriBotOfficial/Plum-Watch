package com.iflytek.cloud.a.h;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechEvent;
import com.iflytek.cloud.SynthesizerListener;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.cloud.record.c;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class c extends com.iflytek.cloud.a.f.e {
    private com.iflytek.cloud.record.c e;
    private com.iflytek.cloud.record.b f;
    private SynthesizerListener g;
    private SynthesizerListener h;
    private f i;
    private int j;
    private boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public SpeechError o;
    private com.iflytek.cloud.a.h.b p;

    /* renamed from: q, reason: collision with root package name */
    private c.InterfaceC0656c f11145q;
    private Handler r;
    private boolean s;
    final Handler t;

    class a implements com.iflytek.cloud.a.h.b {
        a() {
        }

        @Override // com.iflytek.cloud.a.h.b
        public void a(ArrayList<byte[]> arrayList, int i, int i2, int i3, String str) {
            Bundle bundle = new Bundle();
            bundle.putInt("percent", i);
            bundle.putInt("begpos", i2);
            bundle.putInt("endpos", i3);
            bundle.putString("spellinfo", str);
            if (c.this.g != null) {
                Message.obtain(c.this.r, 2, bundle).sendToTarget();
            }
            try {
                c.this.f.a(arrayList, i, i2, i3);
                c.this.h();
            } catch (IOException e) {
                DebugLog.LogE(e);
                c.this.o = new SpeechError(20010);
                Message.obtain(c.this.r, 6, c.this.o).sendToTarget();
                c.this.cancel(false);
            }
        }

        @Override // com.iflytek.cloud.a.h.b
        public void onCompleted(SpeechError speechError) {
            c cVar = c.this;
            cVar.o = speechError;
            if (speechError == null) {
                cVar.m = true;
                c.this.f.a(((com.iflytek.cloud.a.f.e) cVar).c != null ? ((com.iflytek.cloud.a.f.e) c.this).c.getParam().a(SpeechConstant.AUDIO_FORMAT, (String) null) : null);
                if (c.this.i != null) {
                    c.this.i.a();
                    DebugLog.LogD("onCompleted NextSession pause");
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("session_id", ((com.iflytek.cloud.a.f.e) c.this).c.getSessionID());
            Message.obtain(c.this.r, 7, bundle).sendToTarget();
            if (c.this.g == null || speechError == null) {
                return;
            }
            Message.obtain(c.this.r, 6, speechError).sendToTarget();
            if (c.this.e != null) {
                c.this.e.k();
            }
        }
    }

    /* renamed from: com.iflytek.cloud.a.h.c$c, reason: collision with other inner class name */
    class HandlerC0648c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private int f11148a;

        HandlerC0648c(Looper looper) {
            super(looper);
            this.f11148a = 0;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
            } catch (Exception e) {
                DebugLog.LogE("SpeakSession mUiHandler error:" + e);
            }
            if (c.this.g == null) {
                return;
            }
            switch (message.what) {
                case 1:
                    DebugLog.LogD("tts-onSpeakBegin");
                    c.this.g.onSpeakBegin();
                    break;
                case 2:
                    Bundle bundle = (Bundle) message.obj;
                    int i = bundle.getInt("percent");
                    int i2 = bundle.getInt("begpos");
                    int i3 = bundle.getInt("endpos");
                    String string = bundle.getString("spellinfo");
                    if (c.this.g != null) {
                        DebugLog.LogI("tts-onBufferProgress percent: " + i + ", beg: " + i2 + ", endpos: " + i3 + ", spell: " + string);
                        c.this.g.onBufferProgress(i, i2, i3, string);
                        break;
                    }
                    break;
                case 3:
                    DebugLog.LogD("tts-onSpeakPaused");
                    c.this.g.onSpeakPaused();
                    break;
                case 4:
                    DebugLog.LogD("tts-onSpeakResumed");
                    c.this.g.onSpeakResumed();
                    break;
                case 5:
                    int intValue = ((Integer) message.obj).intValue();
                    if (c.this.g != null) {
                        if (this.f11148a != intValue) {
                            DebugLog.LogD("tts-onSpeakProgress percent: " + message.arg1 + ", begpos: " + message.arg2 + ", endpos: " + intValue);
                            this.f11148a = intValue;
                        }
                        c.this.g.onSpeakProgress(message.arg1, message.arg2, intValue);
                        break;
                    }
                    break;
                case 6:
                    DebugLog.LogD("tts-onCompleted");
                    c.this.g.onCompleted((SpeechError) message.obj);
                    break;
                case 7:
                    c.this.g.onEvent(20001, 0, 0, (Bundle) message.obj);
                    break;
            }
        }
    }

    class d implements com.iflytek.cloud.a.h.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11149a;

        d(String str) {
            this.f11149a = str;
        }

        @Override // com.iflytek.cloud.a.h.b
        public void a(ArrayList<byte[]> arrayList, int i, int i2, int i3, String str) throws SpeechError {
            if (((com.iflytek.cloud.a.f.e) c.this).c != null && ((com.iflytek.cloud.a.f.e) c.this).c.getParam().a(SpeechConstant.TTS_DATA_NOTIFY, false) && c.this.h != null && arrayList != null) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    byte[] bArr = arrayList.get(i4);
                    Bundle bundle = new Bundle();
                    bundle.putByteArray(SpeechEvent.KEY_EVENT_TTS_BUFFER, bArr);
                    if (c.this.s) {
                        Message obtain = Message.obtain();
                        obtain.what = 21001;
                        obtain.arg1 = 0;
                        obtain.arg2 = 0;
                        obtain.obj = bundle;
                        Message.obtain(c.this.t, 7, 0, 0, obtain).sendToTarget();
                    } else {
                        c.this.h.onEvent(21001, 0, 0, bundle);
                    }
                }
            }
            try {
                c.this.f.a(arrayList, i, i2, i3);
                if (c.this.h != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("percent", i);
                    bundle2.putInt("begpos", i2);
                    bundle2.putInt("endpos", i3);
                    bundle2.putString("spellinfo", str);
                    if (c.this.s) {
                        Message.obtain(c.this.t, 2, bundle2).sendToTarget();
                    } else {
                        c.this.h.onBufferProgress(i, i2, i3, str);
                    }
                }
                if (i >= 100) {
                    if (((com.iflytek.cloud.a.f.e) c.this).c == null || !((com.iflytek.cloud.a.f.e) c.this).c.getParam().a(SpeechConstant.TTS_DATA_NOTIFY, false)) {
                        String a2 = ((com.iflytek.cloud.a.f.e) c.this).c != null ? ((com.iflytek.cloud.a.f.e) c.this).c.getParam().a(SpeechConstant.AUDIO_FORMAT, (String) null) : null;
                        if (c.this.f.e() == 0) {
                            throw new SpeechError(ErrorCode.MSP_ERROR_NO_DATA);
                        }
                        if (!c.this.f.a(a2)) {
                            throw new IOException();
                        }
                    } else {
                        String a3 = ((com.iflytek.cloud.a.f.e) c.this).c.getParam().a(SpeechConstant.AUDIO_FORMAT, (String) null);
                        if (!TextUtils.isEmpty(this.f11149a) && !c.this.f.a(a3)) {
                            throw new IOException();
                        }
                    }
                    if (c.this.h != null) {
                        if (c.this.s) {
                            Message.obtain(c.this.t, 6, null).sendToTarget();
                        } else {
                            c.this.h.onCompleted(null);
                        }
                    }
                }
            } catch (IOException e) {
                DebugLog.LogE(e);
                if (c.this.h != null) {
                    if (c.this.s) {
                        Message.obtain(c.this.t, 6, new SpeechError(20010)).sendToTarget();
                    } else {
                        try {
                            c.this.h.onCompleted(new SpeechError(20010));
                        } catch (Exception unused) {
                        }
                    }
                }
                if (((com.iflytek.cloud.a.f.e) c.this).c != null) {
                    ((com.iflytek.cloud.a.f.e) c.this).c.cancel(false);
                }
            }
        }

        @Override // com.iflytek.cloud.a.h.b
        public void onCompleted(SpeechError speechError) {
            if (c.this.h == null || speechError == null) {
                return;
            }
            if (c.this.s) {
                Message.obtain(c.this.t, 6, speechError).sendToTarget();
            } else {
                c.this.h.onCompleted(speechError);
            }
        }
    }

    class e extends Handler {
        e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Message message2;
            try {
                if (c.this.h == null) {
                    return;
                }
                int i = message.what;
                if (i == 2) {
                    Bundle bundle = (Bundle) message.obj;
                    c.this.h.onBufferProgress(bundle.getInt("percent"), bundle.getInt("begpos"), bundle.getInt("endpos"), bundle.getString("spellinfo"));
                } else if (i == 6) {
                    c.this.h.onCompleted((SpeechError) message.obj);
                } else if (i == 7 && (message2 = (Message) message.obj) != null) {
                    c.this.h.onEvent(message2.what, message2.arg1, message2.arg2, (Bundle) message2.obj);
                }
            } catch (Exception e) {
                DebugLog.LogE("SpeakSession mUiHandler error:" + e);
            }
        }
    }

    public interface f {
        void a();
    }

    public c(Context context) {
        super(context);
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = 0;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = new a();
        this.f11145q = new b();
        this.r = new HandlerC0648c(Looper.getMainLooper());
        this.s = true;
        this.t = new e(Looper.getMainLooper());
    }

    @Override // com.iflytek.cloud.a.f.e
    public void cancel(boolean z) {
        DebugLog.LogD("SpeakSession cancel notifyError:" + z);
        if (isSpeaking()) {
            SynthesizerListener synthesizerListener = this.g;
            if (synthesizerListener != null) {
                synthesizerListener.onEvent(21002, 0, 0, null);
            }
            SynthesizerListener synthesizerListener2 = this.h;
            if (synthesizerListener2 != null) {
                synthesizerListener2.onEvent(21002, 0, 0, null);
            }
            if (z) {
                SpeechError speechError = new SpeechError(ErrorCode.ERROR_INTERRUPT);
                if (this.g != null) {
                    DebugLog.LogD("tts-onCompleted-cancel");
                    Message.obtain(this.r, 6, speechError).sendToTarget();
                }
                SynthesizerListener synthesizerListener3 = this.h;
                if (synthesizerListener3 != null) {
                    if (this.s) {
                        Message.obtain(this.t, 6, speechError).sendToTarget();
                    } else {
                        synthesizerListener3.onCompleted(speechError);
                    }
                }
            }
        }
        this.g = null;
        this.h = null;
        super.cancel(false);
        com.iflytek.cloud.record.c cVar = this.e;
        if (cVar != null) {
            cVar.k();
        }
    }

    @Override // com.iflytek.cloud.a.f.e, com.iflytek.cloud.a.f.d
    public boolean destroy() {
        synchronized (this.b) {
            cancel(false);
        }
        return true;
    }

    public boolean isSpeaking() {
        if (c()) {
            return true;
        }
        return (f() == 4 || f() == 0) ? false : true;
    }

    public void pauseSpeaking() {
        com.iflytek.cloud.record.c cVar;
        if (this.f == null || (cVar = this.e) == null) {
            return;
        }
        cVar.d();
    }

    public void resumeSpeaking() {
        com.iflytek.cloud.record.c cVar;
        if (this.f != null && (cVar = this.e) != null) {
            cVar.g();
        } else {
            this.e = new com.iflytek.cloud.record.c(this.f11137a);
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.k || this.e == null || !this.f.c(this.j)) {
            return;
        }
        this.k = true;
        this.e.a(this.f, this.f11145q);
        if (this.g != null) {
            Message.obtain(this.r, 1).sendToTarget();
        }
    }

    public void a(String str, com.iflytek.cloud.b.a aVar) {
        setParameter(aVar);
        this.n = str;
    }

    @Override // com.iflytek.cloud.a.f.e
    public boolean c() {
        return super.c();
    }

    public int f() {
        com.iflytek.cloud.record.c cVar;
        if (this.f == null || (cVar = this.e) == null) {
            return 4;
        }
        return cVar.c();
    }

    public void g() {
        if (this.m) {
            return;
        }
        a(this.n, this.mSessionParams, null, false, this.mSessionParams.a("tts_next_audio_path"));
    }

    class b implements c.InterfaceC0656c {
        b() {
        }

        @Override // com.iflytek.cloud.record.c.InterfaceC0656c
        public void a(int i, int i2, int i3) {
            Message.obtain(c.this.r, 5, i, i2, Integer.valueOf(i3)).sendToTarget();
        }

        @Override // com.iflytek.cloud.record.c.InterfaceC0656c
        public void b() {
            if (c.this.g != null) {
                Message.obtain(c.this.r, 4).sendToTarget();
            }
        }

        @Override // com.iflytek.cloud.record.c.InterfaceC0656c
        public void c() {
            if (c.this.g != null) {
                Message.obtain(c.this.r, 3).sendToTarget();
            }
        }

        @Override // com.iflytek.cloud.record.c.InterfaceC0656c
        public void onError(SpeechError speechError) {
            Message.obtain(c.this.r, 6, speechError).sendToTarget();
            if (c.this.e != null) {
                c.this.e.k();
            }
            c.this.cancel(false);
        }

        @Override // com.iflytek.cloud.record.c.InterfaceC0656c
        public void a() {
            Message.obtain(c.this.r, 6, null).sendToTarget();
        }
    }

    public void a(f fVar) {
        this.i = fVar;
    }

    public synchronized int a(String str, com.iflytek.cloud.b.a aVar, SynthesizerListener synthesizerListener, boolean z, String str2) {
        int i;
        try {
            DebugLog.LogD("tts start:" + System.currentTimeMillis());
            this.g = synthesizerListener;
            this.n = str;
            setParameter(aVar);
            int a2 = aVar.a(SpeechConstant.STREAM_TYPE, 3);
            boolean a3 = aVar.a(SpeechConstant.KEY_REQUEST_FOCUS, true);
            i = 0;
            if (z) {
                this.e = new com.iflytek.cloud.record.c(this.f11137a, a2, a3, com.iflytek.cloud.b.a.b(this.mSessionParams.e(SpeechConstant.TTS_FADING), false), com.iflytek.cloud.b.a.b(this.mSessionParams.e("tts_buf_fading"), false));
            }
            this.c = new com.iflytek.cloud.a.h.a(this.f11137a, aVar, a("tts"));
            this.f = new com.iflytek.cloud.record.b(this.f11137a, this.c.getSampleRate(), Math.max(1, aVar.a("tts_min_audio_len", 0) / 1000) + (str != null ? str.length() : 0), str2, aVar.a("tts_proc_scale", 100));
            this.f.a(com.iflytek.cloud.b.a.b(this.mSessionParams.e("end_with_null"), true));
            this.j = aVar.a(SpeechConstant.TTS_BUFFER_TIME, 0);
            DebugLog.LogD("minPlaySec:" + this.j);
            this.k = false;
            ((com.iflytek.cloud.a.h.a) this.c).a(str, this.p);
            this.l = true;
        } catch (SpeechError e2) {
            i = e2.getErrorCode();
            DebugLog.LogE(e2);
            return i;
        } catch (Throwable th) {
            DebugLog.LogE(th);
            i = ErrorCode.ERROR_UNKNOWN;
            return i;
        }
        return i;
    }

    public void a(SynthesizerListener synthesizerListener) {
        this.g = synthesizerListener;
    }

    public int a(String str, String str2, com.iflytek.cloud.b.a aVar, SynthesizerListener synthesizerListener) {
        try {
            this.s = aVar.a("message_main_thread", true);
            this.h = synthesizerListener;
            this.c = new com.iflytek.cloud.a.h.a(this.f11137a, aVar, a("tts"));
            this.f = new com.iflytek.cloud.record.b(this.f11137a, this.c.getSampleRate(), Math.max(1, aVar.a("tts_min_audio_len", 0) / 1000) + (str != null ? str.length() : 0), str2, aVar.a("tts_proc_scale", 100));
            ((com.iflytek.cloud.a.h.a) this.c).a(str, new d(str2));
            return 0;
        } catch (SpeechError e2) {
            int errorCode = e2.getErrorCode();
            DebugLog.LogE(e2);
            return errorCode;
        } catch (Throwable th) {
            DebugLog.LogE(th);
            return ErrorCode.ERROR_UNKNOWN;
        }
    }
}
