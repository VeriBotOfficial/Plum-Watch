package com.wakeup.feature.device.bean;

import com.wakeup.common.network.entity.mine.ApplicationModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public class DeviceApplicationModel implements Serializable {
    private List<ApplicationModel> applicationModelList;

    public DeviceApplicationModel(List<ApplicationModel> list) {
        this.applicationModelList = list;
    }

    public List<ApplicationModel> getApplicationModelList() {
        return this.applicationModelList;
    }

    public void setApplicationModelList(List<ApplicationModel> list) {
        this.applicationModelList = list;
    }
}
