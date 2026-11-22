package com.compress.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes14.dex */
public class ImageConvertTool {
    private static final String TAG = "DialConvertTool_ImageConvertTool";
    private static ImageConvertTool instance;
    private static final int[] tileWidthSupport = {4, 6, 8, 16};
    private byte[] compressData;
    private Bitmap image;
    private int mDataLength;
    private BinHeader binHeader = new BinHeader();
    private List<SeekInfo> seekInfo = new ArrayList();
    private List<ImageHeader> imageHeader = new ArrayList();
    private List<BsData> imageData = new ArrayList();
    private int imageNum = 0;
    private List<String> isConvertedFile = new ArrayList();
    private int markCurOffset = 0;
    private int width = 0;
    private int height = 0;
    private boolean fileAlpha = false;
    private String cmpMode = "HFBC";
    private String colorFmt = " ";
    private int align = 1;
    private int tileWidth = 6;
    private int modeAlpha = 1;
    private int modeRgb = 1;
    private int autoCmpMode = 0;
    private int highQualityMode = 0;
    private int highCmpRatioMode = 0;
    private int version = 1;

    public static synchronized ImageConvertTool getInstance() {
        ImageConvertTool imageConvertTool;
        synchronized (ImageConvertTool.class) {
            if (instance == null) {
                instance = new ImageConvertTool();
            }
            imageConvertTool = instance;
        }
        return imageConvertTool;
    }

    public ImageConvertTool() {
        this.binHeader.setDirId(4079);
        initWatchFaceImageData();
    }

    public void setTileWidth(int i) {
        for (int i2 : tileWidthSupport) {
            if (i == i2) {
                this.tileWidth = i;
                return;
            }
        }
        throw new IllegalArgumentException("The tile_width value is not supported.");
    }

    private void initWatchFaceImageData() {
        WatchFaceImageUtil.getInstance().setOnWatchOnclickListener(new OnWatchFaceImageListener() { // from class: com.compress.utils.ImageConvertTool.1
            @Override // com.compress.utils.OnWatchFaceImageListener
            public void compressRets(int i, int i2, int i3, byte[] bArr, File file) {
                Log.i(ImageConvertTool.TAG, "compressRets complete");
                ImageConvertTool.this.mDataLength = bArr.length;
                ImageConvertTool.this.compressData = bArr;
            }

            @Override // com.compress.utils.OnWatchFaceImageListener
            public void deCompressRets(int i, int i2, DecompressRet2 decompressRet2, Bitmap bitmap) {
                Log.i(ImageConvertTool.TAG, "deCompressRets complete");
            }
        });
    }

    private int convert(Bitmap bitmap) {
        Log.i(TAG, "convert");
        this.image = bitmap;
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
        int i = this.width;
        int i2 = this.align;
        int i3 = ((i + i2) - 1) / i2;
        this.fileAlpha = bitmap.getConfig() == Bitmap.Config.ARGB_8888;
        CmpInput cmpInput = new CmpInput();
        getCmpInput(cmpInput);
        AutoCmpInput autoCmpInput = new AutoCmpInput();
        autoCmpInput.setAutoCmpMode(this.autoCmpMode);
        autoCmpInput.setHighQualityMode(this.highQualityMode);
        autoCmpInput.setHighCmpRatioMode(this.highCmpRatioMode);
        autoCmpInput.setCmpInput(cmpInput);
        WatchFaceImageUtil.getInstance();
        WatchFaceImageUtil.compress(bitmap);
        BinHeader binHeader = this.binHeader;
        binHeader.setCount(binHeader.getCount() + 1);
        ImageHeader imageHeader = new ImageHeader();
        imageHeader.setWidth(this.width);
        imageHeader.setHeight(this.height);
        imageHeader.setColorMode(getColorMode());
        imageHeader.setVersion(1);
        imageHeader.setCompressMode(4);
        imageHeader.setReserved(0);
        SeekInfo seekInfo = new SeekInfo();
        seekInfo.setOffset(this.markCurOffset);
        seekInfo.setSize(this.mDataLength);
        this.markCurOffset += this.mDataLength;
        this.seekInfo.add(seekInfo);
        this.imageHeader.add(imageHeader);
        BsData bsData = new BsData();
        bsData.bsData = this.compressData;
        bsData.dataSize = this.compressData.length;
        this.imageData.add(bsData);
        Log.i(TAG, "imageNum old: " + this.imageNum);
        this.imageNum++;
        Log.i(TAG, "imageNum new: " + this.imageNum);
        return this.imageNum;
    }

