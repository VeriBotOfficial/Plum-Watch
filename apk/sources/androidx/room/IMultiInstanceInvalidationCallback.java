package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes7.dex */
public interface IMultiInstanceInvalidationCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx$room$IMultiInstanceInvalidationCallback".replace(Typography.dollar, '.');

    public static class Default implements IMultiInstanceInvalidationCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        public void onInvalidation(String[] strArr) throws RemoteException {
        }
    }

    void onInvalidation(String[] strArr) throws RemoteException;

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {
        static final int TRANSACTION_onInvalidation = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMultiInstanceInvalidationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                return (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) throws RemoteException {
            String str = DESCRIPTOR;
            if (r4 >= 1 && r4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (r4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (r4 == 1) {
                onInvalidation(parcel.createStringArray());
                return true;
            }
            return super.onTransact(r4, parcel, parcel2, r7);
        }

        private static class Proxy implements IMultiInstanceInvalidationCallback {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public void onInvalidation(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeStringArray(strArr);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }
}
