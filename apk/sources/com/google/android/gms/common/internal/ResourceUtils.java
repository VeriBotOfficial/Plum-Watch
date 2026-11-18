package com.google.android.gms.common.internal;

import android.net.Uri;
import com.anythink.expressad.foundation.h.k;
import com.facebook.common.util.UriUtil;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes15.dex */
public final class ResourceUtils {
    private static final Uri zza = new Uri.Builder().scheme(UriUtil.QUALIFIED_RESOURCE_SCHEME).authority("com.google.android.gms").appendPath(k.c).build();

    private ResourceUtils() {
    }
}
