package com.google.android.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: BaseStub.java */
/* JADX INFO: loaded from: classes11.dex */
public class b extends Binder implements IInterface {
    protected b() {
        attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    protected boolean a(int r1, Parcel parcel, Parcel parcel2) throws RemoteException {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        if (r2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(r2, parcel, parcel2, r5)) {
            return true;
        }
        return a(r2, parcel, parcel2);
    }
}
