package com.iflytek.speech;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface SynthesizerListener extends IInterface {

    public static class Default implements SynthesizerListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onBufferProgress(int r1, int r2, int r3, String str) throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onCompleted(int r1) throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onEvent(int r1, int r2, int r3, Bundle bundle) throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onSpeakBegin() throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onSpeakPaused() throws RemoteException {
        }

        @Override // com.iflytek.speech.SynthesizerListener
        public void onSpeakProgress(int r1, int r2, int r3) throws RemoteException {
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
            public void onBufferProgress(int r6, int r7, int r8, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(r6);
                    parcelObtain.writeInt(r7);
                    parcelObtain.writeInt(r8);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onBufferProgress(r6, r7, r8, str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onCompleted(int r6) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(r6);
                    if (this.mRemote.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCompleted(r6);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onEvent(int r6, int r7, int r8, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(r6);
                    parcelObtain.writeInt(r7);
                    parcelObtain.writeInt(r8);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(7, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onEvent(r6, r7, r8, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onSpeakBegin() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSpeakBegin();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onSpeakPaused() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSpeakPaused();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onSpeakProgress(int r6, int r7, int r8) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(r6);
                    parcelObtain.writeInt(r7);
                    parcelObtain.writeInt(r8);
                    if (this.mRemote.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSpeakProgress(r6, r7, r8);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.iflytek.speech.SynthesizerListener
            public void onSpeakResumed() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSpeakResumed();
                } finally {
                    parcelObtain.recycle();
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
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof SynthesizerListener)) ? new Proxy(iBinder) : (SynthesizerListener) iInterfaceQueryLocalInterface;
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
        public boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) throws RemoteException {
            if (r4 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (r4) {
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
                    return super.onTransact(r4, parcel, parcel2, r7);
            }
        }
    }

    void onBufferProgress(int r1, int r2, int r3, String str) throws RemoteException;

    void onCompleted(int r1) throws RemoteException;

    void onEvent(int r1, int r2, int r3, Bundle bundle) throws RemoteException;

    void onSpeakBegin() throws RemoteException;

    void onSpeakPaused() throws RemoteException;

    void onSpeakProgress(int r1, int r2, int r3) throws RemoteException;

    void onSpeakResumed() throws RemoteException;
}
