package com.wakeup.howear.ops;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.luck.picture.lib.config.PictureMimeType;
import com.tencent.open.SocialConstants;
import com.wakeup.common.permissions.PermissionGroup;
import com.wakeup.common.permissions.PermissionsManager;
import com.wakeup.common.utils.BitmapUtils;
import com.wakeup.common.utils.ShareUtils;
import com.wakeup.common.utils.ToastUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.ImageUtils;
import com.wakeup.commponent.Navigator;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.module.h5.JsApi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OperateRunJs.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Lcom/wakeup/howear/ops/OperateRunJs;", "Lcom/wakeup/commponent/module/h5/JsApi;", "<init>", "()V", "getName", "", "shareImg", "", SocialConstants.PARAM_IMG_URL, "jumpMedal", "jumpRun", "jumpHome", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperateRunJs extends JsApi {
    @Override // com.wakeup.commponent.module.h5.JsApi
    public String getName() {
        return "androidOperateRun";
    }

    @JavascriptInterface
    public final void shareImg(final String img) {
        Intrinsics.checkNotNullParameter(img, "img");
        PermissionsManager.Callback callback = new PermissionsManager.Callback() { // from class: com.wakeup.howear.ops.OperateRunJs$shareImg$1
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

    @JavascriptInterface
    public final void jumpMedal() {
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        Navigator.start(mContext, PagePath.PAGE_USER_MEDAL);
    }

    @JavascriptInterface
    public final void jumpRun() {
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        Navigator.start(mContext, PagePath.PAGE_SPORT_HOME);
        if (this.mContext instanceof Activity) {
            Context context = this.mContext;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).finish();
        }
    }

    @JavascriptInterface
    public final void jumpHome() {
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        Navigator.start(mContext, PagePath.PAGE_MAIN_HOME);
        if (this.mContext instanceof Activity) {
            Context context = this.mContext;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).finish();
        }
    }
}
