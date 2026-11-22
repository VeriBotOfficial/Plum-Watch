package com.phancy.mini.service;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.phancy.mini.api.media.MediaModule;
import com.phancy.mini.core.api.BaseApi;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: IMediaService.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u0000 )2\u00020\u0001:\u0001)J>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J&\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&JE\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00132+\u0010\u0019\u001a'\u0012\u001d\u0012\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0015¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030\u001aH&J5\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0019\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010 ¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030\u001aH&JY\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2+\u0010\u0019\u001a'\u0012\u001d\u0012\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0015¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030\u001aH&JI\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2#\u0010\u0019\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030\u001aH&JS\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020\u00162#\u0010\u0019\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00030\u001aH&¨\u0006*"}, d2 = {"Lcom/phancy/mini/service/IMediaService;", "Lcom/phancy/mini/service/IService;", MediaModule.CROP_IMAGE, "", "api", "Lcom/phancy/mini/core/api/BaseApi;", "srcFile", "Ljava/io/File;", "dscFile", "width", "", "height", "onActivityResult", "Landroidx/activity/result/ActivityResultCallback;", "Landroidx/activity/result/ActivityResult;", MediaModule.PREVIEW_MEDIA, Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "index", "", "data", "", "", "startChooseImageByAlbum", Const.SP_KEY_CALL_LOC_COUNT, "callback", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "result", "startChooseImageByCamera", "Landroid/graphics/Bitmap;", "startChooseMediaByAlum", "compressed", "", "maxSeconds", "", "startChooseVideoByAlbum", "startChooseVideoByCamera", PixelReadParams.DEFAULT_FILTER_ID, "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IMediaService extends IService {
    public static final String CAMERA_BACK = "back";
    public static final String CAMERA_FRONT = "front";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String PATH = "/PhancyMini/media";

    void cropImage(BaseApi api, File srcFile, File dscFile, float width, float height, ActivityResultCallback<ActivityResult> onActivityResult);

    void previewMedia(Activity activity, int index, List<String> data);

    void startChooseImageByAlbum(BaseApi api, int count, Function1<? super List<? extends Uri>, Unit> callback);

    void startChooseImageByCamera(BaseApi api, Function1<? super Bitmap, Unit> callback);

    void startChooseMediaByAlum(BaseApi api, int count, boolean compressed, long maxSeconds, Function1<? super List<? extends Uri>, Unit> callback);

    void startChooseVideoByAlbum(BaseApi api, boolean compressed, long maxSeconds, Function1<? super Uri, Unit> callback);

    void startChooseVideoByCamera(BaseApi api, boolean compressed, long maxSeconds, String camera, Function1<? super Uri, Unit> callback);

    /* compiled from: IMediaService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/phancy/mini/service/IMediaService$Companion;", "", "()V", "CAMERA_BACK", "", "CAMERA_FRONT", AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH, "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String CAMERA_BACK = "back";
        public static final String CAMERA_FRONT = "front";
        public static final String PATH = "/PhancyMini/media";

        private Companion() {
        }
    }

    /* compiled from: IMediaService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void startChooseVideoByCamera$default(IMediaService iMediaService, BaseApi baseApi, boolean z, long j, String str, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startChooseVideoByCamera");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                j = 60;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                str = "back";
            }
            iMediaService.startChooseVideoByCamera(baseApi, z2, j2, str, function1);
        }

        public static /* synthetic */ void startChooseVideoByAlbum$default(IMediaService iMediaService, BaseApi baseApi, boolean z, long j, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startChooseVideoByAlbum");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                j = 60;
            }
            iMediaService.startChooseVideoByAlbum(baseApi, z2, j, function1);
        }

        public static /* synthetic */ void startChooseMediaByAlum$default(IMediaService iMediaService, BaseApi baseApi, int i, boolean z, long j, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startChooseMediaByAlum");
            }
            if ((i2 & 4) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i2 & 8) != 0) {
                j = 60;
            }
            iMediaService.startChooseMediaByAlum(baseApi, i, z2, j, function1);
        }
    }
}
