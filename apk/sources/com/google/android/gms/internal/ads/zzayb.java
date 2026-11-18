package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-base@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public class zzayb extends Binder implements IInterface {
    protected zzayb(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        if (r2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(r2, parcel, parcel2, r5)) {
            return true;
        }
        return zzdD(r2, parcel, parcel2, r5);
    }

    protected boolean zzdD(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        throw null;
    }
}
