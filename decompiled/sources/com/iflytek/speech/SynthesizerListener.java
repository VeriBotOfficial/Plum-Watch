package com.iflytek.speech;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes17.dex */
public interface SynthesizerListener extends IInterface {

    public static class Default implements SynthesizerListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onBufferProgress(int i, int i2, int i3, String str) throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onCompleted(int i) throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onEvent(int i, int i2, int i3, Bundle bundle) throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onSpeakBegin() throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onSpeakPaused() throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onSpeakProgress(int i, int i2, int i3) throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onSpeakResumed() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements SynthesizerListener {
        private static final String DESCRIPTOR = "com.iflytek.speech.SynthesizerListener";
        static final int TRANSACTION_onBufferProgress = 6;
        static final int TRANSACTION_onCompleted = 4;
        static final int TRANSACTION_onEvent = 7;
        static final int TRANSACTION_onSpeakBegin = 1;
        static final int TRANSACTION_onSpeakPaused = 2;
        static final int TRANSACTION_onSpeakProgress = 5;
        static final int TRANSACTION_onSpeakResumed = 3;

        private static class Proxy implements SynthesizerListener {
            public static SynthesizerListener sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onBufferProgress(int i, int i2, int i3, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    if (this.mRemote.transact(6, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onBufferProgress(i, i2, i3, str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onCompleted(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(4, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCompleted(i);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onEvent(int i, int i2, int i3, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(7, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onEvent(i, i2, i3, bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onSpeakBegin() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSpeakBegin();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onSpeakPaused() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSpeakPaused();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onSpeakProgress(int i, int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (this.mRemote.transact(5, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSpeakProgress(i, i2, i3);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onSpeakResumed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSpeakResumed();
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static SynthesizerListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof SynthesizerListener)) ? new Proxy(iBinder) : (SynthesizerListener) queryLocalInterface;
        }

        public static SynthesizerListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(SynthesizerListener synthesizerListener) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (synthesizerListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = synthesizerListener;
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
                    onSpeakBegin();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSpeakPaused();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSpeakResumed();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onCompleted(parcel.readInt());
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSpeakProgress(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onBufferProgress(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onEvent(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onBufferProgress(int i, int i2, int i3, String str) throws RemoteException;

    void onCompleted(int i) throws RemoteException;

    void onEvent(int i, int i2, int i3, Bundle bundle) throws RemoteException;

    void onSpeakBegin() throws RemoteException;

    void onSpeakPaused() throws RemoteException;

    void onSpeakProgress(int i, int i2, int i3) throws RemoteException;

    void onSpeakResumed() throws RemoteException;
}
