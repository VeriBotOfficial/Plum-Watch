package com.wakeup.module.device.work.fileTrans;

import com.anythink.basead.c.b;
import com.blankj.utilcode.util.SPUtils;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.wakeup.common.Constants;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.ble.BleOrderModel;
import com.wakeup.commponent.module.ble.WatchBleOrder;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: FileTransferOrder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r¨\u0006\u0013"}, d2 = {"Lcom/wakeup/module/device/work/fileTrans/FileTransferOrder;", "", "<init>", "()V", "genFileHead", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "file", "Ljava/io/File;", "type", "", "fileType", "", "getHeadData", "", "genFileBlock", "block", b.a.A, "blockData", "data", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileTransferOrder {
    public static final FileTransferOrder INSTANCE = new FileTransferOrder();

    private FileTransferOrder() {
    }

    public static /* synthetic */ BleOrderModel genFileHead$default(FileTransferOrder fileTransferOrder, File file, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return fileTransferOrder.genFileHead(file, str, i);
    }

    public final BleOrderModel genFileHead(File file, String type, int fileType) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(type, "type");
        byte[] headData = getHeadData(file, type, fileType);
        byte length = (byte) (headData.length / 256);
        byte length2 = (byte) (headData.length % 256);
        int crcTable = BleUtil.crcTable(headData);
        byte[] bArr = {OtaCommandGenerator.CMD_OTA_INFO, 0, 0, 0, 0, length, length2, (byte) (crcTable / 256), (byte) (crcTable % 256)};
        int i = SPUtils.getInstance().getInt(Constants.SPKey.DEVICE_MTU, 256);
        byte[] addBytes = BleUtil.addBytes(bArr, headData);
        Intrinsics.checkNotNullExpressionValue(addBytes, "addBytes(...)");
        return new BleOrderModel(WatchBleOrder.SEND_TRANS_FILE_HEAD, addBytes, false, i);
    }

    static /* synthetic */ byte[] getHeadData$default(FileTransferOrder fileTransferOrder, File file, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return fileTransferOrder.getHeadData(file, str, i);
    }

    private final byte[] getHeadData(File file, String type, int fileType) {
        byte[] bArr = {(byte) fileType};
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        byte[] bytes = name.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] addBytes = BleUtil.addBytes(bArr, BleUtil.addBytes(new byte[]{(byte) bytes.length}, bytes));
        byte[] bytes2 = type.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        byte[] addBytes2 = BleUtil.addBytes(addBytes, BleUtil.addBytes(new byte[]{(byte) bytes2.length}, bytes2));
        long length = file.length();
        byte[] addBytes3 = BleUtil.addBytes(addBytes2, new byte[]{(byte) ((length >> 24) & 255), (byte) ((length >> 16) & 255), (byte) ((length >> 8) & 255), (byte) (length & 255)});
        int crcFile = BleUtil.crcFile(file);
        return BleUtil.addBytes(addBytes3, new byte[]{(byte) (crcFile / 256), (byte) (crcFile % 256)});
    }

    public final BleOrderModel genFileBlock(int block, int pkg, byte[] blockData, byte[] data) {
        Intrinsics.checkNotNullParameter(blockData, "blockData");
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArr = {-95, (byte) (block / 256), (byte) (block % 256), (byte) (pkg / 256), (byte) (pkg % 256)};
        if (pkg == 0) {
            byte[] addBytes = BleUtil.addBytes(bArr, new byte[]{(byte) (blockData.length / 256), (byte) (blockData.length % 256)});
            int crcTable = BleUtil.crcTable(blockData);
            bArr = BleUtil.addBytes(addBytes, new byte[]{(byte) (crcTable / 256), (byte) (crcTable % 256)});
        }
        int i = SPUtils.getInstance().getInt(Constants.SPKey.DEVICE_MTU, 256);
        byte[] addBytes2 = BleUtil.addBytes(bArr, data);
        Intrinsics.checkNotNullExpressionValue(addBytes2, "addBytes(...)");
        return new BleOrderModel(WatchBleOrder.SEND_TRANS_FILE_DATA, addBytes2, false, i);
    }
}
