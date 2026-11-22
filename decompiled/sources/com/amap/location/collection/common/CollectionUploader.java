package com.amap.location.collection.common;

import android.util.Base64;
import com.amap.location.collection.CollectionConfig;
import com.amap.location.support.AmapContext;
import com.amap.location.support.log.ALLog;
import com.amap.location.support.network.HttpRequest;
import com.amap.location.support.network.HttpResponse;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.nio.charset.StandardCharsets;

/* loaded from: classes11.dex */
public class CollectionUploader {
    private static final String TAG = "colup";

    public static boolean doUpload(int i, byte[] bArr) {
        if (bArr != null) {
            boolean z = i == 0;
            try {
                HttpRequest httpRequest = new HttpRequest();
                httpRequest.headers.put("Content-Type", "application/octet-stream");
                httpRequest.headers.put(HttpRequest.sHeaderProductTypeKey, Base64.encodeToString(HttpRequest.getHeaderProductType().getBytes(), 2));
                httpRequest.headers.put(HttpRequest.sHeaderProductInfoKey, Base64.encodeToString(HttpRequest.getHeaderProductInfo().getBytes(), 2));
                httpRequest.body = bArr;
                if (CollectionConfig.sUseTestNet) {
                    httpRequest.url = z ? CollectionConst.BASEDATA_UPLOAD_URL_DEBUG : CollectionConst.EXTDATA_UPLOAD_URL_DEBUG;
                } else {
                    httpRequest.url = (CollectionConfig.sUseHttps ? "https://" : "http://").concat(z ? CollectionConst.BASEDATA_UPLOAD_URL_DOMAIN_RELEASE : CollectionConst.EXTDATA_UPLOAD_URL_DOMAIN_RELEASE);
                }
                HttpResponse post = AmapContext.getNetwork().post(httpRequest);
                byte[] bArr2 = (post == null || post.statusCode != 200) ? null : post.body;
                if (bArr2 != null) {
                    if (MediaConstraintKeys.TRUE.equals(new String(bArr2, StandardCharsets.UTF_8))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                ALLog.d(e);
            }
        }
        return false;
    }
}
