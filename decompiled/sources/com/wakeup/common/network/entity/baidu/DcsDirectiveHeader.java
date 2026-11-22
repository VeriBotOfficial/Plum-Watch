package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/DcsDirectiveHeader;", "", "name", "", "namespace", "messageId", "dialogRequestId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getNamespace", "getMessageId", "getDialogRequestId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DcsDirectiveHeader {
    private final String dialogRequestId;
    private final String messageId;
    private final String name;
    private final String namespace;

    public static /* synthetic */ DcsDirectiveHeader copy$default(DcsDirectiveHeader dcsDirectiveHeader, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dcsDirectiveHeader.name;
        }
        if ((i & 2) != 0) {
            str2 = dcsDirectiveHeader.namespace;
        }
        if ((i & 4) != 0) {
            str3 = dcsDirectiveHeader.messageId;
        }
        if ((i & 8) != 0) {
            str4 = dcsDirectiveHeader.dialogRequestId;
        }
        return dcsDirectiveHeader.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    public final DcsDirectiveHeader copy(String name, String namespace, String messageId, String dialogRequestId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(dialogRequestId, "dialogRequestId");
        return new DcsDirectiveHeader(name, namespace, messageId, dialogRequestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DcsDirectiveHeader)) {
            return false;
        }
        DcsDirectiveHeader dcsDirectiveHeader = (DcsDirectiveHeader) other;
        return Intrinsics.areEqual(this.name, dcsDirectiveHeader.name) && Intrinsics.areEqual(this.namespace, dcsDirectiveHeader.namespace) && Intrinsics.areEqual(this.messageId, dcsDirectiveHeader.messageId) && Intrinsics.areEqual(this.dialogRequestId, dcsDirectiveHeader.dialogRequestId);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.namespace.hashCode()) * 31) + this.messageId.hashCode()) * 31) + this.dialogRequestId.hashCode();
    }

    public String toString() {
        return "DcsDirectiveHeader(name=" + this.name + ", namespace=" + this.namespace + ", messageId=" + this.messageId + ", dialogRequestId=" + this.dialogRequestId + Separators.RPAREN;
    }

    public DcsDirectiveHeader(String name, String namespace, String messageId, String dialogRequestId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(dialogRequestId, "dialogRequestId");
        this.name = name;
        this.namespace = namespace;
        this.messageId = messageId;
        this.dialogRequestId = dialogRequestId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNamespace() {
        return this.namespace;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }
}
