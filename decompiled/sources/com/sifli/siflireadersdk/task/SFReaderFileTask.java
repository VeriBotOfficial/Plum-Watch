package com.sifli.siflireadersdk.task;

import com.sifli.siflireadersdk.error.SFError;
import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;
import com.sifli.siflireadersdk.packet.response.SFReaderAudioDumpGetResponsePacket;
import com.sifli.siflireadersdk.packet.response.SFReaderResponsePacket;
import com.sifli.siflireadersdk.util.SFLog;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes17.dex */
public class SFReaderFileTask extends SFReaderBLETaskBase {
    private static final String TAG = "SFReaderFileTask";
    private String currentAudioDumpFileName;
    private String rcvDir;
    private ArrayList<String> rcvFileList;

    public SFReaderFileTask(SFReaderRequestPacket sFReaderRequestPacket, String str) {
        super(sFReaderRequestPacket);
        this.rcvDir = str;
        this.rcvFileList = new ArrayList<>();
    }

    @Override // com.sifli.siflireadersdk.task.SFReaderBLETaskBase
    public void handleRspPacket(SFReaderResponsePacket sFReaderResponsePacket) {
        if (this.rspPackets.size() > 0) {
            handleContinuePacket(this.rspPackets.get(0), sFReaderResponsePacket);
        } else {
            handleFirstPacket(sFReaderResponsePacket);
        }
    }

    private void handleFirstPacket(SFReaderResponsePacket sFReaderResponsePacket) {
        if (sFReaderResponsePacket.getPacketType() == 4) {
            stopTimer();
            this.callback.bleTaskOnTaskCompete(this, true, null);
            return;
        }
        if (sFReaderResponsePacket.getPacketType() != 1 && sFReaderResponsePacket.getPacketType() != 0) {
            SFLog.e(TAG, "⚠️⚠️⚠️SABLETaskBase收到的第一个响应包类型错误: packetType=" + sFReaderResponsePacket.getPacketType());
            return;
        }
        if (sFReaderResponsePacket.getPacketType() == 0) {
            this.callback.bleTaskOnProcess(this, sFReaderResponsePacket.getData().length, sFReaderResponsePacket.getData().length);
            stopTimer();
            this.callback.bleTaskOnTaskCompete(this, true, null);
            return;
        }
        if (sFReaderResponsePacket.getCommandType() == 31) {
            if (sFReaderResponsePacket.getClass() == SFReaderAudioDumpGetResponsePacket.class) {
                applyAudioDumpFileName((SFReaderAudioDumpGetResponsePacket) sFReaderResponsePacket);
            } else {
                SFError sFError = new SFError(180, "convert packet to SFReaderAudioDumpGetResponsePacket fail");
                stopTimer();
                this.callback.bleTaskOnTaskCompete(this, false, sFError);
                return;
            }
        }
        this.rspPackets.add(sFReaderResponsePacket);
        resumeCountDown();
        this.receivedDataLength = 0L;
        this.totalDataLength = sFReaderResponsePacket.getAllDataLength();
        SFLog.i(TAG, "收到文件开始包,totalDataLength=" + this.totalDataLength);
        this.callback.bleTaskOnProcess(this, this.receivedDataLength, this.totalDataLength);
    }

    private void applyAudioDumpFileName(SFReaderAudioDumpGetResponsePacket sFReaderAudioDumpGetResponsePacket) {
        this.currentAudioDumpFileName = getFileName(sFReaderAudioDumpGetResponsePacket.getFileName());
    }

    public static String getFileName(String str) {
        String format = String.format("%s.bin", Long.valueOf(System.currentTimeMillis()));
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : format;
    }

    private void handleContinuePacket(SFReaderResponsePacket sFReaderResponsePacket, SFReaderResponsePacket sFReaderResponsePacket2) {
        if (sFReaderResponsePacket.getPacketType() != 1) {
            this.callback.bleTaskOnTaskCompete(this, false, new SFError(110, "BLETaskBase缓存中的第一个包不是startPacket类型,packet_type=" + sFReaderResponsePacket.getPacketType()));
            return;
        }
        if (sFReaderResponsePacket2.getPacketType() != 2 && sFReaderResponsePacket2.getPacketType() != 3 && sFReaderResponsePacket2.getPacketType() != 4) {
            SFLog.e(TAG, "⚠️⚠️⚠️SABLETaskBase收到的后续响应包类型错误: packetType=" + sFReaderResponsePacket2.getPacketType());
            return;
        }
        this.rspPackets.add(sFReaderResponsePacket2);
        if (sFReaderResponsePacket2.getPacketType() == 2) {
            this.receivedDataLength += sFReaderResponsePacket2.getData().length;
            if (this.receivedDataLength > this.totalDataLength) {
                stopTimer();
                String str = "❌收到的data总长(" + this.receivedDataLength + ")大于预计长度(" + this.totalDataLength + ",packet=" + this.rspPackets.size();
                SFLog.e(TAG, str);
                this.callback.bleTaskOnTaskCompete(this, false, new SFError(120, str));
                return;
            }
            this.callback.bleTaskOnProcess(this, this.receivedDataLength, this.totalDataLength);
            resumeCountDown();
            return;
        }
        if (sFReaderResponsePacket2.getPacketType() == 3) {
            resumeCountDown();
            if (this.receivedDataLength != this.totalDataLength) {
                stopTimer();
                String str2 = "❌收到的data总长(" + this.receivedDataLength + ")不等于预计长度(" + this.totalDataLength + "),packet=" + this.rspPackets.size();
                SFLog.e(TAG, str2);
                this.callback.bleTaskOnTaskCompete(this, false, new SFError(120, str2));
                return;
            }
            this.callback.bleTaskOnProcess(this, this.receivedDataLength, this.totalDataLength);
            SFLog.i(TAG, "start  write to file....");
            writeFile();
            return;
        }
        if (sFReaderResponsePacket2.getPacketType() == 4) {
            stopTimer();
            this.callback.bleTaskOnTaskCompete(this, true, null);
        }
    }

    private boolean writeFile() {
        String str;
        String str2;
        SFLog.i(TAG, "writeFile data len=" + this.receivedDataLength);
        String str3 = (System.currentTimeMillis() / 1000) + "";
        if (this.sendPacket.getCommandType() == 17) {
            str = "%s/%s.bin";
        } else if (this.sendPacket.getCommandType() != 35) {
            str = "%s/%s.txt";
        } else {
            str = "%s/%s.dump";
        }
        String format = String.format(str, this.rcvDir, str3);
        if (this.sendPacket.getCommandType() == 35 && (str2 = this.currentAudioDumpFileName) != null) {
            format = String.format("%s/%s", this.rcvDir, str2);
        }
        SFLog.i(TAG, "writeFile path=" + format);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(format);
            Iterator<SFReaderResponsePacket> it = this.rspPackets.iterator();
            while (it.hasNext()) {
                SFReaderResponsePacket next = it.next();
                if (next.getPacketType() == 2) {
                    fileOutputStream.write(next.getData());
                }
            }
            fileOutputStream.close();
            SFLog.i(TAG, "writeFile success.");
            this.rcvFileList.add(format);
            this.rspPackets.clear();
            return true;
        } catch (Exception e) {
            SFLog.e(TAG, "writeFile error" + e.toString());
            return false;
        }
    }

    public ArrayList<String> getRcvFileList() {
        return this.rcvFileList;
    }
}
