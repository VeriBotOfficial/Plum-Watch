package com.wakeup.feature.device.nfc;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.nfc.tech.NfcA;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.internal.AssetHelper;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.utils.ToastUtils;
import com.wakeup.commonui.R;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public class NfcUtils {
    private final Activity activity;
    private NfcAdapter mNfcAdapter;
    private final String TAG = "NfcUtils";
    private IntentFilter[] mIntentFilter = null;
    private PendingIntent mPendingIntent = null;
    private String[][] mTechList = null;

    static /* synthetic */ void lambda$showSettingDailog$1(DialogInterface dialogInterface, int i) {
    }

    public NfcUtils(Activity activity) {
        this.activity = activity;
        NFCCheck();
    }

    private void NFCCheck() {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.activity);
        this.mNfcAdapter = defaultAdapter;
        if (defaultAdapter == null) {
            ToastUtils.showToast(this.activity.getString(R.string.device_tip_1023));
        } else if (!defaultAdapter.isEnabled()) {
            showSettingDailog(this.activity);
        } else {
            LogUtils.i("NfcUtils", "NFC功能已打开!");
            init();
        }
    }

    private void init() {
        Activity activity = this.activity;
        Intent intent = new Intent(activity, activity.getClass());
        intent.addFlags(536870912);
        this.mPendingIntent = PendingIntent.getActivity(this.activity, 0, intent, 33554432);
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        try {
            intentFilter.addDataType(AssetHelper.DEFAULT_MIME_TYPE);
        } catch (IntentFilter.MalformedMimeTypeException e) {
            e.printStackTrace();
        }
        this.mIntentFilter = new IntentFilter[]{intentFilter, new IntentFilter("android.nfc.action.TECH_DISCOVERED")};
        this.mTechList = new String[][]{new String[]{MifareClassic.class.getName()}, new String[]{NfcA.class.getName()}, new String[]{Ndef.class.getName()}, new String[]{NdefFormatable.class.getName()}};
    }

    public boolean enableForegroundDispatch(Activity activity) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
        this.mNfcAdapter = defaultAdapter;
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            return false;
        }
        this.mNfcAdapter.enableForegroundDispatch(activity, this.mPendingIntent, this.mIntentFilter, this.mTechList);
        return true;
    }

    public void disableForegroundDispatch(Activity activity) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
        this.mNfcAdapter = defaultAdapter;
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            return;
        }
        this.mNfcAdapter.disableForegroundDispatch(activity);
    }

    public void showSettingDailog(final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage(activity.getString(R.string.device_tip_1022));
        builder.setPositiveButton(activity.getString(R.string.area_queding), new DialogInterface.OnClickListener() { // from class: com.wakeup.feature.device.nfc.NfcUtils$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                activity.startActivity(new Intent("android.settings.SETTINGS"));
            }
        });
        builder.setNegativeButton(activity.getString(R.string.area_quxiao), new DialogInterface.OnClickListener() { // from class: com.wakeup.feature.device.nfc.NfcUtils$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NfcUtils.lambda$showSettingDailog$1(dialogInterface, i);
            }
        });
        builder.create().show();
    }

    public String readNFCId(Tag tag) {
        return ByteArrayToHexString(tag.getId());
    }

    public boolean getTagType(Tag tag, String str) {
        for (String str2 : tag.getTechList()) {
            LogUtils.i("NfcUtils", "TechList:" + str2);
            if (str != null && str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public Tag getNFCTag(Intent intent) {
        return (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
    }

    public String readMessage(Intent intent) {
        if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            return readNdef(intent);
        }
        if ("android.nfc.action.TECH_DISCOVERED".equals(intent.getAction()) && getTagType(getNFCTag(intent), MifareClassic.class.getSimpleName())) {
            return readMifareClassic(intent);
        }
        return "";
    }

    private String readNdef(Intent intent) {
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        if (parcelableArrayExtra != null) {
            NdefMessage[] ndefMessageArr = new NdefMessage[parcelableArrayExtra.length];
            for (int i = 0; i < parcelableArrayExtra.length; i++) {
                ndefMessageArr[i] = (NdefMessage) parcelableArrayExtra[i];
                LogUtils.i("NfcUtils", "rawMsgs[i]：" + parcelableArrayExtra[i]);
                LogUtils.i("NfcUtils", "msgs[i]：" + ndefMessageArr[i]);
            }
            NdefRecord ndefRecord = ndefMessageArr[0].getRecords()[0];
            if (ndefRecord != null) {
                byte[] payload = ndefRecord.getPayload();
                LogUtils.i("NfcUtils", "payload: " + payload);
                byte b = payload[0];
                String str = (b & 128) == 0 ? "UTF-8" : "UTF-16";
                int i2 = b & 63;
                new String(payload, 1, i2, StandardCharsets.US_ASCII);
                try {
                    return new String(payload, i2 + 1, (payload.length - i2) - 1, str);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    private String readMifareClassic(Intent intent) {
        String str = "";
        ArrayList arrayList = new ArrayList();
        LogUtils.d("id:" + getNFCTag(intent).getId(), new Object[0]);
        MifareClassic mifareClassic = MifareClassic.get(getNFCTag(intent));
        try {
            try {
                mifareClassic.connect();
                if (mifareClassic.isConnected()) {
                    int sectorCount = mifareClassic.getSectorCount();
                    for (int i = 0; i < sectorCount; i++) {
                        if (mifareClassic.authenticateSectorWithKeyA(i, MifareClassic.KEY_NFC_FORUM)) {
                            int blockCountInSector = mifareClassic.getBlockCountInSector(i);
                            int sectorToBlock = mifareClassic.sectorToBlock(i);
                            for (int i2 = 0; i2 < blockCountInSector; i2++) {
                                byte[] readBlock = mifareClassic.readBlock(sectorToBlock);
                                if (i2 < blockCountInSector - 1 && !bytesToHexString(readBlock).equals("0x00000000000000000000000000000000")) {
                                    arrayList.add(readBlock);
                                }
                                sectorToBlock++;
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        byte[] bArr = new byte[arrayList.size() * ((byte[]) arrayList.get(0)).length];
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            byte[] bArr2 = (byte[]) arrayList.get(i3);
                            System.arraycopy(bArr2, 0, bArr, bArr2.length * i3, bArr2.length);
                        }
                        str = new String(trim(bArr), StandardCharsets.UTF_8);
                    }
                }
                try {
                    mifareClassic.close();
                } catch (IOException e) {
                    LogUtils.e("NfcUtils", e);
                }
            } finally {
                try {
                    mifareClassic.close();
                } catch (IOException e2) {
                    LogUtils.e("NfcUtils", e2);
                }
            }
        } catch (Exception e3) {
            LogUtils.e("NfcUtils", e3);
        }
        return str;
    }

    public void writeMifareClassic(String str, Intent intent) throws IOException {
        MifareClassic mifareClassic = MifareClassic.get((Tag) intent.getParcelableExtra("android.nfc.extra.TAG"));
        try {
            mifareClassic.connect();
            int sectorCount = mifareClassic.getSectorCount();
            for (int i = 0; i < sectorCount; i++) {
                if (mifareClassic.authenticateSectorWithKeyA(i, MifareClassic.KEY_NFC_FORUM)) {
                    int blockCountInSector = mifareClassic.getBlockCountInSector(i);
                    int sectorToBlock = mifareClassic.sectorToBlock(i);
                    for (int i2 = 0; i2 < blockCountInSector - 1; i2++) {
                        int i3 = sectorToBlock + i2;
                        if (!bytesToHexString(mifareClassic.readBlock(i3)).equals("0x00000000000000000000000000000000")) {
                            mifareClassic.writeBlock(i3, new byte[16]);
                        }
                    }
                }
            }
            byte[] bArr = new byte[16];
            System.arraycopy(str.getBytes(), 0, bArr, 0, str.getBytes().length);
            if (mifareClassic.authenticateSectorWithKeyA(1, MifareClassic.KEY_NFC_FORUM)) {
                mifareClassic.writeBlock(4, bArr);
            }
            LogUtils.i("NfcUtils", "写入MifareClassic成功");
        } finally {
            try {
                mifareClassic.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean clear(Intent intent) throws IOException {
        MifareClassic mifareClassic = MifareClassic.get((Tag) intent.getParcelableExtra("android.nfc.extra.TAG"));
        try {
            mifareClassic.connect();
            int sectorCount = mifareClassic.getSectorCount();
            for (int i = 0; i < sectorCount; i++) {
                if (mifareClassic.authenticateSectorWithKeyA(i, MifareClassic.KEY_NFC_FORUM)) {
                    int blockCountInSector = mifareClassic.getBlockCountInSector(i);
                    int sectorToBlock = mifareClassic.sectorToBlock(i);
                    for (int i2 = 0; i2 < blockCountInSector - 1; i2++) {
                        int i3 = sectorToBlock + i2;
                        if (!bytesToHexString(mifareClassic.readBlock(i3)).equals("0x00000000000000000000000000000000")) {
                            mifareClassic.writeBlock(i3, new byte[16]);
                        }
                    }
                }
            }
            LogUtils.i("NfcUtils", "清空成功");
            try {
                return true;
            } catch (IOException e) {
                return true;
            }
        } finally {
            try {
                mifareClassic.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void writeNFCToTag(String str, Intent intent) throws IOException, FormatException {
        Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
        byte[] bytes = Locale.CHINA.getLanguage().getBytes(StandardCharsets.US_ASCII);
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        char length = (char) bytes.length;
        byte[] bArr = new byte[bytes.length + 1 + bytes2.length];
        bArr[0] = (byte) length;
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        System.arraycopy(bytes2, 0, bArr, bytes.length + 1, bytes2.length);
        NdefMessage ndefMessage = new NdefMessage(new NdefRecord[]{new NdefRecord((short) 1, NdefRecord.RTD_TEXT, new byte[0], bArr)});
        int length2 = ndefMessage.toByteArray().length;
        Ndef ndef = Ndef.get(tag);
        if (ndef != null) {
            ndef.connect();
            if (ndef.isWritable() && ndef.getMaxSize() >= length2) {
                ndef.writeNdefMessage(ndefMessage);
                LogUtils.i("NfcUtils", "写入NDEF成功");
                return;
            }
            return;
        }
        NdefFormatable ndefFormatable = NdefFormatable.get(tag);
        if (ndefFormatable == null) {
            LogUtils.i("NfcUtils", "格式化并写入NDEF失败");
            return;
        }
        ndefFormatable.connect();
        ndefFormatable.format(ndefMessage);
        LogUtils.i("NfcUtils", "格式化并写入NDEF成功");
    }

    private String ByteArrayToHexString(byte[] bArr) {
        String[] strArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", TokenNames.C, "D", "E", TokenNames.F};
        String str = "";
        for (byte b : bArr) {
            str = (str + strArr[((b & 255) >> 4) & 15]) + strArr[b & 15];
        }
        return str;
    }

    private String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("0x");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (int i = 0; i < bArr.length; i++) {
            sb.append(new char[]{Character.forDigit((bArr[i] >>> 4) & 15, 16), Character.forDigit(bArr[i] & 15, 16)});
        }
        return sb.toString();
    }

    private byte[] trim(byte[] bArr) {
        byte b;
        byte[] bArr2 = new byte[bArr.length];
        byte b2 = 0;
        int i = 0;
        while (b2 < bArr.length) {
            byte b3 = bArr[b2];
            if (b3 != 0) {
                b = (byte) (i + 1);
                bArr2[i] = b3;
                b2 = (byte) (b2 + 1);
            } else {
                byte b4 = 0;
                while (b2 < bArr.length && bArr[b2] == 0) {
                    b4 = (byte) (b4 + 1);
                    b2 = (byte) (b2 + 1);
                }
                if (b4 < 2) {
                    b = (byte) (i + 1);
                    bArr2[i] = bArr[b2 - 1];
                }
            }
            i = b;
        }
        byte[] bArr3 = new byte[i];
        for (byte b5 = 0; b5 < i; b5 = (byte) (b5 + 1)) {
            bArr3[b5] = bArr2[b5];
        }
        return bArr3;
    }

    public byte[] concatAll(byte[] bArr, byte[]... bArr2) {
        int length = bArr.length;
        for (byte[] bArr3 : bArr2) {
            if (bArr3 != null) {
                length += bArr3.length;
            }
        }
        byte[] copyOf = Arrays.copyOf(bArr, length);
        int length2 = bArr.length;
        for (byte[] bArr4 : bArr2) {
            if (bArr4 != null) {
                System.arraycopy(bArr4, 0, copyOf, length2, bArr4.length);
                length2 += bArr4.length;
            }
        }
        return copyOf;
    }
}
