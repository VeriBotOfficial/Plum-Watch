package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialModule;", "", "id", "", "name", "", "firmwareId", "icon", "type", "<init>", "(ILjava/lang/String;ILjava/lang/String;I)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getFirmwareId", "getIcon", "getType", "isSelect", "", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialModule {
    private final int firmwareId;
    private final String icon;
    private final int id;
    private boolean isSelect;
    private final String name;
    private final int type;

    public static /* synthetic */ DialModule copy$default(DialModule dialModule, int i, String str, int i2, String str2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dialModule.id;
        }
        if ((i4 & 2) != 0) {
            str = dialModule.name;
        }
        if ((i4 & 4) != 0) {
            i2 = dialModule.firmwareId;
        }
        if ((i4 & 8) != 0) {
            str2 = dialModule.icon;
        }
        if ((i4 & 16) != 0) {
            i3 = dialModule.type;
        }
        int i5 = i3;
        int i6 = i2;
        return dialModule.copy(i, str, i6, str2, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFirmwareId() {
        return this.firmwareId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final DialModule copy(int id2, String name, int firmwareId, String icon, int type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new DialModule(id2, name, firmwareId, icon, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialModule)) {
            return false;
        }
        DialModule dialModule = (DialModule) other;
        return this.id == dialModule.id && Intrinsics.areEqual(this.name, dialModule.name) && this.firmwareId == dialModule.firmwareId && Intrinsics.areEqual(this.icon, dialModule.icon) && this.type == dialModule.type;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.firmwareId)) * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    public String toString() {
        return "DialModule(id=" + this.id + ", name=" + this.name + ", firmwareId=" + this.firmwareId + ", icon=" + this.icon + ", type=" + this.type + Separators.RPAREN;
    }

    public DialModule(int i, String name, int i2, String icon, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.id = i;
        this.name = name;
        this.firmwareId = i2;
        this.icon = icon;
        this.type = i3;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getFirmwareId() {
        return this.firmwareId;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getType() {
        return this.type;
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }
}
