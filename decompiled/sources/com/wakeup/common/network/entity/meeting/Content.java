package com.wakeup.common.network.entity.meeting;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeetingBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/meeting/Content;", "", "type", "", "text", "", "transText", "textTime", "spokesman", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()I", "getText", "()Ljava/lang/String;", "getTransText", "getTextTime", "getSpokesman", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Content {
    private final String spokesman;
    private final String text;
    private final String textTime;
    private final String transText;
    private final int type;

    public static /* synthetic */ Content copy$default(Content content, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = content.type;
        }
        if ((i2 & 2) != 0) {
            str = content.text;
        }
        if ((i2 & 4) != 0) {
            str2 = content.transText;
        }
        if ((i2 & 8) != 0) {
            str3 = content.textTime;
        }
        if ((i2 & 16) != 0) {
            str4 = content.spokesman;
        }
        String str5 = str4;
        String str6 = str2;
        return content.copy(i, str, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransText() {
        return this.transText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTextTime() {
        return this.textTime;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSpokesman() {
        return this.spokesman;
    }

    public final Content copy(int type, String text, String transText, String textTime, String spokesman) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(transText, "transText");
        Intrinsics.checkNotNullParameter(textTime, "textTime");
        Intrinsics.checkNotNullParameter(spokesman, "spokesman");
        return new Content(type, text, transText, textTime, spokesman);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Content)) {
            return false;
        }
        Content content = (Content) other;
        return this.type == content.type && Intrinsics.areEqual(this.text, content.text) && Intrinsics.areEqual(this.transText, content.transText) && Intrinsics.areEqual(this.textTime, content.textTime) && Intrinsics.areEqual(this.spokesman, content.spokesman);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.type) * 31) + this.text.hashCode()) * 31) + this.transText.hashCode()) * 31) + this.textTime.hashCode()) * 31) + this.spokesman.hashCode();
    }

    public String toString() {
        return "Content(type=" + this.type + ", text=" + this.text + ", transText=" + this.transText + ", textTime=" + this.textTime + ", spokesman=" + this.spokesman + Separators.RPAREN;
    }

    public Content(int i, String text, String transText, String textTime, String spokesman) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(transText, "transText");
        Intrinsics.checkNotNullParameter(textTime, "textTime");
        Intrinsics.checkNotNullParameter(spokesman, "spokesman");
        this.type = i;
        this.text = text;
        this.transText = transText;
        this.textTime = textTime;
        this.spokesman = spokesman;
    }

    public final int getType() {
        return this.type;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTransText() {
        return this.transText;
    }

    public final String getTextTime() {
        return this.textTime;
    }

    public final String getSpokesman() {
        return this.spokesman;
    }
}
