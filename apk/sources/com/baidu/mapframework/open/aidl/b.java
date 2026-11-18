package com.baidu.mapframework.open.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IOpenClientCallback.java */
/* JADX INFO: loaded from: classes15.dex */
public interface b extends IInterface {

    /* JADX INFO: compiled from: IOpenClientCallback.java */
    public static abstract class a extends Binder implements b {
        public a() {
            attachInterface(this, "com.baidu.mapframework.open.aidl.IOpenClientCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) throws RemoteException {
            if (r4 != 1) {
                if (r4 != 1598968902) {
                    return super.onTransact(r4, parcel, parcel2, r7);
                }
                parcel2.writeString("com.baidu.mapframework.open.aidl.IOpenClientCallback");
                return true;
            }
            parcel.enforceInterface("com.baidu.mapframework.open.aidl.IOpenClientCallback");
            a(parcel.readStrongBinder());
            parcel2.writeNoException();
            return true;
        }
    }

    void a(IBinder iBinder) throws RemoteException;
}
