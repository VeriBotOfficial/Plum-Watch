package com.xmly.businesssdk.player;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xmly.businesssdk.player.entity.Playable;

/* loaded from: classes3.dex */
public interface IAIDLInterceptorCallback extends IInterface {

    public static class Default implements IAIDLInterceptorCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAIDLInterceptorCallback
        public void onContinue(Playable playable) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAIDLInterceptorCallback
        public void onInterrupt(int i) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAIDLInterceptorCallback
        public void onProcessIng() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAIDLInterceptorCallback {
        private static final String DESCRIPTOR = "com.xmly.businesssdk.player.IAIDLInterceptorCallback";
        public static final int TRANSACTION_onContinue = 1;
        public static final int TRANSACTION_onInterrupt = 2;
        public static final int TRANSACTION_onProcessIng = 3;

        public static class Proxy implements IAIDLInterceptorCallback {
            public static IAIDLInterceptorCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xmly.businesssdk.player.IAIDLInterceptorCallback
            public void onContinue(Playable playable) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (playable != null) {
                        obtain.writeInt(1);
                        playable.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onContinue(playable);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAIDLInterceptorCallback
            public void onInterrupt(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onInterrupt(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAIDLInterceptorCallback
            public void onProcessIng() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onProcessIng();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAIDLInterceptorCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAIDLInterceptorCallback)) ? new Proxy(iBinder) : (IAIDLInterceptorCallback) queryLocalInterface;
        }

        public static IAIDLInterceptorCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAIDLInterceptorCallback iAIDLInterceptorCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iAIDLInterceptorCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAIDLInterceptorCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onContinue(parcel.readInt() != 0 ? Playable.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onInterrupt(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onProcessIng();
            parcel2.writeNoException();
            return true;
        }
    }

    void onContinue(Playable playable) throws RemoteException;

    void onInterrupt(int i) throws RemoteException;

    void onProcessIng() throws RemoteException;
}
