package org.apache.commons.net.nntp;

import com.yandex.div2.PhoneMasks;
import java.util.Calendar;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes8.dex */
public final class NewGroupsOrNewsQuery {
    private final String date;
    private final boolean isGMT;
    private final String time;
    private StringBuffer distributions = null;
    private StringBuffer newsgroups = null;

    public NewGroupsOrNewsQuery(Calendar calendar, boolean z) {
        this.isGMT = z;
        StringBuilder sb = new StringBuilder();
        String num = Integer.toString(calendar.get(1));
        int length = num.length();
        if (length >= 2) {
            sb.append(num.substring(length - 2));
        } else {
            sb.append(PhoneMasks.EXTRA_NUMBERS);
        }
        String num2 = Integer.toString(calendar.get(2) + 1);
        int length2 = num2.length();
        if (length2 == 1) {
            sb.append('0');
            sb.append(num2);
        } else if (length2 == 2) {
            sb.append(num2);
        } else {
            sb.append("01");
        }
        String num3 = Integer.toString(calendar.get(5));
        int length3 = num3.length();
        if (length3 == 1) {
            sb.append('0');
            sb.append(num3);
        } else if (length3 == 2) {
            sb.append(num3);
        } else {
            sb.append("01");
        }
        this.date = sb.toString();
        sb.setLength(0);
        String num4 = Integer.toString(calendar.get(11));
        int length4 = num4.length();
        if (length4 == 1) {
            sb.append('0');
            sb.append(num4);
        } else if (length4 == 2) {
            sb.append(num4);
        } else {
            sb.append(PhoneMasks.EXTRA_NUMBERS);
        }
        String num5 = Integer.toString(calendar.get(12));
        int length5 = num5.length();
        if (length5 == 1) {
            sb.append('0');
            sb.append(num5);
        } else if (length5 == 2) {
            sb.append(num5);
        } else {
            sb.append(PhoneMasks.EXTRA_NUMBERS);
        }
        String num6 = Integer.toString(calendar.get(13));
        int length6 = num6.length();
        if (length6 == 1) {
            sb.append('0');
            sb.append(num6);
        } else if (length6 == 2) {
            sb.append(num6);
        } else {
            sb.append(PhoneMasks.EXTRA_NUMBERS);
        }
        this.time = sb.toString();
    }

    public void addDistribution(String str) {
        StringBuffer stringBuffer = this.distributions;
        if (stringBuffer != null) {
            stringBuffer.append(AbstractJsonLexerKt.COMMA);
        } else {
            this.distributions = new StringBuffer();
        }
        this.distributions.append(str);
    }

    public void addNewsgroup(String str) {
        StringBuffer stringBuffer = this.newsgroups;
        if (stringBuffer != null) {
            stringBuffer.append(AbstractJsonLexerKt.COMMA);
        } else {
            this.newsgroups = new StringBuffer();
        }
        this.newsgroups.append(str);
    }

    public String getDate() {
        return this.date;
    }

    public String getDistributions() {
        return Objects.toString(this.distributions, null);
    }

    public String getNewsgroups() {
        return Objects.toString(this.newsgroups, null);
    }

    public String getTime() {
        return this.time;
    }

    public boolean isGMT() {
        return this.isGMT;
    }

    public void omitNewsgroup(String str) {
        addNewsgroup("!" + str);
    }
}
