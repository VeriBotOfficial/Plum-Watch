package com.wakeup.module.sound;

import android.content.Context;
import com.wakeup.commponent.ServiceManager;
import com.wakeup.commponent.api.SoundService;
import com.wakeup.module.ai.robot.AiRobotHelper;
import com.wakeup.module.ai.simInter.SimInterSessionMgr;
import com.wakeup.module.ai.trans.AiOneTransHelper;
import com.wakeup.module.ai.trans.JacketTransHelper;
import com.wakeup.module.sound.music.AiMusicDeviceHelper;
import com.wakeup.module.sound.order.SoundAnalyzer;
import kotlin.Metadata;

/* compiled from: SoundServiceImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/wakeup/module/sound/SoundServiceImpl;", "Lcom/wakeup/commponent/api/SoundService;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "feature-sound_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SoundServiceImpl implements SoundService {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        ServiceManager.getDeviceService().addAnalyzer(new SoundAnalyzer());
        AiOneTransHelper.INSTANCE.init();
        JacketTransHelper.INSTANCE.init();
        SimInterSessionMgr.INSTANCE.init();
        AiRobotHelper.INSTANCE.init();
        AiMusicDeviceHelper.INSTANCE.init();
    }
}
