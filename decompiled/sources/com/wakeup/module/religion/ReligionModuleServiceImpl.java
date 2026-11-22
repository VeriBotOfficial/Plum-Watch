package com.wakeup.module.religion;

import android.content.Context;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.entity.qibla.PrayerTimeBean;
import com.wakeup.common.storage.DeviceDao;
import com.wakeup.commponent.ServiceManager;
import com.wakeup.commponent.module.device.qibla.ReligionModuleService;
import com.wakeup.module.religion.ble.MuslimAnalyzer;
import com.wakeup.module.religion.ble.MuslimBle;
import com.wakeup.module.religion.util.KoranPlayerManager;
import com.wakeup.module.religion.util.ReligionPrayerTimeHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReligionModuleServiceImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/religion/ReligionModuleServiceImpl;", "Lcom/wakeup/commponent/module/device/qibla/ReligionModuleService;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "clearPlay", "", "sendPrayerTime", "init", "context", "Landroid/content/Context;", "feature-religion_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReligionModuleServiceImpl implements ReligionModuleService {
    private final String TAG = "ReligionModuleServiceImpl";

    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.wakeup.commponent.module.device.qibla.ReligionModuleService
    public void clearPlay() {
        KoranPlayerManager.INSTANCE.getInstance().onDestroy();
    }

    @Override // com.wakeup.commponent.module.device.qibla.ReligionModuleService
    public void sendPrayerTime() {
        if (!DeviceDao.isSupport(134)) {
            LogUtils.w(this.TAG, "sendPrayerTime not support");
        } else {
            LogUtils.i(this.TAG, "sendPrayerTime");
            ReligionPrayerTimeHelper.INSTANCE.getPrayerTime(this.TAG, new BaseCallback<List<PrayerTimeBean>>() { // from class: com.wakeup.module.religion.ReligionModuleServiceImpl$sendPrayerTime$1
                @Override // com.wakeup.common.base.BaseCallback
                public void callback(int code, List<PrayerTimeBean> prayerTimeBeans) {
                    if (code == 0) {
                        LogUtils.w(ReligionModuleServiceImpl.this.getTAG(), "ReligionPrayerTimeHelper getPrayerTime is error 0");
                        return;
                    }
                    ReligionPrayerTimeHelper religionPrayerTimeHelper = ReligionPrayerTimeHelper.INSTANCE;
                    Intrinsics.checkNotNull(prayerTimeBeans);
                    List<Integer> itemTimes = religionPrayerTimeHelper.getItemTimes(prayerTimeBeans);
                    List<Integer> itemEnables = ReligionPrayerTimeHelper.INSTANCE.getItemEnables(prayerTimeBeans);
                    LogUtils.i(ReligionModuleServiceImpl.this.getTAG(), "sendPrayerTime itemTimes: ", itemTimes.toString(), " itemEnables:", itemEnables, " ,itemRings");
                    ServiceManager.getDeviceService().sendData(MuslimBle.INSTANCE.sendPrayTime(itemTimes, itemEnables));
                }
            });
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        LogUtils.i(this.TAG, "init");
        ServiceManager.getDeviceService().addAnalyzer(new MuslimAnalyzer());
    }
}
