package sg.bigo.ads.common.o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes9.dex */
public interface f extends IInterface {

    public static abstract class a extends Binder implements f {

        /* renamed from: sg.bigo.ads.common.o.f$a$a, reason: collision with other inner class name */
        static class C1081a implements f {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f19666a;

            C1081a(IBinder iBinder) {
                this.f19666a = iBinder;
            }

            @Override // sg.bigo.ads.common.o.f
            public final String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.alipay.sdk.m.d.b.f1368a);
                    this.f19666a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f19666a;
            }

            @Override // sg.bigo.ads.common.o.f
            public final boolean b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.alipay.sdk.m.d.b.f1368a);
                    this.f19666a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(com.alipay.sdk.m.d.b.f1368a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof f)) ? new C1081a(iBinder) : (f) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(com.alipay.sdk.m.d.b.f1368a);
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(com.alipay.sdk.m.d.b.f1368a);
                return true;
            }
            parcel.enforceInterface(com.alipay.sdk.m.d.b.f1368a);
            boolean b = b();
            parcel2.writeNoException();
            parcel2.writeInt(b ? 1 : 0);
            return true;
        }
    }

    String a();

    boolean b();
}
