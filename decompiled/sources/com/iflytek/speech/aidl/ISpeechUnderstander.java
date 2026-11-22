package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.iflytek.speech.SpeechUnderstanderListener;

/* loaded from: classes17.dex */
public interface ISpeechUnderstander extends IInterface {

    public static class Default implements ISpeechUnderstander {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.iflytek.speech.aidl.ISpeechUnderstander
        public void cancel(SpeechUnderstanderListener speechUnderstanderListener) throws RemoteException {
        }

        @Override // com.iflytek.speech.aidl.ISpeechUnderstander
        public boolean isUnderstanding() throws RemoteException {
            return false;
        }

        @Override // com.iflytek.speech.aidl.ISpeechUnderstander
        public void startUnderstanding(Intent intent, SpeechUnderstanderListener speechUnderstanderListener) throws RemoteException {
        }

        @Override // com.iflytek.speech.aidl.ISpeechUnderstander
        public void stopUnderstanding(SpeechUnderstanderListener speechUnderstanderListener) throws RemoteException {
        }

        @Override // com.iflytek.speech.aidl.ISpeechUnderstander
        public void writeAudio(Intent intent, byte[] bArr, int i, int i2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISpeechUnderstander {
        private static final String DESCRIPTOR = "com.iflytek.speech.aidl.ISpeechUnderstander";
        static final int TRANSACTION_cancel = 3;
        static final int TRANSACTION_isUnderstanding = 4;
        static final int TRANSACTION_startUnderstanding = 1;
        static final int TRANSACTION_stopUnderstanding = 2;
        static final int TRANSACTION_writeAudio = 5;

        private static class Proxy implements ISpeechUnderstander {
            public static ISpeechUnderstander sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.iflytek.speech.aidl.ISpeechUnderstander
            public void cancel(SpeechUnderstanderListener speechUnderstanderListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(speechUnderstanderListener != null ? speechUnderstanderListener.asBinder() : null);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().cancel(speechUnderstanderListener);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.iflytek.speech.aidl.ISpeechUnderstander
            public boolean isUnderstanding() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isUnderstanding();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.aidl.ISpeechUnderstander
            public void startUnderstanding(Intent intent, SpeechUnderstanderListener speechUnderstanderListener) throws RemoteException {
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
                    obtain.writeStrongBinder(speechUnderstanderListener != null ? speechUnderstanderListener.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startUnderstanding(intent, speechUnderstanderListener);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.aidl.ISpeechUnderstander
            public void stopUnderstanding(SpeechUnderstanderListener speechUnderstanderListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(speechUnderstanderListener != null ? speechUnderstanderListener.asBinder() : null);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopUnderstanding(speechUnderstanderListener);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.iflytek.speech.aidl.ISpeechUnderstander
            public void writeAudio(Intent intent, byte[] bArr, int i, int i2) throws RemoteException {
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
                    obtain.writeByteArray(bArr);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().writeAudio(intent, bArr, i, i2);
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

        public static ISpeechUnderstander asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISpeechUnderstander)) ? new Proxy(iBinder) : (ISpeechUnderstander) queryLocalInterface;
        }

        public static ISpeechUnderstander getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISpeechUnderstander iSpeechUnderstander) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iSpeechUnderstander == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSpeechUnderstander;
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
                startUnderstanding(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, SpeechUnderstanderListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                stopUnderstanding(SpeechUnderstanderListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                cancel(SpeechUnderstanderListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean isUnderstanding = isUnderstanding();
                parcel2.writeNoException();
                parcel2.writeInt(isUnderstanding ? 1 : 0);
                return true;
            }
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            writeAudio(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.createByteArray(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void cancel(SpeechUnderstanderListener speechUnderstanderListener) throws RemoteException;

    boolean isUnderstanding() throws RemoteException;

    void startUnderstanding(Intent intent, SpeechUnderstanderListener speechUnderstanderListener) throws RemoteException;

    void stopUnderstanding(SpeechUnderstanderListener speechUnderstanderListener) throws RemoteException;

    void writeAudio(Intent intent, byte[] bArr, int i, int i2) throws RemoteException;
}
