package com.iflytek.cloud.util.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.cloud.util.AudioDetector;
import com.iflytek.msc.VAD;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class a extends AudioDetector {
    private static final Map<String, Integer> c;
    private static final Map<String, Integer> d;
    private com.iflytek.cloud.b.a e;
    private long f;
    private AudioDetector.DetectorResult g;
    private VAD.VadData h;
    private byte[] i;
    private byte[] j;
    private boolean k;
    private int l;
    private long m;
    private long n;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        HashMap hashMap2 = new HashMap();
        d = hashMap2;
        hashMap.put(SpeechConstant.VAD_BOS, 0);
        hashMap.put(SpeechConstant.VAD_EOS, 1);
        hashMap.put(AudioDetector.SUB_TIMEOUT, 3);
        hashMap.put(AudioDetector.EARLY_START, 4);
        hashMap2.put(SpeechConstant.VAD_BOS, 2000);
        hashMap2.put(SpeechConstant.VAD_EOS, 700);
        hashMap2.put(AudioDetector.SUB_TIMEOUT, 20000);
        hashMap2.put(AudioDetector.EARLY_START, 1);
    }

    public a(Context context, String str) {
        super(context, str);
        this.e = new com.iflytek.cloud.b.a();
        this.f = 0L;
        this.g = new AudioDetector.DetectorResult();
        this.h = new VAD.VadData();
        this.i = new byte[32768];
        this.j = new byte[com.umeng.commonsdk.internal.a.s];
        this.k = true;
        this.l = 2;
        this.m = -1L;
        this.n = 0L;
        DebugLog.LogD("AudioDetector constructor enter, context: " + context + ", param: " + str);
        this.e.c(str);
        try {
            this.f = VAD.Initialize(this.e.a("sample_rate", 16000));
            DebugLog.LogD("VAD Initialize ret: " + this.f);
        } catch (Throwable th) {
            DebugLog.LogE("AudioDetector constructor exception");
            DebugLog.LogE(th);
        }
        this.h.wavData = this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2e
            r2 = 3
            r3 = 2
            switch(r5) {
                case 5: goto L29;
                case 6: goto L24;
                case 7: goto L1f;
                case 8: goto L1a;
                case 9: goto L13;
                case 10: goto Le;
                case 11: goto L2e;
                default: goto L9;
            }
        L9:
            com.iflytek.cloud.util.AudioDetector$DetectorResult r2 = r4.g
            r2.error = r5
            goto L32
        Le:
            com.iflytek.cloud.util.AudioDetector$DetectorResult r5 = r4.g
            r5.status = r2
            goto L32
        L13:
            com.iflytek.cloud.util.AudioDetector$DetectorResult r5 = r4.g
            r5.sub = r2
            r5.status = r3
            goto L32
        L1a:
            com.iflytek.cloud.util.AudioDetector$DetectorResult r5 = r4.g
            r5.status = r3
            goto L32
        L1f:
            com.iflytek.cloud.util.AudioDetector$DetectorResult r5 = r4.g
            r5.sub = r2
            goto L32
        L24:
            com.iflytek.cloud.util.AudioDetector$DetectorResult r5 = r4.g
            r5.sub = r3
            goto L32
        L29:
            com.iflytek.cloud.util.AudioDetector$DetectorResult r5 = r4.g
            r5.sub = r0
            goto L32
        L2e:
            com.iflytek.cloud.util.AudioDetector$DetectorResult r5 = r4.g
            r5.error = r1
        L32:
            boolean r5 = r4.k
            if (r5 == 0) goto L44
            com.iflytek.cloud.util.AudioDetector$DetectorResult r5 = r4.g
            int r2 = r5.sub
            if (r2 == 0) goto L44
            r4.k = r1
            int r1 = r5.status
            if (r1 != 0) goto L44
            r5.status = r0
        L44:
            com.iflytek.cloud.util.AudioDetector$DetectorResult r5 = r4.g
            int r5 = r5.status
            if (r5 != 0) goto L55
            boolean r5 = r4.a()
            if (r5 == 0) goto L55
            com.iflytek.cloud.util.AudioDetector$DetectorResult r5 = r4.g
            r0 = 4
            r5.status = r0
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.util.a.a.a.a(int):void");
    }

    private void b() {
        AudioDetector.DetectorResult detectorResult = this.g;
        detectorResult.buffer = null;
        detectorResult.end = 0;
        detectorResult.error = 0;
        detectorResult.length = 0;
        detectorResult.offset = 0;
        detectorResult.quality = 0;
        detectorResult.start = 0;
        detectorResult.status = 0;
        detectorResult.sub = 0;
        detectorResult.voice = false;
        detectorResult.volume = 0;
        VAD.VadData vadData = this.h;
        vadData.audioQuality = 0;
        vadData.endByte = 0;
        vadData.endRemainFrameNum = 0;
        vadData.firstOutByte = 0;
        vadData.inSpeech = 0;
        vadData.startByte = 0;
        vadData.startRemainFrameNum = 0;
        vadData.status = 0;
        vadData.volumeLevel = 0;
        vadData.waitPauseOrEnd = 0;
        vadData.waitStart = 0;
        vadData.wavData = this.j;
        vadData.wavDataSize = 0;
    }

    private void c() {
        AudioDetector.DetectorResult detectorResult = this.g;
        VAD.VadData vadData = this.h;
        detectorResult.buffer = vadData.wavData;
        detectorResult.end = vadData.endByte;
        detectorResult.length = vadData.wavDataSize;
        detectorResult.offset = 0;
        detectorResult.quality = vadData.audioQuality;
        detectorResult.start = vadData.startByte;
        detectorResult.voice = 1 == vadData.inSpeech;
        detectorResult.volume = vadData.volumeLevel;
    }

    @Override // com.iflytek.cloud.util.AudioDetector
    public boolean destroy() {
        boolean z;
        DebugLog.LogD("destroy enter");
        synchronized (AudioDetector.b) {
            long j = this.f;
            if (0 != j) {
                try {
                    VAD.Uninitialize(j);
                    DebugLog.LogD("VAD Uninitialize");
                    this.f = 0L;
                } catch (Throwable th) {
                    DebugLog.LogE("destroy exception");
                    DebugLog.LogE(th);
                    z = false;
                }
            }
            z = true;
        }
        AudioDetector.f11223a = null;
        DebugLog.LogD("destroy leave");
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        r0 = com.iflytek.msc.VAD.EndAudioData(r13);
        com.iflytek.cloud.msc.util.log.DebugLog.LogD("VAD EndAudioData ret: " + r0);
        a(r0);
        r0 = r18.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0166, code lost:
    
        if (r0.error != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0168, code lost:
    
        r0.error = com.iflytek.msc.VAD.GetLastSpeechPos(r18.f, r18.h);
        com.iflytek.cloud.msc.util.log.DebugLog.LogD("VAD GetLastSpeechPos ret: " + r18.g.error);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018a, code lost:
    
        if (r18.g.error != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018c, code lost:
    
        c();
     */
    @Override // com.iflytek.cloud.util.AudioDetector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.iflytek.cloud.util.AudioDetector.DetectorResult detect(byte[] r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.util.a.a.a.detect(byte[], int, int, boolean):com.iflytek.cloud.util.AudioDetector$DetectorResult");
    }

    @Override // com.iflytek.cloud.util.AudioDetector
    public void reset() {
        DebugLog.LogD("reset enter");
        synchronized (AudioDetector.b) {
            long j = this.f;
            if (0 != j) {
                try {
                    VAD.Reset(j);
                    DebugLog.LogD("VAD Reset");
                    this.k = true;
                    this.n = 0L;
                } catch (Throwable th) {
                    DebugLog.LogE("reset exception");
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
            try {
            } finally {
                DebugLog.LogD("setParameter leave.");
            }
            if (!TextUtils.isEmpty(str)) {
                Map<String, Integer> map = c;
                if (map.containsKey(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        this.e.e(str);
                    } else {
                        this.e.b(str, str2);
                    }
                    int a2 = this.e.a(str, d.get(str).intValue());
                    int intValue = map.get(str).intValue();
                    DebugLog.LogD("VAD SetParameter key=" + intValue + ", value=" + a2 + ", ret: " + VAD.SetParam(this.f, intValue, a2));
                }
            }
            if (SpeechConstant.KEY_SPEECH_TIMEOUT.equalsIgnoreCase(str)) {
                try {
                    j = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                    j = -1;
                }
                DebugLog.LogD("SetParameter speech timeout value:" + j);
                if (0 < j) {
                    this.m = ((this.e.a("sample_rate", 16000) * this.l) * j) / 1000;
                    DebugLog.LogD("SetParameter BytesOfSpeechTimeout: " + this.m);
                } else {
                    this.m = -1L;
                }
            } else {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                DebugLog.LogD("VAD SetParameter key=" + parseInt + ", value=" + parseInt2 + ", ret: " + VAD.SetParam(this.f, parseInt, parseInt2));
            }
        }
        DebugLog.LogD("setParameter leave.");
    }

    private boolean a() {
        long j = this.m;
        return 0 < j && j <= this.n;
    }
}
