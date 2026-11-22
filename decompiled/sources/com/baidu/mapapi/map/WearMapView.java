package com.baidu.mapapi.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.map.MapViewLayoutParams;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapsdkplatform.comapi.commonutils.AssetsLoadUtil;
import com.baidu.mapsdkplatform.comapi.map.c;
import com.baidu.mapsdkplatform.comapi.map.q;
import com.baidu.mapsdkplatform.comapi.map.s;
import com.baidu.mapsdkplatform.comapi.map.y;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.map.MapSurfaceView;
import com.baidu.platform.comapi.map.v;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes13.dex */
public class WearMapView extends ViewGroup implements View.OnApplyWindowInsetsListener {
    public static final int BT_INVIEW = 1;
    private static String b;
    private static final SparseArray<Integer> h;
    private float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private MapSurfaceView i;
    private BaiduMap j;
    private ImageView k;
    private Bitmap l;
    private y m;
    public AnimationTask mTask;
    public Timer mTimer;
    public f mTimerHandler;
    private boolean n;
    private Point o;
    private Point p;

    /* renamed from: q, reason: collision with root package name */
    private RelativeLayout f8015q;
    private SwipeDismissView r;
    private TextView s;
    private TextView t;
    private ImageView u;
    private boolean v;
    private Context w;
    ScreenShape x;
    private boolean y;
    private boolean z;

    /* renamed from: a, reason: collision with root package name */
    private static final String f8014a = "MapView";
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;
    private static int g = 10;

