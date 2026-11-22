package com.sifli.watchfacesdk.task;

import android.os.Handler;
import com.sifli.siflicore.error.SFError;
import com.sifli.siflicore.error.SFException;
import com.sifli.siflicore.log.SFLog;
import com.sifli.siflicore.task.SFTaskBase;
import com.sifli.siflicore.util.StringUtil;
import com.sifli.watchfacesdk.modules.pushfile.ISFPushInfos;
import com.sifli.watchfacesdk.modules.pushfile.SFFile;
import com.sifli.watchfacesdk.packet.request.SFWatchfaceFileDataRequest;
import com.sifli.watchfacesdk.packet.request.SFWatchfaceFileEndRequest;
import com.sifli.watchfacesdk.packet.request.SFWatchfaceFileStartRequest;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceFileDataResponse;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceFileStartResponse;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceLoseCheckReqResponse;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceResponsePacket;
import java.nio.charset.StandardCharsets;

/* loaded from: classes17.dex */
public class SFWatchfacePushFileTask extends SFTaskBase {
    private static final int NORMAL_TIME_OUT = 60;
    private long competeBytes;
    private SFFile file;
    private int fileIndex;
    private long fileInvervalTime;
    private int loseCheckReceiveErrorCount;
    private long makePacketTime;
    private SFWatchfacePushFileTaskCallback pushFileCallback;
    private Handler pushHandler;
    private ISFPushInfos pushInfos;
    private long sendFileBeginTIme;
    private long sendFileEndTIme;
    private int sendIndex;
    private long sendPacketEndTIme;
    private long sendPacketStartTIme;
    private int status;
    private final String TAG = "SFWatchfacePushFileTask";
    private boolean taskBusy = false;

    public SFWatchfacePushFileTask(SFWatchfacePushFileTaskCallback sFWatchfacePushFileTaskCallback) {
        this.pushFileCallback = sFWatchfacePushFileTaskCallback;
        setStatus(SFWatchfacePushFileStatus.NONE);
    }

    public boolean isBusy() {
        return this.taskBusy;
    }

    public int getIndex() {
        return this.sendIndex + 1;
    }

