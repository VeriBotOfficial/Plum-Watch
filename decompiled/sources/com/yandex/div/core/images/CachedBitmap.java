package com.yandex.div.core.images;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes5.dex */
public class CachedBitmap {
    private final Bitmap mBitmap;
    private final byte[] mBytes;
    private final Uri mCacheUri;
    private final BitmapSource mFrom;

    public CachedBitmap(Bitmap bitmap, Uri uri, BitmapSource bitmapSource) {
        this(bitmap, null, uri, bitmapSource);
    }

    public CachedBitmap(Bitmap bitmap, byte[] bArr, Uri uri, BitmapSource bitmapSource) {
        this.mBitmap = bitmap;
        this.mCacheUri = uri;
        this.mBytes = bArr;
        this.mFrom = bitmapSource;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public byte[] getBytes() {
        return this.mBytes;
    }

    public Uri getCacheUri() {
        return this.mCacheUri;
    }

    public BitmapSource getFrom() {
        return this.mFrom;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CachedBitmap cachedBitmap = (CachedBitmap) obj;
            if (!this.mBitmap.equals(cachedBitmap.getBitmap()) || this.mFrom != cachedBitmap.getFrom()) {
                return false;
            }
            Uri cacheUri = cachedBitmap.getCacheUri();
            Uri uri = this.mCacheUri;
            if (uri != null) {
                return uri.equals(cacheUri);
            }
            if (cacheUri == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.mBitmap.hashCode() * 31) + this.mFrom.hashCode()) * 31;
        Uri uri = this.mCacheUri;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }
}