    private boolean checkPath(String str) {
        File file = new File(str);
        if (!file.exists()) {
            System.out.println("[ERROR]: " + str + " is not exist");
            return false;
        }
        String lowerCase = file.getName().substring(file.getName().lastIndexOf(46) + 1).toLowerCase();
        if (lowerCase.equals("png") || lowerCase.equals("jpg") || lowerCase.equals("bmp")) {
            return true;
        }
        System.out.println("[ERROR]: " + str + " is not jpg or png or bmp format image");
        return false;
    }

    public int convertImg(String str) {
        Log.i(TAG, "convertImg path: " + str);
        if (this.isConvertedFile.contains(str)) {
            Log.e(TAG, "isConvertedFile contains");
            return this.isConvertedFile.indexOf(str) + 1;
        }
        if (!checkPath(str)) {
            Log.e(TAG, "checkPath is null");
            return -1;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            Log.i(TAG, "image is null");
            return -1;
        }
        if (decodeFile.getConfig() == Bitmap.Config.ARGB_8888) {
            this.colorFmt = "ARGB8888";
        } else if (decodeFile.getConfig() == Bitmap.Config.RGB_565) {
            this.colorFmt = "RGB565";
        } else {
            this.colorFmt = "RGB888";
        }
        this.isConvertedFile.add(str);
        return convert(decodeFile);
    }

    private int getCmpPxFormat() {
        if (this.colorFmt.equals("RGB565")) {
            return 2;
        }
        if (this.colorFmt.equals("RGB888")) {
            return 0;
        }
        return this.colorFmt.equals("ARGB8888") ? 1 : -1;
    }

    private int getColorMode() {
        if (this.colorFmt.equals("RGB565")) {
            return 2;
        }
        if (this.colorFmt.equals("RGB888")) {
            return 1;
        }
        return this.colorFmt.equals("ARGB8888") ? 0 : -1;
    }

