package com.wakeup.commonui.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.location.LocationManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Patterns;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.anythink.expressad.video.dynview.a.a;
import com.blankj.utilcode.util.Utils;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.utils.AppPath;
import com.wakeup.commonui.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class CommonUtil {
    public static boolean isZh() {
        return com.blankj.utilcode.util.LanguageUtils.getSystemLanguage().getLanguage().contains("zh");
    }

    public static boolean isAr() {
        return com.blankj.utilcode.util.LanguageUtils.getSystemLanguage().getLanguage().contains(a.X);
    }

    public static boolean isUk() {
        return com.blankj.utilcode.util.LanguageUtils.getSystemLanguage().getLanguage().contains("uk");
    }

    public static boolean isEn() {
        return com.blankj.utilcode.util.LanguageUtils.getSystemLanguage().getLanguage().contains("en");
    }

    public static boolean isRLT() {
        String languageTag = BaseApplication.getContext().getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        String[] strArr = {a.X, "he", "fa", "ur", "yi"};
        for (int i = 0; i < 5; i++) {
            if (languageTag.startsWith(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean isOpenGPS(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            return locationManager.isProviderEnabled("gps");
        }
        return false;
    }

    public static byte[] readStream(InputStream inputStream) throws Exception {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArray;
            }
        }
    }

    public static boolean hasInstall(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 256) != null;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String Kb2Mb(long j) {
        return Formatter.formatFileSize(BaseApplication.getContext(), j * 1000);
    }

    public static float[] getAxis(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 <= i) {
            arrayList.add(Integer.valueOf(i3));
            i3 += i2;
        }
        if (!arrayList.isEmpty() && ((Integer) arrayList.get(arrayList.size() - 1)).intValue() != i) {
            arrayList.add(Integer.valueOf(i));
        }
        float[] fArr = new float[arrayList.size()];
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            fArr[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
        return fArr;
    }

    public static float[] getMax_Min(boolean z, float[] fArr) {
        float[] fArr2 = {-1.0f, -1.0f, -1.0f, -1.0f};
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = fArr[i];
            f += f2;
            float f3 = fArr2[0];
            if (f3 == -1.0f || f2 > f3) {
                fArr2[0] = f2;
            }
            float f4 = fArr2[1];
            if ((f4 == -1.0f || fArr[i] < f4) && (z || fArr[i] != 0.0f)) {
                fArr2[1] = fArr[i];
            }
        }
        fArr2[2] = f / fArr.length;
        fArr2[3] = f;
        return fArr2;
    }

    public static String getWeekStr(int i, Context context) {
        switch (i) {
            case 1:
                return context.getString(R.string.assistant_yi) + "\u3000";
            case 2:
                return context.getString(R.string.assistant_er) + "\u3000";
            case 3:
                return context.getString(R.string.assistant_san) + "\u3000";
            case 4:
                return context.getString(R.string.assistant_si) + "\u3000";
            case 5:
                return context.getString(R.string.assistant_wu) + "\u3000";
            case 6:
                return context.getString(R.string.assistant_liu) + "\u3000";
            default:
                return context.getString(R.string.assistant_ri) + "\u3000";
        }
    }

    public static String convertDate(Date date, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        return simpleDateFormat.format(date);
    }

    public static String toString(Date date, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        return simpleDateFormat.format(date);
    }

    public static String convertSecond(int i) {
        long j = i % 3600;
        return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Long.valueOf(i / 3600), Long.valueOf(j / 60), Long.valueOf(j % 60));
    }

    public static String convertMinuteSecond(int i) {
        long j = i % 3600;
        return String.format(Locale.ENGLISH, "%02d:%02d", Long.valueOf(j / 60), Long.valueOf(j % 60));
    }

    public static String getSecondText(int i) {
        int i2 = i / 60;
        return i2 + Separators.QUOTE + (i - (i2 * 60)) + "\"";
    }

    public static float getSecond(int i) {
        if (i < 0) {
            return 0.0f;
        }
        int i2 = i / 60;
        return Float.valueOf(i2 + "." + (i - (i2 * 60))).floatValue();
    }

    public static int[] subInts(int[] iArr, int i, int i2) {
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, i, iArr2, 0, i2);
        return iArr2;
    }

    public static File createFile(byte[] bArr) {
        return createFile(AppPath.getAppImageCache(), bArr);
    }

    public static File createFile(String str, byte[] bArr) {
        File file = new File(str, String.format("%s.png", Long.valueOf(new Date().getTime())));
        try {
            if (file.createNewFile()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        } catch (IOException unused) {
        }
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public static boolean isValidEmail(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    public static boolean isValidPhone(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && Patterns.PHONE.matcher(charSequence).matches() && charSequence.length() == 11;
    }

    public static boolean isSameTime(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        calendar.setTimeInMillis(j2 * 1000);
        return i == calendar.get(1) && i2 == calendar.get(2) && i3 == calendar.get(5) && i4 == calendar.get(11) && i5 == calendar.get(12);
    }

    public static boolean findIds(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return Arrays.asList(str.split(",")).contains(str2);
    }

    public static String formatDomestic(long j) {
        String string = Utils.getApp().getString(R.string.fatigue_tip_05);
        String string2 = Utils.getApp().getString(R.string.fatigue_tip_06);
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
            return String.format("%.1f" + string, Double.valueOf(j / 10000.0d));
        }
        if (j < 1000000) {
            return String.format("%.1f" + string, Double.valueOf(j / 10000.0d));
        }
        if (j < 100000000) {
            return String.format("%.0f" + string, Double.valueOf(j / 10000.0d));
        }
        return String.format("%.0f" + string2, Double.valueOf(j / 1.0E8d));
    }

    public static String formatOverseas(long j) {
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j >= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US && j >= 1000000) {
            if (j < 1000000000) {
                return String.format("%.1fm", Double.valueOf(j / 1000000.0d));
            }
            return String.format("%.1fb", Double.valueOf(j / 1.0E9d));
        }
        return String.format("%.0fk", Double.valueOf(j / 1000.0d));
    }
}
