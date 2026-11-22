package com.monetization.ads.core.identifiers.ad.huawei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.alipay.sdk.m.d.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078fX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService;", "Landroid/os/IInterface;", "oaid", "", "getOaid", "()Ljava/lang/String;", "oaidTrackLimited", "", "getOaidTrackLimited", "()Z", "Stub", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface OpenDeviceIdentifierService extends IInterface {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService$Stub;", "Landroid/os/Binder;", "Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService;", "Landroid/os/IBinder;", "asBinder", "()Landroid/os/IBinder;", "<init>", "()V", "Proxy", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static abstract class Stub extends Binder implements OpenDeviceIdentifierService {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f12677a = 0;

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService$Stub$Proxy;", "Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService;", "Landroid/os/IBinder;", "asBinder", "()Landroid/os/IBinder;", "", "getOaid", "()Ljava/lang/String;", "oaid", "", "getOaidTrackLimited", "()Z", "oaidTrackLimited", "remote", "<init>", "(Landroid/os/IBinder;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
        static final class Proxy implements OpenDeviceIdentifierService {

            /* renamed from: a, reason: collision with root package name */
            private final IBinder f12678a;

            public Proxy(IBinder remote) {
                Intrinsics.checkNotNullParameter(remote, "remote");
                this.f12678a = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12678a;
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public String getOaid() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
                Parcel obtain2 = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
                try {
                    obtain.writeInterfaceToken(b.f1368a);
                    this.f12678a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public boolean getOaidTrackLimited() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
                Parcel obtain2 = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
                try {
                    obtain.writeInterfaceToken(b.f1368a);
                    this.f12678a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, b.f1368a);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        protected final boolean onTransact(int i, Parcel data, Parcel parcel, int i2) throws RemoteException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (i == 1) {
                data.enforceInterface(b.f1368a);
                String oaid = getOaid();
                if (parcel != null) {
                    parcel.writeNoException();
                }
                if (parcel != null) {
                    parcel.writeString(oaid);
                }
            } else if (i == 2) {
                data.enforceInterface(b.f1368a);
                boolean oaidTrackLimited = getOaidTrackLimited();
                if (parcel != null) {
                    parcel.writeNoException();
                }
                if (parcel != null) {
                    parcel.writeInt(oaidTrackLimited ? 1 : 0);
                }
            } else {
                if (i != 1598968902) {
                    return super.onTransact(i, data, parcel, i2);
                }
                if (parcel != null) {
                    parcel.writeString(b.f1368a);
                }
            }
            return true;
        }
    }

    String getOaid() throws RemoteException;

    boolean getOaidTrackLimited() throws RemoteException;
}
