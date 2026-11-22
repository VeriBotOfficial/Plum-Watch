package com.xmly.businesssdk.network.bean.listen;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListenData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/xmly/businesssdk/network/bean/listen/ListenResponse;", "", "data", "", "", "Lcom/xmly/businesssdk/network/bean/listen/ListenGroup;", "(Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ListenResponse {

    @SerializedName("data")
    private final Map<String, ListenGroup> data;

    /* JADX WARN: Multi-variable type inference failed */
    public ListenResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ListenResponse(Map<String, ListenGroup> map) {
        this.data = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListenResponse copy$default(ListenResponse listenResponse, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = listenResponse.data;
        }
        return listenResponse.copy(map);
    }

    public final Map<String, ListenGroup> component1() {
        return this.data;
    }

    public final ListenResponse copy(Map<String, ListenGroup> data) {
        return new ListenResponse(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ListenResponse) && Intrinsics.areEqual(this.data, ((ListenResponse) other).data);
    }

    public final Map<String, ListenGroup> getData() {
        return this.data;
    }

    public int hashCode() {
        Map<String, ListenGroup> map = this.data;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return c.a("ListenResponse(data=").append(this.data).append(')').toString();
    }

    public /* synthetic */ ListenResponse(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