    public class AnimationTask extends TimerTask {
        public AnimationTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Message message = new Message();
            message.what = 1;
            WearMapView.this.mTimerHandler.sendMessage(message);
        }
    }

    public interface OnDismissCallback {
        void onDismiss();

        void onNotify();
    }

    public enum ScreenShape {
        ROUND,
        RECTANGLE,
        UNDETECTED
    }

    class a implements c.InterfaceC0380c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CustomMapStyleCallBack f8018a;
        final /* synthetic */ MapCustomStyleOptions b;

        a(CustomMapStyleCallBack customMapStyleCallBack, MapCustomStyleOptions mapCustomStyleOptions) {
            this.f8018a = customMapStyleCallBack;
            this.b = mapCustomStyleOptions;
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0380c
        public void onCustomMapStyleLoadFailed(int i, String str, String str2) {
            CustomMapStyleCallBack customMapStyleCallBack = this.f8018a;
            if ((customMapStyleCallBack == null || !customMapStyleCallBack.onCustomMapStyleLoadFailed(i, str, str2)) && !WearMapView.this.H) {
                WearMapView.this.a(str2, this.b);
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0380c
        public void onCustomMapStyleLoadSuccess(boolean z, String str) {
            CustomMapStyleCallBack customMapStyleCallBack = this.f8018a;
            if ((customMapStyleCallBack == null || !customMapStyleCallBack.onCustomMapStyleLoadSuccess(z, str)) && !TextUtils.isEmpty(str)) {
                WearMapView.this.a(str, "");
                WearMapView.this.setMapCustomStyleEnable(true);
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.c.InterfaceC0380c
        public void onPreLoadLastCustomMapStyle(String str) {
            CustomMapStyleCallBack customMapStyleCallBack = this.f8018a;
            if (customMapStyleCallBack == null || !customMapStyleCallBack.onPreLoadLastCustomMapStyle(str)) {
                WearMapView.this.H = true;
                WearMapView.this.a(str, this.b);
            }
        }
    }

    class b implements v {
        b() {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void a() {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void a(MotionEvent motionEvent) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void a(s sVar) {
            if (WearMapView.this.i == null || WearMapView.this.i.getBaseMap() == null) {
                return;
            }
            float zoomLevel = WearMapView.this.i.getZoomLevel();
            if (zoomLevel < WearMapView.this.i.getController().mMinZoomLevel) {
                zoomLevel = WearMapView.this.i.getController().mMinZoomLevel;
            } else if (zoomLevel > WearMapView.this.i.getController().mMaxZoomLevel) {
                zoomLevel = WearMapView.this.i.getController().mMaxZoomLevel;
            }
            if (Math.abs(WearMapView.this.A - zoomLevel) > 0.0f) {
                int intValue = ((Integer) WearMapView.h.get(Math.round(zoomLevel))).intValue();
                int zoomUnitsInMeter = ((int) (intValue / WearMapView.this.i.getController().getZoomUnitsInMeter())) / 2;
                WearMapView.this.u.setPadding(zoomUnitsInMeter, 0, zoomUnitsInMeter, 0);
                String format = intValue >= 1000 ? String.format(" %d公里 ", Integer.valueOf(intValue / 1000)) : String.format(" %d米 ", Integer.valueOf(intValue));
                WearMapView.this.s.setText(format);
                WearMapView.this.t.setText(format);
                WearMapView.this.A = zoomLevel;
            }
            WearMapView.this.requestLayout();
        }

        @Override // com.baidu.platform.comapi.map.v
        public void a(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void a(GL10 gl10, s sVar) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void a(boolean z) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void a(boolean z, int i) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public boolean a(Point point, Point point2, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.v
        public boolean a(Point point, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.v
        public boolean a(MotionEvent motionEvent, float f, float f2, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.v
        public boolean a(BmDrawItem bmDrawItem) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.v
        public boolean a(String str) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.v
        public void b() {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void b(s sVar) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void b(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void b(String str) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public boolean b(Point point, Point point2, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.v
        public void c() {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void c(s sVar) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void c(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public boolean c(Point point, Point point2, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.v
        public void d() {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void d(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public boolean d(Point point, Point point2, s sVar) {
            return false;
        }

        @Override // com.baidu.platform.comapi.map.v
        public void e(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void f(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void g(GeoPoint geoPoint) {
        }

        @Override // com.baidu.platform.comapi.map.v
        public void onFirstMapTileLoaded() {
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s z = WearMapView.this.i.getBaseMap().z();
            z.f8385a -= 1.0f;
            WearMapView.this.i.getBaseMap().a(z, 300);
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s z = WearMapView.this.i.getBaseMap().z();
            z.f8385a += 1.0f;
            WearMapView.this.i.getBaseMap().a(z, 300);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8022a;

        e(View view) {
            this.f8022a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8022a.setVisibility(4);
            super.onAnimationEnd(animator);
        }
    }

    private class f extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f8023a;

        public f(Context context) {
            this.f8023a = new WeakReference<>(context);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f8023a.get() == null) {
                return;
            }
            super.handleMessage(message);
            if (message.what == 1 && WearMapView.this.m != null) {
                WearMapView.this.a(true);
            }
        }
    }

    static {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        h = sparseArray;
        sparseArray.append(3, 2000000);
        sparseArray.append(4, 1000000);
        sparseArray.append(5, 500000);
        sparseArray.append(6, 200000);
        sparseArray.append(7, 100000);
        sparseArray.append(8, 50000);
        sparseArray.append(9, 25000);
        sparseArray.append(10, 20000);
        sparseArray.append(11, 10000);
        sparseArray.append(12, 5000);
        sparseArray.append(13, 2000);
        sparseArray.append(14, 1000);
        sparseArray.append(15, 500);
        sparseArray.append(16, 200);
        sparseArray.append(17, 100);
        sparseArray.append(18, 50);
        sparseArray.append(19, 20);
        sparseArray.append(20, 10);
        sparseArray.append(21, 5);
        sparseArray.append(22, 2);
    }

    public WearMapView(Context context) {
        super(context);
        this.n = true;
        this.v = true;
        this.x = ScreenShape.ROUND;
        this.y = true;
        this.z = true;
        this.H = false;
        a(context, (BaiduMapOptions) null);
    }

    @Deprecated
    public static void setCustomMapStylePath(String str) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("BDMapSDKException: customMapStylePath String is illegal");
        }
        if (!new File(str).exists()) {
            throw new RuntimeException("BDMapSDKException: please check whether the customMapStylePath file exits");
        }
        b = str;
    }

    @Deprecated
    public static void setIconCustom(int i) {
        d = i;
    }

    @Deprecated
    public static void setLoadCustomMapStyleFileMode(int i) {
        c = i;
    }

    @Deprecated
    public static void setMapCustomEnable(boolean z) {
    }

    private static void setScreenSize(Context context) {
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MapViewLayoutParams) {
            super.addView(view, layoutParams);
        }
    }

    public final BaiduMap getMap() {
        BaiduMap baiduMap = this.j;
        baiduMap.l0 = this;
        return baiduMap;
    }

    public final int getMapLevel() {
        return h.get((int) this.i.getZoomLevel()).intValue();
    }

    public int getScaleControlViewHeight() {
        return this.F;
    }

    public int getScaleControlViewWidth() {
        return this.G;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (windowInsets.isRound()) {
            this.x = ScreenShape.ROUND;
            return windowInsets;
        }
        this.x = ScreenShape.RECTANGLE;
        return windowInsets;
    }

    public void onCreate(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        MapStatus mapStatus = (MapStatus) bundle.getParcelable("mapstatus");
        if (this.o != null) {
            this.o = (Point) bundle.getParcelable("scalePosition");
        }
        if (this.p != null) {
            this.p = (Point) bundle.getParcelable("zoomPosition");
        }
        this.y = bundle.getBoolean("mZoomControlEnabled");
        this.z = bundle.getBoolean("mScaleControlEnabled");
        setPadding(bundle.getInt(ViewProps.PADDING_LEFT), bundle.getInt(ViewProps.PADDING_TOP), bundle.getInt(ViewProps.PADDING_RIGHT), bundle.getInt(ViewProps.PADDING_BOTTOM));
        a(context, new BaiduMapOptions().mapStatus(mapStatus));
    }

    public final void onDestroy() {
        if (this.w != null) {
            this.i.unInit();
        }
        Bitmap bitmap = this.l;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.l.recycle();
            this.l = null;
        }
        this.m.d();
        BMapManager.destroy();
        com.baidu.mapsdkplatform.comapi.map.e.a();
        AnimationTask animationTask = this.mTask;
        if (animationTask != null) {
            animationTask.cancel();
        }
        this.w = null;
    }

    public final void onDismiss() {
        removeAllViews();
    }

    public final void onEnterAmbient(Bundle bundle) {
        a(0);
    }

    public void onExitAmbient() {
        a(1);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.mTimer = new Timer();
                AnimationTask animationTask = this.mTask;
                if (animationTask != null) {
                    animationTask.cancel();
                }
                AnimationTask animationTask2 = new AnimationTask();
                this.mTask = animationTask2;
                this.mTimer.schedule(animationTask2, 5000L);
            }
        } else if (this.m.getVisibility() == 0) {
            Timer timer = this.mTimer;
            if (timer != null) {
                if (this.mTask != null) {
                    timer.cancel();
                    this.mTask.cancel();
                }
                this.mTimer = null;
                this.mTask = null;
            }
        } else if (this.m.getVisibility() == 4) {
            if (this.mTimer != null) {
                AnimationTask animationTask3 = this.mTask;
                if (animationTask3 != null) {
                    animationTask3.cancel();
                }
                this.mTimer.cancel();
                this.mTask = null;
                this.mTimer = null;
            }
            a(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        a(this.k);
        if (((getWidth() - this.B) - this.C) - this.k.getMeasuredWidth() <= 0 || ((getHeight() - this.D) - this.E) - this.k.getMeasuredHeight() <= 0) {
            this.B = 0;
            this.C = 0;
            this.E = 0;
            this.D = 0;
            f2 = 1.0f;
            f3 = 1.0f;
        } else {
            f2 = ((getWidth() - this.B) - this.C) / getWidth();
            f3 = ((getHeight() - this.D) - this.E) / getHeight();
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            MapSurfaceView mapSurfaceView = this.i;
            if (childAt == mapSurfaceView) {
                mapSurfaceView.layout(0, 0, getWidth(), getHeight());
            } else if (childAt == this.k) {
                int i10 = (int) (this.E + (12.0f * f3));
                if (this.x == ScreenShape.ROUND) {
                    a(this.m);
                    int i11 = e / 2;
                    i7 = a(i11, this.m.getMeasuredWidth() / 2);
                    i8 = ((e / 2) - a(i11, i11 - i7)) + g;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i12 = (f - i7) - i10;
                int measuredHeight = i12 - this.k.getMeasuredHeight();
                int i13 = e - i8;
                this.k.layout(i13 - this.k.getMeasuredWidth(), measuredHeight, i13, i12);
            } else {
                y yVar = this.m;
                if (childAt == yVar) {
                    if (yVar.c()) {
                        a(this.m);
                        Point point = this.p;
                        if (point == null) {
                            int a2 = (int) ((12.0f * f3) + this.D + (this.x == ScreenShape.ROUND ? a(f / 2, this.m.getMeasuredWidth() / 2) : 0));
                            int measuredWidth = (e - this.m.getMeasuredWidth()) / 2;
                            this.m.layout(measuredWidth, a2, this.m.getMeasuredWidth() + measuredWidth, this.m.getMeasuredHeight() + a2);
                        } else {
                            y yVar2 = this.m;
                            int i14 = point.x;
                            yVar2.layout(i14, point.y, yVar2.getMeasuredWidth() + i14, this.p.y + this.m.getMeasuredHeight());
                        }
                    }
                } else if (childAt == this.f8015q) {
                    if (this.x == ScreenShape.ROUND) {
                        a(yVar);
                        int i15 = e / 2;
                        i5 = a(i15, this.m.getMeasuredWidth() / 2);
                        i6 = ((e / 2) - a(i15, i15 - i5)) + g;
                    } else {
                        i5 = 0;
                        i6 = 0;
                    }
                    a(this.f8015q);
                    Point point2 = this.o;
                    if (point2 == null) {
                        this.G = this.f8015q.getMeasuredWidth();
                        this.F = this.f8015q.getMeasuredHeight();
                        int i16 = (int) (this.B + (5.0f * f2) + i6);
                        int i17 = (f - ((int) (this.E + (12.0f * f3)))) - i5;
                        this.f8015q.layout(i16, i17 - this.f8015q.getMeasuredHeight(), this.G + i16, i17);
                    } else {
                        RelativeLayout relativeLayout = this.f8015q;
                        int i18 = point2.x;
                        relativeLayout.layout(i18, point2.y, relativeLayout.getMeasuredWidth() + i18, this.o.y + this.f8015q.getMeasuredHeight());
                    }
                } else {
                    View view = this.r;
                    if (childAt == view) {
                        a(view);
                        this.r.layout(0, 0, this.r.getMeasuredWidth(), f);
                    } else {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        if (layoutParams instanceof MapViewLayoutParams) {
                            MapViewLayoutParams mapViewLayoutParams = (MapViewLayoutParams) layoutParams;
                            Point a3 = mapViewLayoutParams.c == MapViewLayoutParams.ELayoutMode.absoluteMode ? mapViewLayoutParams.b : this.i.getBaseMap() != null ? this.i.getBaseMap().a(CoordUtil.ll2mc(mapViewLayoutParams.f7948a)) : new Point();
                            a(childAt);
                            int measuredWidth2 = childAt.getMeasuredWidth();
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i19 = (int) (a3.x - (mapViewLayoutParams.d * measuredWidth2));
                            int i20 = ((int) (a3.y - (mapViewLayoutParams.e * measuredHeight2))) + mapViewLayoutParams.f;
                            childAt.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
                        }
                    }
                }
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        BaiduMap baiduMap;
        if (bundle == null || (baiduMap = this.j) == null) {
            return;
        }
        bundle.putParcelable("mapstatus", baiduMap.getMapStatus());
        Point point = this.o;
        if (point != null) {
            bundle.putParcelable("scalePosition", point);
        }
        Point point2 = this.p;
        if (point2 != null) {
            bundle.putParcelable("zoomPosition", point2);
        }
        bundle.putBoolean("mZoomControlEnabled", this.y);
        bundle.putBoolean("mScaleControlEnabled", this.z);
        bundle.putInt(ViewProps.PADDING_LEFT, this.B);
        bundle.putInt(ViewProps.PADDING_TOP, this.D);
        bundle.putInt(ViewProps.PADDING_RIGHT, this.C);
        bundle.putInt(ViewProps.PADDING_BOTTOM, this.E);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view == this.k) {
            return;
        }
        super.removeView(view);
    }

    public void setCustomStyleFilePathAndMode(String str, int i) {
    }

    public void setMapCustomStyle(MapCustomStyleOptions mapCustomStyleOptions, CustomMapStyleCallBack customMapStyleCallBack) {
        if (mapCustomStyleOptions == null) {
            return;
        }
        String customMapStyleId = mapCustomStyleOptions.getCustomMapStyleId();
        if (customMapStyleId != null && !customMapStyleId.isEmpty()) {
            com.baidu.mapsdkplatform.comapi.map.c.a().a(this.w, customMapStyleId, new a(customMapStyleCallBack, mapCustomStyleOptions));
            return;
        }
        String localCustomStyleFilePath = mapCustomStyleOptions.getLocalCustomStyleFilePath();
        if (localCustomStyleFilePath == null || localCustomStyleFilePath.isEmpty()) {
            return;
        }
        a(localCustomStyleFilePath, "");
    }

    public void setMapCustomStyleEnable(boolean z) {
    }

    public void setMapCustomStylePath(String str) {
        a(str, "");
    }

    public void setOnDismissCallbackListener(OnDismissCallback onDismissCallback) {
        SwipeDismissView swipeDismissView = this.r;
        if (swipeDismissView == null) {
            return;
        }
        swipeDismissView.setCallback(onDismissCallback);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.B = i;
        this.D = i2;
        this.C = i3;
        this.E = i4;
    }

    public void setScaleControlPosition(Point point) {
        int i;
        if (point != null && (i = point.x) >= 0 && point.y >= 0 && i <= getWidth() && point.y <= getHeight()) {
            this.o = point;
            requestLayout();
        }
    }

    public void setShape(ScreenShape screenShape) {
        this.x = screenShape;
    }

    public void setViewAnimitionEnable(boolean z) {
        this.n = z;
    }

    public void setZoomControlsPosition(Point point) {
        int i;
        if (point != null && (i = point.x) >= 0 && point.y >= 0 && i <= getWidth() && point.y <= getHeight()) {
            this.p = point;
            requestLayout();
        }
    }

    public void showScaleControl(boolean z) {
        this.f8015q.setVisibility(z ? 0 : 8);
        this.z = z;
    }

    public void showZoomControls(boolean z) {
        if (this.m.c()) {
            this.m.setVisibility(z ? 0 : 8);
            this.y = z;
        }
    }

    private void d(Context context) {
        y yVar = new y(context, true);
        this.m = yVar;
        if (yVar.c()) {
            this.m.setOnZoomOutClickListener(new c());
            this.m.setOnZoomInClickListener(new d());
            addView(this.m);
        }
    }

    private void e() {
        if (this.i != null && this.v) {
            b();
            this.v = false;
        }
    }

    private void b(Context context) {
        this.f8015q = new RelativeLayout(context);
        this.f8015q.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.s = new TextView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        this.s.setTextColor(Color.parseColor("#FFFFFF"));
        this.s.setTextSize(2, 11.0f);
        TextView textView = this.s;
        textView.setTypeface(textView.getTypeface(), 1);
        this.s.setLayoutParams(layoutParams);
        this.s.setId(Integer.MAX_VALUE);
        this.f8015q.addView(this.s);
        this.t = new TextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.addRule(14);
        this.t.setTextColor(Color.parseColor("#000000"));
        this.t.setTextSize(2, 11.0f);
        this.t.setLayoutParams(layoutParams2);
        this.f8015q.addView(this.t);
        this.u = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, this.s.getId());
        this.u.setLayoutParams(layoutParams3);
        Bitmap loadAssetsFile = AssetsLoadUtil.loadAssetsFile("icon_scale.9.png", context);
        byte[] ninePatchChunk = loadAssetsFile.getNinePatchChunk();
        NinePatch.isNinePatchChunk(ninePatchChunk);
        this.u.setBackgroundDrawable(new NinePatchDrawable(loadAssetsFile, ninePatchChunk, new Rect(), null));
        this.f8015q.addView(this.u);
        addView(this.f8015q);
    }

    private void c(Context context) {
        this.r = new SwipeDismissView(context, this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((int) ((context.getResources().getDisplayMetrics().density * 34.0f) + 0.5f), f);
        this.r.setBackgroundColor(Color.argb(0, 0, 0, 0));
        this.r.setLayoutParams(layoutParams);
        addView(this.r);
    }

    private int a(int i, int i2) {
        return i - ((int) Math.sqrt(Math.pow(i, 2.0d) - Math.pow(i2, 2.0d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MapCustomStyleOptions mapCustomStyleOptions) {
        if (!TextUtils.isEmpty(str)) {
            a(str, "");
            setMapCustomStyleEnable(true);
            return;
        }
        String localCustomStyleFilePath = mapCustomStyleOptions.getLocalCustomStyleFilePath();
        if (TextUtils.isEmpty(localCustomStyleFilePath)) {
            return;
        }
        a(localCustomStyleFilePath, "");
        setMapCustomStyleEnable(true);
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions) {
        Point point;
        Point point2;
        setScreenSize(context);
        setOnApplyWindowInsetsListener(this);
        this.w = context;
        this.mTimerHandler = new f(context);
        this.mTimer = new Timer();
        AnimationTask animationTask = this.mTask;
        if (animationTask != null) {
            animationTask.cancel();
        }
        AnimationTask animationTask2 = new AnimationTask();
        this.mTask = animationTask2;
        this.mTimer.schedule(animationTask2, 5000L);
        com.baidu.mapsdkplatform.comapi.map.e.c();
        BMapManager.init();
        a(context, baiduMapOptions, b);
        this.i.getController().set3DGestureEnable(false);
        this.i.getController().setOverlookGestureEnable(false);
        a(context);
        d(context);
        c(context);
        if (baiduMapOptions != null && !baiduMapOptions.h) {
            this.m.setVisibility(4);
        }
        b(context);
        if (baiduMapOptions != null && !baiduMapOptions.i) {
            this.f8015q.setVisibility(4);
        }
        if (baiduMapOptions != null && (point2 = baiduMapOptions.l) != null) {
            this.p = point2;
        }
        if (baiduMapOptions == null || (point = baiduMapOptions.k) == null) {
            return;
        }
        this.o = point;
    }

    private void d() {
        if (this.i == null || this.v) {
            return;
        }
        a();
        this.v = true;
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions, String str) {
        this.i = new MapSurfaceView(context);
        if (baiduMapOptions != null) {
            this.j = new BaiduMap(context, this.i, baiduMapOptions.a());
        } else {
            this.j = new BaiduMap(context, this.i, (q) null);
        }
        addView(this.i);
        this.i.getBaseMap().a(new b());
    }

    private void b() {
        MapSurfaceView mapSurfaceView = this.i;
        if (mapSurfaceView == null) {
            return;
        }
        mapSurfaceView.onForeground();
    }

    public WearMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = true;
        this.v = true;
        this.x = ScreenShape.ROUND;
        this.y = true;
        this.z = true;
        this.H = false;
        a(context, (BaiduMapOptions) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.n) {
            a(this.m, z);
        }
    }

    private void a(Context context) {
        int densityDpi = SysOSUtil.getDensityDpi();
        Bitmap loadAssetsFile = AssetsLoadUtil.loadAssetsFile(densityDpi < 180 ? "logo_l.png" : "logo_h.png", context);
        if (densityDpi > 480) {
            Matrix matrix = new Matrix();
            matrix.postScale(2.0f, 2.0f);
            this.l = Bitmap.createBitmap(loadAssetsFile, 0, 0, loadAssetsFile.getWidth(), loadAssetsFile.getHeight(), matrix, true);
        } else if (densityDpi > 320 && densityDpi <= 480) {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(1.5f, 1.5f);
            this.l = Bitmap.createBitmap(loadAssetsFile, 0, 0, loadAssetsFile.getWidth(), loadAssetsFile.getHeight(), matrix2, true);
        } else {
            this.l = loadAssetsFile;
        }
        if (this.l != null) {
            ImageView imageView = new ImageView(context);
            this.k = imageView;
            imageView.setImageBitmap(this.l);
            addView(this.k);
        }
    }

    private void a() {
        MapSurfaceView mapSurfaceView = this.i;
        if (mapSurfaceView == null) {
            return;
        }
        mapSurfaceView.onBackground();
    }

    private void a(int i) {
        MapSurfaceView mapSurfaceView = this.i;
        if (mapSurfaceView == null) {
            return;
        }
        if (i == 0) {
            mapSurfaceView.onPause();
            d();
        } else {
            if (i != 1) {
                return;
            }
            mapSurfaceView.onResume();
            e();
        }
    }

    private void a(View view) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i = layoutParams.width;
        if (i > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    private void a(View view, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "TranslationY", 0.0f, -50.0f), ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
            animatorSet.addListener(new e(view));
            animatorSet.setDuration(1200L);
            animatorSet.start();
            return;
        }
        view.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, "TranslationY", -50.0f, 0.0f), ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
        animatorSet2.setDuration(1200L);
        animatorSet2.start();
    }

    public WearMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = true;
        this.v = true;
        this.x = ScreenShape.ROUND;
        this.y = true;
        this.z = true;
        this.H = false;
        a(context, (BaiduMapOptions) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        MapSurfaceView mapSurfaceView = this.i;
        if (mapSurfaceView == null || mapSurfaceView.getBaseMap() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(f8014a, "customStyleFilePath is empty or null, please check!");
            return;
        }
        if (!str.endsWith(".sty")) {
            Log.e(f8014a, "customStyleFile format is incorrect , please check!");
        } else if (!new File(str).exists()) {
            Log.e(f8014a, "customStyleFile does not exist , please check!");
        } else {
            this.i.getBaseMap().a(str, "");
        }
    }

    public WearMapView(Context context, BaiduMapOptions baiduMapOptions) {
        super(context);
        this.n = true;
        this.v = true;
        this.x = ScreenShape.ROUND;
        this.y = true;
        this.z = true;
        this.H = false;
        a(context, baiduMapOptions);
    }
}
