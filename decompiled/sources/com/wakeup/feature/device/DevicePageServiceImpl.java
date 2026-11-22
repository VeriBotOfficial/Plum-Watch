package com.wakeup.feature.device;

import android.app.Activity;
import android.content.Context;
import com.blankj.utilcode.util.ActivityUtils;
import com.wakeup.common.EventMgr;
import com.wakeup.common.network.entity.schedule.ScheduleModel;
import com.wakeup.common.storage.ScheduleManager;
import com.wakeup.common.utils.DateUtil;
import com.wakeup.commponent.ServiceManager;
import com.wakeup.commponent.api.DevicePageService;
import com.wakeup.commponent.module.ble.BleOrderModel;
import com.wakeup.feature.device.aiAlbum.order.AigcAlbumAnalyzer;
import com.wakeup.feature.device.aigc.order.AigcDialAnalyzer;
import com.wakeup.feature.device.dial.ring.order.RingAnalyzer;
import com.wakeup.feature.device.meeting.order.MeetingAnalyzer;
import com.wakeup.feature.device.music.BaiduAiAudioMgr;
import com.wakeup.feature.device.music.order.AiAudioAnalyzer;
import com.wakeup.feature.device.note.NoteRecordAnalyzer;
import com.wakeup.feature.device.schedule.order.ScheduleOrder;
import com.wakeup.feature.device.xmly.order.XmlyAnalyzer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevicePageServiceImpl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J(\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/device/DevicePageServiceImpl;", "Lcom/wakeup/commponent/api/DevicePageService;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "scheduleOp", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "op", "", "time", "", "content", "", "scheduleId", "addSchedule", "mac", "getScheduleTotal", "", "Lcom/wakeup/common/network/entity/schedule/ScheduleModel;", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DevicePageServiceImpl implements DevicePageService {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        ServiceManager.getDeviceService().addAnalyzer(new AigcDialAnalyzer());
        ServiceManager.getDeviceService().addAnalyzer(new AiAudioAnalyzer());
        ServiceManager.getDeviceService().addAnalyzer(new AigcAlbumAnalyzer());
        ServiceManager.getDeviceService().addAnalyzer(new RingAnalyzer());
        ServiceManager.getDeviceService().addAnalyzer(new XmlyAnalyzer());
        ServiceManager.getDeviceService().addAnalyzer(new NoteRecordAnalyzer());
        ServiceManager.getDeviceService().addAnalyzer(new MeetingAnalyzer());
        BaiduAiAudioMgr.INSTANCE.init();
    }

    @Override // com.wakeup.commponent.api.DevicePageService
    public BleOrderModel scheduleOp(int op, long time, String content, long scheduleId) {
        Intrinsics.checkNotNullParameter(content, "content");
        return ScheduleOrder.scheduleOp(op, time, content, scheduleId);
    }

    @Override // com.wakeup.commponent.api.DevicePageService
    public void addSchedule(String mac, long scheduleId, long time, String content) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(content, "content");
        Activity topActivity = ActivityUtils.getTopActivity();
        if (topActivity == null) {
            return;
        }
        ScheduleModel scheduleModel = new ScheduleModel();
        scheduleModel.setId(Long.valueOf(scheduleId));
        scheduleModel.setMac(mac);
        scheduleModel.setSource(1);
        scheduleModel.setStartTime(time);
        scheduleModel.setEndTime(3600 + time);
        scheduleModel.setRemark(content);
        scheduleModel.setTitle(content);
        String dateUtil = DateUtil.toString(1000 * time, "yyyyMMdd");
        Intrinsics.checkNotNullExpressionValue(dateUtil, "toString(...)");
        scheduleModel.setDayNo(Integer.parseInt(dateUtil));
        scheduleModel.setReminderList(CollectionsKt.arrayListOf(Long.valueOf(time)));
        ScheduleManager.INSTANCE.updateScheduleData(scheduleModel);
        ScheduleManager.INSTANCE.notifyNotification(topActivity, scheduleModel);
        EventMgr.getPrePageEvent().post(1);
    }

    @Override // com.wakeup.commponent.api.DevicePageService
    public List<ScheduleModel> getScheduleTotal(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        long j = 1000;
        return ScheduleManager.INSTANCE.deviceScheduleList(mac, DateUtil.getTime(DateUtil.getYear(System.currentTimeMillis() / j), DateUtil.getMonth(System.currentTimeMillis() / j) + 1, 1).longValue() * j, false);
    }
}
