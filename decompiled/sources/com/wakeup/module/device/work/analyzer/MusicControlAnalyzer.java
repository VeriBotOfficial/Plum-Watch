package com.wakeup.module.device.work.analyzer;

import android.media.AudioManager;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.DeviceDao;
import com.wakeup.commponent.module.device.BleOrderAnalyzer;
import java.util.List;

/* loaded from: classes4.dex */
public class MusicControlAnalyzer implements BleOrderAnalyzer {
    private static final String TAG = "MusicControlAnalyzer";

    @Override // com.wakeup.commponent.module.device.BleOrderAnalyzer
    public void analyzeOrder(String str, byte[] bArr, List<Integer> list) {
        if (DeviceDao.isSupport(18) && list.size() >= 7) {
            int intValue = list.get(4).intValue();
            if (intValue == 153) {
                int intValue2 = list.get(6).intValue();
                LogUtils.i(TAG, "音乐控制    " + intValue2);
                if (intValue2 == 0) {
                    LogUtils.i(TAG, "播放歌曲");
                    controlMusic(85);
                    return;
                } else if (intValue2 == 1) {
                    LogUtils.i(TAG, "上一首歌曲");
                    controlMusic(88);
                    return;
                } else {
                    if (intValue2 != 2) {
                        return;
                    }
                    LogUtils.i(TAG, "下一首歌曲");
                    controlMusic(87);
                    return;
                }
            }
            if (intValue == 157) {
                int intValue3 = list.get(6).intValue();
                Log.e(TAG, "新音乐控制    " + intValue3);
                if (intValue3 == 0) {
                    Log.e(TAG, "播放歌曲");
                    controlMusic(126);
                    return;
                }
                if (intValue3 == 1) {
                    Log.e(TAG, "暂停歌曲");
                    controlMusic(127);
                } else if (intValue3 == 2) {
                    Log.e(TAG, "上一首歌曲");
                    controlMusic(88);
                } else {
                    if (intValue3 != 3) {
                        return;
                    }
                    Log.e(TAG, "下一首歌曲");
                    controlMusic(87);
                }
            }
        }
    }

    public static void controlMusic(int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        KeyEvent keyEvent = new KeyEvent(uptimeMillis, uptimeMillis, 0, i, 0);
        dispatchMediaKeyToAudioService(keyEvent);
        dispatchMediaKeyToAudioService(KeyEvent.changeAction(keyEvent, 1));
    }

    public static void dispatchMediaKeyToAudioService(KeyEvent keyEvent) {
        try {
            AudioManager audioManager = (AudioManager) BaseApplication.getContext().getSystemService("audio");
            if (audioManager == null) {
                return;
            }
            audioManager.dispatchMediaKeyEvent(keyEvent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
