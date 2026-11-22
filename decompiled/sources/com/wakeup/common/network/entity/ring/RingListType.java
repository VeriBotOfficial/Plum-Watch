package com.wakeup.common.network.entity.ring;

import com.facebook.hermes.intl.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RingListType.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/ring/RingListType;", "", "id", "", "typeId", "categoryId", "name", "", Constants.SORT, "icon", "<init>", "(IIILjava/lang/String;ILjava/lang/String;)V", "getId", "()I", "getTypeId", "getCategoryId", "getName", "()Ljava/lang/String;", "getSort", "getIcon", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RingListType {
    private final int categoryId;
    private final String icon;
    private final int id;
    private final String name;
    private final int sort;
    private final int typeId;

    public RingListType(int i, int i2, int i3, String name, int i4, String icon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.id = i;
        this.typeId = i2;
        this.categoryId = i3;
        this.name = name;
        this.sort = i4;
        this.icon = icon;
    }

    public final int getId() {
        return this.id;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSort() {
        return this.sort;
    }

    public final String getIcon() {
        return this.icon;
    }
}
