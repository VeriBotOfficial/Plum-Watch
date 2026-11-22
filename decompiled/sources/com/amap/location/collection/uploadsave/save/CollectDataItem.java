package com.amap.location.collection.uploadsave.save;

import com.amap.location.collection.common.CollectionData;
import com.amap.location.collection.uploadsave.save.SaveController;

/* loaded from: classes11.dex */
public class CollectDataItem extends CollectionData implements SaveController.DataItem {
    public CollectDataItem(int i, byte[] bArr) {
        super(i, bArr);
    }

    @Override // com.amap.location.collection.uploadsave.save.SaveController.DataItem
    public long getDataSize() {
        return getData().length + 17;
    }
}
