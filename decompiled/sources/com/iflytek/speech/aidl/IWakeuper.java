package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.iflytek.speech.WakeuperListener;

/* loaded from: classes17.dex */
public interface IWakeuper extends IInterface {

    public static class Default implements IWakeuper {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.iflytek.speech.aidl.IWakeuper
        public void cancel(WakeuperListener wakeuperListener) throws RemoteException {
        }

        @Override // com.iflytek.speech.aidl.IWakeuper
        public void destroy() throws RemoteException {
        }

        @Override // com.iflytek.speech.aidl.IWakeuper
        public boolean isListening() throws RemoteException {
            return false;
        }

        @Override // com.iflytek.speech.aidl.IWakeuper
        public void startListening(Intent intent, WakeuperListener wakeuperListener) throws RemoteException {
        }

        @Override // com.iflytek.speech.aidl.IWakeuper
        public void stopListening(WakeuperListener wakeuperListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWakeuper {
        private static final String DESCRIPTOR = "com.iflytek.speech.aidl.IWakeuper";
        static final int TRANSACTION_cancel = 3;
        static final int TRANSACTION_destroy = 5;
        static final int TRANSACTION_isListening = 4;
        static final int TRANSACTION_startListening = 1;
        static final int TRANSACTION_stopListening = 2;

        private static class Proxy implements IWakeuper {
            public static IWakeuper sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.iflytek.speech.aidl.IWakeuper
            public void cancel(WakeuperListener wakeuperListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(wakeuperListener != null ? wakeuperListener.asBinder() : null);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().cancel(wakeuperListener);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.aidl.IWakeuper
            public void destroy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().destroy();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.iflytek.speech.aidl.IWakeuper
            public boolean isListening() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isListening();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.aidl.IWakeuper
            public void startListening(Intent intent, WakeuperListener wakeuperListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(wakeuperListener != null ? wakeuperListener.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startListening(intent, wakeuperListener);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.aidl.IWakeuper
            public void stopListening(WakeuperListener wakeuperListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(wakeuperListener != null ? wakeuperListener.asBinder() : null);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopListening(wakeuperListener);
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

        public static IWakeuper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IWakeuper)) ? new Proxy(iBinder) : (IWakeuper) queryLocalInterface;
        }

        public static IWakeuper getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IWakeuper iWakeuper) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iWakeuper == null) {
                return false;
            }
            Proxy.sDefaultImpl = iWakeuper;
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
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                startListening(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, WakeuperListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                stopListening(WakeuperListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                cancel(WakeuperListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isListening = isListening();
                parcel2.writeNoException();
                parcel2.writeInt(isListening ? 1 : 0);
                return true;
            }
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            destroy();
            parcel2.writeNoException();
            return true;
        }
    }

    void cancel(WakeuperListener wakeuperListener) throws RemoteException;

    void destroy() throws RemoteException;

    boolean isListening() throws RemoteException;

    void startListening(Intent intent, WakeuperListener wakeuperListener) throws RemoteException;

    void stopListening(WakeuperListener wakeuperListener) throws RemoteException;
}
