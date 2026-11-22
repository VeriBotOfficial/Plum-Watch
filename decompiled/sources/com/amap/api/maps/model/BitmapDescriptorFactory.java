package com.amap.api.maps.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.javax.sip.header.WarningHeader;
import android.view.View;
import android.widget.FrameLayout;
import com.amap.api.col.p0003sl.a1;
import com.amap.api.col.p0003sl.k4;
import com.amap.api.col.p0003sl.m4;
import com.amap.api.col.p0003sl.t4;
import com.amap.api.col.p0003sl.w4;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes11.dex */
public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;
    private static final String ICON_ID_PREFIX = "com.amap.api.icon_";

    public static BitmapDescriptor defaultMarker() {
        try {
            return fromAsset(k4.marker_default.name() + PictureMimeType.PNG);
        } catch (Throwable th) {
            t4.a(th);
            return null;
        }
    }

    public static BitmapDescriptor fromAsset(String str) {
        try {
            Bitmap b = m4.b(getContext(), str);
            if (b != null) {
                return fromBitmap(b);
            }
            InputStream resourceAsStream = BitmapDescriptorFactory.class.getResourceAsStream("/assets/" + str);
            if (resourceAsStream == null) {
                return null;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(resourceAsStream);
            resourceAsStream.close();
            return fromBitmap(decodeStream);
        } catch (Throwable th) {
            t4.a(th);
            w4.a("[map][function][res]", "read bitmap from assets failed " + th.getMessage());
            return null;
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            return new BitmapDescriptor(bitmap, ICON_ID_PREFIX + t4.a());
        } catch (Throwable th) {
            t4.a(th);
            w4.a("[map][function][res]", "read bitmap from bitmap failed " + th.getMessage());
            return null;
        }
    }

    public static BitmapDescriptor fromFile(String str) {
        try {
            Context context = getContext();
            if (context == null) {
                return null;
            }
            FileInputStream openFileInput = context.openFileInput(str);
            Bitmap decodeStream = BitmapFactory.decodeStream(openFileInput);
            openFileInput.close();
            BitmapDescriptor fromBitmap = fromBitmap(decodeStream);
            t4.a(decodeStream);
            return fromBitmap;
        } catch (Throwable th) {
            t4.a(th);
            w4.a("[map][function][res]", "read bitmap from disk failed " + th.getMessage());
            return null;
        }
    }

    public static BitmapDescriptor fromPath(String str) {
        try {
            return fromBitmap(BitmapFactory.decodeFile(str));
        } catch (Throwable th) {
            t4.a(th);
            w4.a("[map][function][res]", "read bitmap from disk failed " + th.getMessage());
            return null;
        }
    }

    public static BitmapDescriptor fromResource(int i) {
        try {
            Context context = getContext();
            if (context != null) {
                return fromBitmap(BitmapFactory.decodeStream(context.getResources().openRawResource(i)));
            }
            return null;
        } catch (Throwable th) {
            t4.a(th);
            w4.a("[map][function][res]", "read bitmap from res failed " + th.getMessage());
            return null;
        }
    }

    public static BitmapDescriptor fromView(View view) {
        try {
            Context context = getContext();
            if (context == null) {
                return null;
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(view);
            frameLayout.setDrawingCacheEnabled(true);
            return fromBitmap(t4.a(frameLayout));
        } catch (Throwable th) {
            t4.a(th);
            w4.a("[map][function][res]", "read bitmap from view failed " + th.getMessage());
            return null;
        }
    }

    public static Context getContext() {
        return a1.f;
    }

    public static BitmapDescriptor defaultMarker(float f) {
        try {
            float f2 = (((int) (f + 15.0f)) / 30) * 30;
            float f3 = WarningHeader.MULTICAST_NOT_AVAILABLE;
            if (f2 > f3) {
                f2 = f3;
            } else if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            return fromAsset((f2 == 0.0f ? "RED" : f2 == 30.0f ? "ORANGE" : f2 == 60.0f ? "YELLOW" : f2 == 120.0f ? "GREEN" : f2 == 180.0f ? "CYAN" : f2 == 210.0f ? "AZURE" : f2 == 240.0f ? "BLUE" : f2 == 270.0f ? "VIOLET" : f2 == 300.0f ? "MAGENTA" : f2 == 330.0f ? "ROSE" : "").concat(PictureMimeType.PNG));
        } catch (Throwable th) {
            t4.a(th);
            return null;
        }
    }
}
