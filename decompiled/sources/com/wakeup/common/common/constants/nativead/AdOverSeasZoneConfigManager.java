package com.wakeup.common.common.constants.nativead;

import com.qumeng.overseas.advlib.trdparty.unionset.network.c;
import com.wakeup.common.network.entity.ad.InfomecialZoonsEntity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdOverSeasZoneConfigManager.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0006J\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0010J\u0006\u0010\u001b\u001a\u00020\u0019R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/common/constants/nativead/AdOverSeasZoneConfigManager;", "", "<init>", "()V", "adZoneConfigMap", "", "", "Lcom/wakeup/common/network/entity/ad/InfomecialZoonsEntity;", "feedAdvertisingNum", "", "setFeedAdvertisingNum", "", "num", "(Ljava/lang/Integer;)V", "getFeedAdvertisingNum", "defaultSdkConfig", "", "Lcom/wakeup/common/common/constants/nativead/SdkType;", "sdkCodeToTypeMap", "initAdZoneConfig", "infomecialZoons", "", "getSdkTypeForZone", "infomecialZoonCode", "isZoneConfigured", "", "getAllConfiguredZones", "isInitialized", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdOverSeasZoneConfigManager {
    public static final AdOverSeasZoneConfigManager INSTANCE = new AdOverSeasZoneConfigManager();
    private static final Map<String, InfomecialZoonsEntity> adZoneConfigMap = new LinkedHashMap();
    private static int feedAdvertisingNum = 1;
    private static final Map<String, SdkType> defaultSdkConfig = MapsKt.mapOf(TuplesKt.to("ad_open_screen", SdkType.TOPON), TuplesKt.to("ad_insert_screen", SdkType.TOPON), TuplesKt.to("ad_banner", SdkType.TOPON));
    private static final Map<String, SdkType> sdkCodeToTypeMap = MapsKt.mapOf(TuplesKt.to("sigmob", SdkType.SIGMOB), TuplesKt.to(c.x, SdkType.TOPON), TuplesKt.to("redwhale", SdkType.REDWHALE));

    private AdOverSeasZoneConfigManager() {
    }

    public final void setFeedAdvertisingNum(Integer num) {
        feedAdvertisingNum = num != null ? num.intValue() : 1;
    }

    public final int getFeedAdvertisingNum() {
        return feedAdvertisingNum;
    }

    public final void initAdZoneConfig(List<InfomecialZoonsEntity> infomecialZoons) {
        adZoneConfigMap.clear();
        if (infomecialZoons != null) {
            for (InfomecialZoonsEntity infomecialZoonsEntity : infomecialZoons) {
                try {
                    String infomecialZoonCode = infomecialZoonsEntity.getInfomecialZoonCode();
                    String sdkCode = infomecialZoonsEntity.getSdkCode();
                    String clientType = infomecialZoonsEntity.getClientType();
                    if (infomecialZoonCode != null && sdkCode != null && clientType != null) {
                        adZoneConfigMap.put(infomecialZoonCode, infomecialZoonsEntity);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final SdkType getSdkTypeForZone(String infomecialZoonCode) {
        Intrinsics.checkNotNullParameter(infomecialZoonCode, "infomecialZoonCode");
        InfomecialZoonsEntity infomecialZoonsEntity = adZoneConfigMap.get(infomecialZoonCode);
        if (infomecialZoonsEntity != null) {
            Map<String, SdkType> map = sdkCodeToTypeMap;
            String lowerCase = infomecialZoonsEntity.getSdkCode().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            SdkType sdkType = map.get(lowerCase);
            return sdkType == null ? SdkType.UNKNOWN : sdkType;
        }
        SdkType sdkType2 = defaultSdkConfig.get(infomecialZoonCode);
        return sdkType2 == null ? SdkType.UNKNOWN : sdkType2;
    }

    public final boolean isZoneConfigured(String infomecialZoonCode) {
        Intrinsics.checkNotNullParameter(infomecialZoonCode, "infomecialZoonCode");
        return adZoneConfigMap.containsKey(infomecialZoonCode);
    }

    public final Map<String, InfomecialZoonsEntity> getAllConfiguredZones() {
        return MapsKt.toMap(adZoneConfigMap);
    }

    public final boolean isInitialized() {
        return !adZoneConfigMap.isEmpty();
    }
}
