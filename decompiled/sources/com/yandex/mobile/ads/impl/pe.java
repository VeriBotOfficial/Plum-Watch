package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class pe {
    private static final RectF j = new RectF();
    private static ConcurrentHashMap<String, Method> k = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Field> l = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private int f16552a = 0;
    private boolean b = false;
    private float c = -1.0f;
    private float d = -1.0f;
    private int[] e = new int[0];
    private TextPaint f;
    private final TextView g;
    private final Context h;
    private final c i;

    private static Object a(TextView textView, String str, Object obj) {
        try {
            Field a2 = a(str);
            return a2 == null ? obj : a2.get(textView);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return obj;
        }
    }

    public final boolean b() {
        return ((this.g instanceof EditText) || this.f16552a == 0) ? false : true;
    }

    private static Method b(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = k;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    private static class c {
        void a(StaticLayout.Builder builder, TextView textView) {
        }

        c() {
        }

        boolean a(TextView textView) {
            return ((Boolean) pe.a((Object) textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    private static class a extends c {
        a() {
        }

        @Override // com.yandex.mobile.ads.impl.pe.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) pe.a((Object) textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class b extends a {
        b() {
        }

        @Override // com.yandex.mobile.ads.impl.pe.a, com.yandex.mobile.ads.impl.pe.c
        final void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // com.yandex.mobile.ads.impl.pe.c
        final boolean a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public pe(TextView textView) {
        this.g = textView;
        this.h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.i = new b();
        } else {
            this.i = new a();
        }
    }

    public final void a() {
        if (b()) {
            if (this.b) {
                if (this.g.getMeasuredHeight() <= 0 || this.g.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.i.a(this.g) ? 1048576 : (this.g.getMeasuredWidth() - this.g.getTotalPaddingLeft()) - this.g.getTotalPaddingRight();
                int height = (this.g.getHeight() - this.g.getCompoundPaddingBottom()) - this.g.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = j;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float a2 = a(rectF);
                    if (a2 != this.g.getTextSize()) {
                        a(0, a2);
                    }
                }
            }
            this.b = true;
        }
    }

    private int a(RectF rectF) {
        CharSequence transformation;
        int length = this.e.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.e[i4];
                CharSequence text = this.g.getText();
                TransformationMethod transformationMethod = this.g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.g)) != null) {
                    text = transformation;
                }
                int maxLines = this.g.getMaxLines();
                TextPaint textPaint = this.f;
                if (textPaint == null) {
                    this.f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f.set(this.g.getPaint());
                this.f.setTextSize(i5);
                Layout.Alignment alignment = (Layout.Alignment) a((Object) this.g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f, Math.round(rectF.right));
                obtain.setAlignment(alignment).setLineSpacing(this.g.getLineSpacingExtra(), this.g.getLineSpacingMultiplier()).setIncludePad(this.g.getIncludeFontPadding()).setBreakStrategy(this.g.getBreakStrategy()).setHyphenationFrequency(this.g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.i.a(obtain, this.g);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                    int i6 = i4 + 1;
                    i3 = i2;
                    i2 = i6;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.e[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    static <T> T a(Object obj, String str, T t) {
        try {
            return (T) b(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    public final void a(int i) {
        if (this.g instanceof EditText) {
            return;
        }
        if (i == 0) {
            this.f16552a = 0;
            this.d = -1.0f;
            this.c = -1.0f;
            this.e = new int[0];
            this.b = false;
            return;
        }
        if (i == 1) {
            DisplayMetrics displayMetrics = this.h.getResources().getDisplayMetrics();
            float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
            float applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
            if (applyDimension <= 0.0f) {
                throw new IllegalArgumentException("Minimum auto-size text size (" + applyDimension + "px) is less or equal to (0px)");
            }
            if (applyDimension2 > applyDimension) {
                this.f16552a = 1;
                this.d = applyDimension;
                this.c = 1.0f;
                if (!(this.g instanceof EditText)) {
                    int floor = ((int) Math.floor((applyDimension2 - applyDimension) / 1.0f)) + 1;
                    int[] iArr = new int[floor];
                    for (int i2 = 0; i2 < floor; i2++) {
                        iArr[i2] = Math.round((i2 * this.c) + this.d);
                    }
                    if (floor != 0) {
                        Arrays.sort(iArr);
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < floor; i3++) {
                            int i4 = iArr[i3];
                            if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                                arrayList.add(Integer.valueOf(i4));
                            }
                        }
                        if (floor != arrayList.size()) {
                            int size = arrayList.size();
                            iArr = new int[size];
                            for (int i5 = 0; i5 < size; i5++) {
                                iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
                            }
                        }
                    }
                    this.e = iArr;
                    this.b = true;
                } else {
                    this.b = false;
                }
                if (this.b) {
                    a();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + applyDimension2 + "px) is less or equal to minimum auto-size text size (" + applyDimension + "px)");
        }
        throw new IllegalArgumentException(oe.a("Unknown auto-size text type: ", i));
    }

    public final void a(int i, float f) {
        Resources resources;
        Context context = this.h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        if (applyDimension != this.g.getPaint().getTextSize()) {
            this.g.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.g.isInLayout();
            if (this.g.getLayout() != null) {
                this.b = false;
                try {
                    Method b2 = b("nullLayouts");
                    if (b2 != null) {
                        b2.invoke(this.g, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.g.requestLayout();
                } else {
                    this.g.forceLayout();
                }
                this.g.invalidate();
            }
        }
    }

    private static Field a(String str) {
        try {
            ConcurrentHashMap<String, Field> concurrentHashMap = l;
            Field field = concurrentHashMap.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                concurrentHashMap.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }
}
