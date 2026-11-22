package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesChatBean.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesChatBean;", "", "id", "", "time", "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getTime", "()J", "chatList", "", "Lcom/wakeup/module/glasses/bean/GlassesChat;", "getChatList", "()Ljava/util/List;", "setChatList", "(Ljava/util/List;)V", "isFirsting", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GlassesChatBean {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<GlassesChat> chatList;
    private final String id;
    private final long time;

    public static /* synthetic */ GlassesChatBean copy$default(GlassesChatBean glassesChatBean, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glassesChatBean.id;
        }
        if ((i & 2) != 0) {
            j = glassesChatBean.time;
        }
        return glassesChatBean.copy(str, j);
    }

    @JvmStatic
    public static final String generateId() {
        return INSTANCE.generateId();
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final GlassesChatBean copy(String id2, long time) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new GlassesChatBean(id2, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesChatBean)) {
            return false;
        }
        GlassesChatBean glassesChatBean = (GlassesChatBean) other;
        return Intrinsics.areEqual(this.id, glassesChatBean.id) && this.time == glassesChatBean.time;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + Long.hashCode(this.time);
    }

    public String toString() {
        return "GlassesChatBean(id=" + this.id + ", time=" + this.time + Separators.RPAREN;
    }

    public GlassesChatBean(String id2, long j) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.time = j;
        this.chatList = new ArrayList();
    }

    public final String getId() {
        return this.id;
    }

    public final long getTime() {
        return this.time;
    }

    /* compiled from: GlassesChatBean.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesChatBean$Companion;", "", "<init>", "()V", "generateId", "", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String generateId() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            return uuid;
        }
    }

    public final List<GlassesChat> getChatList() {
        return this.chatList;
    }

    public final void setChatList(List<GlassesChat> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.chatList = list;
    }

    public final boolean isFirsting() {
        return !this.chatList.get(0).getIsAnswerEnd();
    }
}
