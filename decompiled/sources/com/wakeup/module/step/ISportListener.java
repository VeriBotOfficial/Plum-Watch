package com.wakeup.module.step;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.wakeup.commponent.module.sport.LocationEntity;
import com.wakeup.commponent.module.sport.SportCacheData;

/* loaded from: classes4.dex */
public interface ISportListener extends IInterface {
    public static final String DESCRIPTOR = "com.wakeup.module.step.ISportListener";

    public static class Default implements ISportListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.wakeup.module.step.ISportListener
        public void onSportDataChange(SportCacheData sportCacheData) throws RemoteException {
        }

        @Override // com.wakeup.module.step.ISportListener
        public void onSportGps(LocationEntity locationEntity, int i, int i2) throws RemoteException {
        }
    }

    void onSportDataChange(SportCacheData sportCacheData) throws RemoteException;

    void onSportGps(LocationEntity locationEntity, int i, int i2) throws RemoteException;

    public static abstract class Stub extends Binder implements ISportListener {
        static final int TRANSACTION_onSportDataChange = 1;
        static final int TRANSACTION_onSportGps = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ISportListener.DESCRIPTOR);
        }

        public static ISportListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ISportListener.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ISportListener)) {
                return (ISportListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISportListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISportListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onSportDataChange((SportCacheData) _Parcel.readTypedObject(parcel, SportCacheData.INSTANCE));
                parcel2.writeNoException();
            } else if (i == 2) {
                onSportGps((LocationEntity) _Parcel.readTypedObject(parcel, LocationEntity.CREATOR), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        private static class Proxy implements ISportListener {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISportListener.DESCRIPTOR;
            }

            @Override // com.wakeup.module.step.ISportListener
            public void onSportDataChange(SportCacheData sportCacheData) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, sportCacheData, 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.wakeup.module.step.ISportListener
            public void onSportGps(LocationEntity locationEntity, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ISportListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, locationEntity, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
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
