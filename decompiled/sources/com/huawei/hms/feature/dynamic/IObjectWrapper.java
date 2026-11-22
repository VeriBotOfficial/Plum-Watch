package com.huawei.hms.feature.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes14.dex */
public interface IObjectWrapper extends IInterface {

    public static abstract class Stub extends Binder implements IObjectWrapper {

        /* renamed from: a, reason: collision with root package name */
        private static final String f10341a = "com.huawei.hms.feature.dynamic.IObjectWrapper";

        static class Proxy implements IObjectWrapper {

            /* renamed from: a, reason: collision with root package name */
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
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f10341a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IObjectWrapper)) ? new Proxy(iBinder) : (IObjectWrapper) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(f10341a);
            return true;
        }
    }
}
