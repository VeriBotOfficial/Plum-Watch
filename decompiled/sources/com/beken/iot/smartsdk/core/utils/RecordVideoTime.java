package com.beken.iot.smartsdk.core.utils;

import com.beken.iot.smartsdk.core.data.BasicHead;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.beken.iot.smartsdk.core.video.CameraFramePacket;
import com.beken.iot.smartsdk.core.video.ImageFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecordVideoTime.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0017"}, d2 = {"Lcom/beken/iot/smartsdk/core/utils/RecordVideoTime;", "", "()V", "printD", "", "msg", "", "recordCompleteReceiveTime", "imageFrame", "Lcom/beken/iot/smartsdk/core/video/ImageFrame;", "recordDecodeEndTime", "type", "recordFilterEndTime", "sequence", "", "recordIotReceiveTime", "recordReceiveTime", "cameraFramePacket", "Lcom/beken/iot/smartsdk/core/video/CameraFramePacket;", "head", "Lcom/beken/iot/smartsdk/core/data/BasicHead;", "recordSendTime", "recordShowTime", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RecordVideoTime {
    public static final RecordVideoTime INSTANCE = new RecordVideoTime();

    private RecordVideoTime() {
    }

    public final void recordSendTime(CameraFramePacket cameraFramePacket, BasicHead head) {
        Intrinsics.checkNotNullParameter(cameraFramePacket, "cameraFramePacket");
        Intrinsics.checkNotNullParameter(head, "head");
        printD("sequence => " + cameraFramePacket.getId() + " sendTime => " + head.timestamp + " packetIndex => " + cameraFramePacket.getCount());
    }

    public final void recordReceiveTime(CameraFramePacket cameraFramePacket, BasicHead head) {
        Intrinsics.checkNotNullParameter(cameraFramePacket, "cameraFramePacket");
        Intrinsics.checkNotNullParameter(head, "head");
        printD("sequence => " + cameraFramePacket.getId() + " receiveTime => " + head.createTime + " packetIndex => " + cameraFramePacket.getCount());
    }

    public final void recordCompleteReceiveTime(ImageFrame imageFrame) {
        Intrinsics.checkNotNullParameter(imageFrame, "imageFrame");
        printD("sequence => " + imageFrame.getSequence() + " recordCompleteReceiveTime => " + System.currentTimeMillis());
    }

    public final void recordDecodeEndTime(ImageFrame imageFrame, String type) {
        Intrinsics.checkNotNullParameter(imageFrame, "imageFrame");
        Intrinsics.checkNotNullParameter(type, "type");
        printD("sequence => " + imageFrame.getSequence() + " decodeEndTime => " + System.currentTimeMillis() + " type => " + type);
    }

    public final void recordFilterEndTime(int sequence) {
        printD("sequence => " + sequence + " filterEndTime => " + System.currentTimeMillis());
    }

    public final void recordIotReceiveTime(int sequence) {
        printD("sequence => " + sequence + " iotReceiveTime => " + System.currentTimeMillis());
    }

    public final void recordShowTime(int sequence) {
        printD("sequence => " + sequence + " showTime => " + System.currentTimeMillis());
    }

    private final void printD(String msg) {
        BKSmartLog.INSTANCE.detail("RecordVideoTime", msg);
    }
}
