package com.sifli.siflidfu;

import org.apache.commons.codec.language.bm.Languages;

/* loaded from: classes15.dex */
public class OTAFile {
    private byte[] fileData;
    private String fileExtension;
    private int fileIndex;
    private String fileName;
    private int fileOrder;
    private String filePath;
    private int imageID;
    private String listName;

    public String getFileExtension() {
        return this.fileExtension;
    }

    public OTAFile(byte[] bArr, String str) {
        this.fileData = bArr;
        this.fileName = str;
    }

    public OTAFile(String str, byte[] bArr, String str2) {
        this.filePath = str;
        this.fileData = bArr;
        this.fileName = str2;
        this.imageID = -2;
        int indexOf = str2.indexOf(".");
        if (indexOf == -1) {
            this.fileExtension = Languages.ANY;
            this.listName = str2;
            return;
        }
        String substring = str2.substring(indexOf + 1);
        this.fileExtension = substring;
        substring.toLowerCase();
        this.listName = str2.substring(0, indexOf - 4);
        this.listName += "." + this.fileExtension;
    }

    public OTAFile(byte[] bArr, int i) {
        this.fileData = bArr;
        this.imageID = i;
    }

    public int getFileLength() {
        byte[] bArr = this.fileData;
        if (bArr == null) {
            return FileProcess.getFileSize(this.filePath);
        }
        return bArr.length;
    }

    public void setFileIndex(int i) {
        this.fileIndex = i;
    }

    public byte[] getFileData() {
        return this.fileData;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public int getFileIndex() {
        return this.fileIndex;
    }

    public void setImageID(int i) {
        this.imageID = i;
    }

    public int getImageID() {
        return this.imageID;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getListName() {
        return this.listName;
    }
}
