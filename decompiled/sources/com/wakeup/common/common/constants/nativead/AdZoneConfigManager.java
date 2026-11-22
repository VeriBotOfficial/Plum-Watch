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

/* compiled from: AdZoneConfigManager.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0006J\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000bJ\u0006\u0010\u001c\u001a\u00020\u001aR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/common/constants/nativead/AdZoneConfigManager;", "", "<init>", "()V", "adZoneConfigMap", "", "", "Lcom/wakeup/common/network/entity/ad/InfomecialZoonsEntity;", "feedAdvertisingNum", "", "defaultSdkConfig", "", "Lcom/wakeup/common/common/constants/nativead/SdkType;", "sdkCodeToTypeMap", "initAdZoneConfig", "", "infomecialZoons", "", "setFeedAdvertisingNum", "num", "(Ljava/lang/Integer;)V", "getFeedAdvertisingNum", "getSdkTypeForZone", "infomecialZoonCode", "getSdkTypeForZoneConfig", "isZoneConfigured", "", "getAllConfiguredZones", "isInitialized", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdZoneConfigManager {
    public static final AdZoneConfigManager INSTANCE = new AdZoneConfigManager();
    private static final Map<String, InfomecialZoonsEntity> adZoneConfigMap = new LinkedHashMap();
    private static int feedAdvertisingNum = 1;
    private static final Map<String, SdkType> defaultSdkConfig = MapsKt.mapOf(TuplesKt.to("ad_open_screen", SdkType.TOPON), TuplesKt.to("feed2", SdkType.TOPON), TuplesKt.to("feed4", SdkType.TOPON), TuplesKt.to("feed6", SdkType.TOPON), TuplesKt.to("feed8", SdkType.TOPON), TuplesKt.to("black_feed_source", SdkType.TOPON), TuplesKt.to("black_feed", SdkType.TOPON));
    private static final Map<String, SdkType> sdkCodeToTypeMap = MapsKt.mapOf(TuplesKt.to("sigmob", SdkType.SIGMOB), TuplesKt.to(c.x, SdkType.TOPON), TuplesKt.to("redwhale", SdkType.REDWHALE));

    private AdZoneConfigManager() {
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

    public final void setFeedAdvertisingNum(Integer num) {
        feedAdvertisingNum = num != null ? num.intValue() : 1;
    }

    public final int getFeedAdvertisingNum() {
        return feedAdvertisingNum;
    }

    public final SdkType getSdkTypeForZone(String infomecialZoonCode) {
        Intrinsics.checkNotNullParameter(infomecialZoonCode, "infomecialZoonCode");
        InfomecialZoonsEntity infomecialZoonsEntity = adZoneConfigMap.get(infomecialZoonCode);
        if (infomecialZoonsEntity != null) {
            Map<String, SdkType> map = sdkCodeToTypeMap;
            String lowerCase = infomecialZoonsEntity.getSdkCode().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            SdkType sdkType = map.get(lowerCase);
            return sdkType == null ? SdkType.TOPON : sdkType;
        }
        SdkType sdkType2 = defaultSdkConfig.get(infomecialZoonCode);
        return sdkType2 == null ? SdkType.TOPON : sdkType2;
    }

    public final InfomecialZoonsEntity getSdkTypeForZoneConfig(String infomecialZoonCode) {
        Intrinsics.checkNotNullParameter(infomecialZoonCode, "infomecialZoonCode");
        return adZoneConfigMap.get(infomecialZoonCode);
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
