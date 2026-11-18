package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzfbp {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfbp(int r1, int r2, boolean z) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = z;
    }

    static List zza(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int r1 = 0;
            int r2 = 0;
            boolean zNextBoolean = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if ("width".equals(strNextName)) {
                    r1 = jsonReader.nextInt();
                } else if ("height".equals(strNextName)) {
                    r2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(strNextName)) {
                    zNextBoolean = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzfbp(r1, r2, zNextBoolean));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
