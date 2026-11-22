package com.baidu.platform.comjni.map.basemap;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.baidu.platform.comjni.NativeComponent;
import com.baidu.platform.comjni.tools.ParcelItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes13.dex */
public class NABaseMap extends NativeComponent {
    private long b;

    /* renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f8979a = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    private volatile boolean c = false;
    private volatile int d = 0;
    private final ReadWriteLock e = new ReentrantReadWriteLock(true);
    private final Set<Long> f = new CopyOnWriteArraySet();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f8980a;
        final /* synthetic */ boolean b;

        a(Bundle bundle, boolean z) {
            this.f8980a = bundle;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                if (z) {
                    Bundle bundle = this.f8980a;
                    if (bundle != null) {
                        if (NABaseMap.this.a(bundle.getLong("itemaddr", 0L))) {
                            if (z) {
                                NABaseMap.this.e.readLock().unlock();
                                return;
                            }
                            return;
                        }
                    }
                    NABaseMap nABaseMap = NABaseMap.this;
                    nABaseMap.nativeAddItemData(nABaseMap.b, this.f8980a, this.b);
                }
                if (!z) {
                    return;
                }
            } catch (Exception unused) {
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    NABaseMap.this.e.readLock().unlock();
                }
                throw th;
            }
            NABaseMap.this.e.readLock().unlock();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f8981a;

        b(Bundle bundle) {
            this.f8981a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                if (z) {
                    Bundle bundle = this.f8981a;
                    if (bundle != null) {
                        if (NABaseMap.this.a(bundle.getLong("itemaddr", 0L))) {
                            if (z) {
                                NABaseMap.this.e.readLock().unlock();
                                return;
                            }
                            return;
                        }
                    }
                    NABaseMap nABaseMap = NABaseMap.this;
                    nABaseMap.nativeRemoveItemData(nABaseMap.b, this.f8981a);
                }
                if (!z) {
                    return;
                }
            } catch (Exception unused) {
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    NABaseMap.this.e.readLock().unlock();
                }
                throw th;
            }
            NABaseMap.this.e.readLock().unlock();
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f8982a;

        c(Bundle bundle) {
            this.f8982a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NABaseMap.this.a()) {
                boolean z = false;
                try {
                    z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                    if (z) {
                        NABaseMap nABaseMap = NABaseMap.this;
                        nABaseMap.nativeAddOneOverlayItem(nABaseMap.b, this.f8982a);
                    }
                    if (!z) {
                        return;
                    }
                } catch (Exception unused) {
                    if (!z) {
                        return;
                    }
                } catch (Throwable th) {
                    if (z) {
                        NABaseMap.this.e.readLock().unlock();
                    }
                    throw th;
                }
                NABaseMap.this.e.readLock().unlock();
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle[] f8983a;
        final /* synthetic */ int b;

        d(Bundle[] bundleArr, int i) {
            this.f8983a = bundleArr;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NABaseMap.this.a()) {
                boolean z = false;
                try {
                    z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                    if (z) {
                        NABaseMap nABaseMap = NABaseMap.this;
                        nABaseMap.nativeAddOverlayItems(nABaseMap.b, this.f8983a, this.b);
                    }
                    if (!z) {
                        return;
                    }
                } catch (Exception unused) {
                    if (!z) {
                        return;
                    }
                } catch (Throwable th) {
                    if (z) {
                        NABaseMap.this.e.readLock().unlock();
                    }
                    throw th;
                }
                NABaseMap.this.e.readLock().unlock();
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f8984a;

        e(Bundle bundle) {
            this.f8984a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NABaseMap.this.a()) {
                boolean z = false;
                try {
                    z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                    if (z) {
                        NABaseMap nABaseMap = NABaseMap.this;
                        nABaseMap.nativeUpdateOneOverlayItem(nABaseMap.b, this.f8984a);
                    }
                    if (!z) {
                        return;
                    }
                } catch (Exception unused) {
                    if (!z) {
                        return;
                    }
                } catch (Throwable th) {
                    if (z) {
                        NABaseMap.this.e.readLock().unlock();
                    }
                    throw th;
                }
                NABaseMap.this.e.readLock().unlock();
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f8985a;

        f(Bundle bundle) {
            this.f8985a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NABaseMap.this.a()) {
                boolean z = false;
                try {
                    z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                    if (z) {
                        NABaseMap nABaseMap = NABaseMap.this;
                        nABaseMap.nativeRemoveOneOverlayItem(nABaseMap.b, this.f8985a);
                    }
                    if (!z) {
                        return;
                    }
                } catch (Exception unused) {
                    if (!z) {
                        return;
                    }
                } catch (Throwable th) {
                    if (z) {
                        NABaseMap.this.e.readLock().unlock();
                    }
                    throw th;
                }
                NABaseMap.this.e.readLock().unlock();
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle[] f8986a;

        g(Bundle[] bundleArr) {
            this.f8986a = bundleArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Throwable th;
            if (NABaseMap.this.a()) {
                int i = 0;
                try {
                    z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                    if (z) {
                        try {
                            Bundle[] bundleArr = this.f8986a;
                            int length = bundleArr.length;
                            while (i < length) {
                                Bundle bundle = bundleArr[i];
                                if (NABaseMap.this.c) {
                                    break;
                                }
                                NABaseMap nABaseMap = NABaseMap.this;
                                nABaseMap.nativeRemoveOneOverlayItem(nABaseMap.b, bundle);
                                i++;
                            }
                        } catch (Exception unused) {
                            i = z ? 1 : 0;
                            if (i == 0) {
                                return;
                            }
                            NABaseMap.this.e.readLock().unlock();
                        } catch (Throwable th2) {
                            th = th2;
                            if (z) {
                                NABaseMap.this.e.readLock().unlock();
                            }
                            throw th;
                        }
                    }
                    if (!z) {
                        return;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th3) {
                    z = false;
                    th = th3;
                }
                NABaseMap.this.e.readLock().unlock();
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NABaseMap.this.dispose();
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8988a;
        final /* synthetic */ boolean b;

        i(long j, boolean z) {
            this.f8988a = j;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                if (z && !NABaseMap.this.a(this.f8988a)) {
                    if (NABaseMap.this.c) {
                        if (z) {
                            NABaseMap.this.e.readLock().unlock();
                            return;
                        }
                        return;
                    }
                    NABaseMap nABaseMap = NABaseMap.this;
                    nABaseMap.nativeShowLayers(nABaseMap.b, this.f8988a, this.b);
                }
                if (!z) {
                    return;
                }
            } catch (Exception unused) {
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    NABaseMap.this.e.readLock().unlock();
                }
                throw th;
            }
            NABaseMap.this.e.readLock().unlock();
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8989a;
        final /* synthetic */ boolean b;

        j(long j, boolean z) {
            this.f8989a = j;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                if (z && !NABaseMap.this.a(this.f8989a)) {
                    NABaseMap nABaseMap = NABaseMap.this;
                    nABaseMap.nativeSetLayersClickable(nABaseMap.b, this.f8989a, this.b);
                }
                if (!z) {
                    return;
                }
            } catch (Exception unused) {
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    NABaseMap.this.e.readLock().unlock();
                }
                throw th;
            }
            NABaseMap.this.e.readLock().unlock();
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8990a;

        k(long j) {
            this.f8990a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                if (z && !NABaseMap.this.a(this.f8990a)) {
                    NABaseMap nABaseMap = NABaseMap.this;
                    nABaseMap.nativeUpdateLayers(nABaseMap.b, this.f8990a);
                }
                if (!z) {
                    return;
                }
            } catch (Exception unused) {
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    NABaseMap.this.e.readLock().unlock();
                }
                throw th;
            }
            NABaseMap.this.e.readLock().unlock();
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8991a;

        l(long j) {
            this.f8991a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                z = NABaseMap.this.e.writeLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                if (z) {
                    NABaseMap.this.f.add(Long.valueOf(this.f8991a));
                    NABaseMap nABaseMap = NABaseMap.this;
                    nABaseMap.nativeRemoveLayer(nABaseMap.b, this.f8991a);
                }
                if (!z) {
                    return;
                }
            } catch (Exception unused) {
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    NABaseMap.this.e.writeLock().unlock();
                }
                throw th;
            }
            NABaseMap.this.e.writeLock().unlock();
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8992a;
        final /* synthetic */ long b;

        m(long j, long j2) {
            this.f8992a = j;
            this.b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                if (z && !NABaseMap.this.a(this.f8992a) && !NABaseMap.this.a(this.b)) {
                    NABaseMap nABaseMap = NABaseMap.this;
                    nABaseMap.nativeSwitchLayer(nABaseMap.b, this.f8992a, this.b);
                }
                if (!z) {
                    return;
                }
            } catch (Exception unused) {
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    NABaseMap.this.e.readLock().unlock();
                }
                throw th;
            }
            NABaseMap.this.e.readLock().unlock();
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8993a;

        n(long j) {
            this.f8993a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                if (z && !NABaseMap.this.a(this.f8993a) && !NABaseMap.this.c && NABaseMap.this.b != 0) {
                    NABaseMap nABaseMap = NABaseMap.this;
                    nABaseMap.nativeSyncClearLayer(nABaseMap.b, this.f8993a);
                }
                if (!z) {
                    return;
                }
            } catch (Exception unused) {
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    NABaseMap.this.e.readLock().unlock();
                }
                throw th;
            }
            NABaseMap.this.e.readLock().unlock();
        }
    }

    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8994a;

        o(long j) {
            this.f8994a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                if (z && !NABaseMap.this.a(this.f8994a)) {
                    NABaseMap nABaseMap = NABaseMap.this;
                    nABaseMap.nativeClearLayer(nABaseMap.b, this.f8994a);
                }
                if (!z) {
                    return;
                }
            } catch (Exception unused) {
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    NABaseMap.this.e.readLock().unlock();
                }
                throw th;
            }
            NABaseMap.this.e.readLock().unlock();
        }
    }

    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8995a;
        final /* synthetic */ long b;
        final /* synthetic */ boolean c;
        final /* synthetic */ Bundle d;

        p(long j, long j2, boolean z, Bundle bundle) {
            this.f8995a = j;
            this.b = j2;
            this.c = z;
            this.d = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            try {
                z = NABaseMap.this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
                if (z && !NABaseMap.this.a(this.f8995a)) {
                    NABaseMap nABaseMap = NABaseMap.this;
                    nABaseMap.nativeSetFocus(nABaseMap.b, this.f8995a, this.b, this.c, this.d);
                }
                if (!z) {
                    return;
                }
            } catch (Exception unused) {
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    NABaseMap.this.e.readLock().unlock();
                }
                throw th;
            }
            NABaseMap.this.e.readLock().unlock();
        }
    }

    private native void nativSetAuto3DEnter3DByZoomIn(long j2, boolean z);

    private native void nativeAdd3DModelIDForFilterList(long j2, String str);

    private native boolean nativeAddBmLayerBelow(long j2, long j3, long j4, int i2, int i3);

    private native void nativeAddHexagonMapData(long j2, long j3, Bundle bundle);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAddItemData(long j2, Bundle bundle, boolean z);

    private native long nativeAddLayer(long j2, int i2, int i3, String str);

    private native void nativeAddPopupData(long j2, Bundle bundle);

    private native void nativeAddRtPopData(long j2, Bundle bundle);

    private native void nativeAddStreetCustomMarker(long j2, Bundle bundle, Bitmap bitmap);

    private native void nativeAttachDC(long j2, long j3);

    private native boolean nativeBeginLocationLayerAnimation(long j2);

    private native void nativeCancelPreload(long j2, int i2);

    private native boolean nativeCleanCache(long j2, int i2, boolean z);

    private native void nativeClearFullscreenMaskColor(long j2);

    private native void nativeClearHeatMapLayerCache(long j2, long j3);

    private native void nativeClearHexagonLayerCache(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeClearLayer(long j2, long j3);

    private native void nativeClearLocationLayerData(long j2, Bundle bundle);

    private native void nativeClearMistmapLayer(long j2);

    private native void nativeClearParticleSystemMemory(long j2);

    private native void nativeClearUniversalLayer(long j2);

    private native boolean nativeCloseCache(long j2);

    private native void nativeCloseParticleEffect(long j2, String str);

    private native void nativeCloseParticleEffectByType(long j2, int i2);

    private native long nativeCreate();

    private native long nativeCreateDuplicate(long j2);

    private native boolean nativeCustomParticleEffectByType(long j2, int i2, Bundle bundle);

    private native boolean nativeDownloadMapStyle(long j2, String str);

    private native int nativeDraw(long j2);

    private native void nativeEnablePOIAnimation(long j2, boolean z);

    private native void nativeEntrySearchTopic(long j2, int i2, String str, String str2);

    private native void nativeExitSearchTopic(long j2);

    private native void nativeFocusTrafficUGCLabel(long j2);

    private native String nativeGeoPt3ToScrPoint(long j2, int i2, int i3, int i4);

    private native String nativeGeoPtToScrPoint(long j2, int i2, int i3);

    private static native boolean nativeGet3DModelEnable(long j2);

    private native float nativeGetAdapterZoomUnitsEx(long j2);

    private native long nativeGetBackGroundColorByLevel(long j2, int i2);

    private native Bundle nativeGetBaseRoadData(long j2);

    private native int nativeGetCacheSize(long j2, int i2);

    private native boolean nativeGetCityInfoByBound(long j2, Bundle bundle);

    private native String nativeGetCityInfoByID(long j2, int i2);

    private native String nativeGetCurDrawPoiInfo(long j2, int i2);

    private native boolean nativeGetCustomTrafficColorEnable(long j2);

    private static native boolean nativeGetDEMEnable(long j2);

    private native float nativeGetDpiScale(long j2);

    private static native boolean nativeGetDrawHouseHeightEnable(long j2);

    private native Bundle nativeGetDrawingMapStatus(long j2);

    private native float nativeGetFZoomToBoundF(long j2, Bundle bundle, Bundle bundle2);

    private native String nativeGetFocusedBaseIndoorMapInfo(long j2);

    private native int nativeGetFontSizeLevel(long j2);

    private static native int nativeGetHouseSmoothLevel(long j2);

    private native int nativeGetIndoorMapShowMode(long j2, String str);

    private static native long nativeGetLayerIDByTag(long j2, String str);

    private native int nativeGetLayerPos(long j2, long j3);

    private native boolean nativeGetMapBarData(long j2, Bundle bundle);

    private native int nativeGetMapLanguage(long j2);

    private native int nativeGetMapRenderType(long j2);

    private native int nativeGetMapScene(long j2);

    private native int nativeGetMapSceneAttr(long j2);

    private native Bundle nativeGetMapStatus(long j2, boolean z);

    private static native Bundle nativeGetMapStatusLimits(long j2);

    private native boolean nativeGetMapStatusLimitsLevel(long j2, int[] iArr);

    private native int nativeGetMapTheme(long j2);

    private native String nativeGetNearlyObjID(long j2, long j3, int i2, int i3, int i4);

    private native String nativeGetPoiMarkData(long j2, int i2, int i3, int i4, int i5, boolean z);

    private static native boolean nativeGetPoiTagEnable(long j2, int i2);

    private static native void nativeGetProjectionMatrix(long j2, float[] fArr);

    private native String nativeGetProjectionPt(long j2, String str);

    private native int nativeGetScaleLevel(long j2, int i2, int i3);

    private native int nativeGetSkyOffset(long j2);

    private static native int nativeGetSkyboxStyle(long j2);

    private native String nativeGetStreetRoadNearPointFromCenter(long j2, double d2, double d3, int i2);

    private native int nativeGetVMPMapCityInfo(long j2, Bundle bundle);

    private static native void nativeGetViewMatrix(long j2, float[] fArr);

    private native boolean nativeGetVirtualPoiShowEnable(long j2);

    private native float nativeGetZoomToBound(long j2, Bundle bundle, int i2, int i3);

    private native float nativeGetZoomToBoundF(long j2, Bundle bundle);

    private native boolean nativeImportMapTheme(long j2, int i2);

    private native boolean nativeInit(long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2);

    private native boolean nativeInitCustomStyle(long j2, String str, String str2);

    private native void nativeInitHeatMapData(long j2, long j3, Bundle bundle);

    private native int nativeInitLayerCallback(long j2);

    private native boolean nativeInitWithBundle(long j2, Bundle bundle, boolean z);

    private native long nativeInsertLayerAt(long j2, int i2, int i3, int i4, String str);

    private native void nativeInterruptDraw(long j2, boolean z);

    private native boolean nativeIsAnimationRunning(long j2);

    private native boolean nativeIsBaseIndoorMapMode(long j2);

    private native boolean nativeIsBaseIndoorMapShow(long j2);

    private native boolean nativeIsEnableIndoor3D(long j2);

    private native boolean nativeIsNaviMode(long j2);

    private native boolean nativeIsPointInFocusBarBorder(long j2, double d2, double d3, double d4);

    private native boolean nativeIsPointInFocusIDRBorder(long j2, double d2, double d3);

    private native boolean nativeIsStreetArrowShown(long j2);

    private native boolean nativeIsStreetCustomMarkerShown(long j2);

    private native boolean nativeIsStreetPOIMarkerShown(long j2);

    private native boolean nativeIsStreetRoadClickable(long j2);

    private native boolean nativeIsSupBackgroundDraw(long j2);

    private native boolean nativeLayersIsShow(long j2, long j3);

    private native boolean nativeMoveLayerBelow(long j2, long j3, String str);

    private native boolean nativeMoveLayerBelowTo(long j2, long j3, int i2);

    private native void nativeMoveToScrPoint(long j2, int i2, int i3);

    private native void nativeNewSetMapStatus(long j2, Bundle bundle);

    private native void nativeOnBackground(long j2);

    private native void nativeOnForeground(long j2);

    private native void nativeOnGestureFinish(long j2);

    private native void nativeOnGestureStart(long j2);

    private native String nativeOnHotcityGet(long j2);

    private native void nativeOnPause(long j2);

    private native boolean nativeOnRecordAdd(long j2, int i2);

    private native String nativeOnRecordGetAll(long j2);

    private native String nativeOnRecordGetAt(long j2, int i2);

    private native boolean nativeOnRecordImport(long j2, boolean z, boolean z2);

    private native boolean nativeOnRecordReload(long j2, int i2, boolean z);

    private native boolean nativeOnRecordRemove(long j2, int i2, boolean z);

    private native boolean nativeOnRecordStart(long j2, int i2, boolean z, int i3);

    private native boolean nativeOnRecordSuspend(long j2, int i2, boolean z, int i3);

    private native void nativeOnResume(long j2);

    private native String nativeOnSchcityGet(long j2, String str);

    private native boolean nativeOnUsrcityMsgInterval(long j2, int i2);

    private native int nativeOnWifiRecordAdd(long j2, int i2);

    private native boolean nativePerformAction(long j2, String str);

    private native void nativePreLoadParticleFile(long j2, String str);

    private native boolean nativePreload(long j2, Bundle bundle, int i2);

    private native int nativeQueryInterface(long j2);

    private native byte[] nativeReadMapResData(long j2, String str);

    private native void nativeRecycleMemory(long j2, int i2);

    private native int nativeRelease(long j2);

    private native void nativeRemove3DModelIDForFilterList(long j2, String str);

    private native boolean nativeRemoveBmLayer(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeRemoveItemData(long j2, Bundle bundle);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeRemoveLayer(long j2, long j3);

    private native void nativeRemoveStreetAllCustomMarker(long j2);

    private native void nativeRemoveStreetCustomMaker(long j2, String str);

    private static native void nativeRenderClearShaderCache(String str);

    private static native void nativeRenderInit(long j2, int i2, int i3, Surface surface, int i4);

    private native void nativeRenderResize(long j2, int i2, int i3);

    private native void nativeResetImageRes(long j2);

    private native boolean nativeResumeCache(long j2);

    private native boolean nativeSaveCache(long j2);

    private native void nativeSaveScreenToLocal(long j2, String str, String str2);

    private native String nativeScr2GeoInGesture(long j2, int i2, int i3);

    private native String nativeScrPtToGeoPoint(long j2, int i2, int i3);

    private static native void nativeSet3DModelEnable(long j2, boolean z);

    private native void nativeSetAllStreetCustomMarkerVisibility(long j2, boolean z);

    private native void nativeSetBackgroundColor(long j2, int i2);

    private native void nativeSetCustomStyleEnable(long j2, boolean z);

    private native void nativeSetCustomTrafficColor(long j2, int i2, int i3, int i4, int i5);

    private native void nativeSetCustomTrafficColorEnable(long j2, boolean z);

    private native void nativeSetCustomVMPDataRoot(long j2, String str);

    private static native void nativeSetDEMEnable(long j2, boolean z);

    private native void nativeSetDotPoiShowEnable(long j2, boolean z);

    private native void nativeSetDpiScale(long j2, float f2);

    private static native void nativeSetDrawHouseHeightEnable(long j2, boolean z);

    private native void nativeSetEnableIndoor3D(long j2, boolean z);

    private native void nativeSetFeatureConfig(long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native String nativeSetFocus(long j2, long j3, long j4, boolean z, Bundle bundle);

    private native void nativeSetFontSizeLevel(long j2, int i2);

    private native void nativeSetFullscreenMaskColor(long j2, int i2);

    private native void nativeSetGlobalLightEnable(long j2, boolean z);

    private native void nativeSetHeatMapFrameAnimationIndex(long j2, long j3, int i2);

    private static native void nativeSetHouseSmoothLevel(long j2, int i2);

    private native void nativeSetIndoorMapShowMode(long j2, String str, int i2);

    private native boolean nativeSetItsPreTime(long j2, int i2, int i3, int i4);

    private native boolean nativeSetLayerSceneMode(long j2, long j3, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetLayersClickable(long j2, long j3, boolean z);

    private static native void nativeSetLittle3DEnable(long j2, boolean z);

    private native void nativeSetLocationLayerData(long j2, Bundle bundle);

    private native void nativeSetMapBackgroundImage(long j2, Bundle bundle);

    private native int nativeSetMapControlMode(long j2, int i2);

    private native void nativeSetMapLanguage(long j2, int i2, boolean z);

    private native boolean nativeSetMapScene(long j2, int i2);

    private native boolean nativeSetMapSceneAttr(long j2, int i2);

    private native void nativeSetMapStatus(long j2, Bundle bundle);

    private static native void nativeSetMapStatusLimits(long j2, Bundle bundle);

    private native boolean nativeSetMapStatusLimitsLevel(long j2, int i2, int i3);

    private native boolean nativeSetMapTheme(long j2, int i2, Bundle bundle);

    private native boolean nativeSetMapThemeScene(long j2, int i2, int i3, Bundle bundle);

    private static native void nativeSetMaxAndMinZoomLevel(long j2, Bundle bundle);

    private native void nativeSetPoiTagEnable(long j2, int i2, boolean z);

    private native void nativeSetRecommendPOIScene(long j2, int i2);

    private static native void nativeSetSkyboxStyle(long j2, int i2);

    private native void nativeSetStreetArrowShow(long j2, boolean z);

    private static native void nativeSetStreetLayerNewDesignFlag(long j2, boolean z);

    private native void nativeSetStreetMarkerClickable(long j2, String str, boolean z);

    private native void nativeSetStreetRoadClickable(long j2, boolean z);

    private native void nativeSetStyleMode(long j2, int i2);

    private native void nativeSetSupBackgroundDraw(long j2, boolean z);

    private native void nativeSetTargetStreetCustomMarkerVisibility(long j2, boolean z, String str);

    private native boolean nativeSetTestSwitch(long j2, boolean z);

    private native void nativeSetTrafficUGCData(long j2, String str);

    private native void nativeSetUniversalFilter(long j2, String str);

    private native void nativeSetUseCustomVMP(long j2, boolean z);

    private native void nativeSetVirtualPoiShowEnable(long j2, boolean z);

    private native void nativeShowBaseIndoorMap(long j2, boolean z);

    private native void nativeShowFootMarkGrid(long j2, boolean z, String str);

    private native void nativeShowHotMap(long j2, boolean z, int i2);

    private native void nativeShowHotMapWithUid(long j2, boolean z, int i2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeShowLayers(long j2, long j3, boolean z);

    private native void nativeShowMistMap(long j2, boolean z, String str);

    private native void nativeShowOperatorDataByType(long j2, boolean z, int i2);

    private native boolean nativeShowParticleEffect(long j2, int i2);

    private native boolean nativeShowParticleEffectByFileName(long j2, String str);

    private native boolean nativeShowParticleEffectByFilenameAndPos(long j2, String str, float f2, float f3, float f4);

    private native boolean nativeShowParticleEffectByName(long j2, String str, boolean z);

    private native boolean nativeShowParticleEffectByType(long j2, int i2);

    private native boolean nativeShowParticleEffectByTypeAndPos(long j2, int i2, float f2, float f3, float f4);

    private native boolean nativeShowParticleEffectByTypeAndStyleID(long j2, int i2, int i3);

    private native void nativeShowSatelliteMap(long j2, boolean z);

    private native void nativeShowStreetPOIMarker(long j2, boolean z);

    private native void nativeShowStreetPopup(long j2, boolean z);

    private native void nativeShowStreetRoadMap(long j2, boolean z);

    private native void nativeShowTopicPOI(long j2, String str, boolean z, String str2, boolean z2);

    private native void nativeShowTrafficMap(long j2, boolean z);

    private native void nativeShowTrafficUGCMap(long j2, boolean z);

    private native void nativeShowUniversalLayer(long j2, Bundle bundle);

    private native void nativeStartHeatMapFrameAnimation(long j2, long j3);

    private native void nativeStartIndoorAnimation(long j2);

    private native void nativeStopHeatMapFrameAnimation(long j2, long j3);

    private native void nativeSurfaceDestroyed(long j2, Surface surface);

    private native boolean nativeSwitchBaseIndoorMapFloor(long j2, String str, String str2);

    private native void nativeSwitchDayOrDarkTheme(long j2, int i2, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeSwitchLayer(long j2, long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSyncClearLayer(long j2, long j3);

    private native void nativeUnFocusTrafficUGCLabel(long j2);

    private native void nativeUpdateBaseLayers(long j2);

    private native void nativeUpdateDrawFPS(long j2);

    private native void nativeUpdateFootMarkGrid(long j2);

    private native void nativeUpdateHeatMapData(long j2, long j3, Bundle bundle);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUpdateLayers(long j2, long j3);

    private native String nativeworldPointToScreenPoint(long j2, float f2, float f3, float f4);

    public static void renderClearShaderCache(String str) {
        nativeRenderClearShaderCache(str);
    }

    public String Scr2GeoInGesture(int i2, int i3) {
        long j2 = this.b;
        return j2 != 0 ? nativeScr2GeoInGesture(j2, i2, i3) : "";
    }

    public void add3DModelIDForFilterList(String str) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeAdd3DModelIDForFilterList(j2, str);
        }
    }

    public boolean addBmLayerBelow(long j2, long j3, int i2, int i3) {
        return nativeAddBmLayerBelow(this.b, j2, j3, i2, i3);
    }

    public void addHexagonMapData(long j2, Bundle bundle) {
        long j3 = this.b;
        if (j3 != 0) {
            nativeAddHexagonMapData(j3, j2, bundle);
        }
    }

    public void addItemData(Bundle bundle, boolean z) {
        if (a()) {
            this.f8979a.submit(new a(bundle, z));
        }
    }

    public long addLayer(int i2, int i3, String str) {
        long nativeAddLayer = nativeAddLayer(this.b, i2, i3, str);
        this.f.remove(Long.valueOf(nativeAddLayer));
        return nativeAddLayer;
    }

    public void addOneOverlayItem(Bundle bundle) {
        if (a()) {
            this.f8979a.submit(new c(bundle));
        }
    }

    public void addOverlayItems(Bundle[] bundleArr, int i2) {
        if (a()) {
            this.f8979a.submit(new d(bundleArr, i2));
        }
    }

    public void addPopupData(Bundle bundle) {
        nativeAddPopupData(this.b, bundle);
    }

    public void addRtPopData(Bundle bundle) {
        nativeAddRtPopData(this.b, bundle);
    }

    public void addStreetCustomMarker(Bundle bundle, Bitmap bitmap) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeAddStreetCustomMarker(j2, bundle, bitmap);
        }
    }

    public void beginLocationLayerAnimation() {
        nativeBeginLocationLayerAnimation(this.b);
    }

    public void cancelPreload(int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeCancelPreload(j2, i2);
        }
    }

    public boolean cleanCache(int i2, boolean z) {
        return nativeCleanCache(this.b, i2, z);
    }

    public void clearFullscreenMaskColor() {
        long j2 = this.b;
        if (j2 != 0) {
            nativeClearFullscreenMaskColor(j2);
        }
    }

    public void clearHeatMapLayerCache(long j2) {
        long j3 = this.b;
        if (j3 != 0) {
            nativeClearHeatMapLayerCache(j3, j2);
        }
    }

    public void clearHexagonLayerCache(long j2) {
        long j3 = this.b;
        if (j3 != 0) {
            nativeClearHexagonLayerCache(j3, j2);
        }
    }

    public void clearLayer(long j2) {
        if (a()) {
            this.f8979a.submit(new o(j2));
        }
    }

    public void clearLocationLayerData(Bundle bundle) {
        nativeClearLocationLayerData(this.b, bundle);
    }

    public void clearMistmapLayer() {
        nativeClearMistmapLayer(this.b);
    }

    public void clearParticleSystemMemory() {
        nativeClearParticleSystemMemory(this.b);
    }

    public void clearSDKLayer(long j2) {
        if (!a() || this.c) {
            return;
        }
        this.f8979a.submit(new n(j2));
    }

    public void clearUniversalLayer() {
        nativeClearUniversalLayer(this.b);
    }

    public boolean closeCache() {
        return nativeCloseCache(this.b);
    }

    public void closeParticleEffect(String str) {
        nativeCloseParticleEffect(this.b, str);
    }

    public void closeParticleEffectByType(int i2) {
        nativeCloseParticleEffectByType(this.b, i2);
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
        long nativeCreate = nativeCreate();
        this.b = nativeCreate;
        nativeInitLayerCallback(nativeCreate);
        return this.b;
    }

    public long createByDuplicate(long j2) {
        long nativeCreateDuplicate = nativeCreateDuplicate(j2);
        this.b = nativeCreateDuplicate;
        if (nativeCreateDuplicate != 0) {
            nativeInitLayerCallback(nativeCreateDuplicate);
        }
        return this.b;
    }

    public long createDuplicate() {
        return nativeCreateDuplicate(this.b);
    }

    public boolean customParticleEffectByType(int i2, Bundle bundle) {
        return nativeCustomParticleEffectByType(this.b, i2, bundle);
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
        boolean z;
        boolean z2 = false;
        if (this.d >= 5) {
            return 0;
        }
        if (this.b != 0) {
            this.c = true;
            b();
        }
        try {
            z = this.e.writeLock().tryLock(2000L, TimeUnit.MILLISECONDS);
            try {
                if (z) {
                    long j2 = this.b;
                    if (j2 != 0) {
                        int nativeRelease = nativeRelease(j2);
                        this.b = 0L;
                        if (z) {
                            this.e.writeLock().unlock();
                        }
                        return nativeRelease;
                    }
                } else {
                    this.d++;
                    new Handler(Looper.getMainLooper()).postDelayed(new h(), 200L);
                }
                if (z) {
                    this.e.writeLock().unlock();
                }
                return 0;
            } catch (Exception unused) {
                if (z) {
                    this.e.writeLock().unlock();
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    this.e.writeLock().unlock();
                }
                throw th;
            }
        } catch (Exception unused2) {
            z = false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean downloadMapStyle(String str) {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeDownloadMapStyle(j2, str);
        }
        return false;
    }

    public int draw() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeDraw(j2);
        }
        return 0;
    }

    public void enablePOIAnimation(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeEnablePOIAnimation(j2, z);
        }
    }

    public void entrySearchTopic(int i2, String str, String str2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeEntrySearchTopic(j2, i2, str, str2);
        }
    }

    public void exitSearchTopic() {
        long j2 = this.b;
        if (j2 != 0) {
            nativeExitSearchTopic(j2);
        }
    }

    public void focusTrafficUGCLabel() {
        nativeFocusTrafficUGCLabel(this.b);
    }

    public String geoPt3ToScrPoint(int i2, int i3, int i4) {
        return nativeGeoPt3ToScrPoint(this.b, i2, i3, i4);
    }

    public String geoPtToScrPoint(int i2, int i3) {
        return nativeGeoPtToScrPoint(this.b, i2, i3);
    }

    public boolean get3DModelEnable() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGet3DModelEnable(j2);
        }
        return false;
    }

    public float getAdapterZoomUnitsEx() {
        return nativeGetAdapterZoomUnitsEx(this.b);
    }

    public long getBackGroundColorByLevel(int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetBackGroundColorByLevel(j2, i2);
        }
        return 0L;
    }

    public Bundle getBaseRoadData() {
        long j2 = this.b;
        if (j2 == 0) {
            return null;
        }
        return nativeGetBaseRoadData(j2);
    }

    public int getCacheSize(int i2) {
        return nativeGetCacheSize(this.b, i2);
    }

    public boolean getCityInfoByBound(Bundle bundle) {
        return nativeGetCityInfoByBound(this.b, bundle);
    }

    public String getCityInfoByID(int i2) {
        return nativeGetCityInfoByID(this.b, i2);
    }

    public String getCurDrawPoiInfo(int i2) {
        long j2 = this.b;
        return j2 != 0 ? nativeGetCurDrawPoiInfo(j2, i2) : "";
    }

    public boolean getCustomTrafficColorEnable() {
        long j2 = this.b;
        if (0 == j2) {
            return false;
        }
        return nativeGetCustomTrafficColorEnable(j2);
    }

    public boolean getDEMEnable() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetDEMEnable(j2);
        }
        return false;
    }

    public float getDpiScale() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetDpiScale(j2);
        }
        return 1.0f;
    }

    public boolean getDrawHouseHeightEnable() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetDrawHouseHeightEnable(j2);
        }
        return false;
    }

    public Bundle getDrawingMapStatus() {
        return nativeGetDrawingMapStatus(this.b);
    }

    public float getFZoomToBoundF(Bundle bundle, Bundle bundle2) {
        return nativeGetFZoomToBoundF(this.b, bundle, bundle2);
    }

    public String getFocusedBaseIndoorMapInfo() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetFocusedBaseIndoorMapInfo(j2);
        }
        return null;
    }

    public int getFontSizeLevel() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetFontSizeLevel(j2);
        }
        return 1;
    }

    public int getHouseSmoothLevel() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetHouseSmoothLevel(j2);
        }
        return -1;
    }

    public int getIndoorMapShowMode(String str) {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetIndoorMapShowMode(j2, str);
        }
        return 0;
    }

    public long getLayerIDByTag(String str) {
        if (this.b == 0 || TextUtils.isEmpty(str)) {
            return 0L;
        }
        return nativeGetLayerIDByTag(this.b, str);
    }

    public boolean getMapBarData(Bundle bundle) {
        return nativeGetMapBarData(this.b, bundle);
    }

    public int getMapLanguage() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetMapLanguage(j2);
        }
        return 0;
    }

    public int getMapRenderType() {
        return nativeGetMapRenderType(this.b);
    }

    public int getMapScene() {
        return nativeGetMapScene(this.b);
    }

    public int getMapSceneAttr() {
        return nativeGetMapSceneAttr(this.b);
    }

    public Bundle getMapStatus(boolean z) {
        return nativeGetMapStatus(this.b, z);
    }

    public Bundle getMapStatusLimits() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetMapStatusLimits(j2);
        }
        return null;
    }

    public boolean getMapStatusLimitsLevel(int[] iArr) {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetMapStatusLimitsLevel(j2, iArr);
        }
        return false;
    }

    public int getMapTheme() {
        return nativeGetMapTheme(this.b);
    }

    public long getNativeMapPointer() {
        return this.b;
    }

    public String getNearlyObjID(long j2, int i2, int i3, int i4) {
        NABaseMap nABaseMap;
        boolean z = false;
        try {
            z = this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
            if (!z) {
                if (z) {
                    this.e.readLock().unlock();
                }
                return "";
            }
            if (a(j2)) {
                if (z) {
                    this.e.readLock().unlock();
                }
                return "";
            }
            nABaseMap = this;
            try {
                String nativeGetNearlyObjID = nABaseMap.nativeGetNearlyObjID(this.b, j2, i2, i3, i4);
                if (z) {
                    nABaseMap.e.readLock().unlock();
                }
                return nativeGetNearlyObjID;
            } catch (Exception unused) {
                if (z) {
                    nABaseMap.e.readLock().unlock();
                }
                return "";
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (!z) {
                    throw th2;
                }
                nABaseMap.e.readLock().unlock();
                throw th2;
            }
        } catch (Exception unused2) {
            nABaseMap = this;
        } catch (Throwable th3) {
            th = th3;
            nABaseMap = this;
        }
    }

    public String getPoiMarkData(int i2, int i3, int i4, int i5, boolean z) {
        return nativeGetPoiMarkData(this.b, i2, i3, i4, i5, z);
    }

    public boolean getPoiTagEnable(int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetPoiTagEnable(j2, i2);
        }
        return false;
    }

    public void getProjectMatrix(float[] fArr) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeGetProjectionMatrix(j2, fArr);
        }
    }

    public String getProjectionPt(String str) {
        return nativeGetProjectionPt(this.b, str);
    }

    public int getScaleLevel(int i2, int i3) {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetScaleLevel(j2, i2, i3);
        }
        return -1;
    }

    public int getSkyOffset() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetSkyOffset(j2);
        }
        return 0;
    }

    public int getSkyboxStyle() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeGetSkyboxStyle(j2);
        }
        return 0;
    }

    public String getStreetRoadNearPointFromCenter(double d2, double d3, int i2) {
        return nativeGetStreetRoadNearPointFromCenter(this.b, d2, d3, i2);
    }

    public int getVMPMapCityInfo(Bundle bundle) {
        return nativeGetVMPMapCityInfo(this.b, bundle);
    }

    public void getViewMatrix(float[] fArr) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeGetViewMatrix(j2, fArr);
        }
    }

    public boolean getVirtualPoiShowEnable() {
        return nativeGetVirtualPoiShowEnable(this.b);
    }

    public float getZoomToBound(Bundle bundle, int i2, int i3) {
        return nativeGetZoomToBound(this.b, bundle, i2, i3);
    }

    public float getZoomToBoundF(Bundle bundle) {
        return nativeGetZoomToBoundF(this.b, bundle);
    }

    public boolean importMapTheme(int i2) {
        return nativeImportMapTheme(this.b, i2);
    }

    public boolean init(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2) {
        long j2 = this.b;
        return j2 != 0 && nativeInit(j2, str, str2, str3, str4, str5, str6, str7, i2, i3, i4, i5, i6, i7, i8, z, z2);
    }

    public boolean initCustomStyle(String str, String str2) {
        long j2 = this.b;
        if (j2 == 0) {
            return true;
        }
        nativeInitCustomStyle(j2, str, str2);
        return true;
    }

    public void initHeatMapData(long j2, Bundle bundle) {
        long j3 = this.b;
        if (j3 != 0) {
            nativeInitHeatMapData(j3, j2, bundle);
        }
    }

    public boolean initWithOptions(Bundle bundle, boolean z) {
        long j2 = this.b;
        return j2 != 0 && nativeInitWithBundle(j2, bundle, z);
    }

    public void interruptDraw(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeInterruptDraw(j2, z);
        }
    }

    public boolean isAnimationRunning() {
        return nativeIsAnimationRunning(this.b);
    }

    public boolean isBaseIndoorMapMode() {
        long j2 = this.b;
        return j2 != 0 && nativeIsBaseIndoorMapMode(j2);
    }

    public boolean isBaseIndoorMapShow() {
        long j2 = this.b;
        return j2 != 0 && nativeIsBaseIndoorMapShow(j2);
    }

    public boolean isEnableIndoor3D() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeIsEnableIndoor3D(j2);
        }
        return true;
    }

    public boolean isNaviMode() {
        return nativeIsNaviMode(this.b);
    }

    public boolean isPointInFocusBarBorder(double d2, double d3, double d4) {
        long j2 = this.b;
        return j2 != 0 && nativeIsPointInFocusBarBorder(j2, d2, d3, d4);
    }

    public boolean isPointInFocusIDRBorder(double d2, double d3) {
        long j2 = this.b;
        return j2 != 0 && nativeIsPointInFocusIDRBorder(j2, d2, d3);
    }

    public boolean isStreetArrowShown() {
        return nativeIsStreetArrowShown(this.b);
    }

    public boolean isStreetCustomMarkerShown() {
        return nativeIsStreetCustomMarkerShown(this.b);
    }

    public boolean isStreetPOIMarkerShown() {
        long j2 = this.b;
        return j2 != 0 && nativeIsStreetPOIMarkerShown(j2);
    }

    public boolean isStreetRoadClickable() {
        return nativeIsStreetRoadClickable(this.b);
    }

    public boolean isSupBackgroundDraw() {
        long j2 = this.b;
        if (j2 == 0) {
            return false;
        }
        return nativeIsSupBackgroundDraw(j2);
    }

    public boolean layersIsShow(long j2) {
        boolean z;
        boolean z2 = false;
        try {
            z = this.e.readLock().tryLock(2000L, TimeUnit.MILLISECONDS);
            if (!z) {
                if (z) {
                    this.e.readLock().unlock();
                }
                return false;
            }
            try {
                if (a(j2)) {
                    if (z) {
                        this.e.readLock().unlock();
                    }
                    return false;
                }
                boolean nativeLayersIsShow = nativeLayersIsShow(this.b, j2);
                if (z) {
                    this.e.readLock().unlock();
                }
                return nativeLayersIsShow;
            } catch (Exception unused) {
                if (z) {
                    this.e.readLock().unlock();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    this.e.readLock().unlock();
                }
                throw th;
            }
        } catch (Exception unused2) {
            z = false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean moveLayerBelow(long j2, String str) {
        long j3 = this.b;
        if (j3 != 0) {
            return nativeMoveLayerBelow(j3, j2, str);
        }
        return false;
    }

    public boolean moveLayerBelowTo(long j2, int i2) {
        long j3 = this.b;
        if (j3 != 0) {
            return nativeMoveLayerBelowTo(j3, j2, i2);
        }
        return false;
    }

    public void moveToScrPoint(int i2, int i3) {
        nativeMoveToScrPoint(this.b, i2, i3);
    }

    public native void nativeAddOneOverlayItem(long j2, Bundle bundle);

    public native void nativeAddOverlayItems(long j2, Bundle[] bundleArr, int i2);

    public native boolean nativeAddTileOverlay(long j2, Bundle bundle);

    public native boolean nativeCleanSDKTileDataCache(long j2, long j3);

    public native void nativeRemoveOneOverlayItem(long j2, Bundle bundle);

    public native void nativeUpdateOneOverlayItem(long j2, Bundle bundle);

    public native boolean nativeUpdateSDKTile(long j2, Bundle bundle);

    public void onBackground() {
        long j2 = this.b;
        if (j2 != 0) {
            nativeOnBackground(j2);
        }
    }

    public void onForeground() {
        long j2 = this.b;
        if (j2 != 0) {
            nativeOnForeground(j2);
        }
    }

    public void onGestureFinish() {
        long j2 = this.b;
        if (j2 != 0) {
            nativeOnGestureFinish(j2);
        }
    }

    public void onGestureStart() {
        long j2 = this.b;
        if (j2 != 0) {
            nativeOnGestureStart(j2);
        }
    }

    public String onHotcityGet() {
        return nativeOnHotcityGet(this.b);
    }

    public void onPause() {
        long j2 = this.b;
        if (j2 != 0) {
            nativeOnPause(j2);
        }
    }

    public boolean onRecordAdd(int i2) {
        return nativeOnRecordAdd(this.b, i2);
    }

    public String onRecordGetAll() {
        return nativeOnRecordGetAll(this.b);
    }

    public String onRecordGetAt(int i2) {
        return nativeOnRecordGetAt(this.b, i2);
    }

    public boolean onRecordImport(boolean z, boolean z2) {
        return nativeOnRecordImport(this.b, z, z2);
    }

    public boolean onRecordReload(int i2, boolean z) {
        return nativeOnRecordReload(this.b, i2, z);
    }

    public boolean onRecordRemove(int i2, boolean z) {
        return nativeOnRecordRemove(this.b, i2, z);
    }

    public boolean onRecordStart(int i2, boolean z, int i3) {
        return nativeOnRecordStart(this.b, i2, z, i3);
    }

    public boolean onRecordSuspend(int i2, boolean z, int i3) {
        return nativeOnRecordSuspend(this.b, i2, z, i3);
    }

    public void onResume() {
        long j2 = this.b;
        if (j2 != 0) {
            nativeOnResume(j2);
        }
    }

    public String onSchcityGet(String str) {
        return nativeOnSchcityGet(this.b, str);
    }

    public boolean onUsrcityMsgInterval(int i2) {
        return nativeOnUsrcityMsgInterval(this.b, i2);
    }

    public int onWifiRecordAdd(int i2) {
        return nativeOnWifiRecordAdd(this.b, i2);
    }

    public boolean performAction(String str) {
        return nativePerformAction(this.b, str);
    }

    public boolean preLoad(int i2, List<com.baidu.platform.comapi.map.i> list) {
        if (this.b != 0 && list != null && list.size() > 0) {
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                com.baidu.platform.comapi.map.i iVar = list.get(i3);
                ParcelItem parcelItem = new ParcelItem();
                Bundle bundle2 = new Bundle();
                bundle2.putDouble("x", iVar.d);
                bundle2.putDouble("y", iVar.e);
                bundle2.putDouble("z", iVar.f);
                bundle2.putFloat("level", iVar.f8646a);
                bundle2.putInt("rotation", iVar.b);
                bundle2.putDouble("overlooking", iVar.c);
                parcelItem.setBundle(bundle2);
                arrayList.add(parcelItem);
            }
            if (arrayList.size() > 0) {
                ParcelItem[] parcelItemArr = new ParcelItem[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    parcelItemArr[i4] = (ParcelItem) arrayList.get(i4);
                }
                bundle.putParcelableArray("points", parcelItemArr);
                return nativePreload(this.b, bundle, i2);
            }
        }
        return false;
    }

    public void preLoadParticleFile(String str) {
        nativePreLoadParticleFile(this.b, str);
    }

    public byte[] readMapResData(String str) {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeReadMapResData(j2, str);
        }
        return null;
    }

    public void recycleMemory(int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeRecycleMemory(j2, i2);
        }
    }

    public void remove3DModelIDForFilterList(String str) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeRemove3DModelIDForFilterList(j2, str);
        }
    }

    public void removeBmLayer(long j2) {
        nativeRemoveBmLayer(this.b, j2);
    }

    public boolean removeItemData(Bundle bundle) {
        if (!a()) {
            return false;
        }
        this.f8979a.submit(new b(bundle));
        return true;
    }

    public void removeLayer(long j2) {
        if (a()) {
            this.f8979a.submit(new l(j2));
        }
    }

    public void removeOneOverlayItem(Bundle bundle) {
        if (a()) {
            this.f8979a.submit(new f(bundle));
        }
    }

    public void removeOneOverlayItems(Bundle[] bundleArr) {
        if (bundleArr == null || !a() || this.c) {
            return;
        }
        this.f8979a.submit(new g(bundleArr));
    }

    public void removeStreetAllCustomMarker() {
        nativeRemoveStreetAllCustomMarker(this.b);
    }

    public void removeStreetCustomMaker(String str) {
        nativeRemoveStreetCustomMaker(this.b, str);
    }

    @Deprecated
    public void renderDone() {
    }

    public void renderInit(int i2, int i3, Surface surface, int i4) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeRenderInit(j2, i2, i3, surface, i4);
        }
    }

    @Deprecated
    public int renderRender() {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeDraw(j2);
        }
        return 0;
    }

    public void renderResize(int i2, int i3) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeRenderResize(j2, i2, i3);
        }
    }

    public void resetImageRes() {
        long j2 = this.b;
        if (j2 != 0) {
            nativeResetImageRes(j2);
        }
    }

    public boolean resumeCache() {
        return nativeResumeCache(this.b);
    }

    public boolean saveCache() {
        try {
            return nativeSaveCache(this.b);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void saveScreenToLocal(String str, String str2) {
        nativeSaveScreenToLocal(this.b, str, str2);
    }

    public String scrPtToGeoPoint(int i2, int i3) {
        return nativeScrPtToGeoPoint(this.b, i2, i3);
    }

    public void set3DModelEnable(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSet3DModelEnable(j2, z);
        }
    }

    public void setAllStreetCustomMarkerVisibility(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetAllStreetCustomMarkerVisibility(j2, z);
        }
    }

    public void setAutoEnter3DByZoomIn(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativSetAuto3DEnter3DByZoomIn(j2, z);
        }
    }

    public void setBackgroundColor(int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetBackgroundColor(j2, i2);
        }
    }

    public void setCallback(com.baidu.platform.comapi.map.p pVar) {
        BaseMapCallback.setMapCallback(this.b, pVar);
    }

    public void setCustomStyleEnable(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetCustomStyleEnable(j2, z);
        }
    }

    public void setCustomTrafficColor(int i2, int i3, int i4, int i5) {
        long j2 = this.b;
        if (0 == j2) {
            return;
        }
        nativeSetCustomTrafficColor(j2, i2, i3, i4, i5);
    }

    public void setCustomTrafficColorEnable(boolean z) {
        long j2 = this.b;
        if (0 == j2) {
            return;
        }
        nativeSetCustomTrafficColorEnable(j2, z);
    }

    public void setDEMEnable(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetDEMEnable(j2, z);
        }
    }

    public void setDotPoiShowEnable(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetDotPoiShowEnable(j2, z);
        }
    }

    public void setDpiScale(float f2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetDpiScale(j2, f2);
        }
    }

    public void setDrawHouseHeightEnable(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetDrawHouseHeightEnable(j2, z);
        }
    }

    public void setEnableIndoor3D(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetEnableIndoor3D(j2, z);
        }
    }

    public void setFeatureConfig(String str) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetFeatureConfig(j2, str);
        }
    }

    public void setFocus(long j2, long j3, boolean z, Bundle bundle) {
        if (a()) {
            this.f8979a.submit(new p(j2, j3, z, bundle));
        }
    }

    public void setFontSizeLevel(int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetFontSizeLevel(j2, i2);
        }
    }

    public void setFullscreenMaskColor(int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetFullscreenMaskColor(j2, i2);
        }
    }

    public void setGlobalLightEnable(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetGlobalLightEnable(j2, z);
        }
    }

    public void setHeatMapFrameAnimationIndex(long j2, int i2) {
        long j3 = this.b;
        if (j3 != 0) {
            nativeSetHeatMapFrameAnimationIndex(j3, j2, i2);
        }
    }

    public void setHouseSmoothLevel(int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetHouseSmoothLevel(j2, i2);
        }
    }

    public void setIndoorMapShowMode(String str, int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetIndoorMapShowMode(j2, str, i2);
        }
    }

    public boolean setItsPreTime(int i2, int i3, int i4) {
        return nativeSetItsPreTime(this.b, i2, i3, i4);
    }

    public boolean setLayerSceneMode(long j2, int i2) {
        return nativeSetLayerSceneMode(this.b, j2, i2);
    }

    public void setLayersClickable(long j2, boolean z) {
        if (a()) {
            this.f8979a.submit(new j(j2, z));
        }
    }

    public void setLittle3DEnable(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetLittle3DEnable(j2, z);
        }
    }

    public void setLocationLayerData(Bundle bundle) {
        nativeSetLocationLayerData(this.b, bundle);
    }

    public void setMapBackgroundImage(Bundle bundle) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetMapBackgroundImage(j2, bundle);
        }
    }

    public int setMapControlMode(int i2) {
        return nativeSetMapControlMode(this.b, i2);
    }

    public void setMapLanguage(int i2, boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetMapLanguage(j2, i2, z);
        }
    }

    public void setMapScene(int i2) {
        nativeSetMapScene(this.b, i2);
    }

    public boolean setMapSceneAttr(int i2) {
        return nativeSetMapSceneAttr(this.b, i2);
    }

    public void setMapStatus(Bundle bundle) {
        nativeSetMapStatus(this.b, bundle);
    }

    public void setMapStatusLimits(Bundle bundle) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetMapStatusLimits(j2, bundle);
        }
    }

    public boolean setMapStatusLimitsLevel(int i2, int i3) {
        long j2 = this.b;
        if (j2 != 0) {
            return nativeSetMapStatusLimitsLevel(j2, i2, i3);
        }
        return false;
    }

    public boolean setMapTheme(int i2, Bundle bundle) {
        return nativeSetMapTheme(this.b, i2, bundle);
    }

    public boolean setMapThemeScene(int i2, int i3, Bundle bundle) {
        return nativeSetMapThemeScene(this.b, i2, i3, bundle);
    }

    public void setMaxAndMinZoomLevel(Bundle bundle) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetMaxAndMinZoomLevel(j2, bundle);
        }
    }

    public void setNewMapStatus(Bundle bundle) {
        nativeNewSetMapStatus(this.b, bundle);
    }

    public void setPoiTagEnable(int i2, boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetPoiTagEnable(j2, i2, z);
        }
    }

    public void setRecommendPOIScene(int i2) {
        nativeSetRecommendPOIScene(this.b, i2);
    }

    public void setSkyboxStyle(int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetSkyboxStyle(j2, i2);
        }
    }

    public void setStreetArrowShow(boolean z) {
        nativeSetStreetArrowShow(this.b, z);
    }

    public void setStreetLayerNewDesignFlag(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetStreetLayerNewDesignFlag(j2, z);
        }
    }

    public void setStreetMarkerClickable(String str, boolean z) {
        nativeSetStreetMarkerClickable(this.b, str, z);
    }

    public void setStreetRoadClickable(boolean z) {
        nativeSetStreetRoadClickable(this.b, z);
    }

    public void setStyleMode(int i2) {
        nativeSetStyleMode(this.b, i2);
    }

    public void setSupBackgroundDraw(boolean z) {
        long j2 = this.b;
        if (j2 == 0) {
            return;
        }
        nativeSetSupBackgroundDraw(j2, z);
    }

    public void setTargetStreetCustomMarkerVisibility(boolean z, String str) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSetTargetStreetCustomMarkerVisibility(j2, z, str);
        }
    }

    public boolean setTestSwitch(boolean z) {
        return nativeSetTestSwitch(this.b, z);
    }

    public void setTrafficUGCData(String str) {
        nativeSetTrafficUGCData(this.b, str);
    }

    public void setUniversalFilter(String str) {
        nativeSetUniversalFilter(this.b, str);
    }

    public void setVirtualPoiShowEnable(boolean z) {
        nativeSetVirtualPoiShowEnable(this.b, z);
    }

    public void showBaseIndoorMap(boolean z) {
        nativeShowBaseIndoorMap(this.b, z);
    }

    public void showFootMarkGrid(boolean z, String str) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeShowFootMarkGrid(j2, z, str);
        }
    }

    public void showHotMap(boolean z, int i2) {
        nativeShowHotMap(this.b, z, i2);
    }

    public void showLayers(long j2, boolean z) {
        if (!a() || this.c) {
            return;
        }
        this.f8979a.submit(new i(j2, z));
    }

    public void showMistMap(boolean z, String str) {
        nativeShowMistMap(this.b, z, str);
    }

    public void showOperatorDataByType(boolean z, int i2) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeShowOperatorDataByType(j2, z, i2);
        }
    }

    public boolean showParticleEffect(int i2) {
        return nativeShowParticleEffect(this.b, i2);
    }

    public boolean showParticleEffectByFileName(String str) {
        return nativeShowParticleEffectByFileName(this.b, str);
    }

    public boolean showParticleEffectByFilenameAndPos(String str, float f2, float f3, float f4) {
        return nativeShowParticleEffectByFilenameAndPos(this.b, str, f2, f3, f4);
    }

    public boolean showParticleEffectByName(String str, boolean z) {
        return nativeShowParticleEffectByName(this.b, str, z);
    }

    public boolean showParticleEffectByType(int i2) {
        return nativeShowParticleEffectByType(this.b, i2);
    }

    public boolean showParticleEffectByTypeAndPos(int i2, float f2, float f3, float f4) {
        return nativeShowParticleEffectByTypeAndPos(this.b, i2, f2, f3, f4);
    }

    public boolean showParticleEffectByTypeAndStyleID(int i2, int i3) {
        return nativeShowParticleEffectByTypeAndStyleID(this.b, i2, i3);
    }

    public void showSatelliteMap(boolean z) {
        nativeShowSatelliteMap(this.b, z);
    }

    public void showStreetPOIMarker(boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeShowStreetPOIMarker(j2, z);
        }
    }

    public void showStreetPopup(boolean z) {
        nativeShowStreetPopup(this.b, z);
    }

    public void showStreetRoadMap(boolean z) {
        nativeShowStreetRoadMap(this.b, z);
    }

    public void showTopicPOI(String str, boolean z, String str2, boolean z2) {
        nativeShowTopicPOI(this.b, str, z, str2, z2);
    }

    public void showTrafficMap(boolean z) {
        nativeShowTrafficMap(this.b, z);
    }

    public void showTrafficUGCMap(boolean z) {
        nativeShowTrafficUGCMap(this.b, z);
    }

    public void showUniversalLayer(Bundle bundle) {
        nativeShowUniversalLayer(this.b, bundle);
    }

    public void startHeatMapFrameAnimation(long j2) {
        long j3 = this.b;
        if (j3 != 0) {
            nativeStartHeatMapFrameAnimation(j3, j2);
        }
    }

    public void startIndoorAnimation() {
        nativeStartIndoorAnimation(this.b);
    }

    public void stopHeatMapFrameAnimation(long j2) {
        long j3 = this.b;
        if (j3 != 0) {
            nativeStopHeatMapFrameAnimation(j3, j2);
        }
    }

    public void surfaceDestroyed(Surface surface) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSurfaceDestroyed(j2, surface);
        }
    }

    public boolean switchBaseIndoorMapFloor(String str, String str2) {
        return nativeSwitchBaseIndoorMapFloor(this.b, str, str2);
    }

    public void switchDayOrDarkTheme(int i2, boolean z) {
        long j2 = this.b;
        if (j2 != 0) {
            nativeSwitchDayOrDarkTheme(j2, i2, z);
        }
    }

    public boolean switchLayer(long j2, long j3) {
        if (!a()) {
            return false;
        }
        this.f8979a.submit(new m(j2, j3));
        return true;
    }

    public void unFocusTrafficUGCLabel() {
        nativeUnFocusTrafficUGCLabel(this.b);
    }

    public void updateBaseLayers() {
        nativeUpdateBaseLayers(this.b);
    }

    public void updateDrawFPS() {
        long j2 = this.b;
        if (j2 != 0) {
            nativeUpdateDrawFPS(j2);
        }
    }

    public void updateFootMarkGrid() {
        nativeUpdateFootMarkGrid(this.b);
    }

    public void updateHeatMapData(long j2, Bundle bundle) {
        long j3 = this.b;
        if (j3 != 0) {
            nativeUpdateHeatMapData(j3, j2, bundle);
        }
    }

    public void updateLayers(long j2) {
        if (a()) {
            this.f8979a.submit(new k(j2));
        }
    }

    public void updateOneOverlayItem(Bundle bundle) {
        if (a()) {
            this.f8979a.submit(new e(bundle));
        }
    }

    public String worldPointToScreenPoint(float f2, float f3, float f4) {
        return nativeworldPointToScreenPoint(this.b, f2, f3, f4);
    }

    public float getZoomToBound(long j2, Bundle bundle, int i2, int i3) {
        return nativeGetZoomToBound(j2, bundle, i2, i3);
    }

    public void showHotMap(boolean z, int i2, String str) {
        nativeShowHotMapWithUid(this.b, z, i2, str);
    }

    private void b() {
        try {
            ThreadPoolExecutor threadPoolExecutor = this.f8979a;
            if (threadPoolExecutor != null) {
                if (threadPoolExecutor.getQueue() != null) {
                    this.f8979a.getQueue().clear();
                }
                this.f8979a.shutdown();
                this.f8979a.awaitTermination(100L, TimeUnit.MILLISECONDS);
                this.f8979a.shutdownNow();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(long j2) {
        return this.f.contains(Long.valueOf(j2)) && j2 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return (this.f8979a.isShutdown() || this.f8979a.isTerminated()) ? false : true;
    }
}
