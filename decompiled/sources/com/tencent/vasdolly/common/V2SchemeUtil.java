package com.tencent.vasdolly.common;

import com.tencent.vasdolly.common.apk.ApkSigningBlockUtils;
import com.tencent.vasdolly.common.apk.SignatureNotFoundException;
import com.tencent.vasdolly.common.apk.ZipUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class V2SchemeUtil {
    public static final int APK_SIGNATURE_SCHEME_V2_BLOCK_ID = 1896449818;

    public static Map<Integer, ByteBuffer> getAllIdValue(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        ApkSigningBlockUtils.checkByteOrderLittleEndian(byteBuffer);
        ByteBuffer sliceFromTo = ApkSigningBlockUtils.sliceFromTo(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (sliceFromTo.hasRemaining()) {
            i++;
            if (sliceFromTo.remaining() < 8) {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j = sliceFromTo.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int position = sliceFromTo.position() + i2;
            if (i2 > sliceFromTo.remaining()) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + sliceFromTo.remaining());
            }
            linkedHashMap.put(Integer.valueOf(sliceFromTo.getInt()), ApkSigningBlockUtils.getByteBuffer(sliceFromTo, i2 - 4));
            sliceFromTo.position(position);
        }
        if (linkedHashMap.isEmpty()) {
            throw new SignatureNotFoundException("not have Id-Value Pair in APK Signing Block entry #" + i);
        }
        return linkedHashMap;
    }

    public static ByteBuffer getApkSigningBlock(File file) throws SignatureNotFoundException, IOException {
        RandomAccessFile randomAccessFile = null;
        if (file == null || !file.exists() || !file.isFile()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                Pair<ByteBuffer, Long> eocd = ApkSigningBlockUtils.getEocd(randomAccessFile2);
                ByteBuffer first = eocd.getFirst();
                long longValue = eocd.getSecond().longValue();
                if (ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile2, longValue)) {
                    throw new SignatureNotFoundException("ZIP64 APK not supported");
                }
                ByteBuffer first2 = ApkSigningBlockUtils.findApkSigningBlock(randomAccessFile2, ApkSigningBlockUtils.getCentralDirOffset(first, longValue)).getFirst();
                randomAccessFile2.close();
                return first2;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static ApkSectionInfo getApkSectionInfo(File file, boolean z) throws IOException, SignatureNotFoundException {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                Pair<ByteBuffer, Long> eocd = ApkSigningBlockUtils.getEocd(randomAccessFile2);
                ByteBuffer first = eocd.getFirst();
                long longValue = eocd.getSecond().longValue();
                if (ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile2, longValue)) {
                    throw new SignatureNotFoundException("ZIP64 APK not supported");
                }
                long centralDirOffset = ApkSigningBlockUtils.getCentralDirOffset(first, longValue);
                Pair<ByteBuffer, Long> findApkSigningBlock = ApkSigningBlockUtils.findApkSigningBlock(randomAccessFile2, centralDirOffset);
                Pair<ByteBuffer, Long> findCentralDir = findCentralDir(randomAccessFile2, centralDirOffset, (int) (longValue - centralDirOffset));
                ApkSectionInfo apkSectionInfo = new ApkSectionInfo();
                apkSectionInfo.apkSize = file.length();
                apkSectionInfo.lowMemory = z;
                if (apkSectionInfo.apkSize > ApkSectionInfo.COPY_CONTENT_MAX_SIZE) {
                    apkSectionInfo.lowMemory = true;
                }
                if (!apkSectionInfo.lowMemory) {
                    apkSectionInfo.contentEntry = findContentEntry(randomAccessFile2, (int) findApkSigningBlock.getSecond().longValue());
                }
                apkSectionInfo.apkSigningBlock = findApkSigningBlock;
                apkSectionInfo.centralDir = findCentralDir;
                apkSectionInfo.eocd = eocd;
                apkSectionInfo.checkParamters();
                System.out.println("baseApk : " + file.getAbsolutePath() + "\nApkSectionInfo = " + apkSectionInfo);
                randomAccessFile2.close();
                return apkSectionInfo;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Pair<ByteBuffer, Long> findCentralDir(RandomAccessFile randomAccessFile, long j, int i) throws IOException {
        return Pair.create(getByteBuffer(randomAccessFile, j, i), Long.valueOf(j));
    }

    public static Pair<ByteBuffer, Long> findContentEntry(RandomAccessFile randomAccessFile, int i) throws IOException {
        return Pair.create(getByteBuffer(randomAccessFile, 0L, i), 0L);
    }

    private static ByteBuffer getByteBuffer(RandomAccessFile randomAccessFile, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.seek(j);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        return allocate;
    }

    public static ByteBuffer generateApkSigningBlock(Map<Integer, ByteBuffer> map) {
        if (map == null || map.isEmpty()) {
            throw new RuntimeException("getNewApkV2SchemeBlock , id value pair is empty");
        }
        long j = 24;
        while (map.entrySet().iterator().hasNext()) {
            j += r0.next().getValue().remaining() + 12;
        }
        boolean containsKey = map.containsKey(Integer.valueOf(ApkSigningBlockUtils.VERITY_PADDING_BLOCK_ID));
        System.out.println("generateApkSigningBlock , needPadding = " + containsKey);
        if (containsKey) {
            j -= map.get(Integer.valueOf(ApkSigningBlockUtils.VERITY_PADDING_BLOCK_ID)).remaining() + 12;
            map.remove(Integer.valueOf(ApkSigningBlockUtils.VERITY_PADDING_BLOCK_ID));
            int i = (int) ((j + 8) % 4096);
            if (i != 0) {
                int i2 = 4096 - i;
                if (i2 < 12) {
                    i2 = 8192 - i;
                }
                j += i2;
                int i3 = i2 - 12;
                map.put(Integer.valueOf(ApkSigningBlockUtils.VERITY_PADDING_BLOCK_ID), ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN));
                System.out.println("generateApkSigningBlock , final length = " + j + " padding = " + i2 + " bufferSize = " + i3);
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate((int) (8 + j));
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putLong(j);
        for (Map.Entry<Integer, ByteBuffer> entry : map.entrySet()) {
            ByteBuffer value = entry.getValue();
            allocate.putLong(value.remaining() + 4);
            allocate.putInt(entry.getKey().intValue());
            allocate.put(value.array(), value.arrayOffset() + value.position(), value.remaining());
        }
        allocate.putLong(j);
        allocate.putLong(ApkSigningBlockUtils.APK_SIG_BLOCK_MAGIC_LO);
        allocate.putLong(ApkSigningBlockUtils.APK_SIG_BLOCK_MAGIC_HI);
        if (allocate.remaining() > 0) {
            throw new RuntimeException("generateNewApkV2SchemeBlock error");
        }
        allocate.flip();
        return allocate;
    }

    public static boolean containV2Signature(File file) {
        try {
            return getAllIdValue(getApkSigningBlock(file)).containsKey(Integer.valueOf(APK_SIGNATURE_SCHEME_V2_BLOCK_ID));
        } catch (SignatureNotFoundException unused) {
            System.out.println("APK : " + file.getAbsolutePath() + " not have apk v2 signature block");
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
