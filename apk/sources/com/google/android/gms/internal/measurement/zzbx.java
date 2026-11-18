package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* JADX INFO: loaded from: classes12.dex */
public class zzbx extends Binder implements IInterface {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean zza(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        return false;
    }

    protected zzbx(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        boolean zOnTransact;
        if (r2 > 16777215) {
            zOnTransact = super.onTransact(r2, parcel, parcel2, r5);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return zza(r2, parcel, parcel2, r5);
    }
}