    private void getCmpInput(CmpInput cmpInput) {
        cmpInput.setWidth(this.width);
        cmpInput.setHeight(this.height);
        cmpInput.setStride(this.width);
        cmpInput.setTileWidth(this.tileWidth);
        cmpInput.setModeAlpha(this.modeAlpha);
        cmpInput.setModeRgb(this.modeRgb);
        cmpInput.setPixelFormat(getCmpPxFormat());
        int i = this.width;
        int i2 = this.height;
        int i3 = i * i2;
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i3];
        int[] iArr = new int[i3];
        this.image.getPixels(iArr, 0, i, 0, 0, i, i2);
        for (int i4 = 0; i4 < this.height; i4++) {
            int i5 = 0;
            while (true) {
                int i6 = this.width;
                if (i5 < i6) {
                    int i7 = iArr[(i4 * i6) + i5];
                    bArr[(i4 * i6) + i5] = (byte) ((i7 >> 16) & 255);
                    bArr2[(i4 * i6) + i5] = (byte) ((i7 >> 8) & 255);
                    bArr3[(i4 * i6) + i5] = (byte) (i7 & 255);
                    bArr4[(i6 * i4) + i5] = this.fileAlpha ? (byte) ((i7 >> 24) & 255) : (byte) -1;
                    i5++;
                }
            }
        }
        cmpInput.setRedChannel(bArr);
        cmpInput.setGreenChannel(bArr2);
        cmpInput.setBlueChannel(bArr3);
        cmpInput.setAlphaChannel(bArr4);
    }

    private byte[] convertBitmapToBytes(Bitmap bitmap) {
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(allocate);
        return allocate.array();
    }

    public void writeDataToBin(DataOutputStream dataOutputStream) throws IOException {
        StringBuilder sb = new StringBuilder("binHeader.toByteArray(): ");
        new DialConvertTool();
        Log.i(TAG, sb.append(DialConvertTool.bytesToHex(this.binHeader.toByteArray())).toString());
        dataOutputStream.write(this.binHeader.toByteArray());
        for (SeekInfo seekInfo : this.seekInfo) {
            StringBuilder sb2 = new StringBuilder("seek.toByteArray(): ");
            new DialConvertTool();
            Log.i(TAG, sb2.append(DialConvertTool.bytesToHex(seekInfo.toByteArray())).toString());
            dataOutputStream.write(seekInfo.toByteArray());
        }
        Log.i(TAG, "imageNum: " + this.imageNum);
        Log.i(TAG, "imageData: " + this.imageData.size());
        for (int i = 0; i < this.imageNum; i++) {
            ByteBuffer allocate = ByteBuffer.allocate(this.imageData.get(i).dataSize);
            allocate.put(this.imageData.get(i).bsData);
            dataOutputStream.write(allocate.array());
        }
        EventBus.getDefault().post("watchFaceImageComplete");
    }

    private long getHeader(int i) {
        long j;
        long colorMode = getColorMode() | (this.imageHeader.get(i).width << 32) | (this.imageHeader.get(i).height << 48) | (this.imageHeader.get(i).version << 8);
        if (this.cmpMode.equals("HFBC")) {
            j = 16384;
        } else {
            if (!this.cmpMode.equals("HFBC_ABYPASS")) {
                return colorMode;
            }
            j = 20480;
        }
        return colorMode | j;
    }

    public long getSize() {
        long length = this.binHeader.toByteArray().length + (this.seekInfo.size() * 8);
        for (int i = 0; i < this.imageNum; i++) {
            length += this.imageData.get(i).dataSize + 8;
        }
        return length;
    }

    public void clear() {
        this.binHeader.count = 0;
        this.seekInfo.clear();
        this.imageHeader.clear();
        this.imageData.clear();
        this.imageNum = 0;
        this.isConvertedFile.clear();
        this.markCurOffset = 0;
    }

    static class Header {
        private int height;
        private int modeAlpha;
        private int modeRgb;
        private int pixelFormat;
        private int stride;
        private int tileWidth;
        private int width;

        public Header() {
        }

        public Header(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.width = i;
            this.height = i2;
            this.stride = i3;
            this.pixelFormat = i4;
            this.tileWidth = i5;
            this.modeAlpha = i6;
            this.modeRgb = i7;
        }

        public int getWidth() {
            return this.width;
        }

        public void setWidth(int i) {
            this.width = i;
        }

        public int getHeight() {
            return this.height;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public int getStride() {
            return this.stride;
        }

        public void setStride(int i) {
            this.stride = i;
        }

        public int getPixelFormat() {
            return this.pixelFormat;
        }

        public void setPixelFormat(int i) {
            this.pixelFormat = i;
        }

        public int getTileWidth() {
            return this.tileWidth;
        }

        public void setTileWidth(int i) {
            this.tileWidth = i;
        }

        public int getModeAlpha() {
            return this.modeAlpha;
        }

        public void setModeAlpha(int i) {
            this.modeAlpha = i;
        }

        public int getModeRgb() {
            return this.modeRgb;
        }

        public void setModeRgb(int i) {
            this.modeRgb = i;
        }
    }

    static class BsData {
        private byte[] bsData;
        private int cmpRatio;
        private int dataSize;
        private int isValid;
        private Header para;
        private int subjectiveReview;

        public BsData() {
        }

        public BsData(byte[] bArr, int i, int i2, int i3, int i4, Header header) {
            this.bsData = bArr;
            this.dataSize = i;
            this.cmpRatio = i2;
            this.isValid = i3;
            this.subjectiveReview = i4;
            this.para = header;
        }

        public byte[] getBsData() {
            return this.bsData;
        }

        public void setBsData(byte[] bArr) {
            this.bsData = bArr;
        }

        public int getDataSize() {
            return this.dataSize;
        }

        public void setDataSize(int i) {
            this.dataSize = i;
        }

        public int getCmpRatio() {
            return this.cmpRatio;
        }

        public void setCmpRatio(int i) {
            this.cmpRatio = i;
        }

        public int getIsValid() {
            return this.isValid;
        }

        public void setIsValid(int i) {
            this.isValid = i;
        }

        public int getSubjectiveReview() {
            return this.subjectiveReview;
        }

        public void setSubjectiveReview(int i) {
            this.subjectiveReview = i;
        }

        public Header getPara() {
            return this.para;
        }

        public void setPara(Header header) {
            this.para = header;
        }
    }

    public static class CmpInput {
        public byte[] alphaChannel;
        public byte[] blueChannel;
        public byte[] greenChannel;
        public int height;
        public int modeAlpha;
        public int modeRgb;
        public int pixelFormat;
        public byte[] redChannel;
        public int stride;
        public int tileWidth;
        public int width;

        public void setWidth(int i) {
            this.width = i;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public void setStride(int i) {
            this.stride = i;
        }

        public void setTileWidth(int i) {
            this.tileWidth = i;
        }

        public void setModeAlpha(int i) {
            this.modeAlpha = i;
        }

        public void setModeRgb(int i) {
            this.modeRgb = i;
        }

        public void setPixelFormat(int i) {
            this.pixelFormat = i;
        }

        public void setRedChannel(byte[] bArr) {
            this.redChannel = bArr;
        }

        public void setGreenChannel(byte[] bArr) {
            this.greenChannel = bArr;
        }

        public void setBlueChannel(byte[] bArr) {
            this.blueChannel = bArr;
        }

        public void setAlphaChannel(byte[] bArr) {
            this.alphaChannel = bArr;
        }
    }

    public static class AutoCmpInput {
        public int autoCmpMode;
        public CmpInput cmpInput;
        public int highCmpRatioMode;
        public int highQualityMode;

        public void setAutoCmpMode(int i) {
            this.autoCmpMode = i;
        }

        public void setHighQualityMode(int i) {
            this.highQualityMode = i;
        }

        public void setHighCmpRatioMode(int i) {
            this.highCmpRatioMode = i;
        }

        public void setCmpInput(CmpInput cmpInput) {
            this.cmpInput = cmpInput;
        }
    }

    public static class AutoCmpOutput {
        public byte[] compressedData;

        public void setCompressedData(byte[] bArr) {
            this.compressedData = bArr;
        }
    }

    static class BinHeader {
        private int count;
        private int dirId;

        public BinHeader() {
        }

        public BinHeader(int i, int i2) {
            this.dirId = i;
            this.count = i2;
        }

        public int getDirId() {
            return this.dirId;
        }

        public void setDirId(int i) {
            this.dirId = i;
        }

        public int getCount() {
            return this.count;
        }

        public void setCount(int i) {
            this.count = i;
        }

        public byte[] toByteArray() {
            ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
            order.putInt(this.dirId);
            order.putInt(this.count);
            return order.array();
        }
    }

    static class SeekInfo {
        private int offset;
        private int size;

        public SeekInfo() {
        }

        public SeekInfo(int i, int i2) {
            this.offset = i;
            this.size = i2;
        }

        public int getOffset() {
            return this.offset;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public int getSize() {
            return this.size;
        }

        public void setSize(int i) {
            this.size = i;
        }

        public byte[] toByteArray() {
            ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
            order.putInt(this.offset);
            order.putInt(this.size);
            return order.array();
        }
    }

    static class ImageHeader {
        public int width = 0;
        public int height = 0;
        public int colorMode = 0;
        public int version = 1;
        public int compressMode = 4;
        public int reserved = 0;

        public int getSize() {
            return 16;
        }

        public void setWidth(int i) {
            this.width = i;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public void setColorMode(int i) {
            this.colorMode = i;
        }

        public void setVersion(int i) {
            this.version = i;
        }

        public void setCompressMode(int i) {
            this.compressMode = i;
        }

        public void setReserved(int i) {
            this.reserved = i;
        }

        public byte[] toByteArray() {
            ByteBuffer order = ByteBuffer.allocate(16).order(ByteOrder.LITTLE_ENDIAN);
            order.putInt(this.width);
            order.putInt(this.height);
            order.putInt(this.colorMode);
            order.putInt(this.version);
            return order.array();
        }
    }
}
