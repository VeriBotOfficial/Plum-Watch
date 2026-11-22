package org.repackage.a.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IOpenID.java */
/* loaded from: classes7.dex */
public interface a extends IInterface {

    /* compiled from: IOpenID.java */
    /* renamed from: org.repackage.a.a.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1010a extends Binder implements a {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IOpenID.java */
        /* renamed from: org.repackage.a.a.a.a$a$a, reason: collision with other inner class name */
        public static class C1011a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f18843a;

            public C1011a(IBinder iBinder) {
                this.f18843a = iBinder;
            }

            public String a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f18843a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18843a;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C1011a(iBinder) : (a) queryLocalInterface;
        }
    }
}
