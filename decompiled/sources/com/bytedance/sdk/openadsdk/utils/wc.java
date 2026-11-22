package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.anythink.core.common.d.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class wc {
    private static int bh = -1;
    private static Boolean dgx = null;
    private static float fxn = -1.0f;
    private static float gff = -1.0f;
    private static float hie = -1.0f;
    private static int hm = -1;
    private static int jq = -1;
    private static int kg = -1;
    private static final Object mvp = new Object();
    private static int rb = -1;
    private static boolean rlu = true;

    /* renamed from: sg, reason: collision with root package name */
    private static WindowManager f9575sg;
    private static ViewConfiguration tw;

    private static boolean fxn(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    private static boolean gff() {
        return fxn < 0.0f || kg < 0 || gff < 0.0f || hm < 0 || rb < 0;
    }

    public static void fxn(Context context) {
        fxn(context, false);
    }

    public static void fxn(Context context, boolean z) {
        Context fxn2 = context == null ? com.bytedance.sdk.openadsdk.core.rmu.fxn() : context;
        if (fxn2 == null) {
            return;
        }
        f9575sg = (WindowManager) fxn2.getSystemService("window");
        if (gff() || z) {
            DisplayMetrics displayMetrics = fxn2.getResources().getDisplayMetrics();
            fxn = displayMetrics.density;
            kg = displayMetrics.densityDpi;
            gff = displayMetrics.scaledDensity;
            hm = displayMetrics.widthPixels;
            rb = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i = hm;
            int i2 = rb;
            if (i > i2) {
                hm = i2;
                rb = i;
            }
        } else {
            int i3 = hm;
            int i4 = rb;
            if (i3 < i4) {
                hm = i4;
                rb = i3;
            }
        }
        bh = configuration.smallestScreenWidthDp;
    }

    public static float fxn(Context context, float f) {
        fxn(context);
        return f * jq(context);
    }

    public static int kg(Context context, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return Float.valueOf(fxn(context, f, true)).intValue();
    }

    public static float fxn(Context context, float f, boolean z) {
        fxn(context);
        return (f * tw(context)) + (z ? 0.5f : 0.0f);
    }

    public static int gff(Context context, float f) {
        fxn(context, true);
        float tw2 = tw(context);
        if (tw2 <= 0.0f) {
            tw2 = 1.0f;
        }
        return (int) ((f / tw2) + 0.5f);
    }

    public static int[] kg(Context context) {
        if (context == null) {
            return null;
        }
        if (f9575sg == null) {
            f9575sg = (WindowManager) com.bytedance.sdk.openadsdk.core.rmu.fxn().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = f9575sg;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i = point.x;
                i2 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static int gff(Context context) {
        fxn(context);
        return hm;
    }

    public static int hm(Context context) {
        fxn(context);
        return gff(context, hm);
    }

    public static int rb(Context context) {
        fxn(context);
        return rb;
    }

    public static int bh(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.rmu.fxn();
        }
        if (context == null) {
            return bh;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            bh = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return bh;
    }

    public static int sg(Context context) {
        fxn(context);
        return gff(context, rb);
    }

    public static float tw(Context context) {
        fxn(context, true);
        return fxn;
    }

    public static float jq(Context context) {
        fxn(context);
        return gff;
    }

    public static int hie(Context context) {
        fxn(context);
        return kg;
    }

    public static int[] fxn(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] kg(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] gff(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void fxn(View view, int i) {
        if (view == null || view.getVisibility() == i || !fxn(i)) {
            return;
        }
        view.setVisibility(i);
    }

    public static boolean hm(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void fxn(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static void fxn(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        fxn(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    private static void fxn(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i2 != -3) {
            marginLayoutParams.topMargin = i2;
        }
        if (i3 != -3) {
            marginLayoutParams.rightMargin = i3;
        }
        if (i4 != -3) {
            marginLayoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private static Bitmap fxn(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.gff("UIUtils", th.getMessage());
            return bitmap;
        }
    }

    public static void rb(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.wc.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    wc.fxn(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        ofFloat.setDuration(800L);
        ofFloat.start();
    }

    public static void bh(View view) {
        if (view == null) {
            return;
        }
        fxn(view, 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.wc.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public static Pair<Integer, Integer> dgx(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.rmu.fxn();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static int mvp(Context context) {
        return ((Integer) dgx(context).second).intValue();
    }

    public static int rlu(Context context) {
        return ((Integer) dgx(context).first).intValue();
    }

    public static float fxn() {
        float f = hie;
        if (f > 0.0f) {
            return f;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.rmu.fxn().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        hie = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void fxn(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.dx.gff("UIUtils", e.getMessage());
        }
    }

    public static void kg(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static boolean gff(Activity activity) {
        if (dgx == null) {
            synchronized (mvp) {
                if (dgx == null) {
                    String fxn2 = com.bytedance.sdk.openadsdk.ums.fxn.fxn("cutout_devices", "");
                    String str = Build.MODEL;
                    if (!TextUtils.isEmpty(fxn2) && !TextUtils.isEmpty(str)) {
                        try {
                            JSONArray jSONArray = new JSONArray(fxn2);
                            for (int i = 0; i < jSONArray.length(); i++) {
                                if (str.equals(jSONArray.getString(i))) {
                                    dgx = Boolean.TRUE;
                                    return true;
                                }
                            }
                        } catch (Exception e) {
                            com.bytedance.sdk.component.utils.dx.gff("UIUtils", e.getMessage());
                        }
                    }
                    dgx = Boolean.valueOf(hm(activity) || fxn("ro.miui.notch", activity) == 1 || zu(activity) || je(activity) || ckl(activity) || xdg(activity) || rmu(activity));
                }
            }
        }
        return dgx.booleanValue();
    }

    public static boolean kg() {
        return rlu && Build.VERSION.SDK_INT >= 28;
    }

    public static boolean hm(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    rlu = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.dx.gff("UIUtils", e.getMessage());
            }
        }
        return false;
    }

    public static int fxn(String str, Activity activity) {
        if (mve.rb()) {
            try {
                Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e) {
                com.bytedance.sdk.component.utils.dx.gff("UIUtils", e.getMessage());
            } catch (IllegalAccessException e2) {
                com.bytedance.sdk.component.utils.dx.gff("UIUtils", e2.getMessage());
            } catch (IllegalArgumentException e3) {
                com.bytedance.sdk.component.utils.dx.gff("UIUtils", e3.getMessage());
            } catch (NoSuchMethodException e4) {
                com.bytedance.sdk.component.utils.dx.gff("UIUtils", e4.getMessage());
            } catch (InvocationTargetException e5) {
                com.bytedance.sdk.component.utils.dx.gff("UIUtils", e5.getMessage());
            }
        }
        return 0;
    }

    public static boolean zu(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean ckl(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean xdg(Context context) {
        return Build.MODEL.equals("IN2010") || Build.MODEL.equals("IN2020") || Build.MODEL.equals("KB2000") || Build.MODEL.startsWith("ONEPLUS");
    }

    public static boolean rmu(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string != null) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean je(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static void fxn(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.dx.gff("OnclickListener ", str + " is null , can not set OnClickListener !!!");
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    public static void fxn(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.dx.gff("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
        } else {
            view.setOnTouchListener(onTouchListener);
        }
    }

    public static void fxn(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    public static void fxn(TextView textView, com.bytedance.sdk.openadsdk.core.widget.xdg xdgVar, com.bytedance.sdk.openadsdk.core.model.jz jzVar) {
        fxn(textView, xdgVar, jzVar, 14);
    }

    public static void fxn(TextView textView, com.bytedance.sdk.openadsdk.core.widget.xdg xdgVar, com.bytedance.sdk.openadsdk.core.model.jz jzVar, int i) {
        fxn(textView, xdgVar, (jzVar == null || jzVar.bz() == null) ? -1.0d : jzVar.bz().hm(), i);
    }

    public static void fxn(TextView textView, com.bytedance.sdk.openadsdk.core.widget.xdg xdgVar, double d, int i) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            xdgVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)));
            }
            fxn(xdgVar, d, i);
        }
    }

    public static void fxn(com.bytedance.sdk.openadsdk.core.widget.xdg xdgVar, double d, int i) {
        if (d < 0.0d) {
            xdgVar.setVisibility(8);
        } else {
            xdgVar.setVisibility(0);
            xdgVar.fxn(d, i);
        }
    }

    public static Bitmap fxn(com.bytedance.sdk.component.jq.bh bhVar) {
        WebView webView = bhVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap kg2 = kg(bhVar);
        if (kg2 == null) {
            kg2 = fxn(webView);
        }
        webView.setLayerType(layerType, null);
        if (kg2 == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.hm.fxn(kg2, kg2.getWidth() / 6, kg2.getHeight() / 6);
    }

    public static void fxn(final com.bytedance.sdk.openadsdk.core.model.jz jzVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j) {
        yws.kg(new com.bytedance.sdk.component.tw.tw("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.wc.3
            @Override // java.lang.Runnable
            public void run() {
                wc.gff(jzVar, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gff(final com.bytedance.sdk.openadsdk.core.model.jz jzVar, String str, String str2, final Bitmap bitmap, final String str3, final long j) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.hm.gff.fxn(System.currentTimeMillis(), jzVar, str, str2, new com.bytedance.sdk.openadsdk.ckl.gff.fxn() { // from class: com.bytedance.sdk.openadsdk.utils.wc.4
                        @Override // com.bytedance.sdk.openadsdk.ckl.gff.fxn, com.bytedance.sdk.openadsdk.ckl.gff.kg
                        public JSONObject gff() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int fxn2 = wc.fxn(bitmap);
                                jSONObject.put("url", str3);
                                long j2 = j;
                                if (j2 != -1) {
                                    jSONObject.put("page_id", j2);
                                }
                                jSONObject.put(j.w.E, "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", fxn2 == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.ggo.kg(jzVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.rlu.gff.fxn.fxn().fxn(jzVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dx.gff("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    private static Bitmap kg(com.bytedance.sdk.component.jq.bh bhVar) {
        if (bhVar == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bhVar.getWidth(), bhVar.getHeight(), Bitmap.Config.RGB_565);
            bhVar.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int fxn(Bitmap bitmap) {
        try {
            ArrayList<Integer> kg2 = kg(bitmap);
            if (kg2 == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = kg2.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (hashMap.containsKey(next)) {
                    Integer valueOf = Integer.valueOf(((Integer) hashMap.get(next)).intValue() + 1);
                    hashMap.remove(next);
                    hashMap.put(next, valueOf);
                } else {
                    hashMap.put(next, 1);
                }
            }
            int i = 0;
            int i2 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i2 < intValue) {
                    i = ((Integer) entry.getKey()).intValue();
                    i2 = intValue;
                }
            }
            if (i == 0) {
                return -1;
            }
            return (int) ((i2 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static ArrayList<Integer> kg(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void kg(View view, final float f) {
        if (view != null && f > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.wc.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                }
            });
            view.setClipToOutline(true);
        }
    }

    public static void sg(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean fxn(float f, float f2, Context context) {
        new Object[]{Float.valueOf(f), Float.valueOf(f2)};
        if (f != -1.0f && f2 != -1.0f) {
            if (tw == null) {
                tw = ViewConfiguration.get(context);
            }
            if (jq == -1) {
                jq = tw.getScaledTouchSlop();
            }
            if (f - f2 > jq) {
                return true;
            }
        }
        return false;
    }

    public static void fxn(boolean z) {
        dgx = Boolean.valueOf(z);
    }
}
