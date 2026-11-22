package com.applovin.impl;

import android.javax.sip.header.WarningHeader;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.wakeup.common.DeviceFeatures;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.opencv.videoio.Videoio;

/* loaded from: classes12.dex */
public abstract class u6 {
    public static String a(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 2) {
            return "SFBX CMP";
        }
        if (intValue == 3) {
            return "Liveramp CMP";
        }
        if (intValue == 5) {
            return "UserCentrics CMP";
        }
        if (intValue == 6) {
            return "Sourcepoint Dialogue CMP";
        }
        if (intValue == 7) {
            return "Didomi CMP";
        }
        if (intValue == 27) {
            return "Associated Newspapers Ltd CMP";
        }
        if (intValue == 28) {
            return "Onetrust / Cookiepro CMP";
        }
        if (intValue == 104) {
            return "AdOcean CMP";
        }
        if (intValue == 105) {
            return "Dailymotion CMP";
        }
        if (intValue == 302) {
            return "Gravito CMP";
        }
        if (intValue == 303) {
            return "Impala CMP";
        }
        if (intValue == 414) {
            return "MBEX LTD CMP";
        }
        if (intValue == 415) {
            return "Match Group LLC CMP";
        }
        switch (intValue) {
            case 10:
                break;
            case 14:
                break;
            case 21:
                break;
            case 31:
                break;
            case 35:
                break;
            case 59:
                break;
            case 68:
                break;
            case 72:
                break;
            case 76:
                break;
            case 79:
                break;
            case 84:
                break;
            case 90:
                break;
            case 123:
                break;
            case 125:
                break;
            case 134:
                break;
            case 167:
                break;
            case DeviceFeatures.AI_AUDIO_SEARCH /* 171 */:
                break;
            case 198:
                break;
            case 212:
                break;
            case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /* 231 */:
                break;
            case 237:
                break;
            case TelnetCommand.AYT /* 246 */:
                break;
            case 258:
                break;
            case 260:
                break;
            case 273:
                break;
            case 280:
                break;
            case 300:
                break;
            case 306:
                break;
            case 309:
                break;
            case TypedValues.AttributesType.TYPE_PIVOT_TARGET /* 318 */:
                break;
            case 327:
                break;
            case 329:
                break;
            case NNTPReply.SEND_ARTICLE_TO_POST /* 340 */:
                break;
            case 345:
                break;
            case 348:
                break;
            case 355:
                break;
            case 371:
                break;
            case 385:
                break;
            case 387:
                break;
            case 397:
                break;
            case WarningHeader.MISCELLANEOUS_WARNING /* 399 */:
                break;
            case 409:
                break;
            case 421:
                break;
            case Videoio.CAP_PROP_XI_DECIMATION_VERTICAL /* 432 */:
                break;
            case 436:
                break;
            default:
                switch (intValue) {
                }
        }
        return null;
    }
}
