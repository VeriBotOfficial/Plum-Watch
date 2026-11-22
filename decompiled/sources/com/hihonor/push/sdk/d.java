package com.hihonor.push.sdk;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.hihonor.push.sdk.b0;
import com.hihonor.push.sdk.common.ResponseHeader;

/* loaded from: classes11.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        public a() {
            attachInterface(this, "com.hihonor.push.framework.aidl.IPushCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.hihonor.push.framework.aidl.IPushCallback");
                return true;
            }
            parcel.enforceInterface("com.hihonor.push.framework.aidl.IPushCallback");
            b createFromParcel = parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null;
            h0 h0Var = (h0) this;
            Log.i("IPCCallback", "onResult parse start.");
            Bundle bundle = createFromParcel.b;
            Bundle bundle2 = createFromParcel.c;
            ResponseHeader responseHeader = new ResponseHeader();
            f.a(bundle, responseHeader);
            Object obj = h0Var.f10139a;
            if (obj instanceof c) {
                f.a(bundle2, (c) obj);
            }
            i0 i0Var = h0Var.b;
            h hVar = new h(responseHeader.getStatusCode(), responseHeader.getStatusMessage());
            Object obj2 = h0Var.f10139a;
            b0.b bVar = (b0.b) i0Var;
            bVar.getClass();
            b0 b0Var = b0.c;
            z0<?> z0Var = bVar.f10129a;
            b0Var.getClass();
            Log.i("HonorApiManager", "sendResolveResult start");
            Handler handler = b0Var.f10126a;
            handler.sendMessage(handler.obtainMessage(2, z0Var));
            bVar.f10129a.b(hVar, obj2);
            Log.i("IPCCallback", "onResult parse end.");
            parcel2.writeNoException();
            return true;
        }
    }
}
