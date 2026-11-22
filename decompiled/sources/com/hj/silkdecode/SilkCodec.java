package com.hj.silkdecode;

import android.media.AudioTrack;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes11.dex */
public class SilkCodec {
    public static final int PLAY_COMPLETE_STATE = 2;
    public static final int PLAY_ERROR_STATE = -1;
    public static final int PLAY_ING_STATE = 1;
    public static final int PLAY_START_STATE = 0;
    private static AudioTrack mAudioTrack;
    private static int mBufferSizeInBytes = AudioTrack.getMinBufferSize(44100, 4, 2);
    public static final byte[] HEADER = {2, 35, BuiltinOptions.ExpOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.RankOptions, BuiltinOptions.TileOptions};

    public interface OnSilkPlayListener {
        void onPlayState(int i);
    }

    public static native short[] decode(byte[] bArr);

    public static native int decode2(byte[] bArr, short s, short[] sArr);

    public static native void destroyDecoder();

    public static native void destroyEncoder();

    public static native byte[] encode(short[] sArr);

    public static native int initDecoder(int i);

    public static native int initEncoder(int i, int i2);

    static {
        System.loadLibrary("silkDecode");
    }

    public static void playSilk(String str, OnSilkPlayListener onSilkPlayListener) {
        DataInputStream dataInputStream;
        byte[] bArr;
        int decode2;
        AudioTrack audioTrack;
        mAudioTrack = new AudioTrack(3, 44100, 4, 2, mBufferSizeInBytes, 1);
        try {
            dataInputStream = new DataInputStream(new FileInputStream(new File(str)));
            bArr = new byte[10];
            dataInputStream.read(bArr);
        } catch (EOFException e) {
            onSilkPlayListener.onPlayState(-1);
            Log.e("SilkCodec", "playSilk  e: " + e.getMessage());
        } catch (Exception e2) {
            onSilkPlayListener.onPlayState(-1);
            Log.e("SilkCodec", "playSilk  e: " + e2.getMessage());
        }
        if (!Arrays.equals(bArr, HEADER)) {
            Log.e("SilkCodec", "playSilk  不是silk文件");
            onSilkPlayListener.onPlayState(-1);
            return;
        }
        byte[] bArr2 = new byte[1024];
        short[] sArr = new short[8192];
        initDecoder(44100);
        mAudioTrack.play();
        onSilkPlayListener.onPlayState(0);
        boolean z = false;
        while (true) {
            short reverseBytes = Short.reverseBytes(dataInputStream.readShort());
            if (reverseBytes <= 0 || dataInputStream.read(bArr2, 0, reverseBytes) != reverseBytes || (decode2 = decode2(bArr2, reverseBytes, sArr)) <= 0 || (audioTrack = mAudioTrack) == null) {
                break;
            }
            audioTrack.write(sArr, 0, decode2);
            if (!z) {
                z = true;
                onSilkPlayListener.onPlayState(1);
            }
        }
        dataInputStream.close();
        AudioTrack audioTrack2 = mAudioTrack;
        if (audioTrack2 != null) {
            audioTrack2.stop();
            mAudioTrack.release();
            mAudioTrack = null;
        }
        destroyDecoder();
    }

    public void main2(String str, String str2) {
        DataInputStream dataInputStream;
        DataOutputStream dataOutputStream;
        byte[] bArr;
        try {
            dataInputStream = new DataInputStream(new FileInputStream(new File(str)));
            dataOutputStream = new DataOutputStream(new FileOutputStream(str2));
            bArr = new byte[10];
            dataInputStream.read(bArr);
        } catch (FileNotFoundException unused) {
            System.err.println("Failed to FileNotFoundException e: ");
        } catch (IOException unused2) {
            System.err.println("Failed to IOException e: ");
        }
        if (Arrays.equals(bArr, HEADER)) {
            byte[] bArr2 = new byte[1024];
            new ArrayList();
            initDecoder(44100);
            while (true) {
                short reverseBytes = Short.reverseBytes(dataInputStream.readShort());
                if (reverseBytes <= 0) {
                    break;
                }
                if (dataInputStream.read(bArr2, 0, reverseBytes) != reverseBytes) {
                    break;
                }
                for (short s : decode(bArr2)) {
                    dataOutputStream.writeShort(s);
                }
            }
            dataOutputStream.close();
            dataInputStream.close();
            destroyEncoder();
            destroyDecoder();
        }
    }

    public static boolean isPlaying() {
        AudioTrack audioTrack = mAudioTrack;
        return audioTrack != null && audioTrack.getPlayState() == 3;
    }

    public static void stopPlay() {
        AudioTrack audioTrack = mAudioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
            mAudioTrack.release();
            mAudioTrack = null;
        }
    }
}
