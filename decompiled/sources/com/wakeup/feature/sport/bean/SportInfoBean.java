package com.wakeup.feature.sport.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportInfoBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/feature/sport/bean/SportInfoBean;", "", "type", "", "value", "", "unit", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getType", "()I", "getValue", "()Ljava/lang/String;", "getUnit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "feature-sport_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SportInfoBean {
    private static final int TYPE_TIME = 0;
    private final int type;
    private final String unit;
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int TYPE_CALORIE = 1;
    private static final int TYPE_AVG_PACE = 2;
    private static final int TYPE_AVG_SPEED = 3;
    private static final int TYPE_AVG_STEP_FREQUENCY = 4;
    private static final int TYPE_AVG_STRIDE = 5;
    private static final int TYPE_STEP = 6;
    private static final int TYPE_AVG_HEART = 7;
    private static final int TYPE_CLIMB = 8;
    private static final int TYPE_DECLINE = 9;

    public static /* synthetic */ SportInfoBean copy$default(SportInfoBean sportInfoBean, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportInfoBean.type;
        }
        if ((i2 & 2) != 0) {
            str = sportInfoBean.value;
        }
        if ((i2 & 4) != 0) {
            str2 = sportInfoBean.unit;
        }
        return sportInfoBean.copy(i, str, str2);
    }

    public static final int getTYPE_AVG_HEART() {
        return INSTANCE.getTYPE_AVG_HEART();
    }

    public static final int getTYPE_AVG_PACE() {
        return INSTANCE.getTYPE_AVG_PACE();
    }

    public static final int getTYPE_AVG_SPEED() {
        return INSTANCE.getTYPE_AVG_SPEED();
    }

    public static final int getTYPE_AVG_STEP_FREQUENCY() {
        return INSTANCE.getTYPE_AVG_STEP_FREQUENCY();
    }

    public static final int getTYPE_AVG_STRIDE() {
        return INSTANCE.getTYPE_AVG_STRIDE();
    }

    public static final int getTYPE_CALORIE() {
        return INSTANCE.getTYPE_CALORIE();
    }

    public static final int getTYPE_CLIMB() {
        return INSTANCE.getTYPE_CLIMB();
    }

    public static final int getTYPE_DECLINE() {
        return INSTANCE.getTYPE_DECLINE();
    }

    public static final int getTYPE_STEP() {
        return INSTANCE.getTYPE_STEP();
    }

    public static final int getTYPE_TIME() {
        return INSTANCE.getTYPE_TIME();
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final SportInfoBean copy(int type, String value, String unit) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new SportInfoBean(type, value, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportInfoBean)) {
            return false;
        }
        SportInfoBean sportInfoBean = (SportInfoBean) other;
        return this.type == sportInfoBean.type && Intrinsics.areEqual(this.value, sportInfoBean.value) && Intrinsics.areEqual(this.unit, sportInfoBean.unit);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.type) * 31) + this.value.hashCode()) * 31;
        String str = this.unit;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SportInfoBean(type=" + this.type + ", value=" + this.value + ", unit=" + this.unit + Separators.RPAREN;
    }

    public SportInfoBean(int i, String value, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.type = i;
        this.value = value;
        this.unit = str;
    }

    public /* synthetic */ SportInfoBean(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }

    public final int getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getUnit() {
        return this.unit;
    }

    /* compiled from: SportInfoBean.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b \u0010\bR\u001c\u0010!\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/wakeup/feature/sport/bean/SportInfoBean$Companion;", "", "<init>", "()V", "TYPE_TIME", "", "getTYPE_TIME$annotations", "getTYPE_TIME", "()I", "TYPE_CALORIE", "getTYPE_CALORIE$annotations", "getTYPE_CALORIE", "TYPE_AVG_PACE", "getTYPE_AVG_PACE$annotations", "getTYPE_AVG_PACE", "TYPE_AVG_SPEED", "getTYPE_AVG_SPEED$annotations", "getTYPE_AVG_SPEED", "TYPE_AVG_STEP_FREQUENCY", "getTYPE_AVG_STEP_FREQUENCY$annotations", "getTYPE_AVG_STEP_FREQUENCY", "TYPE_AVG_STRIDE", "getTYPE_AVG_STRIDE$annotations", "getTYPE_AVG_STRIDE", "TYPE_STEP", "getTYPE_STEP$annotations", "getTYPE_STEP", "TYPE_AVG_HEART", "getTYPE_AVG_HEART$annotations", "getTYPE_AVG_HEART", "TYPE_CLIMB", "getTYPE_CLIMB$annotations", "getTYPE_CLIMB", "TYPE_DECLINE", "getTYPE_DECLINE$annotations", "getTYPE_DECLINE", "feature-sport_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_AVG_HEART$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_AVG_PACE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_AVG_SPEED$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_AVG_STEP_FREQUENCY$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_AVG_STRIDE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_CALORIE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_CLIMB$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_DECLINE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_STEP$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTYPE_TIME$annotations() {
        }

        private Companion() {
        }

        public final int getTYPE_TIME() {
            return SportInfoBean.TYPE_TIME;
        }

        public final int getTYPE_CALORIE() {
            return SportInfoBean.TYPE_CALORIE;
        }

        public final int getTYPE_AVG_PACE() {
            return SportInfoBean.TYPE_AVG_PACE;
        }

        public final int getTYPE_AVG_SPEED() {
            return SportInfoBean.TYPE_AVG_SPEED;
        }

        public final int getTYPE_AVG_STEP_FREQUENCY() {
            return SportInfoBean.TYPE_AVG_STEP_FREQUENCY;
        }

        public final int getTYPE_AVG_STRIDE() {
            return SportInfoBean.TYPE_AVG_STRIDE;
        }

        public final int getTYPE_STEP() {
            return SportInfoBean.TYPE_STEP;
        }

        public final int getTYPE_AVG_HEART() {
            return SportInfoBean.TYPE_AVG_HEART;
        }

        public final int getTYPE_CLIMB() {
            return SportInfoBean.TYPE_CLIMB;
        }

        public final int getTYPE_DECLINE() {
            return SportInfoBean.TYPE_DECLINE;
        }
    }
}
