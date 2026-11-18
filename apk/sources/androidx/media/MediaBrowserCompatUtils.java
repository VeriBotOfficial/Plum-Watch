package androidx.media;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public class MediaBrowserCompatUtils {
    public static boolean areSameOptions(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            return bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        if (bundle2 == null) {
            return bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        return bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle2) {
        int r6;
        int r2;
        int r0;
        int r3 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
        int r1 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
        int r7 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int r8 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int r4 = Integer.MAX_VALUE;
        if (r3 == -1 || r7 == -1) {
            r6 = Integer.MAX_VALUE;
            r2 = 0;
        } else {
            r2 = r3 * r7;
            r6 = (r7 + r2) - 1;
        }
        if (r1 == -1 || r8 == -1) {
            r0 = 0;
        } else {
            r0 = r1 * r8;
            r4 = (r8 + r0) - 1;
        }
        return r6 >= r0 && r4 >= r2;
    }

    private MediaBrowserCompatUtils() {
    }
}
