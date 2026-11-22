package com.wakeup.commponent.api;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.network.entity.schedule.ScheduleModel;
import com.wakeup.commponent.module.ble.BleOrderModel;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DevicePageService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H&J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\r\u001a\u00020\tH&¨\u0006\u0011"}, d2 = {"Lcom/wakeup/commponent/api/DevicePageService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "scheduleOp", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "op", "", "time", "", "content", "", "scheduleId", "addSchedule", "", "mac", "getScheduleTotal", "", "Lcom/wakeup/common/network/entity/schedule/ScheduleModel;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DevicePageService extends IProvider {
    void addSchedule(String mac, long scheduleId, long time, String content);

    List<ScheduleModel> getScheduleTotal(String mac);

    BleOrderModel scheduleOp(int op, long time, String content, long scheduleId);
}
