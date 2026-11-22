package com.google.zxing.pdf417.encoder;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.anythink.core.common.m.a;
import com.baidu.platform.comapi.UIMsg;
import com.facebook.imageutils.JfifUtil;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.wakeup.common.DeviceFeatures;
import com.wakeup.commponent.module.sport.SportTypeConstant;
import com.xmly.businesssdk.trace.config.TraceConfiguration;
import io.agora.rtc2.Constants;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.smtp.SMTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes11.dex */
final class PDF417ErrorCorrection {
    private static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{522, 568, Constants.AUDIO_MIXING_REASON_ALL_LOOPS_COMPLETED, 809}, new int[]{237, 308, 436, SportTypeConstant.Course_23, 646, 653, Videoio.CAP_PROP_XI_BINNING_VERTICAL, 379}, new int[]{274, 562, DeviceFeatures.HEADSET_KEY_CALL, 755, CommonGatewayClient.CODE_599, 524, 801, 132, SportTypeConstant.Course_34, 116, Videoio.CAP_PROP_XI_AEAG_ROI_HEIGHT, Videoio.CAP_PROP_XI_BINNING_VERTICAL, SportTypeConstant.Course_34, 42, 176, 65}, new int[]{361, 575, 922, UIMsg.MsgDefine.MSG_MSG_CENTER, 176, Videoio.CAP_PROP_XI_SENSOR_FEATURE_VALUE, 640, 321, 536, 742, 677, 742, 687, SportTypeConstant.Course_23, 193, 517, 273, Videoio.CAP_PROP_XI_CC_MATRIX_33, SportTypeConstant.Course_chest_primary, 147, 593, 800, Videoio.CAP_PROP_XI_HW_REVISION, 320, 803, 133, NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS, 390, 685, WarningHeader.MULTICAST_NOT_AVAILABLE, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 287, 107, 505, 733, 877, NNTPReply.MORE_AUTH_INFO_REQUIRED, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, Constants.AUDIO_MIXING_REASON_ALL_LOOPS_COMPLETED, Videoio.CAP_PROP_XI_GAMMAY, Videoio.CAP_PROP_XI_IMAGE_DATA_BIT_DEPTH, 172, 430, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 858, 822, Videoio.CAP_PROP_XI_LUT_VALUE, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, Videoio.CAP_PROP_XI_FFS_FILE_ID, 225, 535, 517, 352, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, NNTPReply.MORE_AUTH_INFO_REQUIRED, 843, 623, SportTypeConstant.Course_chest_intermediate, Videoio.CAP_PROP_XI_LUT_VALUE}, new int[]{521, 310, 864, Videoio.CAP_PROP_XI_IS_DEVICE_EXIST, 858, Videoio.CAP_PROP_XI_FFS_FILE_SIZE, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, JfifUtil.MARKER_EOI, 208, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 244, Videoio.CAP_PROP_XI_FFS_ACCESS_KEY, 620, TelnetCommand.AYT, 148, 447, 631, 292, 908, Videoio.CAP_PROP_XI_CC_MATRIX_23, 704, 516, 258, 457, 907, Videoio.CAP_PROP_XI_FFS_FILE_ID, Constants.AUDIO_MIXING_REASON_ALL_LOOPS_COMPLETED, 674, 292, 272, 96, 684, Videoio.CAP_PROP_XI_DECIMATION_VERTICAL, 686, 606, 860, 569, 193, 219, 129, DeviceFeatures.CONFIG_SLEEP, TelnetCommand.EOF, 287, 192, 775, 278, DeviceFeatures.E_BOOK, 40, 379, 712, Videoio.CAP_PROP_XI_OUTPUT_DATA_PACKING, 646, 776, DeviceFeatures.AI_AUDIO_SEARCH, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, Response.ALTERNATIVE_SERVICE, 602, 754, 336, 89, 614, 87, Videoio.CAP_PROP_XI_DECIMATION_VERTICAL, 670, 616, 157, 374, 242, Constants.AUDIO_MIXING_REASON_RESUMED_BY_USER, 600, 269, 375, 898, 845, 454, SMTPReply.START_MAIL_INPUT, 130, Constants.RHYTHM_PLAYER_STATE_FAILED, Videoio.CAP_PROP_XI_TEST_PATTERN_GENERATOR_SELECTOR, 804, 34, 211, WarningHeader.MULTICAST_NOT_AVAILABLE, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, Videoio.CAP_PROP_XI_SENSOR_FEATURE_VALUE, 708, 250, TypedValues.Custom.TYPE_DIMENSION, 786, 138, 720, 858, DeviceFeatures.SLEEP_APNEA, 311, 913, 275, 190, 375, 850, 438, 733, DeviceFeatures.SLEEP_APNEA, 280, 201, 280, 828, 757, Constants.AUDIO_MIXING_STATE_PLAYING, Constants.RHYTHM_PLAYER_STATE_FAILED, 919, 89, 68, 569, 11, 204, 796, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 540, 913, 801, 700, 799, 137, Videoio.CAP_PROP_XI_AEAG_ROI_OFFSET_X, Videoio.CAP_PROP_XI_AG_MAX_LIMIT, 592, 668, 353, 859, WarningHeader.INSUFFICIENT_BANDWIDTH, 694, 325, 240, JfifUtil.MARKER_SOI, 257, SportTypeConstant.Course_23, Videoio.CAP_PROP_XI_ACQ_BUFFER_SIZE_UNIT, 209, 884, 315, 70, 329, 793, Videoio.CAP_PROP_XI_CC_MATRIX_23, 274, 877, 162, 749, Constants.RHYTHM_PLAYER_STATE_DECODING, 684, Videoio.CAP_PROP_XI_OUTPUT_DATA_BIT_DEPTH, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, WarningHeader.MISCELLANEOUS_WARNING, 908, 103, 511, 51, 8, 517, 225, SportTypeConstant.Course_28, Videoio.CAP_PROP_XI_CMS, 637, 731, 66, 255, 917, 269, Videoio.CAP_PROP_XI_OUTPUT_DATA_PACKING, 830, 730, Videoio.CAP_PROP_XI_DECIMATION_HORIZONTAL, 848, Videoio.CAP_PROP_XI_SENSOR_FEATURE_SELECTOR, 136, Videoio.CAP_PROP_XI_ACQ_TIMING_MODE, TypedValues.Custom.TYPE_REFERENCE, 90, 2, 290, 743, 199, 655, TypedValues.Custom.TYPE_STRING, 329, 49, 802, Videoio.CAP_PROP_XI_FFS_FILE_SIZE, 355, Videoio.CAP_PROP_XI_TEST_PATTERN, 188, Videoio.CAP_PROP_XI_IMAGE_DATA_BIT_DEPTH, 10, 134, 628, 320, Videoio.CAP_PROP_XI_CC_MATRIX_00, 130, 739, 71, SportTypeConstant.Course_chest_primary, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 374, 601, 192, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 142, 673, 687, 234, 722, 384, 177, 752, TypedValues.MotionType.TYPE_PATHMOTION_ARC, 640, 455, 193, 689, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 805, Imgcodecs.IMWRITE_JPEGXL_EFFORT, 48, 60, 732, 621, 895, Videoio.CAP_PROP_XI_TRG_DELAY, 261, 852, 655, 309, 697, 755, 756, 60, NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS, 773, Videoio.CAP_PROP_XI_DECIMATION_PATTERN, 421, Constants.AUDIO_MIXING_REASON_RESUMED_BY_USER, 528, 503, 118, 49, 795, 32, 144, 500, TelnetCommand.ABORT, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 441, 180, 791, 893, 754, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 383, 228, 749, 760, FTPReply.FILE_STATUS, 54, 297, 134, 54, 834, SportTypeConstant.Course_38, 922, DeviceFeatures.DIAL_THUMB, Videoio.CAP_OPENNI_ASUS, 532, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 829, 189, 20, 167, 29, 872, Videoio.CAP_PROP_XI_WB_KG, 83, 402, 41, 656, 505, 579, 481, DeviceFeatures.E_BOOK, 404, 251, 688, 95, 497, Videoio.CAP_PROP_XI_COLUMN_FPN_CORRECTION, Imgcodecs.IMWRITE_JPEGXL_DISTANCE, Videoio.CAP_PROP_XI_LUT_VALUE, 307, 159, 924, Videoio.CAP_PROP_XI_SENSOR_MODE, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, CommonGatewayClient.CODE_599, Videoio.CAP_PROP_XI_BINNING_VERTICAL, 207, 409, 574, 118, Videoio.CAP_PROP_XI_TRG_SELECTOR, SportTypeConstant.Course_24, Response.ALTERNATIVE_SERVICE, FTPReply.FILE_ACTION_PENDING, Videoio.CAP_PROP_XI_CC_MATRIX_31, DeviceFeatures.NETWORK_SHARE, 265, 920, 155, 914, SportTypeConstant.Course_38, 229, Imgcodecs.IMWRITE_JPEGXL_DECODING_SPEED, SportTypeConstant.Course_33, 871, 306, 88, 87, 193, 352, TraceConfiguration.DEFAULT_APP_ID, 846, 75, 327, 520, 435, Videoio.CAP_PROP_XI_LUT_VALUE, 203, 666, TelnetCommand.GA, 346, TraceConfiguration.DEFAULT_APP_ID, 621, 640, 268, 794, 534, 539, TraceConfiguration.DEFAULT_APP_ID, 408, 390, 644, 102, Videoio.CAP_PROP_XI_GAMMAY, Videoio.CAP_PROP_XI_ACQ_FRAME_BURST_COUNT, 290, 632, Videoio.CAP_PROP_XI_TS_RST_MODE, 37, 858, 916, 552, 41, Videoio.CAP_PROP_XI_LUT_INDEX, SportTypeConstant.Course_28, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, Videoio.CAP_PROP_XI_HDR_T1, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 384, 168, 190, 826, 328, Videoio.CAP_PROP_XI_SENSOR_BOARD_TEMP, 786, 303, 570, NNTPReply.MORE_AUTH_INFO_REQUIRED, 415, Imgcodecs.IMWRITE_JPEGXL_EFFORT, 156, 237, 151, Videoio.CAP_PROP_XI_BINNING_HORIZONTAL, Videoio.CAP_PROP_XI_TRANSPORT_PIXEL_FORMAT, 207, 676, Constants.AUDIO_MIXING_STATE_PLAYING, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, DeviceFeatures.CAMERA_PREVIEW, Videoio.CAP_PROP_XI_GAMMAC, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 94, 8, Videoio.CAP_PROP_XI_CC_MATRIX_33, 114, 521, 2, Videoio.CAP_PROP_XI_ACQ_FRAME_BURST_COUNT, 851, Videoio.CAP_PROP_XI_LUT_VALUE, 152, 729, 771, 95, TelnetCommand.EL, 361, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE, 323, 856, 797, SportTypeConstant.Course_28, 51, 684, Videoio.CAP_PROP_XI_COOLING, 533, 820, 669, 45, 902, 452, 167, 342, 244, DeviceFeatures.E_BOOK, 35, Videoio.CAP_PROP_XI_OUTPUT_DATA_PACKING, 651, 51, a.m, Videoio.CAP_PROP_XI_ROW_FPN_CORRECTION, 452, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE, 37, 124, 298, FTPReply.NEED_ACCOUNT, 552, 43, Videoio.CAP_PROP_XI_BINNING_SELECTOR, 119, 662, 777, Videoio.CAP_PROP_XI_COLOR_FILTER_ARRAY, 850, 764, 364, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE, 911, 283, Constants.AUDIO_MIXING_STATE_PAUSED, 472, 420, TelnetCommand.AO, 288, Videoio.CAP_PROP_XI_FFS_FILE_ID, 394, 511, 327, Videoio.CAP_PROP_XI_REGION_SELECTOR, 777, a.m, 688, 43, 408, 842, 383, Constants.AUDIO_MIXING_REASON_ONE_LOOP_COMPLETED, 521, Videoio.CAP_PROP_XI_HDR_KNEEPOINT_COUNT, 644, Constants.AUDIO_MIXING_STATE_FAILED, Videoio.CAP_PROP_XI_HDR, 62, 145, 873, 663, Constants.AUDIO_MIXING_STATE_STOPPED, 159, 672, 729, 624, 59, 193, 417, 158, 209, Videoio.CAP_PROP_XI_KNEEPOINT1, Videoio.CAP_PROP_XI_KNEEPOINT2, 343, 693, 109, TypedValues.MotionType.TYPE_DRAW_PATH, Videoio.CAP_PROP_XI_KNEEPOINT1, 365, 181, 772, 677, 310, TelnetCommand.EL, 353, 708, 410, 579, 870, 617, 841, 632, 860, SportTypeConstant.Course_28, 536, 35, 777, 618, Videoio.CAP_PROP_XI_SENSOR_FEATURE_VALUE, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, Videoio.CAP_PROP_XI_CC_MATRIX_31, 228, 613, 830, 922, 437, 519, 644, TypedValues.Custom.TYPE_DIMENSION, 789, 420, 305, 441, 207, 300, 892, 827, 141, Videoio.CAP_PROP_XI_COUNTER_VALUE, NNTPReply.MORE_AUTH_INFO_REQUIRED, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, Videoio.CAP_PROP_XI_HDR_KNEEPOINT_COUNT, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, Videoio.CAP_PROP_XI_LIMIT_BANDWIDTH, 806, Videoio.CAP_PROP_XI_HOUS_BACK_SIDE_TEMP, 731, 425, JfifUtil.MARKER_SOI, 548, TelnetCommand.GA, 321, 881, a.m, 535, 673, 782, 210, 815, TypedValues.Custom.TYPE_DIMENSION, 303, 843, 922, 281, 73, Videoio.CAP_PROP_XI_HOUS_TEMP, 791, 660, 162, Videoio.CAP_PROP_XI_TRG_SELECTOR, 308, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, WarningHeader.MULTICAST_NOT_AVAILABLE, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, TypedValues.AttributesType.TYPE_PATH_ROTATE, 342, SportTypeConstant.Course_38, 534, 105, 667, 488, 640, 672, 576, 540, TypedValues.AttributesType.TYPE_PATH_ROTATE, 486, Constants.AUDIO_MIXING_REASON_ONE_LOOP_COMPLETED, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 46, 656, 447, DeviceFeatures.AI_AUDIO_SEARCH, 616, Videoio.CAP_PROP_XI_OUTPUT_DATA_PACKING_TYPE, 190, Videoio.CAP_PROP_XI_TRANSPORT_PIXEL_FORMAT, 297, 321, 762, 752, 533, DeviceFeatures.AUDIO_MEMORANDUM, 134, 14, NNTPReply.MORE_AUTH_INFO_REQUIRED, Videoio.CAP_PROP_XI_DECIMATION_HORIZONTAL, 717, 45, 111, 20, Videoio.CAP_PROP_XI_SENSOR_BOARD_TEMP, SportTypeConstant.Course_23, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, DeviceFeatures.CAMERA_PREVIEW, FTPReply.NEED_ACCOUNT, 899, 165, Constants.AUDIO_MIXING_REASON_RESUMED_BY_USER, 600, 325, Videoio.CAP_PROP_XI_TRG_SELECTOR, 655, 357, 752, 768, NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, 849, 647, 63, 310, 863, 251, 366, 304, SportTypeConstant.Course_21, 738, 675, 410, 389, 244, 31, 121, 303, SportTypeConstant.Course_chest_primary}};

    private PDF417ErrorCorrection() {
    }

    static int getErrorCorrectionCodewordCount(int i) {
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i + 1);
    }

    static int getRecommendedMinimumErrorCorrectionLevel(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (i <= 40) {
            return 2;
        }
        if (i <= 160) {
            return 3;
        }
        if (i <= 320) {
            return 4;
        }
        if (i <= 863) {
            return 5;
        }
        throw new WriterException("No recommendation possible");
    }

    static String generateErrorCorrection(CharSequence charSequence, int i) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = errorCorrectionCodewordCount - 1;
            int charAt = (charSequence.charAt(i2) + cArr[i3]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((EC_COEFFICIENTS[i][i3] * charAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i3--;
            }
            cArr[0] = (char) ((929 - ((charAt * EC_COEFFICIENTS[i][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(errorCorrectionCodewordCount);
        for (int i4 = errorCorrectionCodewordCount - 1; i4 >= 0; i4--) {
            char c = cArr[i4];
            if (c != 0) {
                cArr[i4] = (char) (929 - c);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }
}