    public void pushFiles(SFFile sFFile, int i, ISFPushInfos iSFPushInfos, Handler handler) {
        SFLog.i("SFWatchfacePushFileTask", "pushFile name=%s,fileIndex=%d", sFFile.getFileName(), Integer.valueOf(i));
        if (this.taskBusy) {
            SFLog.e("SFWatchfacePushFileTask", "SFWatchfacePushFileTask is busy now.");
            return;
        }
        this.pushInfos = iSFPushInfos;
        this.pushHandler = handler;
        boolean z = true;
        this.taskBusy = true;
        this.file = sFFile;
        this.fileIndex = i;
        this.competeBytes = 0L;
        this.loseCheckReceiveErrorCount = 0;
        SFLog.i("SFWatchfacePushFileTask", "单文件开始: fileIndex=%d,fileName=%s,file size=%d", Integer.valueOf(i), sFFile.getFileName(), Long.valueOf(sFFile.getTotalBytes()));
        String fileName = sFFile.getFileName();
        boolean isNullOrEmpty = StringUtil.isNullOrEmpty(fileName);
        byte[] bytes = sFFile.getFileName().getBytes(StandardCharsets.UTF_8);
        if (bytes != null && bytes.length != 0) {
            z = isNullOrEmpty;
        }
        if (z) {
            SFError sFError = new SFError(15, "filename =" + fileName + "进行utf-8编码失败");
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, sFError);
                return;
            }
            return;
        }
        setStatus(SFWatchfacePushFileStatus.SEND_START);
        setCountDown(60);
        byte[] mashal = new SFWatchfaceFileStartRequest((int) sFFile.getTotalBytes(), fileName).mashal();
        SFWatchfacePushFileTaskCallback sFWatchfacePushFileTaskCallback = this.pushFileCallback;
        if (sFWatchfacePushFileTaskCallback != null) {
            sFWatchfacePushFileTaskCallback.sendFileTask(this, mashal);
        }
    }

    public void handleRspPacket(SFWatchfaceResponsePacket sFWatchfaceResponsePacket) {
        SFLog.i("SFWatchfacePushFileTask", "handleRspPacket rsp command type =%d", Integer.valueOf(sFWatchfaceResponsePacket.getCommandType()));
        if (this.file == null) {
            SFLog.e("SFWatchfacePushFileTask", "file task has been clear,ignore");
            return;
        }
        if (sFWatchfaceResponsePacket.getCommandType() == 3) {
            onFileStartRsp(sFWatchfaceResponsePacket);
            return;
        }
        if (sFWatchfaceResponsePacket.getCommandType() == 5) {
            onFileDataRsp(sFWatchfaceResponsePacket);
            return;
        }
        if (sFWatchfaceResponsePacket.getCommandType() == 7) {
            onFileEndRsp(sFWatchfaceResponsePacket);
        } else if (sFWatchfaceResponsePacket.getCommandType() == 10) {
            onLoseCheckPacketReceived(sFWatchfaceResponsePacket);
        } else {
            SFLog.e("SFWatchfacePushFileTask", "handleRspPacket unknown packet type=%d", Integer.valueOf(sFWatchfaceResponsePacket.getCommandType()));
        }
    }

    public void clear() {
        this.sendIndex = 0;
        this.file = null;
        this.fileIndex = 0;
        this.taskBusy = false;
        this.pushInfos = null;
        this.pushHandler = null;
        setStatus(SFWatchfacePushFileStatus.NONE);
    }

    private void setStatus(int i) {
        this.status = i;
    }

    private void onFileStartRsp(SFWatchfaceResponsePacket sFWatchfaceResponsePacket) {
        SFLog.i("SFWatchfacePushFileTask", "onFileStartRsp");
        if (sFWatchfaceResponsePacket.getResult() != 0) {
            SFError makeDevError = SFError.makeDevError(sFWatchfaceResponsePacket.getResult());
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, makeDevError);
                return;
            }
            return;
        }
        setStatus(SFWatchfacePushFileStatus.SENDING);
        if (sFWatchfaceResponsePacket.getClass() != SFWatchfaceFileStartResponse.class) {
            SFError sFError = new SFError(100, "file start response data is not SFWatchfaceFileStartResponse");
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, sFError);
                return;
            }
            return;
        }
        if (!this.file.hasSlice()) {
            SFError sFError2 = new SFError(100, "file has no slice data.");
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, sFError2);
                return;
            }
            return;
        }
        this.sendIndex = 0;
        pushStepSendFile(0);
    }

    private void onFileDataRsp(SFWatchfaceResponsePacket sFWatchfaceResponsePacket) {
        SFLog.i("SFWatchfacePushFileTask", "onFileDataRsp");
        SFWatchfaceFileDataResponse sFWatchfaceFileDataResponse = (SFWatchfaceFileDataResponse) sFWatchfaceResponsePacket;
        if (sFWatchfaceFileDataResponse.getResult() == 0) {
            long timeNow = timeNow();
            this.sendPacketStartTIme = timeNow;
            SFLog.i("SFWatchfacePushFileTask", "packet invertal time = %df", Long.valueOf(timeNow - this.sendPacketEndTIme));
            this.competeBytes += this.file.getSliceLen(this.sendIndex);
            notifyProgress();
            this.sendIndex++;
            resumeCountDown();
            if (this.sendIndex < this.file.getSliceCount()) {
                pushStepSendFile(this.sendIndex);
                return;
            } else {
                pushStepFileEnd();
                return;
            }
        }
        if (sFWatchfaceFileDataResponse.getResult() != 4) {
            SFError makeDevError = SFError.makeDevError(sFWatchfaceFileDataResponse.getResult());
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, makeDevError);
                return;
            }
            return;
        }
        if (sFWatchfaceFileDataResponse.getExpectIndex() > 0 && sFWatchfaceFileDataResponse.getExpectIndex() <= this.file.getSliceCount()) {
            int expectIndex = ((int) sFWatchfaceFileDataResponse.getExpectIndex()) - 1;
            this.sendIndex = expectIndex;
            pushStepSendFile(expectIndex);
        } else {
            long expectIndex2 = sFWatchfaceFileDataResponse.getExpectIndex();
            SFLog.e("SFWatchfacePushFileTask", "发送slice失败,异常的continueIndex:%d", Long.valueOf(expectIndex2));
            SFError sFError = new SFError(150, "invalid expect index=" + expectIndex2);
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, sFError);
            }
        }
    }

    private void notifyProgress() {
        if (this.callback != null) {
            long totalBytes = this.pushInfos.getTotalBytes();
            this.callback.bleTaskOnProcess(this, this.pushInfos.getCompletedBytes() + this.competeBytes, totalBytes);
        }
    }

    private void onFileEndRsp(SFWatchfaceResponsePacket sFWatchfaceResponsePacket) {
        SFLog.i("SFWatchfacePushFileTask", "onFileEndRsp");
        if (sFWatchfaceResponsePacket.getResult() != 0) {
            SFError makeDevError = SFError.makeDevError(sFWatchfaceResponsePacket.getResult());
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, makeDevError);
                return;
            }
            return;
        }
        setStatus(SFWatchfacePushFileStatus.SEND_DONE);
        this.taskBusy = false;
        this.pushInfos.completeFile(this.file);
        if (this.callback != null) {
            this.callback.bleTaskOnTaskCompete(this, true, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushStepSendFile(int i) {
        SFLog.i("SFWatchfacePushFileTask", "发送文件数据: fileIndex=%d,sliceIndex=%d", Integer.valueOf(this.fileIndex), Integer.valueOf(i));
        try {
            SFWatchfaceFileDataRequest sFWatchfaceFileDataRequest = new SFWatchfaceFileDataRequest(i + 1, this.file.getSliceData(i));
            SFWatchfacePushFileTaskCallback sFWatchfacePushFileTaskCallback = this.pushFileCallback;
            if (sFWatchfacePushFileTaskCallback != null) {
                sFWatchfacePushFileTaskCallback.sendFileTask(this, sFWatchfaceFileDataRequest.mashal());
            }
        } catch (Exception e) {
            SFLog.e("SFWatchfacePushFileTask", "pushStepSendFile exception.ex=%s", e.toString());
            e.printStackTrace();
            if (e.getClass() == SFException.class) {
                SFException sFException = (SFException) e;
                SFError sFError = new SFError(sFException.getCode(), sFException.getMessage());
                if (this.callback != null) {
                    this.callback.bleTaskOnTaskCompete(this, false, sFError);
                    return;
                }
                return;
            }
            SFError sFError2 = new SFError(100, e.getMessage());
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, sFError2);
            }
        }
    }

    private void pushStepFileEnd() {
        SFLog.i("SFWatchfacePushFileTask", "pushStepFileEnd");
        SFWatchfaceFileEndRequest sFWatchfaceFileEndRequest = new SFWatchfaceFileEndRequest();
        SFWatchfacePushFileTaskCallback sFWatchfacePushFileTaskCallback = this.pushFileCallback;
        if (sFWatchfacePushFileTaskCallback != null) {
            sFWatchfacePushFileTaskCallback.sendFileTask(this, sFWatchfaceFileEndRequest.mashal());
        }
    }

    private void onLoseCheckPacketReceived(SFWatchfaceResponsePacket sFWatchfaceResponsePacket) {
        SFWatchfaceLoseCheckReqResponse sFWatchfaceLoseCheckReqResponse = (SFWatchfaceLoseCheckReqResponse) sFWatchfaceResponsePacket;
        if (sFWatchfaceLoseCheckReqResponse.getResult() == 8) {
            SFLog.e("SFWatchfacePushFileTask", "remote user abort!");
            SFError makeDevError = SFError.makeDevError(sFWatchfaceLoseCheckReqResponse.getResult());
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, makeDevError);
                return;
            }
            return;
        }
        if (sFWatchfaceLoseCheckReqResponse.getResult() == 7) {
            long expectIndex = sFWatchfaceLoseCheckReqResponse.getExpectIndex();
            if (expectIndex <= 0) {
                SFLog.w("SFWatchfacePushFileTask", "⚠️设备主动上报的LoseCheck消息expectedOrderNumber为0，忽略");
                return;
            }
            final int i = ((int) expectIndex) - 1;
            if (this.file.getSliceCount() <= i) {
                SFLog.w("SFWatchfacePushFileTask", "⚠️异常的的lose check，返回的expectIndex超出了当前文件的切片范围,忽略.expectSendIndex=%d,file slice count=%d,filename=%s", Integer.valueOf(i), Integer.valueOf(this.file.getSliceCount()), this.file.getFileName());
                return;
            }
            this.pushHandler.postDelayed(new Runnable() { // from class: com.sifli.watchfacesdk.task.SFWatchfacePushFileTask.1
                @Override // java.lang.Runnable
                public void run() {
                    SFWatchfacePushFileTask.this.pushStepSendFile(i);
                }
            }, 1000L);
        }
        if (sFWatchfaceLoseCheckReqResponse.getResult() == 2) {
            int i2 = this.loseCheckReceiveErrorCount + 1;
            this.loseCheckReceiveErrorCount = i2;
            if (i2 >= 3) {
                SFError sFError = new SFError(200, "数据包过长，尝试减小启动推送时的maxFileSliceLength参数值");
                if (this.callback != null) {
                    this.callback.bleTaskOnTaskCompete(this, false, sFError);
                    return;
                }
                return;
            }
            long expectIndex2 = sFWatchfaceLoseCheckReqResponse.getExpectIndex();
            if (expectIndex2 <= 0) {
                SFLog.w("SFWatchfacePushFileTask", "⚠️设备主动上报的LoseCheck消息expectedOrderNumber为0，忽略");
                return;
            }
            final int i3 = ((int) expectIndex2) - 1;
            if (this.file.getSliceCount() <= i3) {
                SFLog.w("SFWatchfacePushFileTask", "⚠️异常的的lose check，返回的expectIndex超出了当前文件的切片范围,忽略.expectSendIndex=%d,file slice count=%d,filename=%s", Integer.valueOf(i3), Integer.valueOf(this.file.getSliceCount()), this.file.getFileName());
            } else {
                this.pushHandler.postDelayed(new Runnable() { // from class: com.sifli.watchfacesdk.task.SFWatchfacePushFileTask.2
                    @Override // java.lang.Runnable
                    public void run() {
                        SFWatchfacePushFileTask.this.pushStepSendFile(i3);
                    }
                }, 1000L);
            }
        }
    }

    private long timeNow() {
        return System.currentTimeMillis();
    }
}
