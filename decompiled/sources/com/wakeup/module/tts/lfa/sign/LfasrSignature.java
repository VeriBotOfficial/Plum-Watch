package com.wakeup.module.tts.lfa.sign;

import com.wakeup.module.tts.lfa.utils.CryptTools;
import java.security.SignatureException;

/* loaded from: classes4.dex */
public class LfasrSignature extends AbstractSignature {
    public LfasrSignature(String str, String str2) {
        super(str, str2, null);
    }

    @Override // com.wakeup.module.tts.lfa.sign.AbstractSignature
    public String getSigna() throws SignatureException {
        if (this.signa == null || this.signa.length() == 0) {
            setOriginSign(generateOriginSign());
            this.signa = generateSignature();
        }
        return this.signa;
    }

    public String generateSignature() throws SignatureException {
        return CryptTools.hmacEncrypt("HmacSHA1", getOriginSign(), getKey());
    }

    @Override // com.wakeup.module.tts.lfa.sign.AbstractSignature
    public String generateOriginSign() throws SignatureException {
        return CryptTools.md5Encrypt(getId() + getTs());
    }
}
