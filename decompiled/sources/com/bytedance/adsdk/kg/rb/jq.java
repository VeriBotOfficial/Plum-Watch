package com.bytedance.adsdk.kg.rb;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.kg.gff.kg;
import java.io.IOException;

/* loaded from: classes13.dex */
public class jq implements ei<com.bytedance.adsdk.kg.gff.kg> {
    public static final jq fxn = new jq();

    private jq() {
    }

    @Override // com.bytedance.adsdk.kg.rb.ei
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.kg.gff.kg kg(JsonReader jsonReader, float f) throws IOException {
        kg.fxn fxnVar = kg.fxn.CENTER;
        jsonReader.beginObject();
        kg.fxn fxnVar2 = fxnVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "f":
                    str2 = jsonReader.nextString();
                    break;
                case "j":
                    int nextInt = jsonReader.nextInt();
                    if (nextInt > kg.fxn.CENTER.ordinal() || nextInt < 0) {
                        fxnVar2 = kg.fxn.CENTER;
                        break;
                    } else {
                        fxnVar2 = kg.fxn.values()[nextInt];
                        break;
                    }
                    break;
                case "s":
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    str = jsonReader.nextString();
                    break;
                case "fc":
                    i2 = ud.fxn(jsonReader);
                    break;
                case "lh":
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    z = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    i3 = ud.fxn(jsonReader);
                    break;
                case "sw":
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.kg.gff.kg(str, str2, f2, fxnVar2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
