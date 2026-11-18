package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IDislikeClosedListener extends IInterface {

    public static class Default implements IDislikeClosedListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
        public void onItemClickClosed() throws RemoteException {
        }
    }

    void onItemClickClosed() throws RemoteException;

    public static abstract class Stub extends Binder implements IDislikeClosedListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IDislikeClosedListener");
        }

        public static IDislikeClosedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IDislikeClosedListener)) {
                return (IDislikeClosedListener) iInterfaceQueryLocalInterface;
            }
            return new fxn(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) throws RemoteException {
            if (r4 != 1) {
                if (r4 == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                    return true;
                }
                return super.onTransact(r4, parcel, parcel2, r7);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            onItemClickClosed();
            parcel2.writeNoException();
            return true;
        }

        private static class fxn implements IDislikeClosedListener {
            public static IDislikeClosedListener fxn;
            private IBinder kg;

            fxn(IBinder iBinder) {
                this.kg = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.kg;
            }

            @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
            public void onItemClickClosed() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                    if (!this.kg.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onItemClickClosed();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IDislikeClosedListener iDislikeClosedListener) {
            if (fxn.fxn != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDislikeClosedListener == null) {
                return false;
            }
            fxn.fxn = iDislikeClosedListener;
            return true;
        }

        public static IDislikeClosedListener getDefaultImpl() {
            return fxn.fxn;
        }
    }
}
