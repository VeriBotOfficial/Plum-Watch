package com.wakeup.feature.device.adapter;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.common.storage.model.DeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceManagementItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/wakeup/feature/device/adapter/DeviceManagementItem;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "itemType", "", "<init>", "(I)V", "getItemType", "()I", "model", "Lcom/wakeup/common/storage/model/DeviceModel;", "getModel", "()Lcom/wakeup/common/storage/model/DeviceModel;", "setModel", "(Lcom/wakeup/common/storage/model/DeviceModel;)V", "Companion", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceManagementItem implements MultiItemEntity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_4G = 3;
    public static final int TYPE_ADD = 1;
    public static final int TYPE_AUDIO_GLASSES = 4;
    public static final int TYPE_DEVICE = 0;
    public static final int TYPE_HEADSET = 2;
    private final int itemType;
    private DeviceModel model;

    public DeviceManagementItem(int i) {
        this.itemType = i;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public final DeviceModel getModel() {
        return this.model;
    }

    public final void setModel(DeviceModel deviceModel) {
        this.model = deviceModel;
    }

    /* compiled from: DeviceManagementItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/wakeup/feature/device/adapter/DeviceManagementItem$Companion;", "", "<init>", "()V", "TYPE_DEVICE", "", "TYPE_HEADSET", "TYPE_4G", "TYPE_AUDIO_GLASSES", "TYPE_ADD", "createDevice", "Lcom/wakeup/feature/device/adapter/DeviceManagementItem;", "model", "Lcom/wakeup/common/storage/model/DeviceModel;", "createHeadset", "create4G", "createAudioGLasses", "createAdd", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DeviceManagementItem createDevice(DeviceModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            DeviceManagementItem deviceManagementItem = new DeviceManagementItem(0);
            deviceManagementItem.setModel(model);
            return deviceManagementItem;
        }

        public final DeviceManagementItem createHeadset(DeviceModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            DeviceManagementItem deviceManagementItem = new DeviceManagementItem(2);
            deviceManagementItem.setModel(model);
            return deviceManagementItem;
        }

        public final DeviceManagementItem create4G(DeviceModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            DeviceManagementItem deviceManagementItem = new DeviceManagementItem(3);
            deviceManagementItem.setModel(model);
            return deviceManagementItem;
        }

        public final DeviceManagementItem createAudioGLasses(DeviceModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            DeviceManagementItem deviceManagementItem = new DeviceManagementItem(4);
            deviceManagementItem.setModel(model);
            return deviceManagementItem;
        }

        public final DeviceManagementItem createAdd() {
            return new DeviceManagementItem(1);
        }
    }
}
