package com.wakeup.common.utils;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.blankj.utilcode.util.CollectionUtils;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioFocusUtils.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0003J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\nJ\b\u0010\u0014\u001a\u00020\rH\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/utils/AudioFocusUtils;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "<init>", "()V", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "mAudioManager", "Landroid/media/AudioManager;", "listenerList", "Ljava/util/ArrayList;", "Lcom/wakeup/common/utils/AudioFocusCallback;", "Lkotlin/collections/ArrayList;", "onAudioFocusChange", "", "focusChange", "", "requestAudioFocus", MiPushClient.COMMAND_REGISTER, "callback", MiPushClient.COMMAND_UNREGISTER, "abandonAudioFocus", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioFocusUtils implements AudioManager.OnAudioFocusChangeListener {
    private static AudioFocusRequest audioFocusRequest;
    private static AudioManager mAudioManager;
    public static final AudioFocusUtils INSTANCE = new AudioFocusUtils();
    private static final ArrayList<AudioFocusCallback> listenerList = new ArrayList<>();

    private AudioFocusUtils() {
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        LogUtils.d("AudioFocusUtils", "focusChange = " + focusChange);
        if (focusChange == -3) {
            Iterator<T> it = listenerList.iterator();
            while (it.hasNext()) {
                ((AudioFocusCallback) it.next()).audioFocusLossCanDuck();
            }
        } else if (focusChange == -2 || focusChange == -1) {
            Iterator<T> it2 = listenerList.iterator();
            while (it2.hasNext()) {
                ((AudioFocusCallback) it2.next()).audioFocusLoss();
            }
        } else {
            if (focusChange != 1) {
                return;
            }
            Iterator<T> it3 = listenerList.iterator();
            while (it3.hasNext()) {
                ((AudioFocusCallback) it3.next()).getGainFocus();
            }
        }
    }

    private final void requestAudioFocus() {
        AudioManager audioManager;
        if (mAudioManager == null) {
            Object systemService = BaseApplication.getContext().getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            mAudioManager = (AudioManager) systemService;
        }
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(2).setContentType(1).build();
        if (audioFocusRequest == null) {
            audioFocusRequest = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this).setAudioAttributes(build).build();
        }
        AudioFocusRequest audioFocusRequest2 = audioFocusRequest;
        if (audioFocusRequest2 == null || (audioManager = mAudioManager) == null) {
            return;
        }
        audioManager.requestAudioFocus(audioFocusRequest2);
    }

    public final void register(AudioFocusCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        requestAudioFocus();
        ArrayList<AudioFocusCallback> arrayList = listenerList;
        if (arrayList.contains(callback)) {
            return;
        }
        arrayList.add(callback);
    }

    public final void unregister(AudioFocusCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList<AudioFocusCallback> arrayList = listenerList;
        arrayList.remove(callback);
        if (CollectionUtils.isEmpty(arrayList)) {
            abandonAudioFocus();
        }
    }

    private final void abandonAudioFocus() {
        AudioManager audioManager;
        AudioFocusRequest audioFocusRequest2 = audioFocusRequest;
        if (audioFocusRequest2 != null) {
            if (audioFocusRequest2 != null && (audioManager = mAudioManager) != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest2);
            }
            mAudioManager = null;
            audioFocusRequest = null;
        }
    }
}
