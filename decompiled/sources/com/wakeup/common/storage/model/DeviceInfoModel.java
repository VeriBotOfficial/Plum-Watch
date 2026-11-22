package com.wakeup.common.storage.model;

import android.javax.sip.message.Response;
import com.wakeup.common.storage.DeviceLocalSupports;
import java.io.Serializable;
import org.opencv.videoio.Videoio;

/* loaded from: classes2.dex */
public class DeviceInfoModel implements Serializable {
    public String audioMac;
    private int bandVersionCode;
    private String bleName;
    private int byte11;
    private int byte12;
    private int byte15;
    private int byte16;
    private int byte17;
    private int byte18;
    private String equipmentCode;
    private int info2Byte5 = -1;
    private int info2Byte6 = -1;
    private int info2Byte7 = -1;
    public boolean isAudioDeviceConnected = false;
    public boolean isAudioDeviceOpen = false;
    private String license;
    private String mac;
    private String otaVersionCode;
    private int protocolVersionCode;
    private int watchfaceBgNum;

    public void setBleName(String bleName) {
        this.bleName = bleName;
    }

    public String getBleName() {
        String str = this.bleName;
        return str == null ? "" : str;
    }

    public String getLicense() {
        return this.license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getEquipmentCode() {
        return this.equipmentCode;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getOtaVersionCode() {
        return this.otaVersionCode;
    }

    public void setOtaVersionCode(String otaVersionCode) {
        this.otaVersionCode = otaVersionCode;
    }

    public int getBandVersionCode() {
        return this.bandVersionCode;
    }

    public void setBandVersionCode(int bandVersionCode) {
        this.bandVersionCode = bandVersionCode;
        if ((getBandVersionCode() > 29 && getBandVersionCode() < 100) || getBandVersionCode() > 199) {
            setProtocolVersionCode(2);
        } else {
            setProtocolVersionCode(1);
        }
    }

    public boolean isLicense() {
        return new Byte11Model(this.byte11).isLicense;
    }

    public int getProtocolVersionCode() {
        return this.protocolVersionCode;
    }

    public void setProtocolVersionCode(int protocolVersionCode) {
        this.protocolVersionCode = protocolVersionCode;
    }

    public int getByte11() {
        return this.byte11;
    }

    public void setByte11(int byte11) {
        this.byte11 = byte11;
    }

    public int getByte12() {
        return this.byte12;
    }

    public void setByte12(int byte12) {
        this.byte12 = byte12;
    }

    public int getByte15() {
        return this.byte15;
    }

    public void setByte15(int byte15) {
        this.byte15 = byte15;
    }

    public int getByte16() {
        return this.byte16;
    }

    public void setByte16(int byte16) {
        this.byte16 = byte16;
    }

    public int getByte17() {
        return this.byte17;
    }

    public void setByte17(int byte17) {
        this.byte17 = byte17;
    }

    public int getByte18() {
        return this.byte18;
    }

    public void setByte18(int byte18) {
        this.byte18 = byte18;
    }

    public int getInfo2Byte5() {
        return this.info2Byte5;
    }

    public void setInfo2Byte5(int info2Byte5) {
        this.info2Byte5 = info2Byte5;
    }

    public int getInfo2Byte6() {
        return this.info2Byte6;
    }

    public void setInfo2Byte6(int info2Byte6) {
        this.info2Byte6 = info2Byte6;
    }

    public int getInfo2Byte7() {
        return this.info2Byte7;
    }

    public void setInfo2Byte7(int info2Byte7) {
        this.info2Byte7 = info2Byte7;
    }

    public int getWatchfaceBgNum() {
        return this.watchfaceBgNum;
    }

    public void setWatchfaceBgNum(int watchfaceBgNum) {
        this.watchfaceBgNum = watchfaceBgNum;
    }

    public Byte11Model analyzeByte11() {
        return new Byte11Model(this.byte11);
    }

    public Byte12Model analyzeByte12() {
        return new Byte12Model(this.byte12);
    }

    public Byte15Model analyzeByte15() {
        return new Byte15Model(this.byte15);
    }

    public Byte16Model analyzeByte16() {
        return new Byte16Model(this.byte16);
    }

    public Byte17Model analyzeByte17() {
        return new Byte17Model(this.byte17);
    }

    public Info2Byte5Model analyzeInfo2Byte5() {
        return new Info2Byte5Model(this.info2Byte5);
    }

    public Info2Byte7Model analyzeInfo2Byte7() {
        return new Info2Byte7Model(this.info2Byte7);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nOTA版本：" + this.otaVersionCode);
        sb.append("\n手环版本号：" + this.bandVersionCode);
        sb.append("\n协议版本：" + this.protocolVersionCode);
        Byte11Model analyzeByte11 = analyzeByte11();
        sb.append("\n是否支持License:" + analyzeByte11.isLicense);
        sb.append("\n是否在OTA状态:" + analyzeByte11.isOta);
        Byte12Model analyzeByte12 = analyzeByte12();
        sb.append("\n是否支持支付宝：" + analyzeByte12.isAlp);
        sb.append("\n是否支持微信：" + analyzeByte12.isWxp);
        Byte15Model analyzeByte15 = analyzeByte15();
        sb.append("\n是否可设置步长：" + analyzeByte15.canSetStepLength);
        sb.append("\n是否可设置睡眠时间：" + analyzeByte15.canSetSleepTime);
        sb.append("\n是否可设置12小时制：" + analyzeByte15.canSet12Hours);
        sb.append("\n是否屏蔽微信运动、苹果健康：" + analyzeByte15.isOpenWechatSport);
        sb.append("\n是否支持心率预警：" + analyzeByte15.hasHeartWarn);
        sb.append("\n方案---->" + analyzeByte15.nordic);
        sb.append("\n是否需要手机序列号：" + analyzeByte15.needPhoneSerialNumber);
        sb.append("\n是否开启女性月经：" + analyzeByte15.menstruationSwitch);
        Byte16Model analyzeByte16 = analyzeByte16();
        sb.append("\n是否支持心电：" + analyzeByte16.hasECG);
        sb.append("\n是否支持连续心率省电模式：" + analyzeByte16.hasContinuousHeartRate);
        sb.append("\n是否支持血压功能：" + analyzeByte16.hasBloodPressure);
        sb.append("\n是否支持血氧功能：" + analyzeByte16.hasBloodOxygen);
        Byte17Model analyzeByte17 = analyzeByte17();
        sb.append("\n是否支持Facebook PagesManager：" + analyzeByte17.hasPagesManager);
        sb.append("\n是否支持Instagram：" + analyzeByte17.hasInstagram);
        sb.append("\n是否支持久坐提醒：" + analyzeByte17.hasJiuzuotixing);
        sb.append("\n是否支持连续心率：" + analyzeByte17.heartRateSaveBattery);
        sb.append("\n是否支持连续心率红外参数设置：" + analyzeByte17.heartRateHongwai);
        sb.append("\n是否支持加长消息内容：" + analyzeByte17.moreMessage);
        sb.append("\n是否支持天气功能：" + analyzeByte17.hasWeather);
        sb.append("\n是否支持通话功能：" + analyzeByte17.hasConverse);
        sb.append("\n分辨率：" + getResolution()[0] + "  " + getResolution()[1]);
        sb.append("\n屏幕类型 0圆屏  1方屏 2矩形屏：" + getScreenType());
        Info2Byte5Model analyzeInfo2Byte5 = analyzeInfo2Byte5();
        sb.append("\n是否支持免疫力：" + analyzeInfo2Byte5.hasImmunity);
        sb.append("\n是否支持体温：" + analyzeInfo2Byte5.hasBodyTemperature);
        sb.append("\n是否连续体温：" + analyzeInfo2Byte5.continuousTemperature);
        sb.append("\n0 ----> 公模APP屏保   1 ----> 私模APP屏保：" + analyzeInfo2Byte7().getType());
        return sb.toString();
    }

    public static class Byte11Model {
        private boolean isLicense = false;
        private boolean isOta = false;

        public Byte11Model(int byte11) {
            if (byte11 == -1) {
                return;
            }
            setLicense(((byte11 >> 1) & 1) == 1);
            setOta(((byte11 >> 2) & 1) == 1);
        }

        public boolean isLicense() {
            return this.isLicense;
        }

        public void setLicense(boolean license) {
            this.isLicense = license;
        }

        public boolean isOta() {
            return this.isOta;
        }

        public void setOta(boolean ota) {
            this.isOta = ota;
        }
    }

    public static class Byte12Model {
        private boolean isAlp = false;
        private boolean isWxp = false;

        public Byte12Model(int byte12) {
            if (byte12 == -1) {
                return;
            }
            setAlp((byte12 & 1) == 1);
            setWxp(((byte12 >> 4) & 1) == 1);
        }

        public boolean isAlp() {
            return this.isAlp;
        }

        public void setAlp(boolean alp) {
            this.isAlp = alp;
        }

        public boolean isWxp() {
            return this.isWxp;
        }

        public void setWxp(boolean wxp) {
            this.isWxp = wxp;
        }
    }

    public class Byte15Model {
        private boolean canSetStepLength = false;
        private boolean canSetSleepTime = false;
        private boolean canSet12Hours = false;
        private boolean isOpenWechatSport = false;
        private boolean hasHeartWarn = false;
        private int nordic = 1;
        private boolean needPhoneSerialNumber = false;
        private boolean menstruationSwitch = false;

        public Byte15Model(int byte15) {
            if (byte15 == -1) {
                return;
            }
            setCanSetStepLength((byte15 & 1) == 0);
            setCanSetSleepTime(((byte15 >> 1) & 1) == 0);
            setCanSet12Hours(((byte15 >> 2) & 1) == 0);
            setOpenWechatSport(((byte15 >> 3) & 1) == 0);
            setHasHeartWarn(((byte15 >> 4) & 1) == 1);
            if (((byte15 >> 5) & 1) == 0) {
                setNordic(0);
            } else {
                setNordic(1);
            }
            setNeedPhoneSerialNumber(((byte15 >> 6) & 1) == 1);
            setMenstruationSwitch(((byte15 >> 7) & 1) == 1);
        }

        public boolean isCanSetStepLength() {
            return this.canSetStepLength;
        }

        public void setCanSetStepLength(boolean canSetStepLength) {
            this.canSetStepLength = canSetStepLength;
        }

        public boolean isCanSetSleepTime() {
            return this.canSetSleepTime;
        }

        public void setCanSetSleepTime(boolean canSetSleepTime) {
            this.canSetSleepTime = canSetSleepTime;
        }

        public boolean isCanSet12Hours() {
            return this.canSet12Hours;
        }

        public void setCanSet12Hours(boolean canSet12Hours) {
            this.canSet12Hours = canSet12Hours;
        }

        public boolean isOpenWechatSport() {
            return this.isOpenWechatSport;
        }

        public void setOpenWechatSport(boolean openWechatSport) {
            this.isOpenWechatSport = openWechatSport;
        }

        public boolean isHasHeartWarn() {
            return this.hasHeartWarn;
        }

        public void setHasHeartWarn(boolean hasHeartWarn) {
            this.hasHeartWarn = hasHeartWarn;
        }

        public int getNordic() {
            return this.nordic;
        }

        public void setNordic(int nordic) {
            this.nordic = nordic;
        }

        public boolean isNeedPhoneSerialNumber() {
            return this.needPhoneSerialNumber;
        }

        public void setNeedPhoneSerialNumber(boolean needPhoneSerialNumber) {
            this.needPhoneSerialNumber = needPhoneSerialNumber;
        }

        public boolean isMenstruationSwitch() {
            return this.menstruationSwitch;
        }

        public void setMenstruationSwitch(boolean menstruationSwitch) {
            this.menstruationSwitch = menstruationSwitch;
        }
    }

    public class Byte16Model {
        boolean hasBloodOxygen;
        boolean hasBloodPressure;
        private boolean hasContinuousHeartRate;
        boolean hasECG;

        public Byte16Model(int byte16) {
            this.hasBloodPressure = false;
            this.hasBloodOxygen = false;
            this.hasECG = false;
            this.hasContinuousHeartRate = false;
            if (byte16 != 48) {
                switch (byte16) {
                    case 10:
                        this.hasBloodPressure = true;
                        break;
                    case 11:
                        this.hasContinuousHeartRate = true;
                        break;
                    case 12:
                        this.hasECG = true;
                        break;
                    case 13:
                        this.hasContinuousHeartRate = true;
                        this.hasBloodPressure = true;
                        break;
                    case 14:
                        this.hasContinuousHeartRate = true;
                        this.hasBloodPressure = true;
                        this.hasBloodOxygen = true;
                        break;
                    case 15:
                        this.hasContinuousHeartRate = true;
                        this.hasBloodOxygen = true;
                        break;
                    case 16:
                        this.hasBloodOxygen = true;
                        break;
                    default:
                        this.hasBloodPressure = true;
                        this.hasBloodOxygen = true;
                        break;
                }
            }
        }
    }

    public class Byte17Model {
        private boolean hasPagesManager = false;
        private boolean hasInstagram = false;
        private boolean hasJiuzuotixing = false;
        private boolean heartRateSaveBattery = false;
        private boolean heartRateHongwai = false;
        private boolean moreMessage = false;
        private boolean hasWeather = false;
        private boolean hasConverse = false;

        public Byte17Model(int byte17) {
            if (byte17 == -1) {
                return;
            }
            setHasPagesManager((byte17 & 1) == 1);
            setHasInstagram(((byte17 >> 1) & 1) == 1);
            setHasJiuzuotixing(((byte17 >> 2) & 1) == 1);
            setHeartRateSaveBattery(((byte17 >> 3) & 1) == 1);
            setHeartRateHongwai(((byte17 >> 4) & 1) == 1);
            setMoreMessage(((byte17 >> 5) & 1) == 1);
            setHasWeather(((byte17 >> 6) & 1) == 1);
            setHasConverse(((byte17 >> 7) & 1) == 1);
        }

        public boolean isHasPagesManager() {
            return this.hasPagesManager;
        }

        public void setHasPagesManager(boolean hasPagesManager) {
            this.hasPagesManager = hasPagesManager;
        }

        public boolean isHasInstagram() {
            return this.hasInstagram;
        }

        public void setHasInstagram(boolean hasInstagram) {
            this.hasInstagram = hasInstagram;
        }

        public boolean isHasJiuzuotixing() {
            return this.hasJiuzuotixing;
        }

        public void setHasJiuzuotixing(boolean hasJiuzuotixing) {
            this.hasJiuzuotixing = hasJiuzuotixing;
        }

        public boolean isHeartRateSaveBattery() {
            return this.heartRateSaveBattery;
        }

        public void setHeartRateSaveBattery(boolean heartRateSaveBattery) {
            this.heartRateSaveBattery = heartRateSaveBattery;
        }

        public boolean isHeartRateHongwai() {
            return this.heartRateHongwai;
        }

        public void setHeartRateHongwai(boolean heartRateHongwai) {
            this.heartRateHongwai = heartRateHongwai;
        }

        public boolean isMoreMessage() {
            return this.moreMessage;
        }

        public void setMoreMessage(boolean moreMessage) {
            this.moreMessage = moreMessage;
        }

        public boolean isHasWeather() {
            return this.hasWeather;
        }

        public void setHasWeather(boolean hasWeather) {
            this.hasWeather = hasWeather;
        }

        public boolean isHasConverse() {
            return this.hasConverse;
        }

        public void setHasConverse(boolean hasConverse) {
            this.hasConverse = hasConverse;
        }
    }

    public class Byte18Model {
        private int[] resolution;
        private int screenType;
        private float size;

        public Byte18Model(int byte18) {
            this.size = 0.0f;
            this.resolution = new int[]{0, 0};
            this.screenType = -1;
            if (byte18 == -1) {
                return;
            }
            switch (byte18) {
                case 0:
                    this.size = 0.0f;
                    this.resolution = new int[]{0, 0};
                    this.screenType = -1;
                    break;
                case 1:
                    this.size = 1.3f;
                    this.resolution = new int[]{240, 240};
                    this.screenType = 1;
                    break;
                case 2:
                    this.size = 1.3f;
                    this.resolution = new int[]{240, 240};
                    this.screenType = 1;
                    break;
                case 3:
                    this.size = 0.96f;
                    this.resolution = new int[]{80, 160};
                    this.screenType = 2;
                    break;
                case 4:
                    this.size = 0.96f;
                    this.resolution = new int[]{80, 160};
                    this.screenType = 2;
                    break;
                case 5:
                    this.size = 1.14f;
                    this.resolution = new int[]{135, 240};
                    this.screenType = 2;
                    break;
                case 6:
                    this.size = 1.14f;
                    this.resolution = new int[]{135, 240};
                    this.screenType = 2;
                    break;
                case 7:
                    this.size = 1.28f;
                    this.resolution = new int[]{240, 240};
                    this.screenType = 0;
                    break;
                case 8:
                    this.size = 1.28f;
                    this.resolution = new int[]{240, 240};
                    this.screenType = 0;
                    break;
                case 9:
                    this.size = 1.57f;
                    this.resolution = new int[]{240, 288};
                    this.screenType = 2;
                    break;
                case 10:
                    this.size = 1.57f;
                    this.resolution = new int[]{240, 288};
                    this.screenType = 2;
                    break;
                case 11:
                    this.size = 1.72f;
                    this.resolution = new int[]{240, 283};
                    this.screenType = 2;
                    break;
                case 12:
                    this.size = 1.72f;
                    this.resolution = new int[]{240, 283};
                    this.screenType = 2;
                    break;
                case 13:
                    this.size = 1.3f;
                    this.resolution = new int[]{360, 360};
                    this.screenType = 0;
                    break;
                case 14:
                    this.size = 1.3f;
                    this.resolution = new int[]{360, 360};
                    this.screenType = 0;
                    break;
                case 15:
                    this.size = 1.77f;
                    this.resolution = new int[]{320, Response.ALTERNATIVE_SERVICE};
                    this.screenType = 2;
                    break;
                case 16:
                    this.size = 1.77f;
                    this.resolution = new int[]{320, Response.ALTERNATIVE_SERVICE};
                    this.screenType = 2;
                    break;
                case 17:
                    this.size = 1.75f;
                    this.resolution = new int[]{320, 385};
                    this.screenType = 2;
                    break;
                case 18:
                    this.size = 1.75f;
                    this.resolution = new int[]{320, 385};
                    this.screenType = 2;
                    break;
                case 19:
                    this.size = 1.6f;
                    this.resolution = new int[]{320, 360};
                    this.screenType = 2;
                    break;
                case 20:
                    this.size = 1.6f;
                    this.resolution = new int[]{320, 360};
                    this.screenType = 2;
                    break;
                case 21:
                    this.size = 1.91f;
                    this.resolution = new int[]{240, 296};
                    this.screenType = 2;
                    break;
                case 22:
                    this.size = 1.91f;
                    this.resolution = new int[]{240, 296};
                    this.screenType = 2;
                    break;
                case 23:
                    this.size = 1.45f;
                    this.resolution = new int[]{412, 412};
                    this.screenType = 0;
                    break;
                case 24:
                    this.size = 1.45f;
                    this.resolution = new int[]{412, 412};
                    this.screenType = 0;
                    break;
                case 25:
                    this.size = 2.0f;
                    this.resolution = new int[]{410, Videoio.CAP_PROP_XI_CC_MATRIX_33};
                    this.screenType = 2;
                    break;
                default:
                    switch (byte18) {
                        case 32:
                            this.size = 2.0f;
                            this.resolution = new int[]{410, Videoio.CAP_PROP_XI_CC_MATRIX_33};
                            this.screenType = 2;
                            break;
                        case 33:
                            this.size = 1.43f;
                            this.resolution = new int[]{Videoio.CAP_PROP_XI_COOLING, Videoio.CAP_PROP_XI_COOLING};
                            this.screenType = 0;
                            break;
                        case 34:
                            this.size = 1.43f;
                            this.resolution = new int[]{Videoio.CAP_PROP_XI_COOLING, Videoio.CAP_PROP_XI_COOLING};
                            this.screenType = 0;
                            break;
                        case 35:
                            this.size = 1.3f;
                            this.resolution = new int[]{360, 360};
                            this.screenType = 0;
                            break;
                        case 36:
                            this.size = 1.3f;
                            this.resolution = new int[]{360, 360};
                            this.screenType = 0;
                            break;
                        case 37:
                        case 38:
                            this.size = 1.49f;
                            this.resolution = new int[]{480, 480};
                            this.screenType = 0;
                            break;
                    }
            }
        }
    }

    public class Info2Byte5Model {
        boolean continuousTemperature;
        boolean hasBodyTemperature;
        boolean hasImmunity;

        public Info2Byte5Model(int info2Byte5) {
            this.hasImmunity = false;
            this.hasBodyTemperature = false;
            this.continuousTemperature = false;
            if (info2Byte5 == -1) {
                return;
            }
            this.hasImmunity = (info2Byte5 & 1) == 1;
            boolean z = ((info2Byte5 >> 1) & 1) == 1;
            boolean z2 = ((info2Byte5 >> 2) & 1) == 1;
            this.continuousTemperature = z2;
            this.hasBodyTemperature = z || z2;
        }
    }

    public class Info2Byte7Model {
        private int type;

        public Info2Byte7Model(int info2Byte7) {
            this.type = info2Byte7;
        }

        public int getType() {
            return this.type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }

    public int getScreenType() {
        DeviceScreen screen = DeviceLocalSupports.getScreen(this.mac);
        if (screen != null) {
            return screen.getScreenType();
        }
        return new Byte18Model(this.byte18).screenType;
    }

    public int[] getResolution() {
        DeviceScreen screen = DeviceLocalSupports.getScreen(this.mac);
        if (screen != null) {
            return new int[]{screen.getWidth(), screen.getHeight()};
        }
        return new Byte18Model(this.byte18).resolution;
    }

    public float getScreenSize() {
        return new Byte18Model(this.byte18).size;
    }

    public int getRotate() {
        return DeviceLocalSupports.getRotate(this.mac);
    }
}
