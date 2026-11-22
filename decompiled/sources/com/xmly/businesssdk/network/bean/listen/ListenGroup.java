package com.xmly.businesssdk.network.bean.listen;

import com.autonavi.aps.amapapi.config.Const;
import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListenData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006!"}, d2 = {"Lcom/xmly/businesssdk/network/bean/listen/ListenGroup;", "", "id", "", "title", "", "bizType", Const.SP_KEY_CALL_LOC_COUNT, "", "listens", "", "Lcom/xmly/businesssdk/network/bean/listen/ListenItem;", "(JLjava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getBizType", "()Ljava/lang/String;", "getCount", "()I", "getId", "()J", "getListens", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ListenGroup {

    @SerializedName("biz_type")
    private final String bizType;

    @SerializedName(Const.SP_KEY_CALL_LOC_COUNT)
    private final int count;

    @SerializedName("id")
    private final long id;

    @SerializedName("listens")
    private final List<ListenItem> listens;

    @SerializedName("title")
    private final String title;

    public ListenGroup() {
        this(0L, null, null, 0, null, 31, null);
    }

    public ListenGroup(long j, String str, String str2, int i, List<ListenItem> list) {
        this.id = j;
        this.title = str;
        this.bizType = str2;
        this.count = i;
        this.listens = list;
    }

    public static /* synthetic */ ListenGroup copy$default(ListenGroup listenGroup, long j, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = listenGroup.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = listenGroup.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = listenGroup.bizType;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            i = listenGroup.count;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list = listenGroup.listens;
        }
        return listenGroup.copy(j2, str3, str4, i3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final List<ListenItem> component5() {
        return this.listens;
    }

    public final ListenGroup copy(long id2, String title, String bizType, int count, List<ListenItem> listens) {
        return new ListenGroup(id2, title, bizType, count, listens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListenGroup)) {
            return false;
        }
        ListenGroup listenGroup = (ListenGroup) other;
        return this.id == listenGroup.id && Intrinsics.areEqual(this.title, listenGroup.title) && Intrinsics.areEqual(this.bizType, listenGroup.bizType) && this.count == listenGroup.count && Intrinsics.areEqual(this.listens, listenGroup.listens);
    }

    public final String getBizType() {
        return this.bizType;
    }

    public final int getCount() {
        return this.count;
    }

    public final long getId() {
        return this.id;
    }

    public final List<ListenItem> getListens() {
        return this.listens;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bizType;
        int a2 = b.a(this.count, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        List<ListenItem> list = this.listens;
        return a2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return c.a("ListenGroup(id=").append(this.id).append(", title=").append(this.title).append(", bizType=").append(this.bizType).append(", count=").append(this.count).append(", listens=").append(this.listens).append(')').toString();
    }

    public /* synthetic */ ListenGroup(long j, String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : list);
    }
}
