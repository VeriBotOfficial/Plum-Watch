package com.wakeup.module.data.sync;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.OSS;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.auth.OSSAuthCredentialsProvider;
import com.alibaba.sdk.android.oss.model.GetObjectRequest;
import com.alibaba.sdk.android.oss.model.GetObjectResult;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import com.wakeup.feature.health.dashboard.HdScenes;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OssManager.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/wakeup/module/data/sync/OssManager;", "", "<init>", "()V", "TAG", "", "STS_INFO_URL", "OSS_ENDPOINT", "BUCKET_NAME_DATA", "BUCKET_NAME_IMAGE", "OSS_URL", "mOss", "Lcom/alibaba/sdk/android/oss/OSS;", "downloadOssFile", "failPathAndName", "uploadOssFile", "", "localFile", "progressCallback", "Lcom/alibaba/sdk/android/oss/callback/OSSProgressCallback;", "Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;", "uploadAvatarOssFile", "typeToOssFolder", "dataType", "", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OssManager {
    private static final String BUCKET_NAME_DATA = "shenzhen-oss-wakeup";
    private static final String BUCKET_NAME_IMAGE = "shenzhen-file-bucket";
    public static final String OSS_URL = "https://shenzhen-oss-wakeup.oss-cn-shenzhen.aliyuncs.com/";
    public static final OssManager INSTANCE = new OssManager();
    private static final String TAG = "OssManager";
    private static final String OSS_ENDPOINT = "https://oss-cn-shenzhen.aliyuncs.com";
    private static final String STS_INFO_URL = "https://sts.iwhop.com/oss/sts/v2/key";
    private static OSS mOss = new OSSClient(BaseApplication.getContext(), OSS_ENDPOINT, new OSSAuthCredentialsProvider(STS_INFO_URL));

    private OssManager() {
    }

    public final String downloadOssFile(String failPathAndName) {
        Intrinsics.checkNotNullParameter(failPathAndName, "failPathAndName");
        GetObjectRequest getObjectRequest = new GetObjectRequest(BUCKET_NAME_DATA, failPathAndName);
        getObjectRequest.setProgressListener(new OSSProgressCallback() { // from class: com.wakeup.module.data.sync.OssManager$$ExternalSyntheticLambda0
            @Override // com.alibaba.sdk.android.oss.callback.OSSProgressCallback
            public final void onProgress(Object obj, long j, long j2) {
                OssManager.downloadOssFile$lambda$0((GetObjectRequest) obj, j, j2);
            }
        });
        try {
            GetObjectResult object = mOss.getObject(getObjectRequest);
            Intrinsics.checkNotNullExpressionValue(object, "getObject(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(object.getObjectContent()));
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return !TextUtils.isEmpty(readText) ? readText : "";
            } finally {
            }
        } catch (ClientException e) {
            e.printStackTrace();
            LogUtils.i(TAG, "ClientException error = " + e.getMessage());
            return "";
        } catch (ServiceException e2) {
            LogUtils.e(TAG, "error = " + e2.getRequestId() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + e2.getErrorCode() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + e2.getHostId() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + e2.getRawMessage());
            return "";
        } catch (IOException e3) {
            LogUtils.i(TAG, "IOException error = " + e3.getMessage());
            e3.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadOssFile$lambda$0(GetObjectRequest getObjectRequest, long j, long j2) {
        LogUtils.i(TAG, "\"downloadProgress: " + j + "  total_size: " + j2 + "\"");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean uploadOssFile$default(OssManager ossManager, String str, String str2, OSSProgressCallback oSSProgressCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            oSSProgressCallback = null;
        }
        return ossManager.uploadOssFile(str, str2, oSSProgressCallback);
    }

    public final boolean uploadOssFile(String failPathAndName, String localFile, OSSProgressCallback<PutObjectRequest> progressCallback) {
        Intrinsics.checkNotNullParameter(failPathAndName, "failPathAndName");
        Intrinsics.checkNotNullParameter(localFile, "localFile");
        PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKET_NAME_DATA, failPathAndName, localFile);
        putObjectRequest.setCRC64(OSSRequest.CRC64Config.YES);
        putObjectRequest.setProgressCallback(progressCallback);
        try {
            mOss.putObject(putObjectRequest);
            return true;
        } catch (Exception e) {
            LogUtils.i(TAG, "uploadOssFile error = " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public final boolean uploadAvatarOssFile(String failPathAndName, String localFile) {
        Intrinsics.checkNotNullParameter(failPathAndName, "failPathAndName");
        Intrinsics.checkNotNullParameter(localFile, "localFile");
        PutObjectRequest putObjectRequest = new PutObjectRequest("shenzhen-file-bucket", failPathAndName, localFile);
        putObjectRequest.setCRC64(OSSRequest.CRC64Config.YES);
        try {
            mOss.putObject(putObjectRequest);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final String typeToOssFolder(int dataType) {
        switch (dataType) {
            case 10000:
            case 10010:
                return "step";
            case 10001:
            case 10008:
                return "heart_rate";
            case 10002:
                return "blood_pressure";
            case 10003:
                return "blood_oxygen";
            case 10004:
                return "blood_sugar";
            case 10005:
                return HdScenes.SLEEP;
            case 10006:
                return "fatigue";
            case 10007:
                return "temperature";
            case 10009:
                return "immunity";
            case 10011:
                return "weight";
            case 10012:
                return "heart_low";
            case 10013:
                return "heart_high";
            case 10014:
                return "sleep_apnea";
            default:
                return "test";
        }
    }
}
