package com.phancy.mini.service;

import android.app.Activity;
import com.autonavi.aps.amapapi.config.Const;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import kotlin.Metadata;

/* compiled from: ILocationService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000 \u00112\u00020\u0001:\u0003\u0010\u0011\u0012J3\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000bJ3\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/phancy/mini/service/ILocationService;", "Lcom/phancy/mini/service/IService;", "chooseLocation", "", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "latitude", "", "longitude", "callBack", "Lcom/phancy/mini/service/ILocationService$LocationCallBack;", "(Landroid/app/Activity;Ljava/lang/Double;Ljava/lang/Double;Lcom/phancy/mini/service/ILocationService$LocationCallBack;)V", "openLocation", "scale", "", "(Landroid/app/Activity;Ljava/lang/Double;Ljava/lang/Double;I)V", "ChoosePoiCallBack", "Companion", "LocationCallBack", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ILocationService extends IService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String PATH = "/PhancyMini/location";

    /* compiled from: ILocationService.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JQ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/phancy/mini/service/ILocationService$ChoosePoiCallBack;", "", "callback", "", "code", "", "type", "city", "", "latitude", "", "longitude", "name", Const.JSON_KEY_ADDRESS, "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ChoosePoiCallBack {
        void callback(int code, Integer type, String city, Double latitude, Double longitude, String name, String address);
    }

    /* compiled from: ILocationService.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/phancy/mini/service/ILocationService$LocationCallBack;", "", "callback", "", "code", "", "latitude", "", "longitude", "name", "", Const.JSON_KEY_ADDRESS, "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface LocationCallBack {
        void callback(int code, Double latitude, Double longitude, String name, String address);
    }

    void chooseLocation(Activity activity, Double latitude, Double longitude, LocationCallBack callBack);

    void openLocation(Activity activity, Double latitude, Double longitude, int scale);

    /* compiled from: ILocationService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/phancy/mini/service/ILocationService$Companion;", "", "()V", AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH, "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PATH = "/PhancyMini/location";

        private Companion() {
        }
    }
}
