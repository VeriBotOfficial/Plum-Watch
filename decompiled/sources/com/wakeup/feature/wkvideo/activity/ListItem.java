package com.wakeup.feature.wkvideo.activity;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoReportActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/wkvideo/activity/ListItem;", "", "title", "", "subList", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ListItem {
    private final List<String> subList;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListItem copy$default(ListItem listItem, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listItem.title;
        }
        if ((i & 2) != 0) {
            list = listItem.subList;
        }
        return listItem.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component2() {
        return this.subList;
    }

    public final ListItem copy(String title, List<String> subList) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ListItem(title, subList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListItem)) {
            return false;
        }
        ListItem listItem = (ListItem) other;
        return Intrinsics.areEqual(this.title, listItem.title) && Intrinsics.areEqual(this.subList, listItem.subList);
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        List<String> list = this.subList;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "ListItem(title=" + this.title + ", subList=" + this.subList + Separators.RPAREN;
    }

    public ListItem(String title, List<String> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subList = list;
    }

    public /* synthetic */ ListItem(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<String> getSubList() {
        return this.subList;
    }
}
