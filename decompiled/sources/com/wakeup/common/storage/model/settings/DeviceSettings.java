package com.wakeup.common.storage.model.settings;

import android.gov.nist.core.Separators;
import com.wakeup.common.storage.model.settings.model.AlarmSettings;
import com.wakeup.common.storage.model.settings.model.ContactSettings;
import com.wakeup.common.storage.model.settings.model.HeartSettings;
import com.wakeup.common.storage.model.settings.model.NoDisturbSettings;
import com.wakeup.common.storage.model.settings.model.NotifySettings;
import com.wakeup.common.storage.model.settings.model.RemindSettings;
import com.wakeup.common.storage.model.settings.model.SleepSettings;
import com.wakeup.common.storage.model.settings.model.SportSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSettings.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010W\u001a\u00020XJ\u0006\u0010Y\u001a\u00020XJ\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\u0013\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\\\u001a\u00020\u001f2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u000209HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010'\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010*\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001a\u0010-\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020601¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u001a\u00108\u001a\u000209X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u000209X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\u0011\u0010A\u001a\u00020B¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020F¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010I\u001a\u00020J¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010M\u001a\u00020N¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010!\"\u0004\bS\u0010#R\u001a\u0010T\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0007\"\u0004\bV\u0010\u0005¨\u0006`"}, d2 = {"Lcom/wakeup/common/storage/model/settings/DeviceSettings;", "", "mac", "", "<init>", "(Ljava/lang/String;)V", "getMac", "()Ljava/lang/String;", "notifySettings", "Lcom/wakeup/common/storage/model/settings/model/NotifySettings;", "getNotifySettings", "()Lcom/wakeup/common/storage/model/settings/model/NotifySettings;", "sedentaryRemind", "Lcom/wakeup/common/storage/model/settings/model/RemindSettings;", "getSedentaryRemind", "()Lcom/wakeup/common/storage/model/settings/model/RemindSettings;", "waterRemind", "getWaterRemind", "heartRemind", "getHeartRemind", "overlookRemind", "getOverlookRemind", "sportRemind", "getSportRemind", "medicineRemind", "getMedicineRemind", "bookRemind", "getBookRemind", "travelRemind", "getTravelRemind", "dailyReminder", "", "getDailyReminder", "()Z", "setDailyReminder", "(Z)V", "motionRecognition", "getMotionRecognition", "setMotionRecognition", "lightScreenSwitch", "getLightScreenSwitch", "setLightScreenSwitch", "hourMeasureSwitch", "getHourMeasureSwitch", "setHourMeasureSwitch", "hour12Switch", "getHour12Switch", "setHour12Switch", "alarms", "", "Lcom/wakeup/common/storage/model/settings/model/AlarmSettings;", "getAlarms", "()Ljava/util/List;", "contacts", "Lcom/wakeup/common/storage/model/settings/model/ContactSettings;", "getContacts", "likeNumber", "", "getLikeNumber", "()I", "setLikeNumber", "(I)V", "langeuage", "getLangeuage", "setLangeuage", "noDisturbSettings", "Lcom/wakeup/common/storage/model/settings/model/NoDisturbSettings;", "getNoDisturbSettings", "()Lcom/wakeup/common/storage/model/settings/model/NoDisturbSettings;", "heartSettings", "Lcom/wakeup/common/storage/model/settings/model/HeartSettings;", "getHeartSettings", "()Lcom/wakeup/common/storage/model/settings/model/HeartSettings;", "sportSettings", "Lcom/wakeup/common/storage/model/settings/model/SportSettings;", "getSportSettings", "()Lcom/wakeup/common/storage/model/settings/model/SportSettings;", "sleepSettings", "Lcom/wakeup/common/storage/model/settings/model/SleepSettings;", "getSleepSettings", "()Lcom/wakeup/common/storage/model/settings/model/SleepSettings;", "weatherSwitch", "getWeatherSwitch", "setWeatherSwitch", "recordLanguage", "getRecordLanguage", "setRecordLanguage", "getSwitch1", "", "getSwitch2", "component1", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeviceSettings {
    private final List<AlarmSettings> alarms;
    private final RemindSettings bookRemind;
    private final List<ContactSettings> contacts;
    private boolean dailyReminder;
    private final RemindSettings heartRemind;
    private final HeartSettings heartSettings;
    private boolean hour12Switch;
    private boolean hourMeasureSwitch;
    private int langeuage;
    private boolean lightScreenSwitch;
    private int likeNumber;
    private final String mac;
    private final RemindSettings medicineRemind;
    private boolean motionRecognition;
    private final NoDisturbSettings noDisturbSettings;
    private final NotifySettings notifySettings;
    private final RemindSettings overlookRemind;
    private String recordLanguage;
    private final RemindSettings sedentaryRemind;
    private final SleepSettings sleepSettings;
    private final RemindSettings sportRemind;
    private final SportSettings sportSettings;
    private final RemindSettings travelRemind;
    private final RemindSettings waterRemind;
    private boolean weatherSwitch;

    public static /* synthetic */ DeviceSettings copy$default(DeviceSettings deviceSettings, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceSettings.mac;
        }
        return deviceSettings.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    public final DeviceSettings copy(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new DeviceSettings(mac);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceSettings) && Intrinsics.areEqual(this.mac, ((DeviceSettings) other).mac);
    }

    public int hashCode() {
        return this.mac.hashCode();
    }

    public String toString() {
        return "DeviceSettings(mac=" + this.mac + Separators.RPAREN;
    }

    public DeviceSettings(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        NotifySettings notifySettings = new NotifySettings(false, 1, null);
        notifySettings.setSwitch(true);
        notifySettings.setRedPointSwitch(true);
        notifySettings.setTipSwitch(true);
        notifySettings.setHideContentSwitch(false);
        this.notifySettings = notifySettings;
        RemindSettings remindSettings = new RemindSettings(false, 1, null);
        remindSettings.setSwitch(false);
        remindSettings.setStartTime(540);
        remindSettings.setEndTime(1320);
        remindSettings.setIntervalTime(45);
        this.sedentaryRemind = remindSettings;
        RemindSettings remindSettings2 = new RemindSettings(false, 1, null);
        remindSettings2.setSwitch(true);
        remindSettings2.setStartTime(540);
        remindSettings2.setEndTime(1320);
        remindSettings2.setIntervalTime(45);
        this.waterRemind = remindSettings2;
        RemindSettings remindSettings3 = new RemindSettings(false, 1, null);
        remindSettings3.setSwitch(false);
        remindSettings3.setCount(100);
        this.heartRemind = remindSettings3;
        RemindSettings remindSettings4 = new RemindSettings(false, 1, null);
        remindSettings4.setSwitch(false);
        remindSettings4.setIntervalTime(45);
        this.overlookRemind = remindSettings4;
        RemindSettings remindSettings5 = new RemindSettings(false, 1, null);
        remindSettings5.setSwitch(false);
        remindSettings5.setRemindTime(480);
        remindSettings5.setRepeatDay(128);
        this.sportRemind = remindSettings5;
        RemindSettings remindSettings6 = new RemindSettings(false, 1, null);
        remindSettings6.setSwitch(false);
        remindSettings6.setRemindTime(480);
        remindSettings6.setRepeatDay(128);
        this.medicineRemind = remindSettings6;
        RemindSettings remindSettings7 = new RemindSettings(false, 1, null);
        remindSettings7.setSwitch(false);
        remindSettings7.setRemindTime(480);
        remindSettings7.setRepeatDay(128);
        this.bookRemind = remindSettings7;
        RemindSettings remindSettings8 = new RemindSettings(false, 1, null);
        remindSettings8.setSwitch(false);
        remindSettings8.setRemindTime(480);
        remindSettings8.setRepeatDay(128);
        this.travelRemind = remindSettings8;
        this.lightScreenSwitch = true;
        this.hourMeasureSwitch = true;
        this.alarms = new ArrayList();
        this.contacts = new ArrayList();
        this.likeNumber = 1;
        NoDisturbSettings noDisturbSettings = new NoDisturbSettings(0, 1, null);
        noDisturbSettings.setSwitch(0);
        noDisturbSettings.setStartTime(480);
        noDisturbSettings.setEndTime(1320);
        this.noDisturbSettings = noDisturbSettings;
        HeartSettings heartSettings = new HeartSettings();
        heartSettings.setAerobicHeartSwitch(true);
        heartSettings.setAerobicMax(150);
        heartSettings.setStaticHeartSwitch(false);
        heartSettings.setStaticHeartMax(150);
        heartSettings.setStaticHeartMin(40);
        heartSettings.setSleepHeartSwitch(false);
        heartSettings.setSleepHeartMax(150);
        heartSettings.setSleepHeartMin(40);
        this.heartSettings = heartSettings;
        SportSettings sportSettings = new SportSettings();
        sportSettings.setAutoPauseSwitch(true);
        sportSettings.setStartRemindSwitch(true);
        sportSettings.setEndRemindSwitch(true);
        sportSettings.setKeyPauseSwitch(false);
        this.sportSettings = sportSettings;
        SleepSettings sleepSettings = new SleepSettings();
        sleepSettings.setAutoSwitch(false);
        sleepSettings.setShowTimeSwitch(false);
        sleepSettings.setTrackingSwitch(false);
        sleepSettings.setChargeRemindSwitch(false);
        sleepSettings.setStartTime(1320);
        sleepSettings.setEndTime(480);
        this.sleepSettings = sleepSettings;
        this.weatherSwitch = true;
        this.recordLanguage = "";
    }

    public final String getMac() {
        return this.mac;
    }

    public final NotifySettings getNotifySettings() {
        return this.notifySettings;
    }

    public final RemindSettings getSedentaryRemind() {
        return this.sedentaryRemind;
    }

    public final RemindSettings getWaterRemind() {
        return this.waterRemind;
    }

    public final RemindSettings getHeartRemind() {
        return this.heartRemind;
    }

    public final RemindSettings getOverlookRemind() {
        return this.overlookRemind;
    }

    public final RemindSettings getSportRemind() {
        return this.sportRemind;
    }

    public final RemindSettings getMedicineRemind() {
        return this.medicineRemind;
    }

    public final RemindSettings getBookRemind() {
        return this.bookRemind;
    }

    public final RemindSettings getTravelRemind() {
        return this.travelRemind;
    }

    public final boolean getDailyReminder() {
        return this.dailyReminder;
    }

    public final void setDailyReminder(boolean z) {
        this.dailyReminder = z;
    }

    public final boolean getMotionRecognition() {
        return this.motionRecognition;
    }

    public final void setMotionRecognition(boolean z) {
        this.motionRecognition = z;
    }

    public final boolean getLightScreenSwitch() {
        return this.lightScreenSwitch;
    }

    public final void setLightScreenSwitch(boolean z) {
        this.lightScreenSwitch = z;
    }

    public final boolean getHourMeasureSwitch() {
        return this.hourMeasureSwitch;
    }

    public final void setHourMeasureSwitch(boolean z) {
        this.hourMeasureSwitch = z;
    }

    public final boolean getHour12Switch() {
        return this.hour12Switch;
    }

    public final void setHour12Switch(boolean z) {
        this.hour12Switch = z;
    }

    public final List<AlarmSettings> getAlarms() {
        return this.alarms;
    }

    public final List<ContactSettings> getContacts() {
        return this.contacts;
    }

    public final int getLikeNumber() {
        return this.likeNumber;
    }

    public final void setLikeNumber(int i) {
        this.likeNumber = i;
    }

    public final int getLangeuage() {
        return this.langeuage;
    }

    public final void setLangeuage(int i) {
        this.langeuage = i;
    }

    public final NoDisturbSettings getNoDisturbSettings() {
        return this.noDisturbSettings;
    }

    public final HeartSettings getHeartSettings() {
        return this.heartSettings;
    }

    public final SportSettings getSportSettings() {
        return this.sportSettings;
    }

    public final SleepSettings getSleepSettings() {
        return this.sleepSettings;
    }

    public final boolean getWeatherSwitch() {
        return this.weatherSwitch;
    }

    public final void setWeatherSwitch(boolean z) {
        this.weatherSwitch = z;
    }

    public final String getRecordLanguage() {
        return this.recordLanguage;
    }

    public final void setRecordLanguage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.recordLanguage = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte getSwitch1() {
        boolean z = this.sedentaryRemind.getSwitch();
        boolean z2 = z;
        if (this.waterRemind.getSwitch()) {
            z2 = (z ? 1 : 0) | 2;
        }
        boolean z3 = z2;
        if (this.heartRemind.getSwitch()) {
            z3 = (z2 ? 1 : 0) | 4;
        }
        boolean z4 = z3;
        if (this.overlookRemind.getSwitch()) {
            z4 = (z3 ? 1 : 0) | '\b';
        }
        boolean z5 = z4;
        if (this.sportRemind.getSwitch()) {
            z5 = (z4 ? 1 : 0) | 16;
        }
        boolean z6 = z5;
        if (this.medicineRemind.getSwitch()) {
            z6 = (z5 ? 1 : 0) | ' ';
        }
        boolean z7 = z6;
        if (this.bookRemind.getSwitch()) {
            z7 = (z6 ? 1 : 0) | '@';
        }
        int i = z7;
        if (this.travelRemind.getSwitch()) {
            i = (z7 ? 1 : 0) | 128;
        }
        return (byte) i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte getSwitch2() {
        boolean z = this.dailyReminder;
        int i = z;
        if (this.motionRecognition) {
            i = (z ? 1 : 0) | 16;
        }
        return (byte) i;
    }
}
