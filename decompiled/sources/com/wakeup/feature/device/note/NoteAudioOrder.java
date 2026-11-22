package com.wakeup.feature.device.note;

import com.amap.api.maps.AMapException;
import com.blankj.utilcode.util.CloseUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.wakeup.common.Constants;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commonui.utils.StringUtils;
import com.wakeup.commponent.module.ble.BleOrderModel;
import java.io.ByteArrayOutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: NoteAudioOrder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/device/note/NoteAudioOrder;", "", "<init>", "()V", "sendNoteAudio", "Lcom/wakeup/commponent/module/ble/BleOrderModel;", "state", "", Constants.BundleKey.BEAN, "Lcom/wakeup/feature/device/note/NoteRecordBean;", "sendNoteAudioList", "data", "", "noteAudioControl", "id", "playState", "noteAudioUpdate", "name", "", "noteAudioDel", "ids", "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoteAudioOrder {
    public static final NoteAudioOrder INSTANCE = new NoteAudioOrder();

    private NoteAudioOrder() {
    }

    public static /* synthetic */ BleOrderModel sendNoteAudio$default(NoteAudioOrder noteAudioOrder, int i, NoteRecordBean noteRecordBean, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            noteRecordBean = null;
        }
        return noteAudioOrder.sendNoteAudio(i, noteRecordBean);
    }

    public final BleOrderModel sendNoteAudio(int state, NoteRecordBean bean) {
        byte[] bArr = new byte[7];
        bArr[0] = -22;
        bArr[1] = 0;
        bArr[2] = 4;
        bArr[3] = 0;
        bArr[4] = BuiltinOptions.RangeOptions;
        bArr[5] = 1;
        if (state != 0) {
            bArr[6] = state == 1 ? (byte) 1 : (byte) 2;
            return new BleOrderModel("发送备忘录音频 失败 ".concat(state == 1 ? "权限未开" : AMapException.ERROR_NOT_ENOUGH_SPACE), bArr, false, 0, 12, null);
        }
        if (bean == null) {
            bArr[6] = 1;
            return new BleOrderModel("发送备忘录音频 失败bean", bArr, false, 0, 12, null);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bArr[6] = 0;
        long createTime = bean.getCreateTime() / 1000;
        int duration = bean.getDuration();
        LogUtils.i("NoteAudioOrder", "2duration " + duration);
        byteArrayOutputStream.write(bean.getId());
        byteArrayOutputStream.write(new byte[]{(byte) ((createTime >> 24) & 255), (byte) ((createTime >> 16) & 255), (byte) ((createTime >> 8) & 255), (byte) (createTime & 255)});
        byteArrayOutputStream.write(new byte[]{(byte) ((duration >> 8) & 255), (byte) (duration & 255)});
        byteArrayOutputStream.write(StringUtils.INSTANCE.strToByteArrayMax(bean.getName(), 20));
        byte[] addBytes = BleUtil.addBytes(bArr, byteArrayOutputStream.toByteArray());
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        CloseUtils.closeIO(byteArrayOutputStream);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("发送备忘录音频 成功", handleMessageBytes, false, 0, 12, null);
    }

    public final BleOrderModel sendNoteAudioList(List<NoteRecordBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArr = {-22, 0, 4, 0, BuiltinOptions.RangeOptions, 2, 0};
        if (CollectionUtils.isEmpty(data)) {
            return new BleOrderModel("发送备忘录音频列表", bArr, false, 0, 12, null);
        }
        bArr[6] = (byte) data.size();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (NoteRecordBean noteRecordBean : data) {
            long createTime = noteRecordBean.getCreateTime() / 1000;
            int duration = noteRecordBean.getDuration();
            byteArrayOutputStream.write(noteRecordBean.getId());
            LogUtils.i("NoteAudioOrder", "duration " + duration);
            byteArrayOutputStream.write(new byte[]{(byte) ((createTime >> 24) & 255), (byte) ((createTime >> 16) & 255), (byte) ((createTime >> 8) & 255), (byte) (createTime & 255)});
            byteArrayOutputStream.write(new byte[]{(byte) ((duration >> 8) & 255), (byte) (duration & 255)});
            byteArrayOutputStream.write(StringUtils.INSTANCE.strToByteArrayMax(noteRecordBean.getName(), 20));
            byteArrayOutputStream.write(31);
        }
        byte[] addBytes = BleUtil.addBytes(bArr, byteArrayOutputStream.toByteArray());
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        CloseUtils.closeIO(byteArrayOutputStream);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("发送备忘录音频列表", handleMessageBytes, false, 0, 12, null);
    }

    public final BleOrderModel noteAudioControl(int id2, int playState) {
        return new BleOrderModel("备忘录音频状态 ".concat(playState == 0 ? "暂停" : "播放"), new byte[]{-22, 0, 5, 0, BuiltinOptions.RangeOptions, 3, (byte) id2, (byte) playState}, false, 0, 12, null);
    }

    public final BleOrderModel noteAudioUpdate(int id2, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        byte[] addBytes = BleUtil.addBytes(new byte[]{-22, 0, 4, 0, BuiltinOptions.RangeOptions, 4, (byte) id2}, StringUtils.INSTANCE.strToByteArrayMax(name, 20));
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("备忘录音频操作重命名", handleMessageBytes, false, 0, 12, null);
    }

    public final BleOrderModel noteAudioDel(int[] ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        byte[] bArr = {-22, 0, 4, 0, BuiltinOptions.RangeOptions, 5, (byte) ids.length};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i : ids) {
            byteArrayOutputStream.write(i);
        }
        byte[] addBytes = BleUtil.addBytes(bArr, byteArrayOutputStream.toByteArray());
        addBytes[1] = (byte) ((addBytes.length - 3) / 256);
        addBytes[2] = (byte) ((addBytes.length - 3) % 256);
        CloseUtils.closeIO(byteArrayOutputStream);
        byte[] handleMessageBytes = BleUtil.handleMessageBytes(addBytes);
        Intrinsics.checkNotNull(handleMessageBytes);
        return new BleOrderModel("备忘录音频操作删除", handleMessageBytes, false, 0, 12, null);
    }
}
