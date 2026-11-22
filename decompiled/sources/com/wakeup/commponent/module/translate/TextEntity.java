package com.wakeup.commponent.module.translate;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/wakeup/commponent/module/translate/TextEntity;", "", "id", "", "beforeStr", "", "afterCode", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getBeforeStr", "()Ljava/lang/String;", "getAfterCode", "setAfterCode", "(Ljava/lang/String;)V", "afterStr", "getAfterStr", "setAfterStr", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextEntity {
    private String afterCode;
    private String afterStr;
    private final String beforeStr;
    private final long id;

    public static /* synthetic */ TextEntity copy$default(TextEntity textEntity, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = textEntity.id;
        }
        if ((i & 2) != 0) {
            str = textEntity.beforeStr;
        }
        if ((i & 4) != 0) {
            str2 = textEntity.afterCode;
        }
        return textEntity.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBeforeStr() {
        return this.beforeStr;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAfterCode() {
        return this.afterCode;
    }

    public final TextEntity copy(long id2, String beforeStr, String afterCode) {
        Intrinsics.checkNotNullParameter(beforeStr, "beforeStr");
        Intrinsics.checkNotNullParameter(afterCode, "afterCode");
        return new TextEntity(id2, beforeStr, afterCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextEntity)) {
            return false;
        }
        TextEntity textEntity = (TextEntity) other;
        return this.id == textEntity.id && Intrinsics.areEqual(this.beforeStr, textEntity.beforeStr) && Intrinsics.areEqual(this.afterCode, textEntity.afterCode);
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.beforeStr.hashCode()) * 31) + this.afterCode.hashCode();
    }

    public String toString() {
        return "TextEntity(id=" + this.id + ", beforeStr=" + this.beforeStr + ", afterCode=" + this.afterCode + Separators.RPAREN;
    }

    public TextEntity(long j, String beforeStr, String afterCode) {
        Intrinsics.checkNotNullParameter(beforeStr, "beforeStr");
        Intrinsics.checkNotNullParameter(afterCode, "afterCode");
        this.id = j;
        this.beforeStr = beforeStr;
        this.afterCode = afterCode;
        this.afterStr = "";
    }

    public final long getId() {
        return this.id;
    }

    public final String getBeforeStr() {
        return this.beforeStr;
    }

    public final String getAfterCode() {
        return this.afterCode;
    }

    public final void setAfterCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.afterCode = str;
    }

    public final String getAfterStr() {
        return this.afterStr;
    }

    public final void setAfterStr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.afterStr = str;
    }
}
