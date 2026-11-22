package com.wakeup.common.storage.model;

import java.util.List;
import kotlin.Metadata;

/* compiled from: HomePageFunctionComponentModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/wakeup/common/storage/model/HomePageFunctionComponentModel;", "", "<init>", "()V", "equipmentFunctionList", "", "Lcom/wakeup/common/storage/model/FunctionComponentModel;", "getEquipmentFunctionList", "()Ljava/util/List;", "setEquipmentFunctionList", "(Ljava/util/List;)V", "functionList", "getFunctionList", "setFunctionList", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomePageFunctionComponentModel {
    private List<FunctionComponentModel> equipmentFunctionList;
    private List<FunctionComponentModel> functionList;

    public final List<FunctionComponentModel> getEquipmentFunctionList() {
        return this.equipmentFunctionList;
    }

    public final void setEquipmentFunctionList(List<FunctionComponentModel> list) {
        this.equipmentFunctionList = list;
    }

    public final List<FunctionComponentModel> getFunctionList() {
        return this.functionList;
    }

    public final void setFunctionList(List<FunctionComponentModel> list) {
        this.functionList = list;
    }
}
