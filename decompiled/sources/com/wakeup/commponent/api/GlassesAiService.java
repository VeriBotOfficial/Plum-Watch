package com.wakeup.commponent.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.facebook.react.uimanager.ThemedReactContext;
import com.iflytek.cloud.SpeechConstant;
import com.wakeup.common.utils.WifiInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: GlassesAiService.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\bH&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H&J6\u0010\u001d\u001a\u00020\u00032\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030!H&J\b\u0010\"\u001a\u00020\u0003H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010$\u001a\u00020\u0003H&J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H&JD\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0019\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010!2\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010+H&J\n\u0010,\u001a\u0004\u0018\u00010-H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\bH&J\u0018\u00100\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00101\u001a\u00020\bH&J&\u00102\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00103\u001a\u00020\b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\b05H&¨\u00066"}, d2 = {"Lcom/wakeup/commponent/api/GlassesAiService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "sendKeyDefault", "", "mac", "", "syncFileCount", "type", "", "sendNavSuccess", "sendWifiReconnect", "sendWifiConnectQuery", "clearKey", "removeWifi", "saveWifi", "wifiSsid", "pwd", "syncDirection", "isAutoStore", "", "getWifi", "Lcom/wakeup/common/utils/WifiInfo;", NativeAdvancedJsUtils.h, SpeechConstant.VOLUME, "startFileSync", "context", "Landroid/content/Context;", "cancelFileSync", "startFileSync2", "registerGlassesFileSyncMgr", "progressCallback", "Lkotlin/Function3;", "completeCallback", "Lkotlin/Function0;", "unregisterGlassesFileSyncMgr", "startSmartGlassesRecording", "stopSmartGlassesRecording", "btConnect", "createPreviewView", "Landroid/view/View;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onCloseClick", "onError", "Lkotlin/Function1;", "getScreenshot", "Landroid/graphics/Bitmap;", "setHallSwitch", DOMConstants.ATTR_MODE, "setAutoShutdown", "duration", "setVideoDurationConfig", "viewState", "durationList", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface GlassesAiService extends IProvider {
    void btConnect(Context context, String mac);

    void cancelFileSync(String mac);

    void clearKey(String mac);

    View createPreviewView(ThemedReactContext context, String mac, Function0<Unit> onCloseClick, Function1<? super String, Unit> onError);

    Bitmap getScreenshot();

    WifiInfo getWifi(String mac);

    boolean isAutoStore(String mac);

    void registerGlassesFileSyncMgr(Function3<? super Integer, ? super Integer, ? super Integer, Unit> progressCallback, Function0<Unit> completeCallback);

    void removeWifi(String mac);

    void saveWifi(String mac, String wifiSsid, String pwd);

    void sendKeyDefault(String mac);

    void sendNavSuccess();

    void sendWifiConnectQuery();

    void sendWifiReconnect();

    void setAutoShutdown(String mac, int duration);

    void setHallSwitch(String mac, int mode);

    void setVideoDurationConfig(String mac, int viewState, List<Integer> durationList);

    void setVolume(String mac, int volume);

    void startFileSync(Context context, String mac);

    void startFileSync2(Context context, String mac);

    void startSmartGlassesRecording(Context context);

    void stopSmartGlassesRecording();

    void syncDirection(String mac);

    void syncFileCount(int type);

    void unregisterGlassesFileSyncMgr();

    /* compiled from: GlassesAiService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ View createPreviewView$default(GlassesAiService glassesAiService, ThemedReactContext themedReactContext, String str, Function0 function0, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPreviewView");
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            return glassesAiService.createPreviewView(themedReactContext, str, function0, function1);
        }
    }
}
