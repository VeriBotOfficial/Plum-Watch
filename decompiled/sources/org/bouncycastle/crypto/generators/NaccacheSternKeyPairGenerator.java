package org.bouncycastle.crypto.generators;

import com.baidu.platform.comapi.UIMsg;
import com.wakeup.common.DeviceFeatures;
import com.wakeup.commponent.module.sport.SportTypeConstant;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.util.BigIntegers;
import org.opencv.videoio.Videoio;

/* loaded from: classes8.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, DeviceFeatures.E_BOOK, DeviceFeatures.MAP_MODE, 181, DeviceFeatures.DIAL_THUMB, 193, DeviceFeatures.NETWORK_SHARE, 199, 211, NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, FTPReply.ENTERING_PASSIVE_MODE, 229, 233, TelnetCommand.EOR, 241, 251, 257, SportTypeConstant.Course_chest_primary, 269, SportTypeConstant.Course_leg_advanced, 277, 281, 283, SportTypeConstant.Course_32, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, Videoio.CAP_PROP_XI_AEAG_LEVEL, 421, 431, Videoio.CAP_PROP_XI_DECIMATION_HORIZONTAL, Videoio.CAP_PROP_XI_AEAG_ROI_OFFSET_X, 443, Videoio.CAP_PROP_XI_WB_KG, 457, Videoio.CAP_PROP_XI_OUTPUT_DATA_BIT_DEPTH, Videoio.CAP_PROP_XI_OUTPUT_DATA_PACKING, Videoio.CAP_PROP_XI_TARGET_TEMP, Videoio.CAP_PROP_XI_CC_MATRIX_00, 487, 491, Videoio.CAP_PROP_XI_ACQ_FRAME_BURST_COUNT, 503, 509, 521, UIMsg.MsgDefine.MSG_COMMON_ENGINE, Videoio.CAP_PROP_XI_LUT_EN, Videoio.CAP_PROP_XI_IS_DEVICE_EXIST, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i) {
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 != i; i2++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i2]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i, int i2, SecureRandom secureRandom) {
        BigInteger createRandomPrime;
        do {
            createRandomPrime = BigIntegers.createRandomPrime(i, i2, secureRandom);
        } while (createRandomPrime.bitLength() != i);
        return createRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i) {
        int nextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((i * (secureRandom.nextInt() & Integer.MAX_VALUE)) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i2 = nextInt % i;
        } while ((nextInt - i2) + (i - 1) < 0);
        return i2;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            vector3.addElement(vector.elementAt(i));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j;
        BigInteger generatePrime;
        BigInteger add;
        BigInteger generatePrime2;
        boolean z;
        BigInteger bigInteger;
        BigInteger add2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigInteger6;
        BigInteger bigInteger7;
        PrintStream printStream;
        StringBuilder sb;
        int i;
        BigInteger createRandomPrime;
        int i2;
        SecureRandom secureRandom;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean isDebug = this.param.isDebug();
        if (isDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector permuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigInteger8 = ONE;
        BigInteger bigInteger9 = bigInteger8;
        for (int i3 = 0; i3 < permuteList.size() / 2; i3++) {
            bigInteger9 = bigInteger9.multiply((BigInteger) permuteList.elementAt(i3));
        }
        for (int size = permuteList.size() / 2; size < permuteList.size(); size++) {
            bigInteger8 = bigInteger8.multiply((BigInteger) permuteList.elementAt(size));
        }
        BigInteger multiply = bigInteger9.multiply(bigInteger8);
        int bitLength = (((strength - multiply.bitLength()) - 48) / 2) + 1;
        BigInteger generatePrime3 = generatePrime(bitLength, certainty, random);
        BigInteger generatePrime4 = generatePrime(bitLength, certainty, random);
        if (isDebug) {
            System.out.println("generating p and q");
        }
        BigInteger shiftLeft = generatePrime3.multiply(bigInteger9).shiftLeft(1);
        BigInteger shiftLeft2 = generatePrime4.multiply(bigInteger8).shiftLeft(1);
        long j2 = 0;
        while (true) {
            j = j2 + 1;
            generatePrime = generatePrime(24, certainty, random);
            add = generatePrime.multiply(shiftLeft).add(ONE);
            if (add.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        generatePrime2 = generatePrime(24, certainty, random);
                    } while (generatePrime.equals(generatePrime2));
                    BigInteger multiply2 = generatePrime2.multiply(shiftLeft2);
                    z = isDebug;
                    bigInteger = ONE;
                    add2 = multiply2.add(bigInteger);
                    if (add2.isProbablePrime(certainty)) {
                        break;
                    }
                    isDebug = z;
                }
                bigInteger2 = shiftLeft2;
                if (!multiply.gcd(generatePrime.multiply(generatePrime2)).equals(bigInteger)) {
                    continue;
                } else {
                    if (add.multiply(add2).bitLength() >= strength) {
                        break;
                    }
                    if (z) {
                        System.out.println("key size too small. Should be " + strength + " but is actually " + add.multiply(add2).bitLength());
                    }
                }
            } else {
                z = isDebug;
                bigInteger2 = shiftLeft2;
            }
            j2 = j;
            isDebug = z;
            shiftLeft2 = bigInteger2;
        }
        if (z) {
            bigInteger3 = generatePrime4;
            System.out.println("needed " + j + " tries to generate p and q.");
        } else {
            bigInteger3 = generatePrime4;
        }
        BigInteger multiply3 = add.multiply(add2);
        BigInteger multiply4 = add.subtract(bigInteger).multiply(add2.subtract(bigInteger));
        if (z) {
            System.out.println("generating g");
        }
        long j3 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger4 = add;
            bigInteger5 = add2;
            int i4 = 0;
            while (i4 != permuteList.size()) {
                BigInteger divide = multiply4.divide((BigInteger) permuteList.elementAt(i4));
                while (true) {
                    j3++;
                    i = i4;
                    createRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    i2 = strength;
                    secureRandom = random;
                    if (createRandomPrime.modPow(divide, multiply3).equals(ONE)) {
                        i4 = i;
                        strength = i2;
                        random = secureRandom;
                    }
                }
                vector.addElement(createRandomPrime);
                i4 = i + 1;
                strength = i2;
                random = secureRandom;
            }
            int i5 = strength;
            SecureRandom secureRandom2 = random;
            bigInteger6 = ONE;
            for (int i6 = 0; i6 < permuteList.size(); i6++) {
                bigInteger6 = bigInteger6.multiply(((BigInteger) vector.elementAt(i6)).modPow(multiply.divide((BigInteger) permuteList.elementAt(i6)), multiply3)).mod(multiply3);
            }
            int i7 = 0;
            while (true) {
                if (i7 >= permuteList.size()) {
                    BigInteger modPow = bigInteger6.modPow(multiply4.divide(BigInteger.valueOf(4L)), multiply3);
                    BigInteger bigInteger10 = ONE;
                    if (!modPow.equals(bigInteger10)) {
                        if (!bigInteger6.modPow(multiply4.divide(generatePrime), multiply3).equals(bigInteger10)) {
                            if (!bigInteger6.modPow(multiply4.divide(generatePrime2), multiply3).equals(bigInteger10)) {
                                if (!bigInteger6.modPow(multiply4.divide(generatePrime3), multiply3).equals(bigInteger10)) {
                                    bigInteger7 = bigInteger3;
                                    if (!bigInteger6.modPow(multiply4.divide(bigInteger7), multiply3).equals(bigInteger10)) {
                                        break;
                                    }
                                    if (z) {
                                        System.out.println("g has order phi(n)/b\n g: " + bigInteger6);
                                    }
                                } else if (z) {
                                    printStream = System.out;
                                    sb = new StringBuilder("g has order phi(n)/a\n g: ");
                                    printStream.println(sb.append(bigInteger6).toString());
                                }
                            } else if (z) {
                                printStream = System.out;
                                sb = new StringBuilder("g has order phi(n)/q'\n g: ");
                                printStream.println(sb.append(bigInteger6).toString());
                            }
                        } else if (z) {
                            printStream = System.out;
                            sb = new StringBuilder("g has order phi(n)/p'\n g: ");
                            printStream.println(sb.append(bigInteger6).toString());
                        }
                    } else if (z) {
                        printStream = System.out;
                        sb = new StringBuilder("g has order phi(n)/4\n g:");
                        printStream.println(sb.append(bigInteger6).toString());
                    }
                } else if (!bigInteger6.modPow(multiply4.divide((BigInteger) permuteList.elementAt(i7)), multiply3).equals(ONE)) {
                    i7++;
                } else if (z) {
                    System.out.println("g has order phi(n)/" + permuteList.elementAt(i7) + "\n g: " + bigInteger6);
                }
            }
            bigInteger7 = bigInteger3;
            bigInteger3 = bigInteger7;
            add2 = bigInteger5;
            add = bigInteger4;
            strength = i5;
            random = secureRandom2;
        }
        if (z) {
            System.out.println("needed " + j3 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + permuteList);
            System.out.println("sigma:...... " + multiply + " (" + multiply.bitLength() + " bits)");
            System.out.println("a:.......... " + generatePrime3);
            System.out.println("b:.......... " + bigInteger7);
            System.out.println("p':......... " + generatePrime);
            System.out.println("q':......... " + generatePrime2);
            System.out.println("p:.......... " + bigInteger4);
            System.out.println("q:.......... " + bigInteger5);
            System.out.println("n:.......... " + multiply3);
            System.out.println("phi(n):..... " + multiply4);
            System.out.println("g:.......... " + bigInteger6);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigInteger6, multiply3, multiply.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigInteger6, multiply3, multiply.bitLength(), permuteList, multiply4));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
    }
}
