package io.appmetrica.analytics.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class n extends Binder implements o {
    public n() {
        attachInterface(this, com.alipay.sdk.m.d.b.f1368a);
    }

    public static o a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(com.alipay.sdk.m.d.b.f1368a);
        return (queryLocalInterface == null || !(queryLocalInterface instanceof o)) ? new m(iBinder) : (o) queryLocalInterface;
    }

    public abstract /* synthetic */ String a() throws RemoteException;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public abstract /* synthetic */ boolean b() throws RemoteException;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface(com.alipay.sdk.m.d.b.f1368a);
            String a2 = a();
            parcel2.writeNoException();
            parcel2.writeString(a2);
            return true;
        }
        if (i != 2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(com.alipay.sdk.m.d.b.f1368a);
            return true;
        }
        parcel.enforceInterface(com.alipay.sdk.m.d.b.f1368a);
        boolean b = b();
        parcel2.writeNoException();
        parcel2.writeInt(b ? 1 : 0);
        return true;
    }
}
