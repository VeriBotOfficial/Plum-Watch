package com.wakeup.feature.user.report;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.luck.picture.lib.config.PictureMimeType;
import com.tencent.open.SocialConstants;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.permissions.PermissionGroup;
import com.wakeup.common.permissions.PermissionsManager;
import com.wakeup.common.utils.BitmapUtils;
import com.wakeup.common.utils.ShareUtils;
import com.wakeup.common.utils.ToastUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.ImageUtils;
import com.wakeup.commponent.module.h5.JsApi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnnualReportApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/user/report/AnnualReportApi;", "Lcom/wakeup/commponent/module/h5/JsApi;", "<init>", "()V", "TAG", "", "getName", "shareImg", "", SocialConstants.PARAM_IMG_URL, "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnnualReportApi extends JsApi {
    private final String TAG = "AnnualReportApi";

    @Override // com.wakeup.commponent.module.h5.JsApi
    public String getName() {
        return "annualReport";
    }

    @JavascriptInterface
    public final void shareImg(final String img) {
        Intrinsics.checkNotNullParameter(img, "img");
        LogUtils.e(this.TAG, "周月年报 发起分享");
        PermissionsManager.Callback callback = new PermissionsManager.Callback() { // from class: com.wakeup.feature.user.report.AnnualReportApi$shareImg$1
            @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
            public void onGranted() {
                Context context;
                String saveBitMap = ImageUtils.saveBitMap(BitmapUtils.base64ToBitmap(img), System.currentTimeMillis() + PictureMimeType.JPG);
                context = this.mContext;
                ShareUtils.shareImage(context, saveBitMap);
            }

            @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
            public void onDenied() {
                Context context;
                context = this.mContext;
                ToastUtils.showToast(context.getString(R.string.tip37));
            }
        };
        String[] filePermissions = PermissionGroup.getFilePermissions();
        PermissionsManager.queryPermission(callback, (String[]) Arrays.copyOf(filePermissions, filePermissions.length));
    }
}
