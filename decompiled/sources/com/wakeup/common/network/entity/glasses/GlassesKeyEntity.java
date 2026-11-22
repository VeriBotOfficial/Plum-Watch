package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import com.anythink.core.d.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesKeyEntity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GlassesKeyEntity;", "", l.a.ac, "", "keyList", "", "Lcom/wakeup/common/network/entity/glasses/GlassesKey;", "physicsImg", "", "touchImg", "<init>", "(JLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getUpdateTime", "()J", "getKeyList", "()Ljava/util/List;", "getPhysicsImg", "()Ljava/lang/String;", "getTouchImg", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesKeyEntity {
    private final List<GlassesKey> keyList;
    private final String physicsImg;
    private final String touchImg;
    private final long updateTime;

    public static /* synthetic */ GlassesKeyEntity copy$default(GlassesKeyEntity glassesKeyEntity, long j, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = glassesKeyEntity.updateTime;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            list = glassesKeyEntity.keyList;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str = glassesKeyEntity.physicsImg;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = glassesKeyEntity.touchImg;
        }
        return glassesKeyEntity.copy(j2, list2, str3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final List<GlassesKey> component2() {
        return this.keyList;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhysicsImg() {
        return this.physicsImg;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTouchImg() {
        return this.touchImg;
    }

    public final GlassesKeyEntity copy(long updateTime, List<GlassesKey> keyList, String physicsImg, String touchImg) {
        Intrinsics.checkNotNullParameter(keyList, "keyList");
        return new GlassesKeyEntity(updateTime, keyList, physicsImg, touchImg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesKeyEntity)) {
            return false;
        }
        GlassesKeyEntity glassesKeyEntity = (GlassesKeyEntity) other;
        return this.updateTime == glassesKeyEntity.updateTime && Intrinsics.areEqual(this.keyList, glassesKeyEntity.keyList) && Intrinsics.areEqual(this.physicsImg, glassesKeyEntity.physicsImg) && Intrinsics.areEqual(this.touchImg, glassesKeyEntity.touchImg);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.updateTime) * 31) + this.keyList.hashCode()) * 31;
        String str = this.physicsImg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.touchImg;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GlassesKeyEntity(updateTime=" + this.updateTime + ", keyList=" + this.keyList + ", physicsImg=" + this.physicsImg + ", touchImg=" + this.touchImg + Separators.RPAREN;
    }

    public GlassesKeyEntity(long j, List<GlassesKey> keyList, String str, String str2) {
        Intrinsics.checkNotNullParameter(keyList, "keyList");
        this.updateTime = j;
        this.keyList = keyList;
        this.physicsImg = str;
        this.touchImg = str2;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final List<GlassesKey> getKeyList() {
        return this.keyList;
    }

    public final String getPhysicsImg() {
        return this.physicsImg;
    }

    public final String getTouchImg() {
        return this.touchImg;
    }
}
