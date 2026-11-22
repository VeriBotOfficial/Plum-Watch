package com.monetization.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.yandex.mobile.ads.impl.rc;
import com.yandex.mobile.ads.impl.sp0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/gms/service/GmsServiceAdvertisingInfoReader;", "Lcom/yandex/mobile/ads/impl/rc;", "Landroid/os/IInterface;", "Landroid/os/IBinder;", "asBinder", "()Landroid/os/IBinder;", "", "readAdvertisingId", "()Ljava/lang/String;", "", "readAdTrackingLimited", "()Ljava/lang/Boolean;", "binder", "<init>", "(Landroid/os/IBinder;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class GmsServiceAdvertisingInfoReader implements rc, IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f12676a;

    public GmsServiceAdvertisingInfoReader(IBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.f12676a = binder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f12676a;
    }

    @Override // com.yandex.mobile.ads.impl.rc
    public Boolean readAdTrackingLimited() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
        try {
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f12676a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
            obtain2.recycle();
            obtain.recycle();
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.rc
    public String readAdvertisingId() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
        try {
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f12676a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
            obtain2.recycle();
            obtain.recycle();
            return null;
        }
    }
}
