package com.wakeup.common.network.api;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialSearchService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/api/HotTagItem;", "", "tag", "", Const.SP_KEY_CALL_LOC_COUNT, "", "<init>", "(Ljava/lang/String;I)V", "getTag", "()Ljava/lang/String;", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HotTagItem {
    private final int count;
    private final String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public HotTagItem() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HotTagItem copy$default(HotTagItem hotTagItem, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hotTagItem.tag;
        }
        if ((i2 & 2) != 0) {
            i = hotTagItem.count;
        }
        return hotTagItem.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final HotTagItem copy(String tag, int count) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new HotTagItem(tag, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotTagItem)) {
            return false;
        }
        HotTagItem hotTagItem = (HotTagItem) other;
        return Intrinsics.areEqual(this.tag, hotTagItem.tag) && this.count == hotTagItem.count;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        return "HotTagItem(tag=" + this.tag + ", count=" + this.count + Separators.RPAREN;
    }

    public HotTagItem(String tag, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.count = i;
    }

    public /* synthetic */ HotTagItem(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }

    public final String getTag() {
        return this.tag;
    }

    public final int getCount() {
        return this.count;
    }
}
