package com.baidu.platform.comapi.wnplatform.tts;

import android.content.Context;
import android.media.AudioManager;
import com.baidu.mapapi.tts.WNTTSManager;
import com.baidu.mapapi.tts.WNTTsInitConfig;
import com.baidu.navisdk.tts.BNTTS;
import com.baidu.navisdk.tts.BNTTSPlayer;
import com.baidu.navisdk.tts.ITTSInitListener;
import com.baidu.navisdk.tts.OnTTSStateChangedListener;
import com.baidu.platform.comapi.wnplatform.WorkModeConfig;
import com.baidu.platform.comjni.jninative.tts.WNaviTTSPlayer;
import java.lang.reflect.Method;

/* loaded from: classes13.dex */
public abstract class BaseTTSPlayer extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8966a = false;
    public static Context b = null;
    private static boolean c = false;
    public static AudioManager.OnAudioFocusChangeListener d = new AudioManager.OnAudioFocusChangeListener() { // from class: com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer.3
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -2 || i == -1) {
                BaseTTSPlayer.b();
            }
        }
    };

    public static void a(WNTTsInitConfig wNTTsInitConfig, WNTTSManager.IWNOuterTTSPlayerCallback iWNOuterTTSPlayerCallback) {
        if (iWNOuterTTSPlayerCallback != null) {
            f8966a = true;
            WNaviTTSPlayer.addOutTTSPlayerListener(iWNOuterTTSPlayerCallback);
        } else {
            if (wNTTsInitConfig == null) {
                return;
            }
            try {
                f8966a = false;
                BNTTS.init(wNTTsInitConfig.context, wNTTsInitConfig.appKey, wNTTsInitConfig.secretKey, wNTTsInitConfig.authsn, new ITTSInitListener() { // from class: com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer.1
                    public void onFail(int i) {
                    }

                    public void onSuccess() {
                    }
                });
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public static boolean b() {
        Context context = b;
        if (context == null || !c) {
            return false;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return true;
            }
            audioManager.abandonAudioFocus(d);
            c = false;
            return true;
        } catch (Exception e) {
            e.getMessage();
            return true;
        }
    }

    public static boolean c() {
        Context context = b;
        if (context == null) {
            return false;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null && audioManager.requestAudioFocus(d, 3, 3) == 1) {
                c = true;
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return false;
    }

    public abstract void a(b bVar);

    public static void a(final WNTTSManager.IOnTTSPlayStateChangedListener iOnTTSPlayStateChangedListener) {
        if (iOnTTSPlayStateChangedListener == null) {
            return;
        }
        try {
            if (f8966a) {
                return;
            }
            BNTTS.setOnTTSStateChangedListener(new OnTTSStateChangedListener() { // from class: com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer.2
                public void onPlayEnd(String str) {
                    WNTTSManager.IOnTTSPlayStateChangedListener.this.onPlayEnd(str);
                    BaseTTSPlayer.b();
                }

                public void onPlayError(int i, String str) {
                    WNTTSManager.IOnTTSPlayStateChangedListener.this.onPlayError(i, str);
                }

                public void onPlayStart() {
                    WNTTSManager.IOnTTSPlayStateChangedListener.this.onPlayStart();
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void a(WNTTSManager.IWNOuterTTSPlayerCallback iWNOuterTTSPlayerCallback) {
        WNaviTTSPlayer.removeOutTTSPlayerListener(iWNOuterTTSPlayerCallback);
    }

    public static int a(String str, boolean z) {
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (WorkModeConfig.b().g()) {
            return 0;
        }
        c();
        Class<?> cls = Class.forName("com.baidu.navisdk.tts.BNTTSPlayer");
        BNTTSPlayer bNTTSPlayer = BNTTSPlayer.getInstance();
        if (bNTTSPlayer != null) {
            Method declaredMethod = cls.getDeclaredMethod("playTTSText", String.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(bNTTSPlayer, str, Boolean.valueOf(z))).intValue();
        }
        return 0;
    }
}
