package com.iflytek.speech;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes17.dex */
public interface SynthesizeToUrlListener extends IInterface {

    public static class Default implements SynthesizeToUrlListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.iflytek.speech.SynthesizeToUrlListener
        public void onSynthesizeCompleted(String str, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements SynthesizeToUrlListener {
        private static final String DESCRIPTOR = "com.iflytek.speech.SynthesizeToUrlListener";
        static final int TRANSACTION_onSynthesizeCompleted = 1;

        private static class Proxy implements SynthesizeToUrlListener {
            public static SynthesizeToUrlListener sDefaultImpl;
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

            @Override // com.iflytek.speech.SynthesizeToUrlListener
            public void onSynthesizeCompleted(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSynthesizeCompleted(str, i);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static SynthesizeToUrlListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof SynthesizeToUrlListener)) ? new Proxy(iBinder) : (SynthesizeToUrlListener) queryLocalInterface;
        }

        public static SynthesizeToUrlListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(SynthesizeToUrlListener synthesizeToUrlListener) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (synthesizeToUrlListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = synthesizeToUrlListener;
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
                onSynthesizeCompleted(parcel.readString(), parcel.readInt());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onSynthesizeCompleted(String str, int i) throws RemoteException;
}
