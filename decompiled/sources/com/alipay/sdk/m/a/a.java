package com.alipay.sdk.m.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes11.dex */
public interface a extends IInterface {

    /* renamed from: com.alipay.sdk.m.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0075a extends Binder implements a {

        /* renamed from: com.alipay.sdk.m.a.a$a$a, reason: collision with other inner class name */
        public static class C0076a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1326a;

            public C0076a(IBinder iBinder) {
                this.f1326a = iBinder;
            }

            public String a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f1326a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1326a;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0076a(iBinder) : (a) queryLocalInterface;
        }
    }
}
