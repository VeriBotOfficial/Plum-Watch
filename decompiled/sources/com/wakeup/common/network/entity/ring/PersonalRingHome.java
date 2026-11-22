package com.wakeup.common.network.entity.ring;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonalRingHome.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JK\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006/"}, d2 = {"Lcom/wakeup/common/network/entity/ring/PersonalRingHome;", "", "id", "", "categoryId", "", "typeId", "name", "", "icon", "list", "", "Lcom/wakeup/common/network/entity/ring/PersonalRingEntity;", "<init>", "(JIILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()J", "setId", "(J)V", "getCategoryId", "()I", "setCategoryId", "(I)V", "getTypeId", "setTypeId", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PersonalRingHome {
    private int categoryId;
    private String icon;
    private long id;
    private List<PersonalRingEntity> list;
    private String name;
    private int typeId;

    public static /* synthetic */ PersonalRingHome copy$default(PersonalRingHome personalRingHome, long j, int i, int i2, String str, String str2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = personalRingHome.id;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = personalRingHome.categoryId;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = personalRingHome.typeId;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = personalRingHome.name;
        }
        String str3 = str;
        if ((i3 & 16) != 0) {
            str2 = personalRingHome.icon;
        }
        String str4 = str2;
        if ((i3 & 32) != 0) {
            list = personalRingHome.list;
        }
        return personalRingHome.copy(j2, i4, i5, str3, str4, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final List<PersonalRingEntity> component6() {
        return this.list;
    }

    public final PersonalRingHome copy(long id2, int categoryId, int typeId, String name, String icon, List<PersonalRingEntity> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(list, "list");
        return new PersonalRingHome(id2, categoryId, typeId, name, icon, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalRingHome)) {
            return false;
        }
        PersonalRingHome personalRingHome = (PersonalRingHome) other;
        return this.id == personalRingHome.id && this.categoryId == personalRingHome.categoryId && this.typeId == personalRingHome.typeId && Intrinsics.areEqual(this.name, personalRingHome.name) && Intrinsics.areEqual(this.icon, personalRingHome.icon) && Intrinsics.areEqual(this.list, personalRingHome.list);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.categoryId)) * 31) + Integer.hashCode(this.typeId)) * 31) + this.name.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.list.hashCode();
    }

    public String toString() {
        return "PersonalRingHome(id=" + this.id + ", categoryId=" + this.categoryId + ", typeId=" + this.typeId + ", name=" + this.name + ", icon=" + this.icon + ", list=" + this.list + Separators.RPAREN;
    }

    public PersonalRingHome(long j, int i, int i2, String name, String icon, List<PersonalRingEntity> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(list, "list");
        this.id = j;
        this.categoryId = i;
        this.typeId = i2;
        this.name = name;
        this.icon = icon;
        this.list = list;
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final void setCategoryId(int i) {
        this.categoryId = i;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final void setTypeId(int i) {
        this.typeId = i;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    public /* synthetic */ PersonalRingHome(long j, int i, int i2, String str, String str2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, str, str2, (i3 & 32) != 0 ? new ArrayList() : list);
    }

    public final List<PersonalRingEntity> getList() {
        return this.list;
    }

    public final void setList(List<PersonalRingEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }
}
