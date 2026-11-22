package com.baidu.mapframework.open.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMapOpenService.java */
/* loaded from: classes13.dex */
public interface a extends IInterface {

    /* compiled from: IMapOpenService.java */
    /* renamed from: com.baidu.mapframework.open.aidl.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0371a extends Binder implements a {

        /* compiled from: IMapOpenService.java */
        /* renamed from: com.baidu.mapframework.open.aidl.a$a$a, reason: collision with other inner class name */
        private static class C0372a implements a {

            /* renamed from: a, reason: collision with root package name */
            public static a f8320a;
            private IBinder b;

            C0372a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // com.baidu.mapframework.open.aidl.a
            public void a(b bVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.baidu.mapframework.open.aidl.IMapOpenService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.b.transact(1, obtain, obtain2, 0) || AbstractBinderC0371a.a() == null) {
                        obtain2.readException();
                    } else {
                        AbstractBinderC0371a.a().a(bVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.b;
            }
        }

        public static a a() {
            return C0372a.f8320a;
        }

        public static a b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.baidu.mapframework.open.aidl.IMapOpenService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0372a(iBinder) : (a) queryLocalInterface;
        }
    }

    void a(b bVar) throws RemoteException;
}
