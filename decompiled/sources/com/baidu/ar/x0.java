package com.baidu.ar;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.arplay.core.message.ARPMessageType;
import com.baidu.ar.arplay.util.LogUtil;
import com.baidu.mapapi.SDKInitializer;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class x0 {
    public static x0 d;
    public static ConcurrentHashMap<String, p> e;
    public static HandlerThread f;
    public static q h;
    public static Map<String, Integer> i;
    public static Timer j;
    public static TimerTask k;

    /* renamed from: a, reason: collision with root package name */
    public Handler f7312a;
    public Map<String, Integer> b;
    public Handler.Callback c = new h();
    public static Handler g = new Handler(Looper.getMainLooper());
    public static final String l = "x0";
    public static Runnable m = new g();

    public class a implements MediaPlayer.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f7313a;
        public final /* synthetic */ HashMap b;

        public a(r0 r0Var, HashMap hashMap) {
            this.f7313a = r0Var;
            this.b = hashMap;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            int a2;
            String str = x0.l;
            LogUtil.b(str, "openAudio mMediaPlayer onCompletion");
            if (x0.this.b == null) {
                return;
            }
            p a3 = x0.this.a(this.f7313a.b());
            if (a3 == null || a3.b.g != "paused") {
                if (a3 != null) {
                    y8 y8Var = a3.b;
                    y8Var.e = "STATUS";
                    y8Var.g = "finished";
                    x0.c(a3);
                    if (this.f7313a.f()) {
                        LogUtil.b(str, "openAudio mMediaPlayer onCompletion  isLoopForever open！");
                        x0.this.a(this.f7313a, this.b);
                        return;
                    }
                }
                if (x0.this.b.size() <= 0 || (a2 = x0.a((Map<String, Integer>) x0.this.b, this.f7313a.b())) <= 1) {
                    x0.this.a(1009, this.b);
                    mediaPlayer.release();
                    return;
                }
                LogUtil.b(str, "openAudio mMediaPlayer onCompletion  count open ！");
                x0.this.a(this.f7313a, this.b);
                int i = a2 - 1;
                x0.this.b.put(this.f7313a.b(), Integer.valueOf(i));
                this.f7313a.a(i);
            }
        }
    }

    public class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f7314a;

        public b(HashMap hashMap) {
            this.f7314a = hashMap;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            x0.this.a(1010, this.f7314a);
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z) {
        }
    }

    public class c implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f7315a;

        public c(HashMap hashMap) {
            this.f7315a = hashMap;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            x0.this.a(1010, this.f7315a);
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z) {
        }
    }

    public class d implements MediaPlayer.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f7316a;
        public final /* synthetic */ HashMap b;

        public d(r0 r0Var, HashMap hashMap) {
            this.f7316a = r0Var;
            this.b = hashMap;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            int a2;
            if (x0.this.b == null) {
                return;
            }
            p a3 = x0.this.a(this.f7316a.b());
            if (a3 != null) {
                y8 y8Var = a3.b;
                y8Var.e = "STATUS";
                y8Var.g = "finished";
                x0.c(a3);
                if (this.f7316a.f()) {
                    x0.this.a(this.f7316a, this.b);
                    return;
                }
            }
            if (x0.this.b.size() <= 0 || (a2 = x0.a((Map<String, Integer>) x0.this.b, this.f7316a.b())) <= 1) {
                x0.this.a(1009, this.b);
                return;
            }
            x0.this.a(this.f7316a, this.b);
            int i = a2 - 1;
            x0.this.b.put(this.f7316a.b(), Integer.valueOf(i));
            this.f7316a.a(i);
        }
    }

    public class e implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f7317a;

        public e(HashMap hashMap) {
            this.f7317a = hashMap;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            x0.this.a(1010, this.f7317a);
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z) {
        }
    }

    public class f implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f7318a;

        public f(HashMap hashMap) {
            this.f7318a = hashMap;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            x0.this.a(1010, this.f7318a);
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z) {
        }
    }

    public class g implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (x0.f != null) {
                x0.f.quit();
                HandlerThread unused = x0.f = null;
            }
        }
    }

    public class h implements Handler.Callback {
        public h() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            return false;
         */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean handleMessage(android.os.Message r3) {
            /*
                r2 = this;
                com.baidu.ar.arplay.core.engine.ARPEngine r0 = com.baidu.ar.arplay.core.engine.ARPEngine.getInstance()
                boolean r0 = r0.isEngineCanAccess()
                r1 = 0
                if (r0 != 0) goto Lc
                return r1
            Lc:
                int r0 = r3.what
                switch(r0) {
                    case 3004: goto L30;
                    case 3005: goto L2a;
                    case 3006: goto L24;
                    case 3007: goto L1e;
                    case 3008: goto L18;
                    case 3009: goto L12;
                    default: goto L11;
                }
            L11:
                goto L35
            L12:
                com.baidu.ar.x0 r0 = com.baidu.ar.x0.this
                r0.c(r3)
                goto L35
            L18:
                com.baidu.ar.x0 r0 = com.baidu.ar.x0.this
                r0.b(r3)
                goto L35
            L1e:
                com.baidu.ar.x0 r0 = com.baidu.ar.x0.this
                r0.d(r3)
                goto L35
            L24:
                com.baidu.ar.x0 r0 = com.baidu.ar.x0.this
                r0.a(r3)
                goto L35
            L2a:
                com.baidu.ar.x0 r0 = com.baidu.ar.x0.this
                r0.f(r3)
                goto L35
            L30:
                com.baidu.ar.x0 r0 = com.baidu.ar.x0.this
                r0.e(r3)
            L35:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.x0.h.handleMessage(android.os.Message):boolean");
        }
    }

    public class i implements MediaPlayer.OnCompletionListener {
        public i(x0 x0Var) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            LogUtil.b(x0.l, "initMediaPlayerInMsg onCompletion()");
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        }
    }

    public class j implements MediaPlayer.OnErrorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f7320a;

        public class a implements q {
            public a() {
            }

            @Override // com.baidu.ar.x0.q
            public void a(Exception exc) {
                x0.this.a(1010, (HashMap<String, Object>) null);
            }

            @Override // com.baidu.ar.x0.q
            public void onResult(boolean z) {
            }
        }

        public j(p pVar) {
            this.f7320a = pVar;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            LogUtil.b(x0.l, "onError: " + i);
            p pVar = this.f7320a;
            y8 y8Var = pVar.b;
            y8Var.e = "ERROR";
            y8Var.f = i;
            x0.c(pVar);
            x0.this.c(new a(), this.f7320a.b.d);
            return false;
        }
    }

    public class k implements MediaPlayer.OnPreparedListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f7322a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public k(p pVar, String str, long j) {
            this.f7322a = pVar;
            this.b = str;
            this.c = j;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            String str = x0.l;
            LogUtil.b(str, "mMediaPlayer onPrepared");
            p pVar = this.f7322a;
            y8 y8Var = pVar.b;
            y8Var.e = "STATUS";
            y8Var.g = "prepared";
            x0.c(pVar);
            if (ARPEngine.getInstance().isPaused() || x0.i == null || x0.i.get(this.b) == null) {
                return;
            }
            if (((Integer) x0.i.get(this.b)).intValue() == 3004 || ((Integer) x0.i.get(this.b)).intValue() == 3007) {
                x0.i();
                try {
                    if (this.f7322a.f7326a.getDuration() >= 0) {
                        long duration = this.f7322a.f7326a.getDuration();
                        long j = this.c;
                        if (duration > j && j >= 0) {
                            this.f7322a.f7326a.seekTo((int) j);
                        }
                        this.f7322a.f7326a.seekTo(0);
                    }
                    LogUtil.b(str, "mMediaPlayer start");
                    this.f7322a.f7326a.start();
                    this.f7322a.b.g = "playing";
                } catch (Exception e) {
                    x0.a(this.f7322a.f7326a);
                    e.printStackTrace();
                }
            }
        }
    }

    public class l implements MediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f7323a;

        public l(p pVar) {
            this.f7323a = pVar;
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            p pVar = this.f7323a;
            y8 y8Var = pVar.b;
            y8Var.e = "INFO";
            y8Var.i = i;
            x0.c(pVar);
        }
    }

    public class m implements MediaPlayer.OnInfoListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f7324a;

        public m(p pVar) {
            this.f7324a = pVar;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            String str;
            p pVar = this.f7324a;
            y8 y8Var = pVar.b;
            y8Var.e = "INFO";
            if (i == 701) {
                str = "buffer_start";
            } else {
                if (i != 702) {
                    return false;
                }
                str = "buffer_end";
            }
            y8Var.h = str;
            x0.c(pVar);
            return false;
        }
    }

    public class n extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            p pVar;
            y8 y8Var;
            if (x0.e != null) {
                for (Map.Entry entry : x0.e.entrySet()) {
                    if (entry != null && (pVar = (p) entry.getValue()) != null && (y8Var = pVar.b) != null && y8Var.g == "playing") {
                        x0.c((p) entry.getValue());
                    }
                }
            }
        }
    }

    public class o implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f7325a;

        public o(HashMap hashMap) {
            this.f7325a = hashMap;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            x0.this.a(1010, this.f7325a);
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z) {
        }
    }

    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public MediaPlayer f7326a;
        public y8 b = new y8();
    }

    public interface q {
        void a(Exception exc);

        void onResult(boolean z);
    }

    public class r implements q {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f7327a;

            public a(r rVar, boolean z) {
                this.f7327a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (x0.h != null) {
                    x0.h.onResult(this.f7327a);
                }
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Exception f7328a;

            public b(r rVar, Exception exc) {
                this.f7328a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (x0.h != null) {
                    x0.h.a(this.f7328a);
                }
            }
        }

        public r(x0 x0Var, q qVar) {
            q unused = x0.h = qVar;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            if (x0.h == null) {
                return;
            }
            x0.g.post(new b(this, exc));
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z) {
            if (x0.h == null) {
                return;
            }
            x0.g.post(new a(this, z));
        }
    }

    public x0() {
        synchronized (x0.class) {
            if (f == null) {
                HandlerThread handlerThread = new HandlerThread("MediaPlayerThread");
                f = handlerThread;
                handlerThread.start();
            } else {
                g.removeCallbacks(m);
            }
        }
        this.f7312a = new Handler(f.getLooper(), this.c);
        this.b = new Hashtable();
        i = new Hashtable();
    }

    public static int a(Map<String, Integer> map, String str) {
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static p a(p pVar, String str, String str2, AssetFileDescriptor assetFileDescriptor, MediaPlayer.OnCompletionListener onCompletionListener, int i2, String str3, long j2) {
        if ((!TextUtils.isEmpty(str2) || assetFileDescriptor != null) && pVar != null) {
            pVar.b.f7346a = a9.a((Object) str, 0L);
            y8 y8Var = pVar.b;
            y8Var.d = str;
            y8Var.b = str3;
            MediaPlayer mediaPlayer = pVar.f7326a;
            if (onCompletionListener != null) {
                mediaPlayer.setOnCompletionListener(onCompletionListener);
            }
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.seekTo(0);
                    mediaPlayer.stop();
                }
                mediaPlayer.setAudioStreamType(3);
                mediaPlayer.reset();
                if (!TextUtils.isEmpty(str2)) {
                    mediaPlayer.setDataSource(str2);
                } else if (assetFileDescriptor != null) {
                    mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                }
                mediaPlayer.prepareAsync();
                mediaPlayer.setLooping(false);
                LogUtil.b(l, "wrapper.mMediaPlayer.prepareAsync()");
                mediaPlayer.setOnPreparedListener(new k(pVar, str, j2));
                pVar.f7326a.setOnBufferingUpdateListener(new l(pVar));
                pVar.f7326a.setOnInfoListener(new m(pVar));
                return pVar;
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
            } catch (IllegalStateException e4) {
                e4.printStackTrace();
            } catch (SecurityException e5) {
                e5.printStackTrace();
            }
        }
        return pVar;
    }

    public static void a(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.release();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(y8 y8Var) {
        if (y8Var == null) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", String.valueOf(y8Var.f7346a));
        hashMap.put("target", y8Var.b);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("play_status", y8Var.g);
        hashMap2.put("buffer_status", y8Var.h);
        hashMap2.put("duration", String.valueOf(y8Var.c));
        hashMap2.put("buffer_progress", String.valueOf(y8Var.i));
        hashMap2.put("play_progress", String.valueOf((int) (y8Var.j * 100.0f)));
        hashMap.put("msg_data", hashMap2);
        ARPMessage.getInstance().sendMessage(1011, hashMap);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0039 -> B:21:0x003c). Please report as a decompilation issue!!! */
    public static void b(p pVar) {
        MediaPlayer mediaPlayer;
        if (pVar == null || (mediaPlayer = pVar.f7326a) == null) {
            return;
        }
        y8 y8Var = pVar.b;
        String str = y8Var.g;
        if (str == "playing" || str == "paused") {
            try {
                int duration = mediaPlayer.getDuration();
                y8Var.c = duration;
                if (duration <= 0) {
                    y8Var.j = 0.0f;
                } else {
                    y8Var.j = (pVar.f7326a.getCurrentPosition() * 1.0f) / y8Var.c;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (str == "finished") {
            y8Var.j = 1.0f;
        }
        if (y8Var.j > 1.0f) {
            y8Var.j = 1.0f;
        }
        if (y8Var.j < 0.0f) {
            y8Var.j = 0.0f;
        }
    }

    public static void c(p pVar) {
        if (pVar == null) {
            return;
        }
        b(pVar);
        a(pVar.b);
        y8 y8Var = pVar.b;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", Integer.valueOf(ARPMessageType.MSG_TYPE_AUDIO));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("action_id", String.valueOf(y8Var.f7346a));
        hashMap2.put("platform", "android");
        hashMap2.put("type", y8Var.e);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, Integer.valueOf(y8Var.f));
        hashMap3.put("buffer_status", y8Var.h);
        hashMap3.put("buffer_progress", Integer.valueOf(y8Var.i));
        hashMap3.put("play_status", y8Var.g);
        hashMap3.put("play_progress", Integer.valueOf((int) (y8Var.j * 100.0f)));
        hashMap2.put("data", hashMap3);
        hashMap.put("msg_data", hashMap2);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    public static synchronized x0 g() {
        x0 x0Var;
        synchronized (x0.class) {
            if (d == null) {
                d = new x0();
            }
            x0Var = d;
        }
        return x0Var;
    }

    public static synchronized void i() {
        synchronized (x0.class) {
            if (j == null) {
                j = new Timer();
                n nVar = new n();
                k = nVar;
                j.scheduleAtFixedRate(nVar, 0L, 200L);
            }
        }
    }

    public final p a(MediaPlayer.OnCompletionListener onCompletionListener, MediaPlayer.OnErrorListener onErrorListener) {
        LogUtil.b(l, "initMediaPlayerInMsg start()");
        try {
            p pVar = new p();
            MediaPlayer mediaPlayer = new MediaPlayer();
            pVar.f7326a = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            if (onCompletionListener == null) {
                onCompletionListener = new i(this);
            }
            mediaPlayer.setOnCompletionListener(onCompletionListener);
            if (onErrorListener == null) {
                onErrorListener = new j(pVar);
            }
            mediaPlayer.setOnErrorListener(onErrorListener);
            return pVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public p a(String str) {
        if (e == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return e.get(str);
    }

    public p a(String str, MediaPlayer.OnCompletionListener onCompletionListener, MediaPlayer.OnErrorListener onErrorListener) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, p> concurrentHashMap = e;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            return e.get(str);
        }
        p a2 = a(onCompletionListener, onErrorListener);
        if (a2 == null) {
            return null;
        }
        if (e == null) {
            e = new ConcurrentHashMap<>();
        }
        e.put(str, a2);
        return a2;
    }

    public void a(int i2, HashMap<String, Object> hashMap) {
        ARPMessage.getInstance().sendMessage(i2, hashMap);
    }

    public void a(Message message) {
        Object[] objArr = (Object[]) message.obj;
        q qVar = (q) objArr[0];
        String str = (String) objArr[1];
        i.put(str, Integer.valueOf(AuthApiStatusCodes.AUTH_APP_CERT_ERROR));
        try {
            p a2 = a(str);
            MediaPlayer mediaPlayer = a2.f7326a;
            if (mediaPlayer != null && a2.b.g != "unstarted" && mediaPlayer.isPlaying()) {
                y8 y8Var = a2.b;
                y8Var.e = "STATUS";
                y8Var.g = "paused";
                c(a2);
                LogUtil.b(l, "mMediaPlayer pause");
                a2.f7326a.pause();
            }
            if (qVar != null) {
                qVar.onResult(true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            if (qVar != null) {
                qVar.a(e2);
            }
        }
    }

    public void a(r0 r0Var, HashMap<String, Object> hashMap) {
        if (r0Var.c() > 1) {
            this.b.put(r0Var.b(), Integer.valueOf(r0Var.c()));
        }
        a(1002, hashMap);
        b(new o(hashMap), r0Var.b(), r0Var.e(), new a(r0Var, hashMap), r0Var.c(), r0Var.d(), r0Var.a());
    }

    public void a(q qVar, String str) {
        Message obtainMessage = this.f7312a.obtainMessage(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        obtainMessage.obj = new Object[]{new r(this, qVar), str};
        obtainMessage.sendToTarget();
    }

    public final void a(q qVar, String str, String str2, AssetFileDescriptor assetFileDescriptor, MediaPlayer.OnCompletionListener onCompletionListener, MediaPlayer.OnErrorListener onErrorListener, int i2, String str3, long j2) {
        Exception exc;
        try {
            p a2 = a(str, onCompletionListener, onErrorListener);
            if (a2 != null) {
                a(a2, str, str2, assetFileDescriptor, onCompletionListener, i2, str3, j2);
            }
            if (qVar != null) {
                qVar.onResult(true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            p a3 = a(str);
            b(str);
            try {
                MediaPlayer mediaPlayer = a3.f7326a;
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
                try {
                    p a4 = g().a(str, onCompletionListener, onErrorListener);
                    if (a4 != null) {
                        a(a4, str, str2, assetFileDescriptor, onCompletionListener, i2, str3, j2);
                    }
                    if (qVar != null) {
                        qVar.onResult(true);
                    }
                } catch (Exception e3) {
                    exc = e3;
                    exc.printStackTrace();
                    if (qVar == null) {
                        return;
                    }
                    qVar.a(exc);
                }
            } catch (Exception e4) {
                exc = e4;
                exc.printStackTrace();
                if (qVar == null) {
                }
            }
        }
    }

    public void a(q qVar, String str, String str2, MediaPlayer.OnCompletionListener onCompletionListener, int i2) {
        Message obtainMessage = this.f7312a.obtainMessage(3007);
        obtainMessage.obj = new Object[]{new r(this, qVar), str, str2, onCompletionListener, Integer.valueOf(i2)};
        obtainMessage.sendToTarget();
    }

    public final void a(q qVar, String str, String str2, MediaPlayer.OnCompletionListener onCompletionListener, int i2, String str3, long j2) {
        Exception exc;
        p a2 = a(str);
        b(str);
        if (a2 != null) {
            try {
                MediaPlayer mediaPlayer = a2.f7326a;
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
            } catch (Exception e2) {
                exc = e2;
                exc.printStackTrace();
                if (qVar == null) {
                    return;
                }
                qVar.a(exc);
            }
        }
        try {
            p a3 = a(str, onCompletionListener, null);
            if (a3 != null) {
                a(a3, str, str2, null, onCompletionListener, i2, str3, j2);
            }
            if (qVar != null) {
                qVar.onResult(true);
            }
        } catch (Exception e3) {
            exc = e3;
            exc.printStackTrace();
            if (qVar == null) {
                return;
            }
            qVar.a(exc);
        }
    }

    public void b(Message message) {
        q qVar = (q) ((Object[]) message.obj)[0];
        ConcurrentHashMap<String, p> concurrentHashMap = e;
        if (concurrentHashMap != null) {
            try {
                for (p pVar : concurrentHashMap.values()) {
                    if (pVar != null) {
                        pVar.f7326a.release();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            e.clear();
        }
        if (qVar != null) {
            qVar.onResult(true);
        }
    }

    public void b(r0 r0Var, HashMap<String, Object> hashMap) {
        a(1004, hashMap);
        a(new b(hashMap), r0Var.b());
    }

    public void b(q qVar, String str) {
        Message obtainMessage = this.f7312a.obtainMessage(3009);
        obtainMessage.obj = new Object[]{new r(this, qVar), str};
        obtainMessage.sendToTarget();
    }

    public void b(q qVar, String str, String str2, MediaPlayer.OnCompletionListener onCompletionListener, int i2, String str3, long j2) {
        Message obtainMessage = this.f7312a.obtainMessage(3004);
        obtainMessage.obj = new Object[]{new r(this, qVar), str, str2, onCompletionListener, Integer.valueOf(i2), str3, Long.valueOf(j2)};
        obtainMessage.sendToTarget();
    }

    public void b(String str) {
        if (e == null || TextUtils.isEmpty(str) || !e.containsKey(str)) {
            return;
        }
        e.remove(str);
    }

    public void c(Message message) {
        Object[] objArr = (Object[]) message.obj;
        if (objArr.length < 2) {
            return;
        }
        q qVar = (q) objArr[0];
        String str = (String) objArr[1];
        i.put(str, 3009);
        try {
            p a2 = a(str);
            if (a2 == null || a2.b.g == "unstarted") {
                return;
            }
            a2.f7326a.seekTo(0);
        } catch (Exception e2) {
            e2.printStackTrace();
            if (qVar != null) {
                qVar.a(e2);
            }
        }
    }

    public void c(r0 r0Var, HashMap<String, Object> hashMap) {
        a(1013, hashMap);
        b(new f(hashMap), r0Var.b());
    }

    public void c(q qVar, String str) {
        Message obtainMessage = this.f7312a.obtainMessage(AuthApiStatusCodes.AUTH_URL_RESOLUTION);
        obtainMessage.obj = new Object[]{new r(this, qVar), str};
        obtainMessage.sendToTarget();
    }

    public void d(Message message) {
        String str;
        long j2;
        if (ARPEngine.getInstance().isPaused()) {
            return;
        }
        Object[] objArr = (Object[]) message.obj;
        if (objArr.length < 5) {
            return;
        }
        q qVar = (q) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) objArr[3];
        int intValue = ((Integer) objArr[4]).intValue();
        if (objArr.length > 6) {
            str = (String) objArr[5];
            j2 = ((Long) objArr[6]).longValue();
        } else {
            str = null;
            j2 = 0;
        }
        long j3 = j2;
        String str4 = str;
        i.put(str2, 3007);
        try {
            p a2 = a(str2);
            if (a2 != null && !a2.f7326a.isPlaying()) {
                y8 y8Var = a2.b;
                if (y8Var.g != "unstarted") {
                    y8Var.e = "STATUS";
                    y8Var.g = "playing";
                    c(a2);
                    LogUtil.b(l, "MediaPlayer resume");
                    MediaPlayer mediaPlayer = a2.f7326a;
                    mediaPlayer.seekTo(mediaPlayer.getCurrentPosition());
                    a2.f7326a.start();
                }
            }
            if (qVar != null) {
                qVar.onResult(true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            a(qVar, str2, str3, onCompletionListener, intValue, str4, j3);
        }
    }

    public void d(r0 r0Var, HashMap<String, Object> hashMap) {
        a(1006, hashMap);
        a(new c(hashMap), r0Var.b(), r0Var.e(), new d(r0Var, hashMap), r0Var.c());
    }

    public void e(Message message) {
        Object[] objArr = (Object[]) message.obj;
        q qVar = (q) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) objArr[3];
        int intValue = ((Integer) objArr[4]).intValue();
        String str3 = (String) objArr[5];
        long longValue = ((Long) objArr[6]).longValue();
        i.put(str, 3004);
        a(qVar, str, str2, null, onCompletionListener, null, intValue, str3, longValue);
    }

    public void e(r0 r0Var, HashMap<String, Object> hashMap) {
        a(1008, hashMap);
        c(new e(hashMap), r0Var.b());
    }

    public void f(Message message) {
        Object[] objArr = (Object[]) message.obj;
        q qVar = (q) objArr[0];
        String str = (String) objArr[1];
        i.put(str, Integer.valueOf(AuthApiStatusCodes.AUTH_URL_RESOLUTION));
        p a2 = a(str);
        if (a2 != null) {
            try {
                y8 y8Var = a2.b;
                y8Var.e = "STATUS";
                y8Var.g = "unstarted";
                c(a2);
                LogUtil.b(l, "mMediaPlayer stopPlay");
                a(a2.f7326a);
                a2.f7326a = null;
                b(str);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (qVar != null) {
                    qVar.a(e2);
                    return;
                }
                return;
            }
        }
        if (qVar != null) {
            qVar.onResult(true);
        }
    }

    public void h() {
        this.c = null;
        Timer timer = j;
        if (timer != null) {
            timer.cancel();
            j.purge();
            j = null;
            k.cancel();
            k = null;
        }
        Map<String, Integer> map = i;
        if (map != null) {
            map.clear();
        }
        ConcurrentHashMap<String, p> concurrentHashMap = e;
        if (concurrentHashMap != null) {
            try {
                for (p pVar : concurrentHashMap.values()) {
                    y8 y8Var = pVar.b;
                    y8Var.e = "STATUS";
                    y8Var.g = "unstarted";
                    a(pVar.f7326a);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            ConcurrentHashMap<String, p> concurrentHashMap2 = e;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.clear();
            }
        }
        Map<String, Integer> map2 = this.b;
        if (map2 != null) {
            map2.clear();
        }
    }
}
