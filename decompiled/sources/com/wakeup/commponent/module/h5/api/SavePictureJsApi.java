package com.wakeup.commponent.module.h5.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.luck.picture.lib.config.PictureMimeType;
import com.phancy.mini.core.resource.MiniPack;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.permissions.PermissionGroup;
import com.wakeup.common.permissions.PermissionsManager;
import com.wakeup.common.utils.BitmapUtils;
import com.wakeup.common.utils.DateUtil;
import com.wakeup.common.utils.ToastUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.ShareDialog;
import com.wakeup.commonui.utils.ImageUtils;
import com.wakeup.commponent.module.h5.JsApi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavePictureJsApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007J*\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/wakeup/commponent/module/h5/api/SavePictureJsApi;", "Lcom/wakeup/commponent/module/h5/JsApi;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getName", "annualReportSavePicture", "", "picUrl", "annualReportShare", "saveToAlbum", "context", "Landroid/content/Context;", "picName", "isShear", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SavePictureJsApi extends JsApi {
    private final String TAG = "SavePicture";

    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.wakeup.commponent.module.h5.JsApi
    public String getName() {
        return "android";
    }

    @JavascriptInterface
    public final void annualReportSavePicture(String picUrl) {
        LogUtils.i(this.TAG, "保存图片接口触发 " + picUrl);
        if (TextUtils.isEmpty(picUrl)) {
            return;
        }
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        saveToAlbum(mContext, picUrl, "annualReport_" + DateUtil.toString(System.currentTimeMillis(), MiniPack.BUILD_TIME_FORMAT), false);
    }

    @JavascriptInterface
    public final void annualReportShare(String picUrl) {
        LogUtils.i(this.TAG, "分享功能接口触发 " + picUrl);
        if (TextUtils.isEmpty(picUrl)) {
            return;
        }
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        saveToAlbum(mContext, picUrl, "annualReport_" + DateUtil.toString(System.currentTimeMillis(), MiniPack.BUILD_TIME_FORMAT), true);
    }

    private final void saveToAlbum(final Context context, final String picUrl, final String picName, final boolean isShear) {
        PermissionsManager.Callback callback = new PermissionsManager.Callback() { // from class: com.wakeup.commponent.module.h5.api.SavePictureJsApi$saveToAlbum$1
            @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
            public void onGranted() {
                Bitmap base64ToBitmap = BitmapUtils.base64ToBitmap(picUrl);
                if (isShear) {
                    new ShareDialog(context, 2, ImageUtils.saveBitMap(base64ToBitmap, System.currentTimeMillis() + PictureMimeType.JPG)).show();
                    return;
                }
                BitmapUtils.saveBitmap(context, base64ToBitmap, picName);
            }

            @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
            public void onDenied() {
                ToastUtils.showToast(context.getString(R.string.tip37));
            }
        };
        String[] filePermissions = PermissionGroup.getFilePermissions();
        PermissionsManager.queryPermission(callback, (String[]) Arrays.copyOf(filePermissions, filePermissions.length));
    }
}
