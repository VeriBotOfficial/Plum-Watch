package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/wakeup/feature/plans/model/ChatStreamEvent;", "", ViewProps.ROLE, "", "delta", "text", "messageId", "recordTitle", "recordTag", "done", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getRole", "()Ljava/lang/String;", "getDelta", "getText", "getMessageId", "getRecordTitle", "getRecordTag", "getDone", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChatStreamEvent {
    private final String delta;
    private final boolean done;
    private final String messageId;
    private final String recordTag;
    private final String recordTitle;
    private final String role;
    private final String text;

    public ChatStreamEvent() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static /* synthetic */ ChatStreamEvent copy$default(ChatStreamEvent chatStreamEvent, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatStreamEvent.role;
        }
        if ((i & 2) != 0) {
            str2 = chatStreamEvent.delta;
        }
        if ((i & 4) != 0) {
            str3 = chatStreamEvent.text;
        }
        if ((i & 8) != 0) {
            str4 = chatStreamEvent.messageId;
        }
        if ((i & 16) != 0) {
            str5 = chatStreamEvent.recordTitle;
        }
        if ((i & 32) != 0) {
            str6 = chatStreamEvent.recordTag;
        }
        if ((i & 64) != 0) {
            z = chatStreamEvent.done;
        }
        String str7 = str6;
        boolean z2 = z;
        String str8 = str5;
        String str9 = str3;
        return chatStreamEvent.copy(str, str2, str9, str4, str8, str7, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDelta() {
        return this.delta;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRecordTitle() {
        return this.recordTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRecordTag() {
        return this.recordTag;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDone() {
        return this.done;
    }

    public final ChatStreamEvent copy(String role, String delta, String text, String messageId, String recordTitle, String recordTag, boolean done) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(delta, "delta");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(recordTitle, "recordTitle");
        Intrinsics.checkNotNullParameter(recordTag, "recordTag");
        return new ChatStreamEvent(role, delta, text, messageId, recordTitle, recordTag, done);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatStreamEvent)) {
            return false;
        }
        ChatStreamEvent chatStreamEvent = (ChatStreamEvent) other;
        return Intrinsics.areEqual(this.role, chatStreamEvent.role) && Intrinsics.areEqual(this.delta, chatStreamEvent.delta) && Intrinsics.areEqual(this.text, chatStreamEvent.text) && Intrinsics.areEqual(this.messageId, chatStreamEvent.messageId) && Intrinsics.areEqual(this.recordTitle, chatStreamEvent.recordTitle) && Intrinsics.areEqual(this.recordTag, chatStreamEvent.recordTag) && this.done == chatStreamEvent.done;
    }

    public int hashCode() {
        return (((((((((((this.role.hashCode() * 31) + this.delta.hashCode()) * 31) + this.text.hashCode()) * 31) + this.messageId.hashCode()) * 31) + this.recordTitle.hashCode()) * 31) + this.recordTag.hashCode()) * 31) + Boolean.hashCode(this.done);
    }

    public String toString() {
        return "ChatStreamEvent(role=" + this.role + ", delta=" + this.delta + ", text=" + this.text + ", messageId=" + this.messageId + ", recordTitle=" + this.recordTitle + ", recordTag=" + this.recordTag + ", done=" + this.done + Separators.RPAREN;
    }

    public ChatStreamEvent(String role, String delta, String text, String messageId, String recordTitle, String recordTag, boolean z) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(delta, "delta");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(recordTitle, "recordTitle");
        Intrinsics.checkNotNullParameter(recordTag, "recordTag");
        this.role = role;
        this.delta = delta;
        this.text = text;
        this.messageId = messageId;
        this.recordTitle = recordTitle;
        this.recordTag = recordTag;
        this.done = z;
    }

    public /* synthetic */ ChatStreamEvent(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? false : z);
    }

    public final String getRole() {
        return this.role;
    }

    public final String getDelta() {
        return this.delta;
    }

    public final String getText() {
        return this.text;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getRecordTitle() {
        return this.recordTitle;
    }

    public final String getRecordTag() {
        return this.recordTag;
    }

    public final boolean getDone() {
        return this.done;
    }
}
