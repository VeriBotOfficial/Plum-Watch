package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CategoryEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J7\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/video/CategoryEntity;", "", "levelName", "", "levelId", "", "childLevel", "", "isSelected", "", "<init>", "(Ljava/lang/String;ILjava/util/List;Z)V", "getLevelName", "()Ljava/lang/String;", "setLevelName", "(Ljava/lang/String;)V", "getLevelId", "()I", "setLevelId", "(I)V", "getChildLevel", "()Ljava/util/List;", "setChildLevel", "(Ljava/util/List;)V", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CategoryEntity {
    private List<CategoryEntity> childLevel;
    private boolean isSelected;
    private int levelId;
    private String levelName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryEntity copy$default(CategoryEntity categoryEntity, String str, int i, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = categoryEntity.levelName;
        }
        if ((i2 & 2) != 0) {
            i = categoryEntity.levelId;
        }
        if ((i2 & 4) != 0) {
            list = categoryEntity.childLevel;
        }
        if ((i2 & 8) != 0) {
            z = categoryEntity.isSelected;
        }
        return categoryEntity.copy(str, i, list, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLevelName() {
        return this.levelName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevelId() {
        return this.levelId;
    }

    public final List<CategoryEntity> component3() {
        return this.childLevel;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final CategoryEntity copy(String levelName, int levelId, List<CategoryEntity> childLevel, boolean isSelected) {
        Intrinsics.checkNotNullParameter(levelName, "levelName");
        Intrinsics.checkNotNullParameter(childLevel, "childLevel");
        return new CategoryEntity(levelName, levelId, childLevel, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryEntity)) {
            return false;
        }
        CategoryEntity categoryEntity = (CategoryEntity) other;
        return Intrinsics.areEqual(this.levelName, categoryEntity.levelName) && this.levelId == categoryEntity.levelId && Intrinsics.areEqual(this.childLevel, categoryEntity.childLevel) && this.isSelected == categoryEntity.isSelected;
    }

    public int hashCode() {
        return (((((this.levelName.hashCode() * 31) + Integer.hashCode(this.levelId)) * 31) + this.childLevel.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "CategoryEntity(levelName=" + this.levelName + ", levelId=" + this.levelId + ", childLevel=" + this.childLevel + ", isSelected=" + this.isSelected + Separators.RPAREN;
    }

    public CategoryEntity(String levelName, int i, List<CategoryEntity> childLevel, boolean z) {
        Intrinsics.checkNotNullParameter(levelName, "levelName");
        Intrinsics.checkNotNullParameter(childLevel, "childLevel");
        this.levelName = levelName;
        this.levelId = i;
        this.childLevel = childLevel;
        this.isSelected = z;
    }

    public final String getLevelName() {
        return this.levelName;
    }

    public final void setLevelName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.levelName = str;
    }

    public final int getLevelId() {
        return this.levelId;
    }

    public final void setLevelId(int i) {
        this.levelId = i;
    }

    public final List<CategoryEntity> getChildLevel() {
        return this.childLevel;
    }

    public final void setChildLevel(List<CategoryEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.childLevel = list;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
