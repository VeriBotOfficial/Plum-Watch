package com.wakeup.feature.health.weight;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import com.wakeup.common.storage.CacheManager;
import com.wakeup.common.storage.UserDao;
import com.wakeup.common.utils.DateUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeightTargetMgr.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/feature/health/weight/WeightTargetMgr;", "", "<init>", "()V", "CACHE_KEY", "", "saveTarget", "", AMapLocationStaticsEntity.FIRST_LOCATE, "", "target", "getTarget", "Lcom/wakeup/feature/health/weight/WeightTargetMgr$WeightTarget;", "WeightTarget", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WeightTargetMgr {
    public static final int $stable = 0;
    public static final WeightTargetMgr INSTANCE = new WeightTargetMgr();
    private static final String CACHE_KEY = "weight_target";

    private WeightTargetMgr() {
    }

    public final void saveTarget(int first, int target) {
        String token = UserDao.getToken();
        long dayStartTime = DateUtil.getDayStartTime();
        CacheManager cacheManager = CacheManager.INSTANCE;
        String str = CACHE_KEY;
        Intrinsics.checkNotNull(token);
        cacheManager.saveData(str, new WeightTarget(token, first, target, dayStartTime));
    }

    public final WeightTarget getTarget() {
        String token = UserDao.getToken();
        WeightTarget weightTarget = (WeightTarget) CacheManager.INSTANCE.getData(CACHE_KEY, WeightTarget.class);
        if (weightTarget != null && Intrinsics.areEqual(weightTarget.getToken(), token)) {
            return weightTarget;
        }
        return null;
    }

    /* compiled from: WeightTargetMgr.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/wakeup/feature/health/weight/WeightTargetMgr$WeightTarget;", "", "token", "", AMapLocationStaticsEntity.FIRST_LOCATE, "", "target", "createTime", "", "<init>", "(Ljava/lang/String;IIJ)V", "getToken", "()Ljava/lang/String;", "getFirst", "()I", "setFirst", "(I)V", "getTarget", "setTarget", "getCreateTime", "()J", "isGain", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WeightTarget {
        public static final int $stable = 8;
        private final long createTime;
        private int first;
        private int target;
        private final String token;

        public static /* synthetic */ WeightTarget copy$default(WeightTarget weightTarget, String str, int i, int i2, long j, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = weightTarget.token;
            }
            if ((i3 & 2) != 0) {
                i = weightTarget.first;
            }
            if ((i3 & 4) != 0) {
                i2 = weightTarget.target;
            }
            if ((i3 & 8) != 0) {
                j = weightTarget.createTime;
            }
            int i4 = i2;
            return weightTarget.copy(str, i, i4, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        /* renamed from: component2, reason: from getter */
        public final int getFirst() {
            return this.first;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTarget() {
            return this.target;
        }

        /* renamed from: component4, reason: from getter */
        public final long getCreateTime() {
            return this.createTime;
        }

        public final WeightTarget copy(String token, int first, int target, long createTime) {
            Intrinsics.checkNotNullParameter(token, "token");
            return new WeightTarget(token, first, target, createTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeightTarget)) {
                return false;
            }
            WeightTarget weightTarget = (WeightTarget) other;
            return Intrinsics.areEqual(this.token, weightTarget.token) && this.first == weightTarget.first && this.target == weightTarget.target && this.createTime == weightTarget.createTime;
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + Integer.hashCode(this.first)) * 31) + Integer.hashCode(this.target)) * 31) + Long.hashCode(this.createTime);
        }

        public String toString() {
            return "WeightTarget(token=" + this.token + ", first=" + this.first + ", target=" + this.target + ", createTime=" + this.createTime + Separators.RPAREN;
        }

        public WeightTarget(String token, int i, int i2, long j) {
            Intrinsics.checkNotNullParameter(token, "token");
            this.token = token;
            this.first = i;
            this.target = i2;
            this.createTime = j;
        }

        public final String getToken() {
            return this.token;
        }

        public final int getFirst() {
            return this.first;
        }

        public final void setFirst(int i) {
            this.first = i;
        }

        public final int getTarget() {
            return this.target;
        }

        public final void setTarget(int i) {
            this.target = i;
        }

        public final long getCreateTime() {
            return this.createTime;
        }

        public final boolean isGain() {
            return this.target - this.first > 0;
        }
    }
}
