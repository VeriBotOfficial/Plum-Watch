package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CategoryLevelEntity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/video/CategoryLevelEntity;", "", "levelName", "", "childLevel", "", "levelId", "", "<init>", "(Ljava/lang/String;Ljava/util/List;I)V", "getLevelName", "()Ljava/lang/String;", "getChildLevel", "()Ljava/util/List;", "getLevelId", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CategoryLevelEntity {
    private final List<CategoryLevelEntity> childLevel;
    private final int levelId;
    private final String levelName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryLevelEntity copy$default(CategoryLevelEntity categoryLevelEntity, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = categoryLevelEntity.levelName;
        }
        if ((i2 & 2) != 0) {
            list = categoryLevelEntity.childLevel;
        }
        if ((i2 & 4) != 0) {
            i = categoryLevelEntity.levelId;
        }
        return categoryLevelEntity.copy(str, list, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLevelName() {
        return this.levelName;
    }

    public final List<CategoryLevelEntity> component2() {
        return this.childLevel;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLevelId() {
        return this.levelId;
    }

    public final CategoryLevelEntity copy(String levelName, List<CategoryLevelEntity> childLevel, int levelId) {
        Intrinsics.checkNotNullParameter(levelName, "levelName");
        Intrinsics.checkNotNullParameter(childLevel, "childLevel");
        return new CategoryLevelEntity(levelName, childLevel, levelId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryLevelEntity)) {
            return false;
        }
        CategoryLevelEntity categoryLevelEntity = (CategoryLevelEntity) other;
        return Intrinsics.areEqual(this.levelName, categoryLevelEntity.levelName) && Intrinsics.areEqual(this.childLevel, categoryLevelEntity.childLevel) && this.levelId == categoryLevelEntity.levelId;
    }

    public int hashCode() {
        return (((this.levelName.hashCode() * 31) + this.childLevel.hashCode()) * 31) + Integer.hashCode(this.levelId);
    }

    public String toString() {
        return "CategoryLevelEntity(levelName=" + this.levelName + ", childLevel=" + this.childLevel + ", levelId=" + this.levelId + Separators.RPAREN;
    }

    public CategoryLevelEntity(String levelName, List<CategoryLevelEntity> childLevel, int i) {
        Intrinsics.checkNotNullParameter(levelName, "levelName");
        Intrinsics.checkNotNullParameter(childLevel, "childLevel");
        this.levelName = levelName;
        this.childLevel = childLevel;
        this.levelId = i;
    }

    public final String getLevelName() {
        return this.levelName;
    }

    public final List<CategoryLevelEntity> getChildLevel() {
        return this.childLevel;
    }

    public final int getLevelId() {
        return this.levelId;
    }
}
