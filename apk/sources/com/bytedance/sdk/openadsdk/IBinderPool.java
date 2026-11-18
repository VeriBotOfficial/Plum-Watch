package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IBinderPool extends IInterface {

    public static class Default implements IBinderPool {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int r1) throws RemoteException {
            return null;
        }
    }

    IBinder queryBinder(int r1) throws RemoteException;

    public static abstract class Stub extends Binder implements IBinderPool {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IBinderPool");
        }

        public static IBinderPool asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IBinderPool)) {
                return (IBinderPool) iInterfaceQueryLocalInterface;
            }
            return new fxn(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) throws RemoteException {
            if (r4 != 1) {
                if (r4 == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.IBinderPool");
                    return true;
                }
                return super.onTransact(r4, parcel, parcel2, r7);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            IBinder iBinderQueryBinder = queryBinder(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iBinderQueryBinder);
            return true;
        }

        private static class fxn implements IBinderPool {
            public static IBinderPool fxn;
            private IBinder kg;

            fxn(IBinder iBinder) {
                this.kg = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.kg;
            }

            @Override // com.bytedance.sdk.openadsdk.IBinderPool
            public IBinder queryBinder(int r6) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IBinderPool");
                    parcelObtain.writeInt(r6);
                    if (!this.kg.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryBinder(r6);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IBinderPool iBinderPool) {
            if (fxn.fxn != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iBinderPool == null) {
                return false;
            }
            fxn.fxn = iBinderPool;
            return true;
        }

        public static IBinderPool getDefaultImpl() {
            return fxn.fxn;
        }
    }
}
