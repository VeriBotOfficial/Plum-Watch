package com.wakeup.commonui.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.wakeup.commonui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoToastUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/commonui/utils/VideoToastUtils;", "", "<init>", "()V", "Companion", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoToastUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: VideoToastUtils.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u000f"}, d2 = {"Lcom/wakeup/commonui/utils/VideoToastUtils$Companion;", "", "<init>", "()V", "show", "", "context", "Landroid/content/Context;", "iconResId", "", "textColor", "message", "", "showNormal", "showAlert", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void show(Context context, int iconResId, int textColor, String message) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(message, "message");
            View inflate = LayoutInflater.from(context).inflate(R.layout.toast_video_custom, (ViewGroup) null);
            Toast toast = new Toast(context);
            toast.setGravity(48, 0, UIHelper.dp2px(60.0f));
            toast.setDuration(0);
            toast.setView(inflate);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.rl_root);
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = UIHelper.getWindowWidth(context) - UIHelper.dp2px(24.0f);
            relativeLayout.setLayoutParams(layoutParams);
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.ic_icon);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_content);
            appCompatImageView.setBackgroundResource(iconResId);
            textView.setText(message);
            textView.setTextColor(textColor);
            toast.show();
        }

        public final void showNormal(Context context, String message) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(message, "message");
            View inflate = LayoutInflater.from(context).inflate(R.layout.toast_video_custom, (ViewGroup) null);
            Toast toast = new Toast(context);
            toast.setGravity(48, 0, UIHelper.dp2px(60.0f));
            toast.setDuration(0);
            toast.setView(inflate);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.rl_root);
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = UIHelper.getWindowWidth(context) - UIHelper.dp2px(24.0f);
            relativeLayout.setLayoutParams(layoutParams);
            ((TextView) inflate.findViewById(R.id.tv_content)).setText(message);
            toast.show();
        }

        public final void showAlert(Context context, String message) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(message, "message");
            View inflate = LayoutInflater.from(context).inflate(R.layout.toast_video_custom, (ViewGroup) null);
            Toast toast = new Toast(context);
            toast.setGravity(48, 0, UIHelper.dp2px(60.0f));
            toast.setDuration(0);
            toast.setView(inflate);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.rl_root);
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = UIHelper.getWindowWidth(context) - UIHelper.dp2px(24.0f);
            relativeLayout.setLayoutParams(layoutParams);
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.ic_icon);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_content);
            appCompatImageView.setBackgroundResource(R.drawable.ic_video_upload_failed);
            textView.setText(message);
            textView.setTextColor(context.getColor(R.color.color_fd6161));
            toast.show();
        }
    }
}
