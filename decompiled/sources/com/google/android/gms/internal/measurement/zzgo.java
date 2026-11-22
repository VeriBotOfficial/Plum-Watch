package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes15.dex */
public final class zzgo implements zzgq {
    @Override // com.google.android.gms.internal.measurement.zzgq
    public final String zza(ContentResolver contentResolver, String str) throws zzgt {
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(zzgi.zza);
        try {
            if (acquireUnstableContentProviderClient == null) {
                throw new zzgt("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor query = acquireUnstableContentProviderClient.query(zzgi.zza, null, null, new String[]{str}, null);
                try {
                    if (query == null) {
                        throw new zzgt("ContentProvider query returned null cursor");
                    }
                    if (!query.moveToFirst()) {
                        if (query != null) {
                            query.close();
                        }
                        acquireUnstableContentProviderClient.release();
                        return null;
                    }
                    String string = query.getString(1);
                    if (query != null) {
                        query.close();
                    }
                    acquireUnstableContentProviderClient.release();
                    return string;
                } finally {
                }
            } catch (RemoteException e) {
                throw new zzgt("ContentProvider query failed", e);
            }
        } catch (Throwable th) {
            acquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgq
    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzgr<T> zzgrVar) throws zzgt {
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(zzgi.zzb);
        try {
            if (acquireUnstableContentProviderClient == null) {
                throw new zzgt("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor query = acquireUnstableContentProviderClient.query(zzgi.zzb, null, null, strArr, null);
                try {
                    if (query == null) {
                        throw new zzgt("ContentProvider query returned null cursor");
                    }
                    T zza = zzgrVar.zza(query.getCount());
                    while (query.moveToNext()) {
                        zza.put(query.getString(0), query.getString(1));
                    }
                    if (!query.isAfterLast()) {
                        throw new zzgt("Cursor read incomplete (ContentProvider dead?)");
                    }
                    if (query != null) {
                        query.close();
                    }
                    acquireUnstableContentProviderClient.release();
                    return zza;
                } finally {
                }
            } catch (RemoteException e) {
                throw new zzgt("ContentProvider query failed", e);
            }
        } catch (Throwable th) {
            acquireUnstableContentProviderClient.release();
            throw th;
        }
    }
}
