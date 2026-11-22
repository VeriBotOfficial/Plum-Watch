package com.wakeup.module.play;

import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.module.play.models.AudioEntity;
import kotlin.Metadata;

/* compiled from: AudioPlayListener.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/wakeup/module/play/AudioPlayListener;", "", "onProgressChange", "", "progress", "", "duration", "onMusicPlayStateChange", "isPlay", "", Const.LBS_FAIL_BD_ENTITY, "Lcom/wakeup/module/play/models/AudioEntity;", "onPrepared", "module-play_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AudioPlayListener {
    void onMusicPlayStateChange(boolean isPlay, AudioEntity entity);

    void onPrepared();

    void onProgressChange(int progress, int duration);
}
