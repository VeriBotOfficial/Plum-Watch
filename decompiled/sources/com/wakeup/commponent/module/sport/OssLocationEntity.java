package com.wakeup.commponent.module.sport;

import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OssLocationEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/wakeup/commponent/module/sport/OssLocationEntity;", "", "<init>", "()V", "latitude", "", "longitude", Constants.BundleKey.TIMESTAMP, "", "speed", "", "altitude", Const.JSON_KEY_ACCURACY, "isKM", "isMile", "toJson", "Lorg/json/JSONObject;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OssLocationEntity {
    private final float accuracy;
    private final double altitude;
    private final Object isKM = false;
    private final Object isMile = false;
    private final double latitude;
    private final double longitude;
    private final float speed;
    private final long timeStamp;

    public final JSONObject toJson() {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", this.latitude);
            jSONObject.put("longitude", this.longitude);
            jSONObject.put(Constants.BundleKey.TIMESTAMP, this.timeStamp);
            jSONObject.put("speed", this.speed);
            jSONObject.put("altitude", this.altitude);
            jSONObject.put(Const.JSON_KEY_ACCURACY, this.accuracy);
            boolean z2 = true;
            if (!Intrinsics.areEqual(this.isKM, (Object) 1) && !Intrinsics.areEqual(this.isKM, (Object) true)) {
                z = false;
                jSONObject.put("isKM", z);
                if (!Intrinsics.areEqual(this.isMile, (Object) 1) && !Intrinsics.areEqual(this.isMile, (Object) true)) {
                    z2 = false;
                }
                jSONObject.put("isMile", z2);
                return jSONObject;
            }
            z = true;
            jSONObject.put("isKM", z);
            if (!Intrinsics.areEqual(this.isMile, (Object) 1)) {
                z2 = false;
            }
            jSONObject.put("isMile", z2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
