package com.wakeup.module.step;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.wakeup.commponent.module.sport.SportCacheData;
import com.wakeup.module.step.ISportListener;
import com.wakeup.module.step.ISportStatusListener;

/* loaded from: classes4.dex */
public interface ISportInterface extends IInterface {
    public static final String DESCRIPTOR = "com.wakeup.module.step.ISportInterface";

    public static class Default implements ISportInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void continueSport() throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void forceForeground() throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public SportCacheData getSportCacheData() throws RemoteException {
            return null;
        }

        @Override // com.wakeup.module.step.ISportInterface
        public boolean isRunning() throws RemoteException {
            return false;
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void notifyVoice(boolean z) throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void onBindDeviceMac(String str) throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void onReceiveHeart(int i) throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void onRecordDisConnectTime(long j) throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void pauseSport() throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void registerSport(ISportListener iSportListener) throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void registerSportStatus(ISportStatusListener iSportStatusListener) throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void startLocation(int i, long j) throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void startStep(int i, long j) throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void stopSport() throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void stopUnreasonableSport() throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportInterface
        public void transferCourseData() throws RemoteException {
        }
    }

    void continueSport() throws RemoteException;

    void forceForeground() throws RemoteException;

    SportCacheData getSportCacheData() throws RemoteException;

    boolean isRunning() throws RemoteException;

    void notifyVoice(boolean z) throws RemoteException;

    void onBindDeviceMac(String str) throws RemoteException;

    void onReceiveHeart(int i) throws RemoteException;

    void onRecordDisConnectTime(long j) throws RemoteException;

    void pauseSport() throws RemoteException;

    void registerSport(ISportListener iSportListener) throws RemoteException;

    void registerSportStatus(ISportStatusListener iSportStatusListener) throws RemoteException;

    void startLocation(int i, long j) throws RemoteException;

    void startStep(int i, long j) throws RemoteException;

    void stopSport() throws RemoteException;

    void stopUnreasonableSport() throws RemoteException;

    void transferCourseData() throws RemoteException;

    public static abstract class Stub extends Binder implements ISportInterface {
        static final int TRANSACTION_continueSport = 3;
        static final int TRANSACTION_forceForeground = 5;
        static final int TRANSACTION_getSportCacheData = 13;
        static final int TRANSACTION_isRunning = 14;
        static final int TRANSACTION_notifyVoice = 16;
        static final int TRANSACTION_onBindDeviceMac = 11;
        static final int TRANSACTION_onReceiveHeart = 10;
        static final int TRANSACTION_onRecordDisConnectTime = 12;
        static final int TRANSACTION_pauseSport = 4;
        static final int TRANSACTION_registerSport = 8;
        static final int TRANSACTION_registerSportStatus = 9;
        static final int TRANSACTION_startLocation = 2;
        static final int TRANSACTION_startStep = 1;
        static final int TRANSACTION_stopSport = 6;
        static final int TRANSACTION_stopUnreasonableSport = 7;
        static final int TRANSACTION_transferCourseData = 15;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ISportInterface.DESCRIPTOR);
        }

        public static ISportInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISportInterface.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ISportInterface)) {
                return (ISportInterface) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISportInterface.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISportInterface.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    startStep(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    startLocation(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    continueSport();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    pauseSport();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    forceForeground();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    stopSport();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    stopUnreasonableSport();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    registerSport(ISportListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    registerSportStatus(ISportStatusListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    onReceiveHeart(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    onBindDeviceMac(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    onRecordDisConnectTime(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    SportCacheData sportCacheData = getSportCacheData();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, sportCacheData, 1);
                    return true;
                case 14:
                    boolean isRunning = isRunning();
                    parcel2.writeNoException();
                    parcel2.writeInt(isRunning ? 1 : 0);
                    return true;
                case 15:
                    transferCourseData();
                    parcel2.writeNoException();
                    return true;
                case 16:
                    notifyVoice(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements ISportInterface {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISportInterface.DESCRIPTOR;
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void startStep(int i, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void startLocation(int i, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void continueSport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void pauseSport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void forceForeground() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void stopSport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void stopUnreasonableSport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void registerSport(ISportListener iSportListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    obtain.writeStrongInterface(iSportListener);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void registerSportStatus(ISportStatusListener iSportStatusListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    obtain.writeStrongInterface(iSportStatusListener);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void onReceiveHeart(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void onBindDeviceMac(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void onRecordDisConnectTime(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    obtain.writeLong(j);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public SportCacheData getSportCacheData() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return (SportCacheData) _Parcel.readTypedObject(obtain2, SportCacheData.INSTANCE);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public boolean isRunning() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void transferCourseData() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportInterface
            public void notifyVoice(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportInterface.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
