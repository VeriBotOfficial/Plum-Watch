package com.iflytek.speech;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface LexiconListener extends IInterface {

    public static class Default implements LexiconListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.iflytek.speech.LexiconListener
        public void onLexiconUpdated(String str, int r2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements LexiconListener {
        private static final String DESCRIPTOR = "com.iflytek.speech.LexiconListener";
        static final int TRANSACTION_onLexiconUpdated = 1;

        private static class Proxy implements LexiconListener {
            public static LexiconListener sDefaultImpl;
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

            @Override // com.iflytek.speech.LexiconListener
            public void onLexiconUpdated(String str, int r6) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(r6);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onLexiconUpdated(str, r6);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static LexiconListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof LexiconListener)) ? new Proxy(iBinder) : (LexiconListener) iInterfaceQueryLocalInterface;
        }

        public static LexiconListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(LexiconListener lexiconListener) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (lexiconListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = lexiconListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) throws RemoteException {
            if (r4 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onLexiconUpdated(parcel.readString(), parcel.readInt());
                return true;
            }
            if (r4 != 1598968902) {
                return super.onTransact(r4, parcel, parcel2, r7);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onLexiconUpdated(String str, int r2) throws RemoteException;
}
