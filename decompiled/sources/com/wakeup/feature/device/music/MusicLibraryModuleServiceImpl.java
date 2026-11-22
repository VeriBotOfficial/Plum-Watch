package com.wakeup.feature.device.music;

import android.content.Context;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.module.device.music.MusicLibraryModuleService;
import com.wakeup.module.play.AudioPlayManager;
import kotlin.Metadata;

/* compiled from: MusicLibraryModuleServiceImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/wakeup/feature/device/music/MusicLibraryModuleServiceImpl;", "Lcom/wakeup/commponent/module/device/music/MusicLibraryModuleService;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "clearPlay", "", "init", "context", "Landroid/content/Context;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MusicLibraryModuleServiceImpl implements MusicLibraryModuleService {
    private final String TAG = "MusicLibraryModuleServiceImpl";

    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.wakeup.commponent.module.device.music.MusicLibraryModuleService
    public void clearPlay() {
        LogUtils.i(this.TAG, "clearPlay");
        if (AudioPlayManager.INSTANCE.isPlaying()) {
            AudioPlayManager.INSTANCE.finishPlay();
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        LogUtils.i(this.TAG, "init");
    }
}
