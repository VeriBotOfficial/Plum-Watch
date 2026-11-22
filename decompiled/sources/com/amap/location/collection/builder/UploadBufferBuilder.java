package com.amap.location.collection.builder;

import com.amap.location.collection.common.CollectionData;
import com.amap.location.collection.data.flatbuffers.RootTUploadData;
import com.amap.location.collection.data.flatbuffers.TData;
import com.amap.location.support.bean.wifi.AmapWifi;
import com.amap.location.support.header.HeaderConfig;
import com.amap.location.support.header.THeader;
import com.amap.location.support.log.ALLog;
import java.util.List;

/* loaded from: classes11.dex */
public class UploadBufferBuilder extends AbstractBuilder {
    private static final int BYTE_BUFFER_SIZE = 5120;
    private static UploadBufferBuilder instance = new UploadBufferBuilder();

    private UploadBufferBuilder() {
        super(5120);
    }

    public static UploadBufferBuilder getInstance() {
        return instance;
    }

    private String nonNull(String str) {
        return str == null ? "" : str;
    }

    public byte[] createHeader() {
        super.init();
        try {
            this.mFlatBufferBuilder.finish(THeader.createTHeader(this.mFlatBufferBuilder, HeaderConfig.getProductId(), this.mFlatBufferBuilder.createString(HeaderConfig.getProcessName()), this.mFlatBufferBuilder.createString(HeaderConfig.getProductVerion()), (byte) HeaderConfig.getSystemVersionInt(), this.mFlatBufferBuilder.createString(HeaderConfig.getAdiu()), this.mFlatBufferBuilder.createString(HeaderConfig.getTid()), this.mFlatBufferBuilder.createString(nonNull(HeaderConfig.getDiu())), this.mFlatBufferBuilder.createString(nonNull(HeaderConfig.getImsi())), AmapWifi.macToLong(HeaderConfig.getDeviceMacString()), this.mFlatBufferBuilder.createString(HeaderConfig.getManufacturer()), this.mFlatBufferBuilder.createString(HeaderConfig.getDeviceMode()), this.mFlatBufferBuilder.createString(HeaderConfig.getLicense()), this.mFlatBufferBuilder.createString(HeaderConfig.getMapkey())));
            return this.mFlatBufferBuilder.sizedByteArray();
        } catch (Exception e) {
            ALLog.d(e);
            return null;
        }
    }

    public byte[] createUploadData(byte[] bArr, byte[] bArr2, List<? extends CollectionData> list) {
        if (list == null) {
            return null;
        }
        try {
            int size = list.size();
            if (size > 0 && bArr != null) {
                init();
                int createKeyVector = RootTUploadData.createKeyVector(this.mFlatBufferBuilder, bArr);
                int[] iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    CollectionData collectionData = list.get(i);
                    iArr[i] = TData.createTData(this.mFlatBufferBuilder, (byte) collectionData.getType(), TData.createDataVector(this.mFlatBufferBuilder, collectionData.getData()));
                }
                this.mFlatBufferBuilder.finish(RootTUploadData.createRootTUploadData(this.mFlatBufferBuilder, createKeyVector, bArr2 != null ? RootTUploadData.createHeaderVector(this.mFlatBufferBuilder, bArr2) : 0, RootTUploadData.createDataVector(this.mFlatBufferBuilder, iArr)));
                return this.mFlatBufferBuilder.sizedByteArray();
            }
        } catch (Throwable th) {
            ALLog.d(th);
        }
        return null;
    }
}
