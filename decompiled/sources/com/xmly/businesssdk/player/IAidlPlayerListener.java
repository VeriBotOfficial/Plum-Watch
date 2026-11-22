package com.xmly.businesssdk.player;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xmly.businesssdk.player.entity.Playable;

/* loaded from: classes3.dex */
public interface IAidlPlayerListener extends IInterface {

    public static class Default implements IAidlPlayerListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerListener
        public void onListCompletion() throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerListener
        public void onTrackBuffering(int i) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerListener
        public void onTrackChanged(Playable playable, boolean z) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerListener
        public boolean onTrackCompletion() throws RemoteException {
            return false;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerListener
        public void onTrackPause() throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerListener
        public void onTrackProgress(int i, int i2) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerListener
        public boolean onTrackStart() throws RemoteException {
            return false;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerListener
        public void onTrackStop() throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerListener
        public void onTrackStreamError(int i, int i2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAidlPlayerListener {
        private static final String DESCRIPTOR = "com.xmly.businesssdk.player.IAidlPlayerListener";
        public static final int TRANSACTION_onListCompletion = 9;
        public static final int TRANSACTION_onTrackBuffering = 4;
        public static final int TRANSACTION_onTrackChanged = 2;
        public static final int TRANSACTION_onTrackCompletion = 6;
        public static final int TRANSACTION_onTrackPause = 7;
        public static final int TRANSACTION_onTrackProgress = 3;
        public static final int TRANSACTION_onTrackStart = 1;
        public static final int TRANSACTION_onTrackStop = 5;
        public static final int TRANSACTION_onTrackStreamError = 8;

        public static class Proxy implements IAidlPlayerListener {
            public static IAidlPlayerListener sDefaultImpl;
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

            @Override // com.xmly.businesssdk.player.IAidlPlayerListener
            public void onListCompletion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onListCompletion();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerListener
            public void onTrackBuffering(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onTrackBuffering(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerListener
            public void onTrackChanged(Playable playable, boolean z) throws RemoteException {
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
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onTrackChanged(playable, z);
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

            @Override // com.xmly.businesssdk.player.IAidlPlayerListener
            public boolean onTrackCompletion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onTrackCompletion();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerListener
            public void onTrackPause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onTrackPause();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerListener
            public void onTrackProgress(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onTrackProgress(i, i2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerListener
            public boolean onTrackStart() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onTrackStart();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerListener
            public void onTrackStop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onTrackStop();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerListener
            public void onTrackStreamError(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onTrackStreamError(i, i2);
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

        public static IAidlPlayerListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAidlPlayerListener)) ? new Proxy(iBinder) : (IAidlPlayerListener) queryLocalInterface;
        }

        public static IAidlPlayerListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAidlPlayerListener iAidlPlayerListener) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iAidlPlayerListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAidlPlayerListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean onTrackStart = onTrackStart();
                    parcel2.writeNoException();
                    parcel2.writeInt(onTrackStart ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    Playable createFromParcel = parcel.readInt() != 0 ? Playable.CREATOR.createFromParcel(parcel) : null;
                    onTrackChanged(createFromParcel, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    if (createFromParcel != null) {
                        parcel2.writeInt(1);
                        createFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onTrackProgress(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onTrackBuffering(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onTrackStop();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean onTrackCompletion = onTrackCompletion();
                    parcel2.writeNoException();
                    parcel2.writeInt(onTrackCompletion ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onTrackPause();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    onTrackStreamError(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onListCompletion();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onListCompletion() throws RemoteException;

    void onTrackBuffering(int i) throws RemoteException;

    void onTrackChanged(Playable playable, boolean z) throws RemoteException;

    boolean onTrackCompletion() throws RemoteException;

    void onTrackPause() throws RemoteException;

    void onTrackProgress(int i, int i2) throws RemoteException;

    boolean onTrackStart() throws RemoteException;

    void onTrackStop() throws RemoteException;

    void onTrackStreamError(int i, int i2) throws RemoteException;
}
