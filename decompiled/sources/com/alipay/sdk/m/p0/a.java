package com.alipay.sdk.m.p0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public interface a extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b(String str) throws RemoteException;

    /* renamed from: com.alipay.sdk.m.p0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0092a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f1435a = "com.samsung.android.deviceidservice.IDeviceIdService";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        public AbstractBinderC0092a() {
            attachInterface(this, f1435a);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f1435a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0093a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f1435a);
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(f1435a);
                String b2 = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(f1435a);
                return true;
            }
            parcel.enforceInterface(f1435a);
            String a3 = a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(a3);
            return true;
        }

        /* renamed from: com.alipay.sdk.m.p0.a$a$a, reason: collision with other inner class name */
        public static class C0093a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1436a;

            public C0093a(IBinder iBinder) {
                this.f1436a = iBinder;
            }

            @Override // com.alipay.sdk.m.p0.a
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0092a.f1435a);
                    this.f1436a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1436a;
            }

            @Override // com.alipay.sdk.m.p0.a
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0092a.f1435a);
                    obtain.writeString(str);
                    this.f1436a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                return AbstractBinderC0092a.f1435a;
            }

            @Override // com.alipay.sdk.m.p0.a
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0092a.f1435a);
                    obtain.writeString(str);
                    this.f1436a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
