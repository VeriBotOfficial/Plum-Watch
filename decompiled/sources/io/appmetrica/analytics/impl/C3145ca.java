package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3145ca implements Parcelable {
    public static final C3120ba CREATOR = new C3120ba();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f18212a;
    public final IdentifierStatus b;
    public final String c;

    public C3145ca(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f18212a = bool;
        this.b = identifierStatus;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3145ca)) {
            return false;
        }
        C3145ca c3145ca = (C3145ca) obj;
        return Intrinsics.areEqual(this.f18212a, c3145ca.f18212a) && this.b == c3145ca.b && Intrinsics.areEqual(this.c, c3145ca.c);
    }

    public final int hashCode() {
        Boolean bool = this.f18212a;
        int hashCode = (this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f18212a + ", status=" + this.b + ", errorExplanation=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f18212a);
        parcel.writeString(this.b.getValue());
        parcel.writeString(this.c);
    }

    public C3145ca() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
