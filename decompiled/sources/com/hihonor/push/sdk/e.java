package com.hihonor.push.sdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.hihonor.push.sdk.d;

/* loaded from: classes11.dex */
public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f10132a = 0;

        /* renamed from: com.hihonor.push.sdk.e$a$a, reason: collision with other inner class name */
        public static class C0602a implements e {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f10133a;

            public C0602a(IBinder iBinder) {
                this.f10133a = iBinder;
            }

            @Override // com.hihonor.push.sdk.e
            public void a(b bVar, d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.hihonor.push.framework.aidl.IPushInvoke");
                    obtain.writeInt(1);
                    obtain.writeString(bVar.f10125a);
                    obtain.writeBundle(bVar.b);
                    obtain.writeBundle(bVar.c);
                    obtain.writeStrongBinder(dVar != null ? (d.a) dVar : null);
                    if (!this.f10133a.transact(1, obtain, obtain2, 0)) {
                        int i = a.f10132a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10133a;
            }
        }
    }

    void a(b bVar, d dVar);
}
