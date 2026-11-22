package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;

/* loaded from: classes.dex */
public class CaptureSessionShouldUseMrirQuirk implements Quirk {
    static boolean load() {
        return AndroidStaticDeviceInfoDataSource.STORE_GOOGLE.equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT >= 35;
    }
}
