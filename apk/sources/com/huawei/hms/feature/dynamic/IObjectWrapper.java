package com.huawei.hms.feature.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes11.dex */
public interface IObjectWrapper extends IInterface {

    public static abstract class Stub extends Binder implements IObjectWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f10341a = "com.huawei.hms.feature.dynamic.IObjectWrapper";

        static class Proxy implements IObjectWrapper {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f10342a;

            Proxy(IBinder iBinder) {
                this.f10342a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10342a;
            }

            public String getInterfaceDescriptor() {
                return Stub.f10341a;
            }
        }

        public Stub() {
            attachInterface(this, f10341a);
        }

        public static IObjectWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f10341a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IObjectWrapper)) ? new Proxy(iBinder) : (IObjectWrapper) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
            if (r2 != 1598968902) {
                return super.onTransact(r2, parcel, parcel2, r5);
            }
            parcel2.writeString(f10341a);
            return true;
        }
    }
}
