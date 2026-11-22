package com.wakeup.feature.device.music;

import com.wakeup.common.network.entity.baidu.AudioModel;
import com.wakeup.common.network.entity.music.library.MusicLibraryEntity;
import com.wakeup.common.storage.CacheManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiAudioCacheMgr.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0014\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/device/music/AiAudioCacheMgr;", "", "<init>", "()V", AiAudioCacheMgr.CACHE_AI_AUDIO_CLASS_, "", AiAudioCacheMgr.CACHE_AI_AUDIO, "saveMusicByClassData", "", "classId", "", "data", "", "Lcom/wakeup/common/network/entity/music/library/MusicLibraryEntity;", "getMusicByClassData", "Lcom/wakeup/feature/device/music/AiAudioCacheMgr$CacheMusicByClassBean;", "saveAiMusic", "aiMusic", "Lcom/wakeup/common/network/entity/baidu/AudioModel;", "getAiMusic", "clearAiMusic", "CacheMusicByClassBean", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AiAudioCacheMgr {
    private static final String CACHE_AI_AUDIO = "CACHE_AI_AUDIO";
    private static final String CACHE_AI_AUDIO_CLASS_ = "CACHE_AI_AUDIO_CLASS_";
    public static final AiAudioCacheMgr INSTANCE = new AiAudioCacheMgr();

    private AiAudioCacheMgr() {
    }

    public final void saveMusicByClassData(int classId, List<MusicLibraryEntity> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        CacheManager.INSTANCE.saveData(CACHE_AI_AUDIO_CLASS_ + classId, new CacheMusicByClassBean(System.currentTimeMillis(), data));
    }

    public final CacheMusicByClassBean getMusicByClassData(int classId) {
        return (CacheMusicByClassBean) CacheManager.INSTANCE.getData(CACHE_AI_AUDIO_CLASS_ + classId, CacheMusicByClassBean.class);
    }

    /* compiled from: AiAudioCacheMgr.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/feature/device/music/AiAudioCacheMgr$CacheMusicByClassBean;", "", "time", "", "data", "", "Lcom/wakeup/common/network/entity/music/library/MusicLibraryEntity;", "<init>", "(JLjava/util/List;)V", "getTime", "()J", "getData", "()Ljava/util/List;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CacheMusicByClassBean {
        private final List<MusicLibraryEntity> data;
        private final long time;

        public CacheMusicByClassBean(long j, List<MusicLibraryEntity> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.time = j;
            this.data = data;
        }

        public final List<MusicLibraryEntity> getData() {
            return this.data;
        }

        public final long getTime() {
            return this.time;
        }
    }

    public final void saveAiMusic(AudioModel aiMusic) {
        Intrinsics.checkNotNullParameter(aiMusic, "aiMusic");
        CacheManager.INSTANCE.saveData(CACHE_AI_AUDIO, aiMusic);
    }

    public final AudioModel getAiMusic() {
        return (AudioModel) CacheManager.INSTANCE.getData(CACHE_AI_AUDIO, AudioModel.class);
    }

    public final void clearAiMusic() {
        CacheManager.INSTANCE.remove(CACHE_AI_AUDIO);
    }
}
