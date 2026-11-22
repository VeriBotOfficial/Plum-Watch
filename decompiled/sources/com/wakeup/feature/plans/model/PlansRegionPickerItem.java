package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansCityTree.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/wakeup/feature/plans/model/PlansRegionPickerItem;", "", "<init>", "()V", "label", "", "getLabel", "()Ljava/lang/String;", "Domestic", "Overseas", "Lcom/wakeup/feature/plans/model/PlansRegionPickerItem$Domestic;", "Lcom/wakeup/feature/plans/model/PlansRegionPickerItem$Overseas;", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PlansRegionPickerItem {
    public /* synthetic */ PlansRegionPickerItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getLabel();

    private PlansRegionPickerItem() {
    }

    /* compiled from: PlansCityTree.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/plans/model/PlansRegionPickerItem$Domestic;", "Lcom/wakeup/feature/plans/model/PlansRegionPickerItem;", "index", "", "provinceName", "", "<init>", "(ILjava/lang/String;)V", "getIndex", "()I", "getProvinceName", "()Ljava/lang/String;", "label", "getLabel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Domestic extends PlansRegionPickerItem {
        private final int index;
        private final String label;
        private final String provinceName;

        public static /* synthetic */ Domestic copy$default(Domestic domestic, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = domestic.index;
            }
            if ((i2 & 2) != 0) {
                str = domestic.provinceName;
            }
            return domestic.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProvinceName() {
            return this.provinceName;
        }

        public final Domestic copy(int index, String provinceName) {
            Intrinsics.checkNotNullParameter(provinceName, "provinceName");
            return new Domestic(index, provinceName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Domestic)) {
                return false;
            }
            Domestic domestic = (Domestic) other;
            return this.index == domestic.index && Intrinsics.areEqual(this.provinceName, domestic.provinceName);
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + this.provinceName.hashCode();
        }

        public String toString() {
            return "Domestic(index=" + this.index + ", provinceName=" + this.provinceName + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Domestic(int i, String provinceName) {
            super(null);
            Intrinsics.checkNotNullParameter(provinceName, "provinceName");
            this.index = i;
            this.provinceName = provinceName;
            this.label = provinceName;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getProvinceName() {
            return this.provinceName;
        }

        @Override // com.wakeup.feature.plans.model.PlansRegionPickerItem
        public String getLabel() {
            return this.label;
        }
    }

    /* compiled from: PlansCityTree.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/plans/model/PlansRegionPickerItem$Overseas;", "Lcom/wakeup/feature/plans/model/PlansRegionPickerItem;", "index", "", "country", "", "<init>", "(ILjava/lang/String;)V", "getIndex", "()I", "getCountry", "()Ljava/lang/String;", "label", "getLabel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Overseas extends PlansRegionPickerItem {
        private final String country;
        private final int index;
        private final String label;

        public static /* synthetic */ Overseas copy$default(Overseas overseas, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = overseas.index;
            }
            if ((i2 & 2) != 0) {
                str = overseas.country;
            }
            return overseas.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public final Overseas copy(int index, String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            return new Overseas(index, country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Overseas)) {
                return false;
            }
            Overseas overseas = (Overseas) other;
            return this.index == overseas.index && Intrinsics.areEqual(this.country, overseas.country);
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + this.country.hashCode();
        }

        public String toString() {
            return "Overseas(index=" + this.index + ", country=" + this.country + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Overseas(int i, String country) {
            super(null);
            Intrinsics.checkNotNullParameter(country, "country");
            this.index = i;
            this.country = country;
            this.label = country;
        }

        public final String getCountry() {
            return this.country;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // com.wakeup.feature.plans.model.PlansRegionPickerItem
        public String getLabel() {
            return this.label;
        }
    }
}
