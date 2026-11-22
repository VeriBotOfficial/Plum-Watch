package com.wakeup.commonui.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.wakeup.commonui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomToastUtil.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ*\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\rJT\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u0016H\u0002JT\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/wakeup/commonui/utils/CustomToastUtil;", "", "<init>", "()V", "handler", "Landroid/os/Handler;", "show", "", "context", "Landroid/content/Context;", "message", "", "duration", "", "showWithIcon", "iconRes", "showCustom", "layoutResId", "gravity", "xOffset", "yOffset", "config", "Lkotlin/Function1;", "Landroid/view/View;", "showInternal", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomToastUtil {
    public static final CustomToastUtil INSTANCE = new CustomToastUtil();
    private static final Handler handler = new Handler(Looper.getMainLooper());

    private CustomToastUtil() {
    }

    public static /* synthetic */ void show$default(CustomToastUtil customToastUtil, Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        customToastUtil.show(context, str, i);
    }

    public final void show(Context context, final String message, int duration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        showCustom$default(this, context, R.layout.toast_custom, duration, 0, 0, 0, new Function1() { // from class: com.wakeup.commonui.utils.CustomToastUtil$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit show$lambda$0;
                show$lambda$0 = CustomToastUtil.show$lambda$0(message, (View) obj);
                return show$lambda$0;
            }
        }, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$0(String str, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((TextView) view.findViewById(R.id.tv_message)).setText(str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showWithIcon$default(CustomToastUtil customToastUtil, Context context, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        customToastUtil.showWithIcon(context, str, i, i2);
    }

    public final void showWithIcon(Context context, final String message, final int iconRes, int duration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        showCustom$default(this, context, R.layout.toast_custom, duration, 0, 0, 0, new Function1() { // from class: com.wakeup.commonui.utils.CustomToastUtil$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit showWithIcon$lambda$1;
                showWithIcon$lambda$1 = CustomToastUtil.showWithIcon$lambda$1(message, iconRes, (View) obj);
                return showWithIcon$lambda$1;
            }
        }, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showWithIcon$lambda$1(String str, int i, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((TextView) view.findViewById(R.id.tv_message)).setText(str);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_icon);
        imageView.setVisibility(0);
        imageView.setImageResource(i);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void showCustom$default(CustomToastUtil customToastUtil, Context context, int i, int i2, int i3, int i4, int i5, Function1 function1, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i2 = 0;
        }
        if ((i6 & 8) != 0) {
            i3 = 17;
        }
        if ((i6 & 16) != 0) {
            i4 = 0;
        }
        if ((i6 & 32) != 0) {
            i5 = 0;
        }
        customToastUtil.showCustom(context, i, i2, i3, i4, i5, function1);
    }

    private final void showCustom(final Context context, final int layoutResId, final int duration, final int gravity, final int xOffset, final int yOffset, final Function1<? super View, Unit> config) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            showInternal(context, layoutResId, duration, gravity, xOffset, yOffset, config);
        } else {
            handler.post(new Runnable() { // from class: com.wakeup.commonui.utils.CustomToastUtil$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CustomToastUtil.showCustom$lambda$2(context, layoutResId, duration, gravity, xOffset, yOffset, config);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCustom$lambda$2(Context context, int i, int i2, int i3, int i4, int i5, Function1 function1) {
        INSTANCE.showInternal(context, i, i2, i3, i4, i5, function1);
    }

    static /* synthetic */ void showInternal$default(CustomToastUtil customToastUtil, Context context, int i, int i2, int i3, int i4, int i5, Function1 function1, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i2 = 0;
        }
        if ((i6 & 8) != 0) {
            i3 = 17;
        }
        if ((i6 & 16) != 0) {
            i4 = 0;
        }
        if ((i6 & 32) != 0) {
            i5 = 0;
        }
        customToastUtil.showInternal(context, i, i2, i3, i4, i5, function1);
    }

    private final void showInternal(Context context, int layoutResId, int duration, int gravity, int xOffset, int yOffset, Function1<? super View, Unit> config) {
        Context applicationContext = context.getApplicationContext();
        View inflate = LayoutInflater.from(applicationContext).inflate(layoutResId, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate);
        config.invoke(inflate);
        Toast toast = new Toast(applicationContext);
        toast.setGravity(gravity, xOffset, yOffset);
        toast.setDuration(duration);
        toast.setView(inflate);
        toast.show();
    }
}
