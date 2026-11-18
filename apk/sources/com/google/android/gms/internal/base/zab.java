package com.google.android.gms.internal.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes12.dex */
public class zab extends Binder implements IInterface {
    protected zab(String str) {
        attachInterface(this, str);
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
        return zaa(r2, parcel, parcel2, r5);
    }

    protected boolean zaa(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        throw null;
    }
}
