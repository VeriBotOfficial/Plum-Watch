package com.wakeup.common.network.entity.redemptioncode;

import java.util.List;

/* loaded from: classes2.dex */
public class AssetsCodeRecords {
    public List<RecordBean> data;
    public int pageNum;
    public int pageSize;

    public List<RecordBean> getData() {
        return this.data;
    }

    public void setData(List<RecordBean> data) {
        this.data = data;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
