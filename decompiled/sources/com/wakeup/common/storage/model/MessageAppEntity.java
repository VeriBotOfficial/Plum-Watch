package com.wakeup.common.storage.model;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageAppEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/storage/model/MessageAppEntity;", "Ljava/io/Serializable;", "appName", "", "packageName", "messageId", "", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getPackageName", "getMessageId", "()I", "getIconUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MessageAppEntity implements Serializable {
    private final String appName;
    private final String iconUrl;
    private final int messageId;
    private final String packageName;

    public MessageAppEntity() {
        this(null, null, 0, null, 15, null);
    }

    public static /* synthetic */ MessageAppEntity copy$default(MessageAppEntity messageAppEntity, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = messageAppEntity.appName;
        }
        if ((i2 & 2) != 0) {
            str2 = messageAppEntity.packageName;
        }
        if ((i2 & 4) != 0) {
            i = messageAppEntity.messageId;
        }
        if ((i2 & 8) != 0) {
            str3 = messageAppEntity.iconUrl;
        }
        return messageAppEntity.copy(str, str2, i, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMessageId() {
        return this.messageId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final MessageAppEntity copy(String appName, String packageName, int messageId, String iconUrl) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        return new MessageAppEntity(appName, packageName, messageId, iconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageAppEntity)) {
            return false;
        }
        MessageAppEntity messageAppEntity = (MessageAppEntity) other;
        return Intrinsics.areEqual(this.appName, messageAppEntity.appName) && Intrinsics.areEqual(this.packageName, messageAppEntity.packageName) && this.messageId == messageAppEntity.messageId && Intrinsics.areEqual(this.iconUrl, messageAppEntity.iconUrl);
    }

    public int hashCode() {
        return (((((this.appName.hashCode() * 31) + this.packageName.hashCode()) * 31) + Integer.hashCode(this.messageId)) * 31) + this.iconUrl.hashCode();
    }

    public String toString() {
        return "MessageAppEntity(appName=" + this.appName + ", packageName=" + this.packageName + ", messageId=" + this.messageId + ", iconUrl=" + this.iconUrl + Separators.RPAREN;
    }

    public MessageAppEntity(String appName, String packageName, int i, String iconUrl) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.appName = appName;
        this.packageName = packageName;
        this.messageId = i;
        this.iconUrl = iconUrl;
    }

    public /* synthetic */ MessageAppEntity(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getMessageId() {
        return this.messageId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }
}
