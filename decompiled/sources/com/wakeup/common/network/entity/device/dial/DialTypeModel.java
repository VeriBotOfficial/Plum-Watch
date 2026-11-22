package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.facebook.hermes.intl.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialTypeModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jy\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006/"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialTypeModel;", "", "id", "", "typeId", "name", "", "topicName", "locale", "icon", "iconLocal", Constants.SORT, "trackId", "delStatus", "type", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;II)V", "getId", "()I", "getTypeId", "getName", "()Ljava/lang/String;", "getTopicName", "getLocale", "getIcon", "getIconLocal", "getSort", "getTrackId", "getDelStatus", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialTypeModel {
    private final int delStatus;
    private final String icon;
    private final int iconLocal;
    private final int id;
    private final String locale;
    private final String name;
    private final int sort;
    private final String topicName;
    private final String trackId;
    private final int type;
    private final int typeId;

    public static /* synthetic */ DialTypeModel copy$default(DialTypeModel dialTypeModel, int i, int i2, String str, String str2, String str3, String str4, int i3, int i4, String str5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = dialTypeModel.id;
        }
        if ((i7 & 2) != 0) {
            i2 = dialTypeModel.typeId;
        }
        if ((i7 & 4) != 0) {
            str = dialTypeModel.name;
        }
        if ((i7 & 8) != 0) {
            str2 = dialTypeModel.topicName;
        }
        if ((i7 & 16) != 0) {
            str3 = dialTypeModel.locale;
        }
        if ((i7 & 32) != 0) {
            str4 = dialTypeModel.icon;
        }
        if ((i7 & 64) != 0) {
            i3 = dialTypeModel.iconLocal;
        }
        if ((i7 & 128) != 0) {
            i4 = dialTypeModel.sort;
        }
        if ((i7 & 256) != 0) {
            str5 = dialTypeModel.trackId;
        }
        if ((i7 & 512) != 0) {
            i5 = dialTypeModel.delStatus;
        }
        if ((i7 & 1024) != 0) {
            i6 = dialTypeModel.type;
        }
        int i8 = i5;
        int i9 = i6;
        int i10 = i4;
        String str6 = str5;
        String str7 = str4;
        int i11 = i3;
        String str8 = str3;
        String str9 = str;
        return dialTypeModel.copy(i, i2, str9, str2, str8, str7, i11, i10, str6, i8, i9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getDelStatus() {
        return this.delStatus;
    }

    /* renamed from: component11, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTopicName() {
        return this.topicName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component7, reason: from getter */
    public final int getIconLocal() {
        return this.iconLocal;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    public final DialTypeModel copy(int id2, int typeId, String name, String topicName, String locale, String icon, int iconLocal, int sort, String trackId, int delStatus, int type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new DialTypeModel(id2, typeId, name, topicName, locale, icon, iconLocal, sort, trackId, delStatus, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialTypeModel)) {
            return false;
        }
        DialTypeModel dialTypeModel = (DialTypeModel) other;
        return this.id == dialTypeModel.id && this.typeId == dialTypeModel.typeId && Intrinsics.areEqual(this.name, dialTypeModel.name) && Intrinsics.areEqual(this.topicName, dialTypeModel.topicName) && Intrinsics.areEqual(this.locale, dialTypeModel.locale) && Intrinsics.areEqual(this.icon, dialTypeModel.icon) && this.iconLocal == dialTypeModel.iconLocal && this.sort == dialTypeModel.sort && Intrinsics.areEqual(this.trackId, dialTypeModel.trackId) && this.delStatus == dialTypeModel.delStatus && this.type == dialTypeModel.type;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.typeId)) * 31) + this.name.hashCode()) * 31) + this.topicName.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.iconLocal)) * 31) + Integer.hashCode(this.sort)) * 31;
        String str = this.trackId;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.delStatus)) * 31) + Integer.hashCode(this.type);
    }

    public String toString() {
        return "DialTypeModel(id=" + this.id + ", typeId=" + this.typeId + ", name=" + this.name + ", topicName=" + this.topicName + ", locale=" + this.locale + ", icon=" + this.icon + ", iconLocal=" + this.iconLocal + ", sort=" + this.sort + ", trackId=" + this.trackId + ", delStatus=" + this.delStatus + ", type=" + this.type + Separators.RPAREN;
    }

    public DialTypeModel(int i, int i2, String name, String topicName, String locale, String icon, int i3, int i4, String str, int i5, int i6) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.id = i;
        this.typeId = i2;
        this.name = name;
        this.topicName = topicName;
        this.locale = locale;
        this.icon = icon;
        this.iconLocal = i3;
        this.sort = i4;
        this.trackId = str;
        this.delStatus = i5;
        this.type = i6;
    }

    public final int getId() {
        return this.id;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTopicName() {
        return this.topicName;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getIconLocal() {
        return this.iconLocal;
    }

    public final int getSort() {
        return this.sort;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final int getDelStatus() {
        return this.delStatus;
    }

    public final int getType() {
        return this.type;
    }
}
