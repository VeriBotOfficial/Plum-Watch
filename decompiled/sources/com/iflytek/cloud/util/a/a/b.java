package com.iflytek.cloud.util.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.msc.util.d;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.cloud.util.AudioDetector;
import com.iflytek.msc.MetaVAD;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class b extends AudioDetector {
    private static final Map<String, String> c;
    private static final Map<String, String> d;
    private com.iflytek.cloud.b.a e;
    private final AudioDetector.DetectorResult f;
    private MetaVAD.Instance g;
    private String h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private long n;
    private long o;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        HashMap hashMap2 = new HashMap();
        d = hashMap2;
        hashMap.put(SpeechConstant.VAD_BOS, "vad_starttimeout");
        hashMap.put(SpeechConstant.VAD_EOS, "vad_endtimeout");
        hashMap.put(AudioDetector.THRESHOLD, "vad_threshold");
        hashMap2.put(SpeechConstant.VAD_BOS, String.valueOf(2000));
        hashMap2.put(SpeechConstant.VAD_EOS, String.valueOf(700));
        hashMap2.put(AudioDetector.THRESHOLD, String.valueOf(0.6f));
    }

    public b(Context context, String str) {
        super(context, str);
        this.e = new com.iflytek.cloud.b.a();
        this.f = new AudioDetector.DetectorResult();
        this.g = new MetaVAD.Instance();
        this.h = "gb2312";
        this.i = false;
        this.j = true;
        this.k = 0;
        this.l = 0;
        this.m = 2;
        this.n = -1L;
        this.o = 0L;
        DebugLog.LogD("Meta VAD AudioDetector constructor enter, context: " + context + ", param: " + str);
        this.e.c(str);
        try {
            this.h = this.e.a(SpeechConstant.TEXT_ENCODING, this.h);
            String a2 = this.e.a("extra");
            byte[] a3 = a2 != null ? d.a(a2, this.h) : null;
            DebugLog.LogD("MetaVAD.VADInitialize begin.");
            int VADInitialize = MetaVAD.VADInitialize(a3);
            if (VADInitialize == 0) {
                this.g.rate = this.e.a("sample_rate", 16000);
                String a4 = this.e.a(AudioDetector.RES_PATH);
                byte[] a5 = a4 != null ? d.a(a4, this.h) : null;
                DebugLog.LogD("MetaVAD.VADLoadResource begin.");
                VADInitialize = MetaVAD.VADLoadResource(this.g.rate, a5);
                if (VADInitialize == 0) {
                    DebugLog.LogD("MetaVAD.VADCreateSession begin.");
                    VADInitialize = MetaVAD.VADCreateSession(this.g);
                }
            }
            if (VADInitialize != 0) {
                DebugLog.LogE("MetaVAD Native error " + VADInitialize);
            }
        } catch (Throwable th) {
            DebugLog.LogE("Meta VAD AudioDetector constructor exception:");
            DebugLog.LogE(th);
        }
        DebugLog.LogD("Meta VAD AudioDetector constructor leave");
    }

    private void a(int i) {
        switch (i) {
            case 0:
            case 6:
                this.f.error = 0;
                this.g.seg = 0;
                break;
            case 1:
            case 2:
                this.f.sub = 1;
                break;
            case 3:
                this.f.sub = 2;
                break;
            case 4:
                this.f.status = this.i ? 2 : 3;
                break;
            case 5:
                this.f.sub = 3;
                break;
            default:
                this.f.error = i;
                break;
        }
        if (!this.i) {
            AudioDetector.DetectorResult detectorResult = this.f;
            if (detectorResult.sub != 0) {
                this.i = true;
                if (detectorResult.status == 0) {
                    detectorResult.status = 1;
                }
            }
        }
        if (this.f.status == 0 && a()) {
            this.f.status = 4;
        }
    }

    private void b() {
        AudioDetector.DetectorResult detectorResult = this.f;
        detectorResult.buffer = null;
        detectorResult.end = 0;
        detectorResult.error = 0;
        detectorResult.length = 0;
        detectorResult.offset = 0;
        detectorResult.quality = 0;
        detectorResult.start = 0;
        detectorResult.status = 0;
        detectorResult.sub = 0;
        detectorResult.subs.clear();
        AudioDetector.DetectorResult detectorResult2 = this.f;
        detectorResult2.voice = false;
        detectorResult2.volume = 0;
        detectorResult2.confidence = 1.0f;
        MetaVAD.Instance instance = this.g;
        if (instance != null) {
            instance.a();
        }
        this.k = 0;
    }

    private void c() {
        MetaVAD.Instance instance = this.g;
        if (instance.seg != 0) {
            Integer put = this.f.subs.put(Integer.valueOf(instance.begin), Integer.valueOf(this.g.end));
            if (put != null) {
                DebugLog.LogE("update result error: repeat sub begin: " + put);
                int i = this.k + 1;
                this.k = i;
                if (10 <= i) {
                    this.f.error = 10100;
                    DebugLog.LogE("update result error: repeat sub reach max count.");
                }
            }
            AudioDetector.DetectorResult detectorResult = this.f;
            detectorResult.sub = 3;
            MetaVAD.Instance instance2 = this.g;
            int i2 = instance2.seg;
            if (1 == i2 || (this.j && 3 == i2)) {
                int i3 = instance2.begin;
                detectorResult.start = i3;
                this.l = i3;
            }
            if (3 == i2) {
                detectorResult.end = instance2.end;
                detectorResult.start = this.l;
                detectorResult.confidence = MetaVAD.VADGetSentConfidence(instance2);
            }
            this.j = false;
        }
        AudioDetector.DetectorResult detectorResult2 = this.f;
        detectorResult2.quality = 0;
        detectorResult2.voice = false;
        detectorResult2.volume = this.g.volume * 4;
    }

    @Override // com.iflytek.cloud.util.AudioDetector
    public boolean destroy() {
        boolean z;
        int i;
        DebugLog.LogD("destroy enter");
        synchronized (AudioDetector.b) {
            z = false;
            try {
                MetaVAD.Instance instance = this.g;
                boolean z2 = true;
                if (instance != null) {
                    if (0 != instance.handle) {
                        DebugLog.LogD("destroy MetaVAD.VADDestroySession begin");
                        i = MetaVAD.VADDestroySession(this.g);
                        DebugLog.LogD("destroy MetaVAD.VADDestroySession ret=" + i);
                    } else {
                        i = 0;
                    }
                    if (i == 0) {
                        this.g.handle = 0L;
                        DebugLog.LogD("destroy MetaVAD.VADDelResource begin");
                        DebugLog.LogD("destroy MetaVAD.VADDelResource ret=" + MetaVAD.VADDelResource(this.g.rate));
                        DebugLog.LogD("destroy MetaVAD.VADUninitialize begin");
                        i = MetaVAD.VADUninitialize();
                        DebugLog.LogD("destroy MetaVAD.VADUninitialize ret=" + i);
                    }
                    if (i != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        this.g = null;
                        AudioDetector.f11223a = null;
                    }
                }
                z = z2;
            } finally {
                DebugLog.LogD("destroy leave: " + z);
                return z;
            }
        }
        DebugLog.LogD("destroy leave: " + z);
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x006a, code lost:
    
        r7.f.error = 20012;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x011c, UnsatisfiedLinkError -> 0x012f, TryCatch #3 {UnsatisfiedLinkError -> 0x012f, all -> 0x011c, blocks: (B:4:0x0037, B:6:0x003e, B:14:0x0052, B:17:0x0057, B:18:0x007c, B:20:0x0082, B:22:0x009c, B:23:0x00a2, B:27:0x00af, B:29:0x00fe, B:30:0x0109, B:32:0x0110, B:35:0x0116, B:46:0x006a, B:47:0x0071), top: B:3:0x0037, outer: #1 }] */
    @Override // com.iflytek.cloud.util.AudioDetector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.iflytek.cloud.util.AudioDetector.DetectorResult detect(byte[] r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.util.a.a.b.detect(byte[], int, int, boolean):com.iflytek.cloud.util.AudioDetector$DetectorResult");
    }

    @Override // com.iflytek.cloud.util.AudioDetector
    public void reset() {
        DebugLog.LogD("reset enter");
        synchronized (AudioDetector.b) {
            MetaVAD.Instance instance = this.g;
            if (instance == null || 0 == instance.handle) {
                DebugLog.LogE("setParameter error: vad instance is null, or invalid handle.");
            } else {
                try {
                    DebugLog.LogD("reset MetaVAD.VADResetSession begin");
                    DebugLog.LogD("reset MetaVAD.VADResetSession return " + MetaVAD.VADResetSession(this.g));
                    this.g.a();
                    this.j = true;
                    this.i = false;
                    this.o = 0L;
                    this.l = 0;
                } catch (Throwable th) {
                    DebugLog.LogE("reset exception:");
                    DebugLog.LogE(th);
                }
            }
        }
        DebugLog.LogD("reset leave");
    }

    @Override // com.iflytek.cloud.util.AudioDetector
    public void setParameter(String str, String str2) {
        long j;
        DebugLog.LogD("setParameter enter, key: " + str + ", value: " + str2);
        synchronized (AudioDetector.b) {
            MetaVAD.Instance instance = this.g;
            if (instance == null || 0 == instance.handle) {
                DebugLog.LogE("setParameter error: vad instance is null, or invalid handle.");
            } else {
                try {
                    if (AudioDetector.RESET_SENTENCE.equalsIgnoreCase(str)) {
                        DebugLog.LogD("VAD VADResetSentence ret: " + MetaVAD.VADResetSentence(this.g));
                    } else {
                        if (!TextUtils.isEmpty(str)) {
                            Map<String, String> map = c;
                            if (map.containsKey(str)) {
                                if (TextUtils.isEmpty(str2)) {
                                    this.e.e(str);
                                } else {
                                    this.e.b(str, str2);
                                }
                                String a2 = this.e.a(str, d.get(str));
                                String str3 = map.get(str);
                                DebugLog.LogD("VAD SetParameter key=" + str3 + ", value=" + a2 + ", ret: " + MetaVAD.VADSetParam(this.g, d.a(str3, this.h), d.a(a2, this.h)));
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            if (SpeechConstant.KEY_SPEECH_TIMEOUT.equalsIgnoreCase(str)) {
                                try {
                                    j = Long.parseLong(str2);
                                } catch (NumberFormatException e) {
                                    DebugLog.LogE(e);
                                    j = -1;
                                }
                                DebugLog.LogD("SetParameter speech timeout value:" + j);
                                if (0 < j) {
                                    this.n = ((this.g.rate * this.m) * j) / 1000;
                                    DebugLog.LogD("SetParameter BytesOfSpeechTimeout: " + this.n);
                                } else {
                                    this.n = -1L;
                                }
                            } else {
                                DebugLog.LogD("VAD SetParameter name=" + str + ", value=" + str2 + ", ret: " + MetaVAD.VADSetParam(this.g, d.a(str, this.h), d.a(str2, this.h)));
                            }
                        }
                    }
                } catch (Throwable th) {
                    DebugLog.LogE("setParameter exception");
                    DebugLog.LogE(th);
                }
            }
        }
        DebugLog.LogD("setParameter leave.");
    }

    private boolean a() {
        long j = this.n;
        return 0 < j && j <= this.o;
    }
}
