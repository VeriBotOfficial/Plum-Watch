package com.wakeup.common.network.entity.other;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class DeviceUpdataModel implements Serializable {
    private int confgFileSize;
    private String confgFileUrl;
    private int fileSize;
    private String fileUrl;
    private int forced;
    private String nextVersion;
    private String noteMsg;
    private int patchFileSize;
    private String patchFileUrl;
    private long releaseTime;
    private String updateMsg;
    private String userDataAddress;
    private int userDataSize;
    private String userDataUrl;

    public int getConfgFileSize() {
        return this.confgFileSize;
    }

    public void setConfgFileSize(int confgFileSize) {
        this.confgFileSize = confgFileSize;
    }

    public String getConfgFileUrl() {
        return this.confgFileUrl;
    }

    public void setConfgFileUrl(String confgFileUrl) {
        this.confgFileUrl = confgFileUrl;
    }

    public int getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getNextVersion() {
        return this.nextVersion;
    }

    public void setNextVersion(String nextVersion) {
        this.nextVersion = nextVersion;
    }

    public String getNoteMsg() {
        return this.noteMsg;
    }

    public void setNoteMsg(String noteMsg) {
        this.noteMsg = noteMsg;
    }

    public int getPatchFileSize() {
        return this.patchFileSize;
    }

    public void setPatchFileSize(int patchFileSize) {
        this.patchFileSize = patchFileSize;
    }

    public String getPatchFileUrl() {
        return this.patchFileUrl;
    }

    public void setPatchFileUrl(String patchFileUrl) {
        this.patchFileUrl = patchFileUrl;
    }

    public long getReleaseTime() {
        return this.releaseTime;
    }

    public void setReleaseTime(long releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getUpdateMsg() {
        return this.updateMsg;
    }

    public void setUpdateMsg(String updateMsg) {
        this.updateMsg = updateMsg;
    }

    public String getUserDataAddress() {
        return this.userDataAddress;
    }

    public void setUserDataAddress(String userDataAddress) {
        this.userDataAddress = userDataAddress;
    }

    public int getUserDataSize() {
        return this.userDataSize;
    }

    public void setUserDataSize(int userDataSize) {
        this.userDataSize = userDataSize;
    }

    public String getUserDataUrl() {
        return this.userDataUrl;
    }

    public void setUserDataUrl(String userDataUrl) {
        this.userDataUrl = userDataUrl;
    }

    public int getForced() {
        return this.forced;
    }

    public void setForced(int forced) {
        this.forced = forced;
    }
}
