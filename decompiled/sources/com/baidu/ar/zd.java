package com.baidu.ar;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.Surface;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.arplay.core.message.ARPMessageType;
import com.baidu.ar.arplay.util.LogUtil;
import com.baidu.ar.arplay.util.c;
import com.baidu.mapapi.SDKInitializer;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class zd {
    public static zd f = null;
    public static final String g = "zd";
    public Timer c;
    public TimerTask d;

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<String, m> f7367a = new ConcurrentHashMap<>();
    public com.baidu.ar.arplay.util.a e = new c();
    public Map<String, Integer> b = new Hashtable();

    public class a implements l {
        public a(zd zdVar, HashMap hashMap) {
        }
    }

    public class b implements l {
        public b(zd zdVar, HashMap hashMap) {
        }
    }

    public class c implements com.baidu.ar.arplay.util.a {
        public c() {
        }

        @Override // com.baidu.ar.arplay.util.a
        public void a() {
            zd.this.a((l) null, true);
        }

        @Override // com.baidu.ar.arplay.util.a
        public void a(c.a aVar) {
            zd.this.b((l) null, true);
        }
    }

    public class d implements MediaPlayer.OnErrorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f7369a;

        public d(zd zdVar, m mVar) {
            this.f7369a = mVar;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            m mVar = this.f7369a;
            y8 y8Var = mVar.e;
            y8Var.e = "ERROR";
            y8Var.f = i;
            zd.c(mVar);
            return true;
        }
    }

    public class e implements MediaPlayer.OnPreparedListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f7370a;
        public final /* synthetic */ long b;

        public e(m mVar, long j) {
            this.f7370a = mVar;
            this.b = j;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            String str = zd.g;
            LogUtil.b(str, "mMediaPlayer onPrepared");
            m mVar = this.f7370a;
            y8 y8Var = mVar.e;
            y8Var.e = "STATUS";
            y8Var.g = "prepared";
            zd.c(mVar);
            if (ARPEngine.getInstance().isEngineCanAccess() && !ARPEngine.getInstance().isPaused()) {
                zd.this.e();
                try {
                    if (this.f7370a.f7375a.getDuration() >= 0) {
                        long duration = this.f7370a.f7375a.getDuration();
                        long j = this.b;
                        if (duration > j && j >= 0) {
                            this.f7370a.f7375a.seekTo((int) j);
                        }
                        this.f7370a.f7375a.seekTo(0);
                    }
                    LogUtil.b(str, "mMediaPlayer start");
                    this.f7370a.f7375a.start();
                    this.f7370a.e.g = "playing";
                } catch (Exception e) {
                    e.fillInStackTrace();
                }
            }
        }
    }

    public class f implements MediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f7371a;

        public f(zd zdVar, m mVar) {
            this.f7371a = mVar;
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            m mVar = this.f7371a;
            y8 y8Var = mVar.e;
            y8Var.e = "INFO";
            y8Var.i = i;
            zd.c(mVar);
        }
    }

    public class g implements MediaPlayer.OnInfoListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f7372a;

        public g(zd zdVar, m mVar) {
            this.f7372a = mVar;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            String str;
            m mVar = this.f7372a;
            y8 y8Var = mVar.e;
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
            zd.c(mVar);
            return false;
        }
    }

    public class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            m mVar;
            y8 y8Var;
            if (zd.this.f7367a != null) {
                for (Map.Entry entry : zd.this.f7367a.entrySet()) {
                    if (entry != null && (mVar = (m) entry.getValue()) != null && (y8Var = mVar.e) != null && y8Var.g == "playing") {
                        zd.c((m) entry.getValue());
                    }
                }
            }
        }
    }

    public class i implements l {
        public i(zd zdVar, HashMap hashMap) {
        }
    }

    public class j implements MediaPlayer.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ xd f7374a;
        public final /* synthetic */ HashMap b;

        public j(xd xdVar, HashMap hashMap) {
            this.f7374a = xdVar;
            this.b = hashMap;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            xd xdVar;
            zd zdVar;
            int a2;
            if (zd.this.b == null || (xdVar = this.f7374a) == null) {
                return;
            }
            m b = zd.this.b(xdVar.b());
            if (b != null) {
                y8 y8Var = b.e;
                y8Var.e = "STATUS";
                y8Var.g = "finished";
                zd.c(b);
                if (this.f7374a.g()) {
                    zd.this.a(this.f7374a, this.b);
                    return;
                }
            }
            if (zd.this.b.size() <= 0 || (a2 = (zdVar = zd.this).a(zdVar.b, this.f7374a.b())) <= 1) {
                zd.this.a(1030, this.b);
                return;
            }
            int i = a2 - 1;
            zd.this.b.put(this.f7374a.b(), Integer.valueOf(i));
            this.f7374a.a(i);
            zd.this.a(this.f7374a, this.b);
        }
    }

    public class k implements l {
        public k(zd zdVar, HashMap hashMap) {
        }
    }

    public interface l {
    }

    public static class m {

        /* renamed from: a, reason: collision with root package name */
        public MediaPlayer f7375a;
        public SurfaceTexture b;
        public int c;
        public boolean d = false;
        public y8 e = new y8();
    }

    public zd() {
        com.baidu.ar.arplay.util.b.a(this.e);
    }

    public static synchronized zd a() {
        zd zdVar;
        synchronized (zd.class) {
            if (f == null) {
                f = new zd();
            }
            zdVar = f;
        }
        return zdVar;
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
        ARPMessage.getInstance().sendMessage(1031, hashMap);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0039 -> B:21:0x003c). Please report as a decompilation issue!!! */
    public static void b(m mVar) {
        MediaPlayer mediaPlayer;
        if (mVar == null || (mediaPlayer = mVar.f7375a) == null) {
            return;
        }
        y8 y8Var = mVar.e;
        String str = y8Var.g;
        if (str == "playing" || str == "paused") {
            try {
                int duration = mediaPlayer.getDuration();
                y8Var.c = duration;
                if (duration <= 0) {
                    y8Var.j = 0.0f;
                } else {
                    y8Var.j = (mVar.f7375a.getCurrentPosition() * 1.0f) / y8Var.c;
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

    public static void c() {
        f = null;
    }

    public static void c(m mVar) {
        if (mVar == null) {
            return;
        }
        b(mVar);
        a(mVar.e);
        y8 y8Var = mVar.e;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", Integer.valueOf(ARPMessageType.MSG_TYPE_VIDEO));
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

    public int a(Map<String, Integer> map, String str) {
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final MediaPlayer a(String str) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f7367a;
        if (concurrentHashMap == null || concurrentHashMap.get(str) == null) {
            return null;
        }
        return this.f7367a.get(str).f7375a;
    }

    public void a(int i2, HashMap<String, Object> hashMap) {
        ARPMessage.getInstance().sendMessage(i2, hashMap);
    }

    public void a(xd xdVar, HashMap<String, Object> hashMap) {
        if (xdVar.c() > 1) {
            this.b.put(xdVar.b(), Integer.valueOf(xdVar.c()));
        }
        a(1022, hashMap);
        a(new i(this, hashMap), xdVar.b(), xdVar.f(), new j(xdVar, hashMap), xdVar.e(), xdVar.c(), xdVar.d(), xdVar.a());
    }

    public void a(l lVar, String str) {
        if (ARPEngine.getInstance().isPaused()) {
            return;
        }
        MediaPlayer a2 = a(str);
        m b2 = b(str);
        if (b2 == null) {
            return;
        }
        String str2 = b2.e.g;
        if ((str2 == "paused" || str2 == "prepared") && a2 != null) {
            LogUtil.b(g, "mMediaPlayer start");
            e();
            a2.start();
            y8 y8Var = b2.e;
            y8Var.e = "STATUS";
            y8Var.g = "playing";
            c(b2);
        }
    }

    public final void a(l lVar, String str, String str2, int i2, MediaPlayer.OnCompletionListener onCompletionListener, boolean z, String str3, long j2) {
        MediaPlayer mediaPlayer;
        try {
            if (this.f7367a.containsKey(str)) {
                m mVar = this.f7367a.get(str);
                if (mVar == null || (mediaPlayer = mVar.f7375a) == null) {
                    return;
                }
                mediaPlayer.reset();
                mVar.f7375a.setDataSource(str2);
                mVar.f7375a.setLooping(z);
                mVar.f7375a.setOnCompletionListener(onCompletionListener);
                mVar.f7375a.prepareAsync();
                return;
            }
            m mVar2 = new m();
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            mVar2.f7375a = mediaPlayer2;
            mediaPlayer2.setDataSource(str2);
            mVar2.c = i2;
            mVar2.b = new SurfaceTexture(i2);
            mVar2.e.f7346a = Long.valueOf(str).longValue();
            mVar2.e.b = str3;
            mVar2.f7375a.setSurface(new Surface(mVar2.b));
            mVar2.f7375a.setOnCompletionListener(onCompletionListener);
            mVar2.f7375a.setOnErrorListener(new d(this, mVar2));
            mVar2.f7375a.setLooping(z);
            mVar2.f7375a.prepareAsync();
            LogUtil.b(g, "wrapper.mMediaPlayer.prepareAsync()");
            mVar2.f7375a.setOnPreparedListener(new e(mVar2, j2));
            mVar2.f7375a.setOnBufferingUpdateListener(new f(this, mVar2));
            mVar2.f7375a.setOnInfoListener(new g(this, mVar2));
            ConcurrentHashMap<String, m> concurrentHashMap = this.f7367a;
            if (concurrentHashMap == null || str == null) {
                return;
            }
            concurrentHashMap.put(str, mVar2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(l lVar, String str, String str2, MediaPlayer.OnCompletionListener onCompletionListener, int i2, int i3, String str3, long j2) {
        a(lVar, str, str2, i2, onCompletionListener, false, str3, j2);
    }

    public void a(l lVar, String str, boolean z) {
        MediaPlayer a2 = a(str);
        if (a2 != null) {
            try {
                if (a2.isPlaying()) {
                    m b2 = b(str);
                    if (b2 != null) {
                        y8 y8Var = b2.e;
                        y8Var.e = "STATUS";
                        y8Var.g = "paused";
                        b2.d = z;
                        c(b2);
                    }
                    LogUtil.b(g, "mMediaPlayer pause");
                    a2.pause();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(l lVar, boolean z) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f7367a;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                a(lVar, it.next().getKey(), z);
            }
        }
    }

    public void a(String str, int i2) {
        m mVar = this.f7367a.get(str);
        if (mVar != null) {
            mVar.b = new SurfaceTexture(i2);
            try {
                mVar.f7375a.setSurface(new Surface(mVar.b));
            } catch (Exception unused) {
                Log.i("VideoPlayerManager", "MediaPlayer setSurface failed.");
            }
            mVar.c = i2;
        }
    }

    public m b(String str) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f7367a;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public synchronized void b() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c.purge();
            this.c = null;
            TimerTask timerTask = this.d;
            if (timerTask != null) {
                timerTask.cancel();
                this.d = null;
            }
        }
        com.baidu.ar.arplay.util.b.b(this.e);
        d();
        c();
    }

    public void b(xd xdVar, HashMap<String, Object> hashMap) {
        a(1024, hashMap);
        a(new k(this, hashMap), xdVar.b(), false);
    }

    public void b(l lVar, String str) {
        m b2 = b(str);
        if (b2 != null) {
            y8 y8Var = b2.e;
            y8Var.e = "STATUS";
            y8Var.g = "unstarted";
            c(b2);
        }
        MediaPlayer a2 = a(str);
        if (a2 != null) {
            LogUtil.b(g, "mMediaPlayer stopPlay");
            x0.a(a2);
            e(str);
        }
    }

    public void b(l lVar, boolean z) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f7367a;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, m> entry : concurrentHashMap.entrySet()) {
                if (!z || (entry != null && entry.getValue() != null && entry.getValue().d)) {
                    a(lVar, entry.getKey());
                }
            }
        }
    }

    public int c(String str) {
        m b2 = b(str);
        if (b2 != null) {
            return b2.c;
        }
        return 0;
    }

    public void c(xd xdVar, HashMap<String, Object> hashMap) {
        a(1026, hashMap);
        LogUtil.b(g, "mMediaPlayer resumeVideo");
        a(new a(this, hashMap), xdVar.b());
    }

    public SurfaceTexture d(String str) {
        m mVar;
        ConcurrentHashMap<String, m> concurrentHashMap = this.f7367a;
        if (concurrentHashMap == null || (mVar = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return mVar.b;
    }

    public void d() {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f7367a;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, m> entry : concurrentHashMap.entrySet()) {
                if (entry != null) {
                    b((l) null, entry.getKey());
                    entry.getValue().b = null;
                    entry.getValue().e.e = "STATUS";
                    entry.getValue().e.g = "unstarted";
                    entry.getValue().d = false;
                    c(entry.getValue());
                    MediaPlayer mediaPlayer = entry.getValue().f7375a;
                    if (mediaPlayer != null) {
                        try {
                            LogUtil.b(g, "releaseMediaPlayer");
                            mediaPlayer.release();
                        } catch (Exception unused) {
                            System.out.println("player release Exception");
                        }
                    }
                }
            }
            this.f7367a.clear();
        }
    }

    public void d(xd xdVar, HashMap<String, Object> hashMap) {
        a(1028, hashMap);
        b(new b(this, hashMap), xdVar.b());
    }

    public final synchronized void e() {
        if (this.c == null) {
            this.c = new Timer();
            h hVar = new h();
            this.d = hVar;
            this.c.scheduleAtFixedRate(hVar, 0L, 200L);
        }
    }

    public final void e(String str) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f7367a;
        if (concurrentHashMap == null || concurrentHashMap.get(str) == null) {
            return;
        }
        this.f7367a.remove(str);
    }
}
