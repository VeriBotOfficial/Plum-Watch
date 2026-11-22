package com.xmly.businesssdk.player;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xmly.businesssdk.player.IAIDLInterceptorCallback;
import com.xmly.businesssdk.player.entity.Playable;

/* loaded from: classes3.dex */
public interface IAIDLInterceptor extends IInterface {

    public static class Default implements IAIDLInterceptor {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAIDLInterceptor
        public void process(Playable playable, IAIDLInterceptorCallback iAIDLInterceptorCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAIDLInterceptor {
        private static final String DESCRIPTOR = "com.xmly.businesssdk.player.IAIDLInterceptor";
        public static final int TRANSACTION_process = 1;

        public static class Proxy implements IAIDLInterceptor {
            public static IAIDLInterceptor sDefaultImpl;
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

            @Override // com.xmly.businesssdk.player.IAIDLInterceptor
            public void process(Playable playable, IAIDLInterceptorCallback iAIDLInterceptorCallback) throws RemoteException {
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
                    obtain.writeStrongBinder(iAIDLInterceptorCallback != null ? iAIDLInterceptorCallback.asBinder() : null);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().process(playable, iAIDLInterceptorCallback);
                        return;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        playable.readFromParcel(obtain2);
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

        public static IAIDLInterceptor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAIDLInterceptor)) ? new Proxy(iBinder) : (IAIDLInterceptor) queryLocalInterface;
        }

        public static IAIDLInterceptor getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAIDLInterceptor iAIDLInterceptor) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iAIDLInterceptor == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAIDLInterceptor;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            Playable createFromParcel = parcel.readInt() != 0 ? Playable.CREATOR.createFromParcel(parcel) : null;
            process(createFromParcel, IAIDLInterceptorCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            if (createFromParcel != null) {
                parcel2.writeInt(1);
                createFromParcel.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    void process(Playable playable, IAIDLInterceptorCallback iAIDLInterceptorCallback) throws RemoteException;
}
