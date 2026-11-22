package com.wakeup.module.step;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public interface ISportStatusListener extends IInterface {
    public static final String DESCRIPTOR = "com.wakeup.module.step.ISportStatusListener";

    public static class Default implements ISportStatusListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.wakeup.module.step.ISportStatusListener
        public void onFinishData() throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportStatusListener
        public void onSportContinue() throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportStatusListener
        public void onSportCreate() throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportStatusListener
        public void onSportDataCreate() throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportStatusListener
        public void onSportPause() throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportStatusListener
        public void onUnreasonableData() throws RemoteException {
        }
    }

    void onFinishData() throws RemoteException;

    void onSportContinue() throws RemoteException;

    void onSportCreate() throws RemoteException;

    void onSportDataCreate() throws RemoteException;

    void onSportPause() throws RemoteException;

    void onUnreasonableData() throws RemoteException;

    public static abstract class Stub extends Binder implements ISportStatusListener {
        static final int TRANSACTION_onFinishData = 4;
        static final int TRANSACTION_onSportContinue = 5;
        static final int TRANSACTION_onSportCreate = 1;
        static final int TRANSACTION_onSportDataCreate = 2;
        static final int TRANSACTION_onSportPause = 6;
        static final int TRANSACTION_onUnreasonableData = 3;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ISportStatusListener.DESCRIPTOR);
        }

        public static ISportStatusListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISportStatusListener.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ISportStatusListener)) {
                return (ISportStatusListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISportStatusListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISportStatusListener.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    onSportCreate();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onSportDataCreate();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onUnreasonableData();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onFinishData();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onSportContinue();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onSportPause();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements ISportStatusListener {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISportStatusListener.DESCRIPTOR;
            }

            @Override // com.wakeup.module.step.ISportStatusListener
            public void onSportCreate() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportStatusListener.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportStatusListener
            public void onSportDataCreate() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportStatusListener.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportStatusListener
            public void onUnreasonableData() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportStatusListener.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportStatusListener
            public void onFinishData() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportStatusListener.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportStatusListener
            public void onSportContinue() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportStatusListener.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportStatusListener
            public void onSportPause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportStatusListener.DESCRIPTOR);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
