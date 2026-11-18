package com.google.android.gms.internal.p003firebaseauthapi;

import android.util.Log;
import io.nats.client.support.NatsJetStreamConstants;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzagq {
    private Long zza;
    private Long zzb;

    public static zzagq zza(String str) throws UnsupportedEncodingException {
        try {
            zzagq zzagqVar = new zzagq();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString(NatsJetStreamConstants.ROLLUP_HDR_SUBJECT);
            zzagqVar.zza = Long.valueOf(jSONObject.optLong("iat"));
            zzagqVar.zzb = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzagqVar;
        } catch (JSONException e) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + String.valueOf(e));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + String.valueOf(e));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    public final Long zzb() {
        return this.zza;
    }
}
