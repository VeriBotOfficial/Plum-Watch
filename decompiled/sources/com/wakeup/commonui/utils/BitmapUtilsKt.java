package com.wakeup.commonui.utils;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BitmapUtils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DEFAULT_PICTURE_QUALITY", "", "PICTURE_QUALITY_STEP", "toJpeg", "", "Landroid/graphics/Bitmap;", "pictureQuality", "qualityStep", "limitedSize", "(Landroid/graphics/Bitmap;IILjava/lang/Integer;)[B", "commonui_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BitmapUtilsKt {
    public static final int DEFAULT_PICTURE_QUALITY = 80;
    public static final int PICTURE_QUALITY_STEP = 10;

    public static /* synthetic */ byte[] toJpeg$default(Bitmap bitmap, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 80;
        }
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        return toJpeg(bitmap, i, i2, num);
    }

    public static final byte[] toJpeg(Bitmap bitmap, int i, int i2, Integer num) {
        byte[] byteArray;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        if (num != null) {
            int i3 = 0;
            long j = 0;
            do {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                long currentTimeMillis = System.currentTimeMillis();
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                i3++;
                j += currentTimeMillis2;
                Log.d("toJpeg", "Try@" + i3 + "#" + i + ": " + currentTimeMillis2 + " ms");
                i -= i2;
                if (byteArray.length <= num.intValue()) {
                    break;
                }
            } while (i > 0);
            if (byteArray.length > num.intValue()) {
                return null;
            }
            Log.d("toJpeg", "Try~" + i3 + "#" + (i + i2) + ": total " + j + " ms");
            return byteArray;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }
}
