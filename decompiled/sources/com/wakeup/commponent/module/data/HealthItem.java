package com.wakeup.commponent.module.data;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: HealthItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ#\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J#\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/wakeup/commponent/module/data/HealthItem;", "", "position", "", "values", "Lorg/json/JSONObject;", "<init>", "(ILorg/json/JSONObject;)V", "getPosition", "()I", "getValueY", "valueType", "", "getValueF", "", "setValue", "kotlin.jvm.PlatformType", "value", "(Ljava/lang/String;I)Lorg/json/JSONObject;", "(Ljava/lang/String;F)Lorg/json/JSONObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HealthItem {
    public static final String TYPE_AVG_DBP_Y = "averageDiastolicY";
    public static final String TYPE_AVG_PULSE = "pulse";
    public static final String TYPE_AVG_SBP_Y = "averageSystolicY";
    public static final String TYPE_AWAKE_Y = "awakeY";
    public static final String TYPE_BS_MAX_TYPE = "bs_max_type";
    public static final String TYPE_BS_MIN_TYPE = "bs_min_type";
    public static final String TYPE_DEEP_Y = "deepY";
    public static final String TYPE_MAX_Y = "maxY";
    public static final String TYPE_MIN_Y = "minY";
    public static final String TYPE_NAP_Y = "napY";
    public static final String TYPE_REM_Y = "remY";
    public static final String TYPE_SHALLOW_Y = "shallowY";
    public static final String TYPE_Y = "y";
    private final int position;
    private JSONObject values;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthItem() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component2, reason: from getter */
    private final JSONObject getValues() {
        return this.values;
    }

    public static /* synthetic */ HealthItem copy$default(HealthItem healthItem, int i, JSONObject jSONObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = healthItem.position;
        }
        if ((i2 & 2) != 0) {
            jSONObject = healthItem.values;
        }
        return healthItem.copy(i, jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    public final HealthItem copy(int position, JSONObject values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return new HealthItem(position, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthItem)) {
            return false;
        }
        HealthItem healthItem = (HealthItem) other;
        return this.position == healthItem.position && Intrinsics.areEqual(this.values, healthItem.values);
    }

    public int hashCode() {
        return (Integer.hashCode(this.position) * 31) + this.values.hashCode();
    }

    public String toString() {
        return "HealthItem(position=" + this.position + ", values=" + this.values + Separators.RPAREN;
    }

    public HealthItem(int i, JSONObject values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.position = i;
        this.values = values;
    }

    public final int getPosition() {
        return this.position;
    }

    public /* synthetic */ HealthItem(int i, JSONObject jSONObject, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new JSONObject() : jSONObject);
    }

    public final int getValueY(String valueType) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        if (!this.values.has(valueType)) {
            return 0;
        }
        Object obj = this.values.get(valueType);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    public final float getValueF(String valueType) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        if (!this.values.has(valueType)) {
            return 0.0f;
        }
        Object obj = this.values.get(valueType);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) obj).floatValue();
    }

    public final JSONObject setValue(String valueType, int value) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        return this.values.put(valueType, value);
    }

    public final JSONObject setValue(String valueType, float value) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        return this.values.put(valueType, Float.valueOf(value));
    }
}
