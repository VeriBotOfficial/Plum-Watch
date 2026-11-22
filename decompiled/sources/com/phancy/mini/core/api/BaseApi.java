package com.phancy.mini.core.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.autonavi.aps.amapapi.config.Const;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.phancy.mini.MiniSDK;
import com.phancy.mini.core.IApi;
import com.phancy.mini.core.IApiCallback;
import com.phancy.mini.core.app.MiniApp;
import com.phancy.mini.core.app.MiniResultLauncher;
import com.phancy.mini.utils.OSExtKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseApi.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0002J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0002J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J \u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0016J\u001e\u0010(\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lcom/phancy/mini/core/api/BaseApi;", "Lcom/phancy/mini/core/IApi;", "apiContext", "Lcom/phancy/mini/core/api/ApiContext;", "(Lcom/phancy/mini/core/api/ApiContext;)V", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity$delegate", "Lkotlin/Lazy;", "getApiContext", "()Lcom/phancy/mini/core/api/ApiContext;", "setApiContext", "app", "Lcom/phancy/mini/core/app/MiniApp;", "getApp", "()Lcom/phancy/mini/core/app/MiniApp;", "app$delegate", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "invoke", "", "event", "Lcom/phancy/mini/core/api/Event;", RemoteMessageConst.MessageBody.PARAM, "Lcom/alibaba/fastjson/JSONObject;", "callback", "Lcom/phancy/mini/core/IApiCallback;", "", "onCreate", "onDestroy", "shouldInterceptEvent", "", "startActivity", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "startActivityForResult", "onActivityResult", "Landroidx/activity/result/ActivityResultCallback;", "Landroidx/activity/result/ActivityResult;", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public class BaseApi implements IApi {
    private static final String TAG = "BaseApi";

    /* renamed from: activity$delegate, reason: from kotlin metadata */
    private final Lazy activity;
    private ApiContext apiContext;

    /* renamed from: app$delegate, reason: from kotlin metadata */
    private final Lazy app;

    /* renamed from: context$delegate, reason: from kotlin metadata */
    private final Lazy context;

    @Override // com.phancy.mini.core.IApi
    public void invoke(String event, JSONObject param, IApiCallback callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.phancy.mini.core.IApi
    public boolean shouldInterceptEvent(Event event, JSONObject param, IApiCallback callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return false;
    }

    public BaseApi(ApiContext apiContext) {
        Intrinsics.checkNotNullParameter(apiContext, "apiContext");
        this.apiContext = apiContext;
        this.app = LazyKt.lazy(new Function0<MiniApp>() { // from class: com.phancy.mini.core.api.BaseApi$app$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MiniApp invoke() {
                return BaseApi.this.getApiContext().getApp();
            }
        });
        this.context = LazyKt.lazy(new Function0<Context>() { // from class: com.phancy.mini.core.api.BaseApi$context$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Context invoke() {
                return BaseApi.this.getApiContext().getContext();
            }
        });
        this.activity = LazyKt.lazy(new Function0<Activity>() { // from class: com.phancy.mini.core.api.BaseApi$activity$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Activity invoke() {
                return BaseApi.this.getApiContext().getApp().getActivity();
            }
        });
    }

    public final ApiContext getApiContext() {
        return this.apiContext;
    }

    public final void setApiContext(ApiContext apiContext) {
        Intrinsics.checkNotNullParameter(apiContext, "<set-?>");
        this.apiContext = apiContext;
    }

    public final MiniApp getApp() {
        return (MiniApp) this.app.getValue();
    }

    public final Context getContext() {
        return (Context) this.context.getValue();
    }

    public final Activity getActivity() {
        return (Activity) this.activity.getValue();
    }

    @Override // com.phancy.mini.core.ILifecycle
    public void onCreate() {
        MiniSDK.d(TAG, "onCreate: " + this);
    }

    @Override // com.phancy.mini.core.ILifecycle
    public void onDestroy() {
        MiniSDK.d(TAG, "onDestroy: " + this);
    }

    @Override // com.phancy.mini.core.ILifecycle
    public void startActivity(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        MiniSDK.d(TAG, "startActivity: " + this);
        Activity activity = getActivity();
        if (activity != null) {
            try {
                activity.startActivity(intent);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        MiniSDK.w(TAG, "startActivity: without activity but by " + getContext());
        try {
            getContext().startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.phancy.mini.core.ILifecycle
    public void startActivityForResult(final Intent intent, final ActivityResultCallback<ActivityResult> onActivityResult) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(onActivityResult, "onActivityResult");
        FragmentActivity fragmentActivity = OSExtKt.toFragmentActivity(getContext());
        if (fragmentActivity != null) {
            MiniResultLauncher.INSTANCE.launch(fragmentActivity, intent, new ActivityResultCallback() { // from class: com.phancy.mini.core.api.BaseApi$$ExternalSyntheticLambda0
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    BaseApi.startActivityForResult$lambda$0(intent, onActivityResult, (ActivityResult) obj);
                }
            });
        } else {
            MiniSDK.e(TAG, "start activity for result error: " + getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startActivityForResult$lambda$0(Intent intent, ActivityResultCallback onActivityResult, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(intent, "$intent");
        Intrinsics.checkNotNullParameter(onActivityResult, "$onActivityResult");
        MiniSDK.d(TAG, "onActivityResult: " + activityResult + " -> " + intent);
        onActivityResult.onActivityResult(activityResult);
    }

    @Override // com.phancy.mini.core.IApi
    public void invoke(Event event, JSONObject param, IApiCallback callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(callback, "callback");
        invoke(event.getName(), param, callback);
    }
}
