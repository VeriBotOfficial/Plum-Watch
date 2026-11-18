package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IAppOpenAdInteractionListener extends IInterface {

    public static class Default implements IAppOpenAdInteractionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdClicked() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdShow() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdSkip() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdTimeOver() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onDestroy() throws RemoteException {
        }
    }

    void onAdClicked() throws RemoteException;

    void onAdShow() throws RemoteException;

    void onAdSkip() throws RemoteException;

    void onAdTimeOver() throws RemoteException;

    void onDestroy() throws RemoteException;

    public static abstract class Stub extends Binder implements IAppOpenAdInteractionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
        }

        public static IAppOpenAdInteractionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IAppOpenAdInteractionListener)) {
                return (IAppOpenAdInteractionListener) iInterfaceQueryLocalInterface;
            }
            return new fxn(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) throws RemoteException {
            if (r4 == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onDestroy();
                parcel2.writeNoException();
                return true;
            }
            if (r4 == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdShow();
                parcel2.writeNoException();
                return true;
            }
            if (r4 == 3) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdClicked();
                parcel2.writeNoException();
                return true;
            }
            if (r4 == 4) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdSkip();
                parcel2.writeNoException();
                return true;
            }
            if (r4 != 5) {
                if (r4 == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    return true;
                }
                return super.onTransact(r4, parcel, parcel2, r7);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
            onAdTimeOver();
            parcel2.writeNoException();
            return true;
        }

        private static class fxn implements IAppOpenAdInteractionListener {
            public static IAppOpenAdInteractionListener fxn;
            private IBinder kg;

            fxn(IBinder iBinder) {
                this.kg = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.kg;
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onDestroy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.kg.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDestroy();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdShow() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.kg.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdShow();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdClicked() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.kg.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdClicked();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdSkip() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.kg.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdSkip();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdTimeOver() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.kg.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdTimeOver();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IAppOpenAdInteractionListener iAppOpenAdInteractionListener) {
            if (fxn.fxn != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iAppOpenAdInteractionListener == null) {
                return false;
            }
            fxn.fxn = iAppOpenAdInteractionListener;
            return true;
        }

        public static IAppOpenAdInteractionListener getDefaultImpl() {
            return fxn.fxn;
        }
    }
}
