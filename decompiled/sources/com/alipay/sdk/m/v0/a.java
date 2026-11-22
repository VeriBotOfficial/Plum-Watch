package com.alipay.sdk.m.v0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public interface a extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b() throws RemoteException;

    String b(String str) throws RemoteException;

    boolean c() throws RemoteException;

    boolean c(String str) throws RemoteException;

    /* renamed from: com.alipay.sdk.m.v0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0100a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f1469a = "com.zui.deviceidservice.IDeviceidInterface";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final int g = 6;

        public AbstractBinderC0100a() {
            attachInterface(this, f1469a);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f1469a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0101a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(f1469a);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(f1469a);
                    String a2 = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a2);
                    return true;
                case 2:
                    parcel.enforceInterface(f1469a);
                    String b2 = b();
                    parcel2.writeNoException();
                    parcel2.writeString(b2);
                    return true;
                case 3:
                    parcel.enforceInterface(f1469a);
                    boolean c2 = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(c2 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(f1469a);
                    String b3 = b(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(b3);
                    return true;
                case 5:
                    parcel.enforceInterface(f1469a);
                    String a3 = a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(a3);
                    return true;
                case 6:
                    parcel.enforceInterface(f1469a);
                    boolean c3 = c(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(c3 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* renamed from: com.alipay.sdk.m.v0.a$a$a, reason: collision with other inner class name */
        public static class C0101a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1470a;

            public C0101a(IBinder iBinder) {
                this.f1470a = iBinder;
            }

            @Override // com.alipay.sdk.m.v0.a
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0100a.f1469a);
                    this.f1470a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1470a;
            }

            @Override // com.alipay.sdk.m.v0.a
            public String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0100a.f1469a);
                    this.f1470a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.m.v0.a
            public boolean c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0100a.f1469a);
                    this.f1470a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                return AbstractBinderC0100a.f1469a;
            }

            @Override // com.alipay.sdk.m.v0.a
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0100a.f1469a);
                    obtain.writeString(str);
                    this.f1470a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.m.v0.a
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0100a.f1469a);
                    obtain.writeString(str);
                    this.f1470a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.m.v0.a
            public boolean c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0100a.f1469a);
                    obtain.writeString(str);
                    this.f1470a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
