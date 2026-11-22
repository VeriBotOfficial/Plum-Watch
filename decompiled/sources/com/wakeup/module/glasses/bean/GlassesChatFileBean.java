package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesChatFileBean.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesChatFileBean;", "", "type", "", "id", "", "time", "", "<init>", "(ILjava/lang/String;J)V", "getType", "()I", "setType", "(I)V", "getId", "()Ljava/lang/String;", "getTime", "()J", "chatList", "", "Lcom/wakeup/module/glasses/bean/GlassesChatFile;", "getChatList", "()Ljava/util/List;", "setChatList", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GlassesChatFileBean {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<GlassesChatFile> chatList;
    private final String id;
    private final long time;
    private int type;

    public static /* synthetic */ GlassesChatFileBean copy$default(GlassesChatFileBean glassesChatFileBean, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = glassesChatFileBean.type;
        }
        if ((i2 & 2) != 0) {
            str = glassesChatFileBean.id;
        }
        if ((i2 & 4) != 0) {
            j = glassesChatFileBean.time;
        }
        return glassesChatFileBean.copy(i, str, j);
    }

    @JvmStatic
    public static final String generateId() {
        return INSTANCE.generateId();
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final GlassesChatFileBean copy(int type, String id2, long time) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new GlassesChatFileBean(type, id2, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesChatFileBean)) {
            return false;
        }
        GlassesChatFileBean glassesChatFileBean = (GlassesChatFileBean) other;
        return this.type == glassesChatFileBean.type && Intrinsics.areEqual(this.id, glassesChatFileBean.id) && this.time == glassesChatFileBean.time;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.type) * 31) + this.id.hashCode()) * 31) + Long.hashCode(this.time);
    }

    public String toString() {
        return "GlassesChatFileBean(type=" + this.type + ", id=" + this.id + ", time=" + this.time + Separators.RPAREN;
    }

    public GlassesChatFileBean(int i, String id2, long j) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.type = i;
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

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final List<GlassesChatFile> getChatList() {
        return this.chatList;
    }

    public final void setChatList(List<GlassesChatFile> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.chatList = list;
    }

    /* compiled from: GlassesChatFileBean.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesChatFileBean$Companion;", "", "<init>", "()V", "generateId", "", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
}
