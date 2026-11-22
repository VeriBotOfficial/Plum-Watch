package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import com.wakeup.common.storage.model.DeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceUpdateBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/other/DeviceUpdateBean;", "", "deviceUpdateModel", "Lcom/wakeup/common/network/entity/other/DeviceUpdataModel;", "deviceModel", "Lcom/wakeup/common/storage/model/DeviceModel;", "<init>", "(Lcom/wakeup/common/network/entity/other/DeviceUpdataModel;Lcom/wakeup/common/storage/model/DeviceModel;)V", "getDeviceUpdateModel", "()Lcom/wakeup/common/network/entity/other/DeviceUpdataModel;", "setDeviceUpdateModel", "(Lcom/wakeup/common/network/entity/other/DeviceUpdataModel;)V", "getDeviceModel", "()Lcom/wakeup/common/storage/model/DeviceModel;", "setDeviceModel", "(Lcom/wakeup/common/storage/model/DeviceModel;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeviceUpdateBean {
    private DeviceModel deviceModel;
    private DeviceUpdataModel deviceUpdateModel;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceUpdateBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeviceUpdateBean copy$default(DeviceUpdateBean deviceUpdateBean, DeviceUpdataModel deviceUpdataModel, DeviceModel deviceModel, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceUpdataModel = deviceUpdateBean.deviceUpdateModel;
        }
        if ((i & 2) != 0) {
            deviceModel = deviceUpdateBean.deviceModel;
        }
        return deviceUpdateBean.copy(deviceUpdataModel, deviceModel);
    }

    /* renamed from: component1, reason: from getter */
    public final DeviceUpdataModel getDeviceUpdateModel() {
        return this.deviceUpdateModel;
    }

    /* renamed from: component2, reason: from getter */
    public final DeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    public final DeviceUpdateBean copy(DeviceUpdataModel deviceUpdateModel, DeviceModel deviceModel) {
        return new DeviceUpdateBean(deviceUpdateModel, deviceModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceUpdateBean)) {
            return false;
        }
        DeviceUpdateBean deviceUpdateBean = (DeviceUpdateBean) other;
        return Intrinsics.areEqual(this.deviceUpdateModel, deviceUpdateBean.deviceUpdateModel) && Intrinsics.areEqual(this.deviceModel, deviceUpdateBean.deviceModel);
    }

    public int hashCode() {
        DeviceUpdataModel deviceUpdataModel = this.deviceUpdateModel;
        int hashCode = (deviceUpdataModel == null ? 0 : deviceUpdataModel.hashCode()) * 31;
        DeviceModel deviceModel = this.deviceModel;
        return hashCode + (deviceModel != null ? deviceModel.hashCode() : 0);
    }

    public String toString() {
        return "DeviceUpdateBean(deviceUpdateModel=" + this.deviceUpdateModel + ", deviceModel=" + this.deviceModel + Separators.RPAREN;
    }

    public DeviceUpdateBean(DeviceUpdataModel deviceUpdataModel, DeviceModel deviceModel) {
        this.deviceUpdateModel = deviceUpdataModel;
        this.deviceModel = deviceModel;
    }

    public /* synthetic */ DeviceUpdateBean(DeviceUpdataModel deviceUpdataModel, DeviceModel deviceModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deviceUpdataModel, (i & 2) != 0 ? null : deviceModel);
    }

    public final DeviceUpdataModel getDeviceUpdateModel() {
        return this.deviceUpdateModel;
    }

    public final void setDeviceUpdateModel(DeviceUpdataModel deviceUpdataModel) {
        this.deviceUpdateModel = deviceUpdataModel;
    }

    public final DeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    public final void setDeviceModel(DeviceModel deviceModel) {
        this.deviceModel = deviceModel;
    }
}
