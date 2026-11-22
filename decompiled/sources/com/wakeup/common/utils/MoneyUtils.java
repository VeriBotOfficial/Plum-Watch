package com.wakeup.common.utils;

import com.xiaomi.mipush.sdk.Constants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes2.dex */
public class MoneyUtils {
    private static final String CN_FULL = "";
    private static final String CN_NEGATIVE = "负";
    private static final String CN_ZEOR_FULL = "零元整";
    private static final int MONEY_PRECISION = 2;
    private static final String[] CN_UPPER_NUMBER = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    private static final String[] CN_UPPER_MONETRAY_UNIT = {"分", "角", "元", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟", "兆", "拾", "佰", "仟"};

    public static String number2CNMoney(String number) {
        return number2CNMoney(new BigDecimal(number));
    }

    public static String getFormatMoney(BigDecimal money, int scale, double divisor) {
        return formatMoney(money, scale, divisor) + getCellFormat(divisor);
    }

    public static String getAccountantMoney(BigDecimal money, int scale, double divisor) {
        return accountantMoney(money, scale, divisor) + getCellFormat(divisor);
    }

    public static String accountantCurrencyMoneyWithoutComma(BigDecimal money, Locale locale, Currency currency, int scale) {
        String accountantMoney = accountantMoney(money, scale, 1.0d);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        if (currency == null) {
            currency = Currency.getInstance(locale);
        }
        return String.format("%s%s", currency.getCurrencyCode(), accountantMoney.replace(",", ""));
    }

    public static String accountantCurrencyMoneyWithoutComma(BigDecimal money, Locale locale, int scale) {
        return accountantCurrencyMoneyWithoutComma(money, locale, Currency.getInstance(locale == null ? Locale.getDefault() : locale), scale);
    }

    public static String accountantCurrencyMoneyWithoutComma(BigDecimal money, int scale) {
        return accountantCurrencyMoneyWithoutComma(money, null, scale);
    }

    public static String accountantCurrencyMoneyWithoutComma(BigDecimal money) {
        return accountantCurrencyMoneyWithoutComma(money, 2);
    }

    public static String accountantMoney(BigDecimal money) {
        return accountantMoney(money, 2, 1.0d);
    }

    public static String number2CNMoney(BigDecimal number) {
        int i;
        boolean z;
        StringBuffer stringBuffer = new StringBuffer();
        int signum = number.signum();
        if (signum == 0) {
            return CN_ZEOR_FULL;
        }
        char c = 4;
        long longValue = number.movePointRight(2).setScale(0, 4).abs().longValue();
        long j = longValue % 100;
        if (j <= 0) {
            longValue /= 100;
            i = 2;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (j > 0 && j % 10 <= 0) {
            longValue /= 10;
            i = 1;
            z = true;
        }
        int i2 = 0;
        while (longValue > 0) {
            char c2 = c;
            long j2 = longValue;
            int i3 = (int) (j2 % 10);
            if (i3 > 0) {
                if (i == 9 && i2 >= 3) {
                    stringBuffer.insert(0, CN_UPPER_MONETRAY_UNIT[6]);
                }
                if (i == 13 && i2 >= 3) {
                    stringBuffer.insert(0, CN_UPPER_MONETRAY_UNIT[10]);
                }
                stringBuffer.insert(0, CN_UPPER_MONETRAY_UNIT[i]);
                stringBuffer.insert(0, CN_UPPER_NUMBER[i3]);
                z = false;
                i2 = 0;
            } else {
                i2++;
                if (!z) {
                    stringBuffer.insert(0, CN_UPPER_NUMBER[i3]);
                }
                if (i == 2) {
                    if (longValue > 0) {
                        stringBuffer.insert(0, CN_UPPER_MONETRAY_UNIT[i]);
                    }
                } else if ((i - 2) % 4 == 0 && j2 % 1000 > 0) {
                    stringBuffer.insert(0, CN_UPPER_MONETRAY_UNIT[i]);
                }
                z = true;
            }
            longValue = j2 / 10;
            i++;
            c = c2;
        }
        if (signum == -1) {
            stringBuffer.insert(0, CN_NEGATIVE);
        }
        if (j <= 0) {
            stringBuffer.append("");
        }
        return stringBuffer.toString();
    }

    private static String accountantMoney(BigDecimal money, int scale, double divisor) {
        String str;
        String formatMoney = formatMoney(money, scale, divisor);
        int indexOf = formatMoney.indexOf(".");
        if (indexOf > 0) {
            String substring = formatMoney.substring(0, indexOf);
            str = formatMoney.substring(indexOf);
            formatMoney = substring;
        } else {
            str = null;
        }
        int indexOf2 = formatMoney.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (indexOf2 == 0) {
            formatMoney = formatMoney.substring(1);
        }
        StringBuffer stringBuffer = new StringBuffer(formatMoney);
        stringBuffer.reverse();
        char[] charArray = stringBuffer.toString().toCharArray();
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i = 0; i < charArray.length; i++) {
            if (i != 0 && i % 3 == 0) {
                stringBuffer2.append(",");
            }
            stringBuffer2.append(charArray[i]);
        }
        stringBuffer2.reverse();
        if (indexOf > 0) {
            stringBuffer2.append(str);
        }
        if (indexOf2 == 0) {
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER + stringBuffer2.toString();
        }
        return stringBuffer2.toString();
    }

    private static String formatMoney(BigDecimal money, int scale, double divisor) {
        if (divisor == 0.0d || scale < 0) {
            return "0.00";
        }
        return money.divide(BigDecimal.valueOf(divisor), scale, RoundingMode.HALF_UP).toString();
    }

    private static String getCellFormat(double divisor) {
        String valueOf = String.valueOf(divisor);
        switch (valueOf.substring(0, valueOf.indexOf(".")).length()) {
        }
        return "元";
    }
}
