package androidx.browser.trusted;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class TokenContents {
    private final byte[] mContents;
    private List<byte[]> mFingerprints;
    private String mPackageName;

    static TokenContents deserialize(byte[] bArr) {
        return new TokenContents(bArr);
    }

    private TokenContents(byte[] bArr) {
        this.mContents = bArr;
    }

    static TokenContents create(String str, List<byte[]> list) throws IOException {
        return new TokenContents(createToken(str, list), str, list);
    }

    private TokenContents(byte[] bArr, String str, List<byte[]> list) {
        this.mContents = bArr;
        this.mPackageName = str;
        this.mFingerprints = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.mFingerprints.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public String getPackageName() throws IOException {
        parseIfNeeded();
        String str = this.mPackageName;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int getFingerprintCount() throws IOException {
        parseIfNeeded();
        List<byte[]> list = this.mFingerprints;
        if (list == null) {
            throw new IllegalStateException();
        }
        return list.size();
    }

    public byte[] getFingerprint(int r3) throws IOException {
        parseIfNeeded();
        List<byte[]> list = this.mFingerprints;
        if (list == null) {
            throw new IllegalStateException();
        }
        return Arrays.copyOf(list.get(r3), this.mFingerprints.get(r3).length);
    }

    public byte[] serialize() {
        byte[] bArr = this.mContents;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.mContents, ((TokenContents) obj).mContents);
    }

    public int hashCode() {
        return Arrays.hashCode(this.mContents);
    }

    private static byte[] createToken(String str, List<byte[]> list) throws IOException {
        Collections.sort(list, new Comparator() { // from class: androidx.browser.trusted.TokenContents$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareByteArrays(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int r1 = 0; r1 < Math.min(bArr.length, bArr2.length); r1++) {
            byte b = bArr[r1];
            byte b2 = bArr2[r1];
            if (b != b2) {
                return b - b2;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    private void parseIfNeeded() throws IOException {
        if (this.mPackageName != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.mContents));
        this.mPackageName = dataInputStream.readUTF();
        int r1 = dataInputStream.readInt();
        this.mFingerprints = new ArrayList(r1);
        for (int r2 = 0; r2 < r1; r2++) {
            int r3 = dataInputStream.readInt();
            byte[] bArr = new byte[r3];
            if (dataInputStream.read(bArr) != r3) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.mFingerprints.add(bArr);
        }
    }
}
