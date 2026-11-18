package com.bytedance.sdk.component.bh.fxn;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface bh extends IInterface {
    int fxn(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException;

    int fxn(Uri uri, String str, String[] strArr) throws RemoteException;

    String fxn(Uri uri) throws RemoteException;

    String fxn(Uri uri, ContentValues contentValues) throws RemoteException;

    Map fxn(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException;

    public static abstract class fxn extends Binder implements bh {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public fxn() {
            attachInterface(this, "com.bytedance.sdk.component.log.impl.IListenerEventManager");
        }

        public static bh fxn(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof bh)) {
                return (bh) iInterfaceQueryLocalInterface;
            }
            return new C0562fxn(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int r9, Parcel parcel, Parcel parcel2, int r12) throws RemoteException {
            if (r9 == 1) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                Map mapFxn = fxn(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray(), parcel.readString(), parcel.createStringArray(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeMap(mapFxn);
                return true;
            }
            if (r9 == 2) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                String strFxn = fxn(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(strFxn);
                return true;
            }
            if (r9 == 3) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                String strFxn2 = fxn(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ContentValues) ContentValues.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(strFxn2);
                return true;
            }
            if (r9 == 4) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                int r10 = fxn(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeInt(r10);
                return true;
            }
            if (r9 != 5) {
                if (r9 == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    return true;
                }
                return super.onTransact(r9, parcel, parcel2, r12);
            }
            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            int r11 = fxn(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ContentValues) ContentValues.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
            parcel2.writeNoException();
            parcel2.writeInt(r11);
            return true;
        }

        /* JADX INFO: renamed from: com.bytedance.sdk.component.bh.fxn.bh$fxn$fxn, reason: collision with other inner class name */
        private static class C0562fxn implements bh {
            public static bh fxn;
            private IBinder kg;

            C0562fxn(IBinder iBinder) {
                this.kg = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.kg;
            }

            @Override // com.bytedance.sdk.component.bh.fxn.bh
            public Map fxn(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr2);
                    parcelObtain.writeString(str2);
                    if (!this.kg.transact(1, parcelObtain, parcelObtain2, 0) && fxn.fxn() != null) {
                        return fxn.fxn().fxn(uri, strArr, str, strArr2, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.bh.fxn.bh
            public String fxn(Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.kg.transact(2, parcelObtain, parcelObtain2, 0) && fxn.fxn() != null) {
                        return fxn.fxn().fxn(uri);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.bh.fxn.bh
            public String fxn(Uri uri, ContentValues contentValues) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        parcelObtain.writeInt(1);
                        contentValues.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.kg.transact(3, parcelObtain, parcelObtain2, 0) && fxn.fxn() != null) {
                        return fxn.fxn().fxn(uri, contentValues);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.bh.fxn.bh
            public int fxn(Uri uri, String str, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    if (!this.kg.transact(4, parcelObtain, parcelObtain2, 0) && fxn.fxn() != null) {
                        return fxn.fxn().fxn(uri, str, strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.bh.fxn.bh
            public int fxn(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        parcelObtain.writeInt(1);
                        contentValues.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    if (!this.kg.transact(5, parcelObtain, parcelObtain2, 0) && fxn.fxn() != null) {
                        return fxn.fxn().fxn(uri, contentValues, str, strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static bh fxn() {
            return C0562fxn.fxn;
        }
    }
}
