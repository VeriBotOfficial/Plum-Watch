package com.phancy.mini.service;

import android.app.Activity;
import android.content.Context;
import com.autonavi.aps.amapapi.config.Const;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IImageService.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\bH&¨\u0006\u0010"}, d2 = {"Lcom/phancy/mini/service/IImageService;", "Lcom/phancy/mini/service/IService;", "preview", "", "context", "Landroid/content/Context;", "images", "", "", "currentItem", "", "share", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "imagePath", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IImageService extends IService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String PATH = "/PhancyMini/image";

    void preview(Context context, List<String> images, int currentItem);

    void share(Activity activity, String imagePath);

    /* compiled from: IImageService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/phancy/mini/service/IImageService$Companion;", "", "()V", AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH, "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PATH = "/PhancyMini/image";

        private Companion() {
        }
    }

    /* compiled from: IImageService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void preview$default(IImageService iImageService, Context context, List list, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preview");
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            iImageService.preview(context, list, i);
        }
    }
}
