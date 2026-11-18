package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* JADX INFO: loaded from: classes12.dex */
public interface zzm extends IInterface {
    void zzb(int r1, String[] strArr) throws RemoteException;

    void zzc(int r1, PendingIntent pendingIntent) throws RemoteException;

    void zzd(int r1, String[] strArr) throws RemoteException;
}
