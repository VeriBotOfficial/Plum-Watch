package com.iflytek.cloud.a.h;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.a.f.a;
import com.iflytek.cloud.msc.util.j;
import com.iflytek.cloud.msc.util.log.DebugLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class a extends com.iflytek.cloud.a.f.a {

    /* renamed from: a, reason: collision with root package name */
    public static int f11143a;
    public static int b;
    private String c;
    private d d;
    private b e;
    private ArrayList<byte[]> f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private final JSONObject l;
    private JSONArray m;
    private int n;
    private int o;
    private String p;

    /* renamed from: q, reason: collision with root package name */
    private int f11144q;

    public a(Context context, com.iflytek.cloud.b.a aVar, HandlerThread handlerThread) {
        super(context, handlerThread);
        this.c = "";
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.k = 0;
        this.l = new JSONObject();
        this.m = null;
        this.n = -1;
        this.o = 100;
        this.p = null;
        this.f11144q = 0;
        this.d = new d();
        this.f = new ArrayList<>();
        setParams(aVar);
    }

    public void a(String str, b bVar) {
        this.c = str;
        this.e = bVar;
        if (str == null || TextUtils.isEmpty(str)) {
            exit(new SpeechError(20009));
            return;
        }
        this.i = getParam().a(SpeechConstant.TTS_SPELL_INFO, false);
        this.j = getParam().a("audio_info", this.j);
        start();
    }

    protected void b() throws Exception {
        com.iflytek.cloud.msc.util.log.a.a("SDKSessionBegin", null);
        int sessionBegin = this.d.sessionBegin(this.mContext, null, this);
        if (sessionBegin != 0) {
            int i = this.f11144q + 1;
            this.f11144q = i;
            if (i > 40) {
                throw new SpeechError(sessionBegin);
            }
            if (isRunning()) {
                sendMsg(1, a.EnumC0646a.normal, false, 15);
                return;
            }
            return;
        }
        byte[] bytes = this.c.getBytes(getTextEncoding());
        if (!"unicode".equals(getTextEncoding())) {
            this.d.a(bytes);
        } else if (Build.VERSION.SDK_INT >= 27) {
            byte[] bArr = new byte[bytes.length];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            for (int i2 = 0; i2 < bytes.length / 2; i2++) {
                int i3 = i2 * 2;
                int i4 = i3 + 1;
                bArr[i4] = bytes[i3];
                bArr[i3] = bytes[i4];
            }
            this.d.a(bArr);
        } else {
            byte[] bArr2 = new byte[bytes.length - 2];
            System.arraycopy(bytes, 2, bArr2, 0, bytes.length - 2);
            this.d.a(bArr2);
        }
        setStatus(a.b.waitresult);
        sendMsg(5);
        updateTimeoutMsg();
    }

    protected void c() throws Exception {
        int i;
        com.iflytek.cloud.msc.util.log.a.a("GetNotifyResult", null);
        if (this.d.d()) {
            DebugLog.LogD("tts msc get last audio");
            if (this.e != null) {
                if (this.j) {
                    this.l.put("audio_len", this.k);
                }
                JSONArray jSONArray = this.m;
                if (jSONArray != null) {
                    this.l.put("spell_info", jSONArray);
                    this.m = null;
                }
                this.e.a(this.f, this.o, this.h, this.c.length() - 1, this.l.length() > 0 ? this.l.toString() : null);
            }
            exit(null);
            return;
        }
        byte[] a2 = this.d.a();
        getSessionID();
        if (a2 == null || this.e == null) {
            sendMsg(5, a.EnumC0646a.normal, false, 10);
            return;
        }
        this.k += a2.length;
        int b2 = Build.VERSION.SDK_INT >= 27 ? (this.d.b() / 2) - 2 : (this.d.b() / 2) - 1;
        if (b2 < 0) {
            DebugLog.LogD("get audio index value error: " + b2);
            b2 = 0;
        }
        if (this.i) {
            String c = this.d.c();
            if (!TextUtils.isEmpty(c)) {
                if (this.m == null) {
                    this.m = new JSONArray();
                }
                this.m.put(c);
            }
        }
        if (this.n < 0 && (i = this.g) != 0 && b2 != i && this.f.size() > 0) {
            DebugLog.LogI("tts msc get audio beg=" + this.h + ", end=" + this.g);
            a();
        }
        updateTimeoutMsg();
        this.g = b2;
        this.f.add(a2);
        if (this.n >= 0) {
            a();
        }
        sendMsg(5, a.EnumC0646a.normal, false, 0);
    }

    @Override // com.iflytek.cloud.a.f.a
    public void cancel(boolean z) {
        b bVar;
        if (z && isRunning() && (bVar = this.e) != null) {
            bVar.onCompleted(new SpeechError(ErrorCode.ERROR_INTERRUPT));
        }
        super.cancel(z);
    }

    @Override // com.iflytek.cloud.a.f.a
    public String getClientID() {
        return this.d.getClientID();
    }

    @Override // com.iflytek.cloud.a.f.a
    public String getSessionID() {
        if (TextUtils.isEmpty(this.p)) {
            this.p = this.d.getSessionID();
        }
        return this.p;
    }

    @Override // com.iflytek.cloud.a.f.a
    public String getTextEncoding() {
        return getParam().a(SpeechConstant.TEXT_ENCODING, "unicode");
    }

    @Override // com.iflytek.cloud.a.f.a
    protected void onEnd(SpeechError speechError) {
        f11143a = this.d.getIntValue(com.iflytek.cloud.a.f.a.TAG_UPFLOW);
        b = this.d.getIntValue(com.iflytek.cloud.a.f.a.TAG_DOWNFLOW);
        getSessionID();
        com.iflytek.cloud.msc.util.log.a.a("SessionEndBegin", null);
        if (this.e == null) {
            this.d.sessionEnd("user abort");
        } else if (speechError != null) {
            this.d.sessionEnd("error" + speechError.getErrorCode());
            DebugLog.LogD("QTts Error Code = " + speechError.getErrorCode());
        } else {
            this.d.sessionEnd("success");
        }
        com.iflytek.cloud.msc.util.log.a.a("SessionEndEnd", null);
        super.onEnd(speechError);
        if (this.e != null) {
            if (this.mUserCancel) {
                DebugLog.LogD("MscSynthesizer#onCancel");
            } else {
                DebugLog.LogD("MscSynthesizer#onEnd");
                this.e.onCompleted(speechError);
            }
        }
    }

    @Override // com.iflytek.cloud.a.f.a
    protected void onMsgProcess(Message message) throws Throwable, SpeechError {
        int i = message.what;
        if (i == 0) {
            proc_Msg_Start();
        } else if (i == 1) {
            b();
        } else {
            if (i != 5) {
                return;
            }
            c();
        }
    }

    @Override // com.iflytek.cloud.a.f.a
    protected void onParseParam() {
        this.n = getParam().a(SpeechConstant.TTS_BUFFER_TIME, this.n);
        this.o = getParam().a("tts_proc_scale", this.o);
        super.onParseParam();
    }

    protected void proc_Msg_Start() throws Exception {
        DebugLog.LogD("tts msg start:" + System.currentTimeMillis());
        String a2 = getParam().a(SpeechConstant.ENGINE_TYPE);
        boolean a3 = getParam().a(SpeechConstant.NET_CHECK, true);
        if (("cloud".equals(a2) || SpeechConstant.TYPE_DISTRIBUTED.equals(a2)) && a3) {
            j.a(this.mContext);
        }
        sendMsg(1);
    }

    private void a() throws SpeechError, JSONException {
        int i = this.o;
        int min = Math.min(i - 1, (this.g * i) / this.c.length());
        if (this.j) {
            this.l.put("audio_len", this.k);
        }
        JSONArray jSONArray = this.m;
        if (jSONArray != null) {
            this.l.put("spell_info", jSONArray);
            this.m = null;
        }
        this.e.a(this.f, min, this.h, this.g, this.l.length() > 0 ? this.l.toString() : null);
        this.f = new ArrayList<>();
        this.h = Math.min(this.g + 1, this.c.length() - 1);
    }
}
