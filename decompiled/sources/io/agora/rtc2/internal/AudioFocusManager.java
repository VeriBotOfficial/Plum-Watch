package io.agora.rtc2.internal;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import io.agora.base.internal.voiceengine.WebRtcAudioUtils;
import io.agora.utils2.internal.Logging;
import java.util.Random;

/* loaded from: classes6.dex */
public class AudioFocusManager {
    private static final String TAG = "AudioFocusManager";
    private AudioFocusChangeListenerImpl mAudioFocusChangeListenerImpl;
    private AudioManager mAudioManager;
    private AudioFocusRequest mFocusRequest;
    private Handler mHandler;

    class AudioFocusChangeListenerImpl implements AudioManager.OnAudioFocusChangeListener {
        AudioFocusChangeListenerImpl() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int focusChange) {
            Logging.d(AudioFocusManager.TAG, "onAudioFocusChange and focusChange: " + focusChange);
            if (focusChange == -3 || focusChange == -2 || focusChange == -1) {
                AudioFocusManager.this.requestAudioFocus();
            }
        }
    }

    public AudioFocusManager(Context context) {
        Logging.d(TAG, " ctor()");
        this.mAudioFocusChangeListenerImpl = new AudioFocusChangeListenerImpl();
        HandlerThread handlerThread = new HandlerThread("AudioFocusManager-" + new Random().nextInt());
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
        if (context != null) {
            this.mAudioManager = (AudioManager) context.getSystemService("audio");
        }
    }

    private boolean abandonAudioFocusOnOreoOrHigher() {
        AudioFocusRequest audioFocusRequest = this.mFocusRequest;
        return (audioFocusRequest != null ? this.mAudioManager.abandonAudioFocusRequest(audioFocusRequest) : 1) == 1;
    }

    private boolean requestAudioFocusOnOreoOrHigher() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
        if (this.mFocusRequest == null) {
            this.mFocusRequest = new AudioFocusRequest.Builder(3).setAudioAttributes(build).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this.mAudioFocusChangeListenerImpl, this.mHandler).build();
        }
        return this.mAudioManager.requestAudioFocus(this.mFocusRequest) == 1;
    }

    public synchronized boolean abandonAudioFocus() {
        String str = TAG;
        Logging.d(str, "abandonAudioFocus()");
        if (this.mAudioManager == null) {
            Logging.w(str, "abandonAudioFocus failed as audioManager is null");
            return false;
        }
        boolean abandonAudioFocusOnOreoOrHigher = WebRtcAudioUtils.runningOnOreoOrHigher() ? abandonAudioFocusOnOreoOrHigher() : abandonAudioFocusOnLowerThanOreo();
        Logging.d(str, "abandonAudioFocus successful: " + abandonAudioFocusOnOreoOrHigher);
        return abandonAudioFocusOnOreoOrHigher;
    }

    boolean abandonAudioFocusOnLowerThanOreo() {
        return this.mAudioManager.abandonAudioFocus(this.mAudioFocusChangeListenerImpl) == 1;
    }

    public void dispose() {
        Logging.d(TAG, "dispose()");
        abandonAudioFocus();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.getLooper().quit();
            this.mHandler = null;
        }
        this.mAudioManager = null;
        this.mAudioFocusChangeListenerImpl = null;
    }

    AudioFocusChangeListenerImpl getAudioFocusChangeListenerImpl() {
        return this.mAudioFocusChangeListenerImpl;
    }

    public synchronized boolean requestAudioFocus() {
        String str = TAG;
        Logging.d(str, "requestAudioFocus()");
        if (this.mAudioManager == null) {
            Logging.w(str, "requestAudioFocus failed as audioManager is null");
            return false;
        }
        boolean requestAudioFocusOnOreoOrHigher = WebRtcAudioUtils.runningOnOreoOrHigher() ? requestAudioFocusOnOreoOrHigher() : requestAudioFocusOnLowerThanOreo();
        Logging.d(str, "requestAudioFocus successful: " + requestAudioFocusOnOreoOrHigher);
        return requestAudioFocusOnOreoOrHigher;
    }

    boolean requestAudioFocusOnLowerThanOreo() {
        return this.mAudioManager.requestAudioFocus(this.mAudioFocusChangeListenerImpl, 3, 3) == 1;
    }
}
