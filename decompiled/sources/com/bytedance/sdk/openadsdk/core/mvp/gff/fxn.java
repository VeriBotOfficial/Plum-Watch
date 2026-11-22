package com.bytedance.sdk.openadsdk.core.mvp.gff;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.utils.wc;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes14.dex */
public class fxn {
    public static final Set<String> fxn = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.mvp.gff.fxn.1
        {
            add("image/jpeg");
            add("image/png");
            add(MimeTypes.IMAGE_BMP);
            add("image/gif");
            add(ClipboardModule.MIMETYPE_JPG);
        }
    };
    public static Set<String> kg = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.mvp.gff.fxn.2
        {
            add("application/x-javascript");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.mvp.gff.fxn$fxn, reason: collision with other inner class name */
    public enum EnumC0518fxn {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public enum kg {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    public static Point fxn(Context context, int i, int i2, kg kgVar) {
        if (context == null) {
            context = rmu.fxn();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int kg2 = wc.kg(context, i);
        int kg3 = wc.kg(context, i2);
        if (kg2 > width || kg3 > height) {
            Point point2 = new Point();
            if (kg.HTML_RESOURCE == kgVar) {
                point2.x = Math.min(width, kg2);
                point2.y = Math.min(height, kg3);
            } else {
                float f = kg2;
                float f2 = f / width;
                float f3 = kg3;
                float f4 = f3 / height;
                if (f2 >= f4) {
                    point2.x = width;
                    point2.y = (int) (f3 / f2);
                } else {
                    point2.x = (int) (f / f4);
                    point2.y = height;
                }
            }
            if (point2.x >= 0 && point2.y >= 0) {
                point2.x = wc.gff(context, point2.x);
                point2.y = wc.gff(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
