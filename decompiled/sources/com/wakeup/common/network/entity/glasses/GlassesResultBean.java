package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import com.facebook.react.uimanager.ViewProps;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GlassesResultBean;", "", "status", "", "content", "", JsonStorageKeyNames.SESSION_ID_KEY, "problemText", "languageId", "dataType", ViewProps.ROLE, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", "getStatus", "()I", "getContent", "()Ljava/lang/String;", "getSessionId", "getProblemText", "getLanguageId", "getDataType", "getRole", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesResultBean {
    private final String content;
    private final int dataType;
    private final int languageId;
    private final String problemText;
    private final int role;
    private final String sessionId;
    private final int status;

    public static /* synthetic */ GlassesResultBean copy$default(GlassesResultBean glassesResultBean, int i, String str, String str2, String str3, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = glassesResultBean.status;
        }
        if ((i5 & 2) != 0) {
            str = glassesResultBean.content;
        }
        if ((i5 & 4) != 0) {
            str2 = glassesResultBean.sessionId;
        }
        if ((i5 & 8) != 0) {
            str3 = glassesResultBean.problemText;
        }
        if ((i5 & 16) != 0) {
            i2 = glassesResultBean.languageId;
        }
        if ((i5 & 32) != 0) {
            i3 = glassesResultBean.dataType;
        }
        if ((i5 & 64) != 0) {
            i4 = glassesResultBean.role;
        }
        int i6 = i3;
        int i7 = i4;
        int i8 = i2;
        String str4 = str2;
        return glassesResultBean.copy(i, str, str4, str3, i8, i6, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProblemText() {
        return this.problemText;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLanguageId() {
        return this.languageId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRole() {
        return this.role;
    }

    public final GlassesResultBean copy(int status, String content, String sessionId, String problemText, int languageId, int dataType, int role) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(problemText, "problemText");
        return new GlassesResultBean(status, content, sessionId, problemText, languageId, dataType, role);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesResultBean)) {
            return false;
        }
        GlassesResultBean glassesResultBean = (GlassesResultBean) other;
        return this.status == glassesResultBean.status && Intrinsics.areEqual(this.content, glassesResultBean.content) && Intrinsics.areEqual(this.sessionId, glassesResultBean.sessionId) && Intrinsics.areEqual(this.problemText, glassesResultBean.problemText) && this.languageId == glassesResultBean.languageId && this.dataType == glassesResultBean.dataType && this.role == glassesResultBean.role;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.status) * 31;
        String str = this.content;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sessionId.hashCode()) * 31) + this.problemText.hashCode()) * 31) + Integer.hashCode(this.languageId)) * 31) + Integer.hashCode(this.dataType)) * 31) + Integer.hashCode(this.role);
    }

    public String toString() {
        return "GlassesResultBean(status=" + this.status + ", content=" + this.content + ", sessionId=" + this.sessionId + ", problemText=" + this.problemText + ", languageId=" + this.languageId + ", dataType=" + this.dataType + ", role=" + this.role + Separators.RPAREN;
    }

    public GlassesResultBean(int i, String str, String sessionId, String problemText, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(problemText, "problemText");
        this.status = i;
        this.content = str;
        this.sessionId = sessionId;
        this.problemText = problemText;
        this.languageId = i2;
        this.dataType = i3;
        this.role = i4;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getProblemText() {
        return this.problemText;
    }

    public final int getLanguageId() {
        return this.languageId;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final int getRole() {
        return this.role;
    }
}
