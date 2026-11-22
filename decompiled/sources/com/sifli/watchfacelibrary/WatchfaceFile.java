package com.sifli.watchfacelibrary;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.apache.commons.codec.language.bm.Languages;

/* loaded from: classes17.dex */
public class WatchfaceFile implements Parcelable {
    public static final Parcelable.Creator<WatchfaceFile> CREATOR = new Parcelable.Creator<WatchfaceFile>() { // from class: com.sifli.watchfacelibrary.WatchfaceFile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchfaceFile createFromParcel(Parcel parcel) {
            return new WatchfaceFile(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchfaceFile[] newArray(int i) {
            return new WatchfaceFile[i];
        }
    };
    private static final String TAG = "watchfaceFile";
    private byte[] fileData;
    private String fileExtension;
    private String fileName;
    private String filePath;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public WatchfaceFile(String str, byte[] bArr) {
        this.filePath = str;
        this.fileData = bArr;
    }

    public WatchfaceFile(String str, byte[] bArr, String str2) {
        this.filePath = str;
        this.fileData = bArr;
        this.fileName = str2;
        int indexOf = str2.indexOf(".");
        if (indexOf == -1) {
            this.fileExtension = Languages.ANY;
            return;
        }
        String substring = str2.substring(indexOf + 1);
        this.fileExtension = substring;
        substring.toLowerCase();
    }

    protected WatchfaceFile(Parcel parcel) {
        this.filePath = parcel.readString();
        this.fileData = parcel.createByteArray();
        this.fileName = parcel.readString();
        this.fileExtension = parcel.readString();
    }

    public String getFilePath() {
        return this.filePath;
    }

    public byte[] getFileData() {
        return this.fileData;
    }

    public String getFileExtension() {
        return this.fileExtension;
    }

    public void setFileData(byte[] bArr) {
        this.fileData = bArr;
    }

    public void makeAlignment() {
        int length = this.fileData.length;
        int i = length % 4;
        if (i == 0) {
            return;
        }
        int i2 = 4 - i;
        byte[] bArr = new byte[length + i2];
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = 0;
        }
        System.arraycopy(this.fileData, 0, bArr, 0, length);
        System.arraycopy(bArr2, 0, bArr, length, i2);
        this.fileData = bArr;
    }

    public void makeAlignment(int i) {
        byte b;
        int length = this.fileData.length;
        int i2 = length % 4;
        if (i == 5) {
            Log.d(TAG, "align with 0x20");
            b = 32;
        } else {
            b = 0;
        }
        if (i2 == 0) {
            return;
        }
        int i3 = 4 - i2;
        byte[] bArr = new byte[length + i3];
        byte[] bArr2 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i4] = b;
        }
        System.arraycopy(this.fileData, 0, bArr, 0, length);
        System.arraycopy(bArr2, 0, bArr, length, i3);
        this.fileData = bArr;
    }

    public void addCRC() {
        int CRC32MPEG2GetValue = CRC32MPEG2.CRC32MPEG2GetValue(this.fileData);
        byte[] bArr = this.fileData;
        byte[] bArr2 = new byte[bArr.length + 4];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        WatchfaceUtil.addIntToByteArray(CRC32MPEG2GetValue, bArr2, this.fileData.length);
        this.fileData = bArr2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filePath);
        parcel.writeByteArray(this.fileData);
        parcel.writeString(this.fileName);
        parcel.writeString(this.fileExtension);
    }
}
