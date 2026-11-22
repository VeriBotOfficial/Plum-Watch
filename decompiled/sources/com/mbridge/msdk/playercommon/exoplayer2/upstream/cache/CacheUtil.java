package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes17.dex */
public final class CacheUtil {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;

    public static class CachingCounters {
        public volatile long alreadyCachedBytes;
        public volatile long contentLength = -1;
        public volatile long newlyCachedBytes;

        public long totalCachedBytes() {
            return this.alreadyCachedBytes + this.newlyCachedBytes;
        }
    }

    private CacheUtil() {
    }

    public static void cache(DataSpec dataSpec, Cache cache, DataSource dataSource, CachingCounters cachingCounters, AtomicBoolean atomicBoolean) throws IOException, InterruptedException {
        cache(dataSpec, cache, new CacheDataSource(cache, dataSource), new byte[131072], null, 0, cachingCounters, atomicBoolean, false);
    }

    public static String generateKey(Uri uri) {
        return uri.toString();
    }

    public static void getCached(DataSpec dataSpec, Cache cache, CachingCounters cachingCounters) {
        String key = getKey(dataSpec);
        long j = dataSpec.absoluteStreamPosition;
        long j2 = dataSpec.length;
        Cache cache2 = cache;
        if (j2 == -1) {
            j2 = cache2.getContentLength(key);
        }
        cachingCounters.contentLength = j2;
        cachingCounters.alreadyCachedBytes = 0L;
        cachingCounters.newlyCachedBytes = 0L;
        long j3 = j2;
        while (j3 != 0) {
            long cachedLength = cache2.getCachedLength(key, j, j3 != -1 ? j3 : Long.MAX_VALUE);
            if (cachedLength > 0) {
                cachingCounters.alreadyCachedBytes += cachedLength;
            } else {
                cachedLength = -cachedLength;
                if (cachedLength == Long.MAX_VALUE) {
                    return;
                }
            }
            j += cachedLength;
            if (j3 == -1) {
                cachedLength = 0;
            }
            j3 -= cachedLength;
            cache2 = cache;
        }
    }

    public static String getKey(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : generateKey(dataSpec.uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long readAndDiscard(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec r16, long r17, long r19, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource r21, byte[] r22, com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager r23, int r24, com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil.CachingCounters r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r1 = r21
            r0 = r22
            r2 = r25
            r3 = r16
        L8:
            if (r23 == 0) goto Ld
            r23.proceed(r24)
        Ld:
            boolean r4 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            if (r4 != 0) goto L86
            com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec r5 = new com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            android.net.Uri r6 = r3.uri     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            byte[] r7 = r3.postBody     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            long r8 = r3.position     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            long r8 = r8 + r17
            long r10 = r3.absoluteStreamPosition     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            long r10 = r8 - r10
            java.lang.String r14 = r3.key     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            int r4 = r3.flags     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            r15 = r4 | 2
            r12 = -1
            r8 = r17
            r5.<init>(r6, r7, r8, r10, r12, r14, r15)     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            long r3 = r1.open(r5)     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            long r6 = r2.contentLength     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            r8 = -1
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L43
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 == 0) goto L43
            long r6 = r5.absoluteStreamPosition     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            long r6 = r6 + r3
            r2.contentLength = r6     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
        L43:
            r3 = 0
        L45:
            int r6 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r6 == 0) goto L80
            boolean r6 = java.lang.Thread.interrupted()     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            if (r6 != 0) goto L7a
            int r6 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r6 == 0) goto L5d
            int r6 = r0.length     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            long r6 = (long) r6     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            long r10 = r19 - r3
            long r6 = java.lang.Math.min(r6, r10)     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            int r6 = (int) r6     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            goto L5e
        L5d:
            int r6 = r0.length     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
        L5e:
            r7 = 0
            int r6 = r1.read(r0, r7, r6)     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            r7 = -1
            if (r6 != r7) goto L72
            long r6 = r2.contentLength     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L80
            long r6 = r5.absoluteStreamPosition     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            long r6 = r6 + r3
            r2.contentLength = r6     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            goto L80
        L72:
            long r6 = (long) r6     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            long r3 = r3 + r6
            long r10 = r2.newlyCachedBytes     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            long r10 = r10 + r6
            r2.newlyCachedBytes = r10     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            goto L45
        L7a:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            r3.<init>()     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
            throw r3     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L84 java.lang.Throwable -> L8c
        L80:
            com.mbridge.msdk.playercommon.exoplayer2.util.Util.closeQuietly(r1)
            return r3
        L84:
            r3 = r5
            goto L91
        L86:
            java.lang.InterruptedException r4 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            r4.<init>()     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
            throw r4     // Catch: java.lang.Throwable -> L8c com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L91
        L8c:
            r0 = move-exception
            com.mbridge.msdk.playercommon.exoplayer2.util.Util.closeQuietly(r1)
            throw r0
        L91:
            com.mbridge.msdk.playercommon.exoplayer2.util.Util.closeQuietly(r1)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil.readAndDiscard(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec, long, long, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource, byte[], com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager, int, com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil$CachingCounters):long");
    }

    public static void remove(Cache cache, String str) {
        Iterator<CacheSpan> it = cache.getCachedSpans(str).iterator();
        while (it.hasNext()) {
            try {
                cache.removeSpan(it.next());
            } catch (Cache.CacheException unused) {
            }
        }
    }

    public static void cache(DataSpec dataSpec, Cache cache, CacheDataSource cacheDataSource, byte[] bArr, PriorityTaskManager priorityTaskManager, int i, CachingCounters cachingCounters, AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        DataSpec dataSpec2 = dataSpec;
        Cache cache2 = cache;
        CachingCounters cachingCounters2 = cachingCounters;
        Assertions.checkNotNull(cacheDataSource);
        Assertions.checkNotNull(bArr);
        if (cachingCounters2 != null) {
            getCached(dataSpec2, cache2, cachingCounters2);
        } else {
            cachingCounters2 = new CachingCounters();
        }
        CachingCounters cachingCounters3 = cachingCounters2;
        String key = getKey(dataSpec2);
        long j = dataSpec2.absoluteStreamPosition;
        long j2 = dataSpec2.length;
        if (j2 == -1) {
            j2 = cache2.getContentLength(key);
        }
        long j3 = j2;
        while (true) {
            long j4 = 0;
            if (j3 == 0) {
                return;
            }
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long cachedLength = cache2.getCachedLength(key, j, j3 != -1 ? j3 : Long.MAX_VALUE);
            String str = key;
            long j5 = j;
            if (cachedLength <= 0) {
                long j6 = -cachedLength;
                if (readAndDiscard(dataSpec2, j5, j6, cacheDataSource, bArr, priorityTaskManager, i, cachingCounters3) < j6) {
                    if (z && j3 != -1) {
                        throw new EOFException();
                    }
                    return;
                }
                cachedLength = j6;
            }
            j = j5 + cachedLength;
            if (j3 != -1) {
                j4 = cachedLength;
            }
            j3 -= j4;
            dataSpec2 = dataSpec;
            cache2 = cache;
            key = str;
        }
    }
}
