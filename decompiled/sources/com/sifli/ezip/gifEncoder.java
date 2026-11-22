package com.sifli.ezip;

import android.graphics.Bitmap;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.net.telnet.TelnetCommand;

/* loaded from: classes12.dex */
public class gifEncoder {
    protected byte[] colorTab;
    protected int height;
    protected byte[] indexedPixels;
    protected OutputStream out;
    protected byte[] pixels;
    protected int width;
    protected int delay = 0;
    protected boolean[] usedEntry = new boolean[256];

    public void init(Bitmap bitmap) {
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
        getImagePixels(bitmap);
        analyzePixels();
    }

    public boolean start(OutputStream outputStream) {
        if (outputStream == null) {
            return false;
        }
        this.out = outputStream;
        try {
            writeHeader();
            writeLSD();
            writePalette();
            writeGraphicCtrlExt();
            writeImageDesc();
            writePalette();
            writePixels();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean start(String str) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
            this.out = bufferedOutputStream;
            return start(bufferedOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addFrame(Bitmap bitmap) {
        try {
            getImagePixels(bitmap);
            analyzePixels();
            writeGraphicCtrlExt();
            writeImageDesc();
            writePalette();
            writePixels();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean finish() {
        try {
            this.out.write(59);
            this.out.flush();
            this.out.close();
            this.out = null;
            this.pixels = null;
            this.indexedPixels = null;
            this.colorTab = null;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void setFrameRate(float f) {
        if (f != 0.0f) {
            this.delay = Math.round(100.0f / f);
        }
    }

    protected void analyzePixels() {
        int length = this.pixels.length;
        int i = length / 3;
        this.indexedPixels = new byte[i];
        NeuQuant neuQuant = new NeuQuant(this.pixels, length, 10);
        this.colorTab = neuQuant.process();
        int i2 = 0;
        while (true) {
            byte[] bArr = this.colorTab;
            if (i2 >= bArr.length) {
                break;
            }
            byte b = bArr[i2];
            int i3 = i2 + 2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b;
            this.usedEntry[i2 / 3] = false;
            i2 += 3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            byte[] bArr2 = this.pixels;
            int i6 = bArr2[i4] & 255;
            int i7 = i4 + 2;
            int i8 = bArr2[i4 + 1] & 255;
            i4 += 3;
            int map = neuQuant.map(i6, i8, bArr2[i7] & 255);
            this.usedEntry[map] = true;
            this.indexedPixels[i5] = (byte) map;
        }
        this.pixels = null;
    }

    protected void getImagePixels(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.pixels = new byte[width * height * 3];
        for (int i = 0; i < height; i++) {
            int i2 = width * 3 * i;
            for (int i3 = 0; i3 < width; i3++) {
                int pixel = bitmap.getPixel(i3, i);
                int i4 = (i3 * 3) + i2;
                byte[] bArr = this.pixels;
                bArr[i4] = (byte) (pixel & 255);
                bArr[i4 + 1] = (byte) ((65280 & pixel) >> 8);
                bArr[i4 + 2] = (byte) ((pixel & 16711680) >> 16);
            }
        }
    }

    protected void writeHeader() throws IOException {
        writeString("GIF89a");
    }

    protected void writeGraphicCtrlExt() throws IOException {
        this.out.write(33);
        this.out.write(TelnetCommand.GA);
        this.out.write(4);
        this.out.write(0);
        writeShort(this.delay);
        this.out.write(0);
        this.out.write(0);
    }

    protected void writeImageDesc() throws IOException {
        this.out.write(44);
        writeShort(0);
        writeShort(0);
        writeShort(this.width);
        writeShort(this.height);
        this.out.write(135);
    }

    protected void writeLSD() throws IOException {
        writeShort(this.width);
        writeShort(this.height);
        this.out.write(247);
        this.out.write(0);
        this.out.write(0);
    }

    protected void writePalette() throws IOException {
        OutputStream outputStream = this.out;
        byte[] bArr = this.colorTab;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.colorTab.length;
        for (int i = 0; i < length; i++) {
            this.out.write(0);
        }
    }

    protected void writePixels() throws IOException {
        new LZWEncoder(this.width, this.height, this.indexedPixels, 8).encode(this.out);
    }

    protected void writeShort(int i) throws IOException {
        this.out.write(i & 255);
        this.out.write((i >> 8) & 255);
    }

    protected void writeString(String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            this.out.write((byte) str.charAt(i));
        }
    }
}
