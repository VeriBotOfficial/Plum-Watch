package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.wakeup.feature.user.constant.UserConstants;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: User.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/xmly/businesssdk/network/bean/Persona;", "", UserConstants.SEX, "", "birthYear", "birthMonth", "birthDay", "(IIII)V", "getBirthDay", "()I", "getBirthMonth", "getBirthYear", "getSex", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Persona {

    @SerializedName("birth_day")
    private final int birthDay;

    @SerializedName("birth_month")
    private final int birthMonth;

    @SerializedName("birth_year")
    private final int birthYear;
    private final int sex;

    public Persona() {
        this(0, 0, 0, 0, 15, null);
    }

    public Persona(int i, int i2, int i3, int i4) {
        this.sex = i;
        this.birthYear = i2;
        this.birthMonth = i3;
        this.birthDay = i4;
    }

    public static /* synthetic */ Persona copy$default(Persona persona, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = persona.sex;
        }
        if ((i5 & 2) != 0) {
            i2 = persona.birthYear;
        }
        if ((i5 & 4) != 0) {
            i3 = persona.birthMonth;
        }
        if ((i5 & 8) != 0) {
            i4 = persona.birthDay;
        }
        return persona.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSex() {
        return this.sex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBirthYear() {
        return this.birthYear;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBirthMonth() {
        return this.birthMonth;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBirthDay() {
        return this.birthDay;
    }

    public final Persona copy(int sex, int birthYear, int birthMonth, int birthDay) {
        return new Persona(sex, birthYear, birthMonth, birthDay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) other;
        return this.sex == persona.sex && this.birthYear == persona.birthYear && this.birthMonth == persona.birthMonth && this.birthDay == persona.birthDay;
    }

    public final int getBirthDay() {
        return this.birthDay;
    }

    public final int getBirthMonth() {
        return this.birthMonth;
    }

    public final int getBirthYear() {
        return this.birthYear;
    }

    public final int getSex() {
        return this.sex;
    }

    public int hashCode() {
        return Integer.hashCode(this.birthDay) + b.a(this.birthMonth, b.a(this.birthYear, Integer.hashCode(this.sex) * 31, 31), 31);
    }

    public String toString() {
        return c.a("Persona(sex=").append(this.sex).append(", birthYear=").append(this.birthYear).append(", birthMonth=").append(this.birthMonth).append(", birthDay=").append(this.birthDay).append(')').toString();
    }

    public /* synthetic */ Persona(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
