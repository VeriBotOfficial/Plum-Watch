package com.wakeup.howear.view.home.device.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.wakeup.common.base.BaseViewModel;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.entity.BasicRequest;
import com.wakeup.common.network.entity.other.DeviceUpdataModel;
import com.wakeup.common.storage.DeviceDao;
import com.wakeup.common.storage.DeviceInfoDao;
import com.wakeup.common.storage.model.DeviceInfoModel;
import com.wakeup.common.storage.model.DeviceModel;
import com.wakeup.common.temp.ResponseThrowable;
import com.wakeup.common.utils.SystemUtils;
import com.wakeup.commponent.ServiceManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseDeviceViewModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ8\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J*\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J8\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0002R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/wakeup/howear/view/home/device/viewmodel/BaseDeviceViewModel;", "Lcom/wakeup/common/base/BaseViewModel;", "<init>", "()V", "updateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/wakeup/common/network/entity/other/DeviceUpdataModel;", "getUpdateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "checkUpdate", "", "model", "Lcom/wakeup/common/storage/model/DeviceModel;", "sicheUpdate", "mac", "", "code", "", "version", "bleName", "isOta", "", "otaFlag", "normalUpdate", "equipmentCode", "hsUpdate", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseDeviceViewModel extends BaseViewModel {
    private final MutableLiveData<DeviceUpdataModel> updateLiveData = new MutableLiveData<>();

    public final MutableLiveData<DeviceUpdataModel> getUpdateLiveData() {
        return this.updateLiveData;
    }

    public final void checkUpdate(DeviceModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        LogUtils.i(getTAG(), "checkUpBleDevice start");
        String mac = model.getMac();
        DeviceInfoModel deviceInfoModel = DeviceInfoDao.getDeviceInfoModel(mac);
        if (deviceInfoModel == null) {
            LogUtils.w(getTAG(), "checkUpBleDevice deviceInfoModel is null");
            return;
        }
        if (DeviceDao.isSupport(model, 123)) {
            if (ServiceManager.getOtaService().isInstalling()) {
                return;
            }
            boolean isOta = deviceInfoModel.analyzeByte11().isOta();
            Intrinsics.checkNotNull(mac);
            int bandVersionCode = deviceInfoModel.getBandVersionCode();
            String otaVersionCode = deviceInfoModel.getOtaVersionCode();
            Intrinsics.checkNotNullExpressionValue(otaVersionCode, "getOtaVersionCode(...)");
            String bleName = deviceInfoModel.getBleName();
            Intrinsics.checkNotNullExpressionValue(bleName, "getBleName(...)");
            sicheUpdate(mac, bandVersionCode, otaVersionCode, bleName, isOta, 0);
            return;
        }
        if (DeviceDao.isSupport(model, 266)) {
            if (ServiceManager.getOtaService().isInstalling()) {
                return;
            }
            DeviceModel device = DeviceDao.getDevice(mac);
            String bleName2 = deviceInfoModel.getBleName();
            if (device != null) {
                bleName2 = device.getName();
            }
            String str = bleName2;
            boolean isOta2 = deviceInfoModel.analyzeByte11().isOta();
            Intrinsics.checkNotNull(mac);
            int bandVersionCode2 = deviceInfoModel.getBandVersionCode();
            String otaVersionCode2 = deviceInfoModel.getOtaVersionCode();
            Intrinsics.checkNotNullExpressionValue(otaVersionCode2, "getOtaVersionCode(...)");
            Intrinsics.checkNotNull(str);
            hsUpdate(mac, bandVersionCode2, otaVersionCode2, str, isOta2, 0);
            return;
        }
        Intrinsics.checkNotNull(mac);
        String equipmentCode = deviceInfoModel.getEquipmentCode();
        int bandVersionCode3 = deviceInfoModel.getBandVersionCode();
        String otaVersionCode3 = deviceInfoModel.getOtaVersionCode();
        Intrinsics.checkNotNullExpressionValue(otaVersionCode3, "getOtaVersionCode(...)");
        normalUpdate(mac, equipmentCode, bandVersionCode3, otaVersionCode3);
    }

    private final void sicheUpdate(final String mac, final int code, final String version, final String bleName, final boolean isOta, int otaFlag) {
        BaseViewModel.launchOnlyResult$default(this, new BaseDeviceViewModel$sicheUpdate$1(new BasicRequest.UpdateSiche(String.valueOf(code), version, bleName, mac), SystemUtils.getLanguage().getLanguage(), otaFlag, null), new Function1() { // from class: com.wakeup.howear.view.home.device.viewmodel.BaseDeviceViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit sicheUpdate$lambda$0;
                sicheUpdate$lambda$0 = BaseDeviceViewModel.sicheUpdate$lambda$0(BaseDeviceViewModel.this, (DeviceUpdataModel) obj);
                return sicheUpdate$lambda$0;
            }
        }, new Function1() { // from class: com.wakeup.howear.view.home.device.viewmodel.BaseDeviceViewModel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit sicheUpdate$lambda$1;
                sicheUpdate$lambda$1 = BaseDeviceViewModel.sicheUpdate$lambda$1(BaseDeviceViewModel.this, isOta, mac, code, version, bleName, (ResponseThrowable) obj);
                return sicheUpdate$lambda$1;
            }
        }, null, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sicheUpdate$lambda$0(BaseDeviceViewModel baseDeviceViewModel, DeviceUpdataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        baseDeviceViewModel.updateLiveData.postValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sicheUpdate$lambda$1(BaseDeviceViewModel baseDeviceViewModel, boolean z, String str, int i, String str2, String str3, ResponseThrowable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LogUtils.w(baseDeviceViewModel.getTAG(), "sicheUpdate fail code: " + it.getCode() + " ,msg: " + it.getErrMsg());
        if (z) {
            baseDeviceViewModel.sicheUpdate(str, i, str2, str3, false, 1);
            return Unit.INSTANCE;
        }
        baseDeviceViewModel.updateLiveData.postValue(null);
        return Unit.INSTANCE;
    }

    private final void normalUpdate(String mac, String equipmentCode, int code, String version) {
        BasicRequest.NewUpdateFirmware newUpdateFirmware = new BasicRequest.NewUpdateFirmware(null, null, null, null, null, 31, null);
        newUpdateFirmware.setEquipmentCode(equipmentCode);
        newUpdateFirmware.setProjectType(String.valueOf(code));
        newUpdateFirmware.setCode(String.valueOf(code));
        newUpdateFirmware.setEquipmentVersion(version);
        newUpdateFirmware.setMac(mac);
        BaseViewModel.launchOnlyResult$default(this, new BaseDeviceViewModel$normalUpdate$1(newUpdateFirmware, SystemUtils.getLanguage().getLanguage(), null), new Function1() { // from class: com.wakeup.howear.view.home.device.viewmodel.BaseDeviceViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit normalUpdate$lambda$2;
                normalUpdate$lambda$2 = BaseDeviceViewModel.normalUpdate$lambda$2(BaseDeviceViewModel.this, (DeviceUpdataModel) obj);
                return normalUpdate$lambda$2;
            }
        }, new Function1() { // from class: com.wakeup.howear.view.home.device.viewmodel.BaseDeviceViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit normalUpdate$lambda$3;
                normalUpdate$lambda$3 = BaseDeviceViewModel.normalUpdate$lambda$3(BaseDeviceViewModel.this, (ResponseThrowable) obj);
                return normalUpdate$lambda$3;
            }
        }, null, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit normalUpdate$lambda$2(BaseDeviceViewModel baseDeviceViewModel, DeviceUpdataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        baseDeviceViewModel.updateLiveData.postValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit normalUpdate$lambda$3(BaseDeviceViewModel baseDeviceViewModel, ResponseThrowable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LogUtils.w(baseDeviceViewModel.getTAG(), "normalUpdate fail code: " + it.getCode() + " ,msg: " + it.getErrMsg());
        baseDeviceViewModel.updateLiveData.postValue(null);
        return Unit.INSTANCE;
    }

    private final void hsUpdate(final String mac, final int code, final String version, final String bleName, final boolean isOta, int otaFlag) {
        BaseViewModel.launchOnlyResult$default(this, new BaseDeviceViewModel$hsUpdate$1(new BasicRequest.UpdateSiche(String.valueOf(code), version, bleName, mac), SystemUtils.getLanguage().getLanguage(), otaFlag, null), new Function1() { // from class: com.wakeup.howear.view.home.device.viewmodel.BaseDeviceViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit hsUpdate$lambda$4;
                hsUpdate$lambda$4 = BaseDeviceViewModel.hsUpdate$lambda$4(BaseDeviceViewModel.this, (DeviceUpdataModel) obj);
                return hsUpdate$lambda$4;
            }
        }, new Function1() { // from class: com.wakeup.howear.view.home.device.viewmodel.BaseDeviceViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit hsUpdate$lambda$5;
                hsUpdate$lambda$5 = BaseDeviceViewModel.hsUpdate$lambda$5(BaseDeviceViewModel.this, isOta, mac, code, version, bleName, (ResponseThrowable) obj);
                return hsUpdate$lambda$5;
            }
        }, null, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hsUpdate$lambda$4(BaseDeviceViewModel baseDeviceViewModel, DeviceUpdataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        baseDeviceViewModel.updateLiveData.postValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hsUpdate$lambda$5(BaseDeviceViewModel baseDeviceViewModel, boolean z, String str, int i, String str2, String str3, ResponseThrowable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LogUtils.w(baseDeviceViewModel.getTAG(), "hsUpdate fail code: " + it.getCode() + " ,msg: " + it.getErrMsg());
        if (z) {
            baseDeviceViewModel.hsUpdate(str, i, str2, str3, false, 1);
            return Unit.INSTANCE;
        }
        baseDeviceViewModel.updateLiveData.postValue(null);
        return Unit.INSTANCE;
    }
}
