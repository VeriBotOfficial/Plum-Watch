package com.wakeup.howear.rn.api.permission;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.wakeup.howear.rn.api.specs.NativePhPermissionSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RnPermissionApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/wakeup/howear/rn/api/permission/RnPermissionApi;", "Lcom/wakeup/howear/rn/api/specs/NativePhPermissionSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getPermissionStatus", "", "type", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "openSystemSettings", "Companion", "feature-rn_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RnPermissionApi extends NativePhPermissionSpec {
    public static final String KEY_DEVICE_ID = "deviceId";
    public static final String KEY_PRODUCT_ID = "productId";
    public static final String NAME = "PhPermission";
    private static final String TAG = "RnPermissionApi";

    @Override // com.wakeup.howear.rn.api.specs.NativePhPermissionSpec
    public void getPermissionStatus(double type, Promise promise) {
    }

    @Override // com.wakeup.howear.rn.api.specs.NativePhPermissionSpec
    public void openSystemSettings(Promise promise) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnPermissionApi(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.wakeup.howear.rn.api.specs.NativePhPermissionSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PhMiscInfo";
    }
}
