package com.alipay.sdk.m.p0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b(String str) throws RemoteException;

    /* JADX INFO: renamed from: com.alipay.sdk.m.p0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0179a extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f1435a = "com.samsung.android.deviceidservice.IDeviceIdService";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        public AbstractBinderC0179a() {
            attachInterface(this, f1435a);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f1435a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0180a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) throws RemoteException {
            if (r4 == 1) {
                parcel.enforceInterface(f1435a);
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (r4 == 2) {
                parcel.enforceInterface(f1435a);
                String strB = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            }
            if (r4 != 3) {
                if (r4 != 1598968902) {
                    return super.onTransact(r4, parcel, parcel2, r7);
                }
                parcel2.writeString(f1435a);
                return true;
            }
            parcel.enforceInterface(f1435a);
            String strA2 = a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strA2);
            return true;
        }

        /* JADX INFO: renamed from: com.alipay.sdk.m.p0.a$a$a, reason: collision with other inner class name */
        public static class C0180a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f1436a;

            public C0180a(IBinder iBinder) {
                this.f1436a = iBinder;
            }

            @Override // com.alipay.sdk.m.p0.a
            public String a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0179a.f1435a);
                    this.f1436a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1436a;
            }

            @Override // com.alipay.sdk.m.p0.a
            public String b(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0179a.f1435a);
                    parcelObtain.writeString(str);
                    this.f1436a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String d() {
                return AbstractBinderC0179a.f1435a;
            }

            @Override // com.alipay.sdk.m.p0.a
            public String a(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0179a.f1435a);
                    parcelObtain.writeString(str);
                    this.f1436a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
