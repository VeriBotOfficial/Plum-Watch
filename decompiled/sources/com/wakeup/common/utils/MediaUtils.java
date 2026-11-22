package com.wakeup.common.utils;

import android.media.MediaPlayer;
import com.wakeup.common.log.LogUtils;

/* loaded from: classes2.dex */
public class MediaUtils {
    private static final String TAG = "MediaUtils";

    private MediaUtils() {
    }

    public static int getAudioDuration(String path) {
        int i;
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            try {
                mediaPlayer.setDataSource(path);
                mediaPlayer.prepare();
                i = mediaPlayer.getDuration() / 1000;
            } finally {
                try {
                    mediaPlayer.release();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            LogUtils.e(TAG, "getDuration");
            try {
                mediaPlayer.release();
            } catch (Exception unused3) {
            }
            i = -1;
        }
        return i;
    }
}
