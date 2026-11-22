package com.wakeup.commponent.module.device;

import android.graphics.Bitmap;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.wakeup.common.Constants;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.commponent.module.device.work.CustomDialBean;
import com.wakeup.commponent.module.device.work.CustomVideoBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: DeviceTransferService.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J0\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J@\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0019\u001a\u00020\u000eH&J\"\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H&J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u001e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u001e\u0010 \u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u001e\u0010!\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020#H&J\u001e\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u001e\u0010(\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0005H&J&\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\b\u0010-\u001a\u00020\u0003H&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020#H&J&\u00100\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\b\u00101\u001a\u00020\u0003H&J\u001e\u00102\u001a\u00020\u00032\u0006\u0010&\u001a\u0002032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J.\u00104\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J2\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020#2\b\u00109\u001a\u0004\u0018\u00010\u00122\b\u0010:\u001a\u0004\u0018\u00010\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J2\u0010;\u001a\u00020\u00032\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120=2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050=2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J.\u0010>\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J2\u0010?\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010@\u001a\u00020#2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050A0\rH&J\u001e\u0010B\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\b\u0010C\u001a\u00020#H&J\u001e\u0010D\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u0018\u0010E\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0005H&¨\u0006G"}, d2 = {"Lcom/wakeup/commponent/module/device/DeviceTransferService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "startPushDial", "", "mac", "", "bleName", "filePath", MapBundleKey.MapObjKey.OBJ_SL_OBJ, "", "startPushMusic", "path", "callback", "Lcom/wakeup/common/base/BaseCallback;", "", "startPushNoiseMusic", "startPushMenuBg", "bitmap", "Landroid/graphics/Bitmap;", "fileName", "startPushApp", "startPushAigcDial", "thumbBitmap", "startPushGallery", "thumbFileName", "availableMemoryKb", "covertCameraPath", "covertFilePath", "dirName", "name", "startPushPicture", "startPushRing", "startPushEBook", "startPushMeeting", "isInstalling", "", "isInstallRinging", "startPushCustomDial", Constants.BundleKey.BEAN, "Lcom/wakeup/commponent/module/device/work/CustomDialBean;", "startPushBarrage", "initNaviParams", "imgNum", "startPushNavi", "index", "pausePushNavi", "stopPushNavi", "isDevice", "startPushCamera", "stopPushCamera", "startPushCustomVideoDial", "Lcom/wakeup/commponent/module/device/work/CustomVideoBean;", "startPushCustomFile", "type", "fileType", "startWxImg", "isWechat", "headBitmap", "qrBitmap", "startWxImgEmo", "imgEmos", "", "startHsFile", "startHsOtaFile", "isZip", "Lkotlin/Pair;", "startJsHsAppFile", "isFtping", "startPushDiyDial", "hsLogSwitch", "code", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DeviceTransferService extends IProvider {
    String covertCameraPath(String covertFilePath, String dirName, String name);

    void hsLogSwitch(String mac, String code);

    void initNaviParams(int imgNum, String filePath);

    boolean isFtping();

    boolean isInstallRinging();

    boolean isInstalling();

    void pausePushNavi();

    void startHsFile(int type, Bitmap bitmap, String fileName, BaseCallback<Integer> callback);

    void startHsOtaFile(String path, boolean isZip, BaseCallback<Pair<Integer, String>> callback);

    void startJsHsAppFile(String path, BaseCallback<Integer> callback);

    void startPushAigcDial(Bitmap bitmap, Bitmap thumbBitmap, String fileName, BaseCallback<Integer> callback);

    void startPushApp(String path, BaseCallback<Integer> callback);

    void startPushBarrage(String path, BaseCallback<Integer> callback);

    void startPushCamera(int index, String path, BaseCallback<Integer> callback);

    void startPushCustomDial(CustomDialBean bean, BaseCallback<Integer> callback);

    void startPushCustomFile(String path, String type, int fileType, BaseCallback<Integer> callback);

    void startPushCustomVideoDial(CustomVideoBean bean, BaseCallback<Integer> callback);

    void startPushDial(String mac, String bleName, String filePath, Object obj);

    void startPushDiyDial(Bitmap bitmap, BaseCallback<Integer> callback);

    void startPushEBook(String path, BaseCallback<Integer> callback);

    void startPushGallery(Bitmap bitmap, Bitmap thumbBitmap, String fileName, String thumbFileName, BaseCallback<Integer> callback, int availableMemoryKb);

    void startPushMeeting(String path, BaseCallback<Integer> callback);

    void startPushMenuBg(Bitmap bitmap, String fileName, BaseCallback<Integer> callback);

    void startPushMusic(String path, BaseCallback<Integer> callback);

    void startPushNavi(int index, String path, BaseCallback<Integer> callback);

    void startPushNoiseMusic(String path, BaseCallback<Integer> callback);

    String startPushPicture(String covertFilePath, String filePath);

    void startPushRing(String path, BaseCallback<Integer> callback);

    void startWxImg(boolean isWechat, Bitmap headBitmap, Bitmap qrBitmap, BaseCallback<Integer> callback);

    void startWxImgEmo(List<Bitmap> imgEmos, List<String> fileName, BaseCallback<Integer> callback);

    void stopPushCamera();

    void stopPushNavi(boolean isDevice);

    /* compiled from: DeviceTransferService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void startPushGallery$default(DeviceTransferService deviceTransferService, Bitmap bitmap, Bitmap bitmap2, String str, String str2, BaseCallback baseCallback, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPushGallery");
            }
            if ((i2 & 32) != 0) {
                i = -1;
            }
            deviceTransferService.startPushGallery(bitmap, bitmap2, str, str2, baseCallback, i);
        }
    }
}
