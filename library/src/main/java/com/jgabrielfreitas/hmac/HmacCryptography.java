package com.jgabrielfreitas.hmac;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by JGabrielFreitas on 08/06/16.
 */
public class HmacCryptography {

    private ShaHash CRYPTOGRAPHY_METHOD;

    public void setCryptographyMethod(ShaHash cryptographyMethod) {
        this.CRYPTOGRAPHY_METHOD = cryptographyMethod;
    }

    public String cryptographyMessage(String key, String message) throws Exception {

        Mac mac;
        String result = "";
        byte[] bytesKey = key.getBytes();
        final SecretKeySpec secretKey = new SecretKeySpec(bytesKey, CRYPTOGRAPHY_METHOD.toString());
        mac = Mac.getInstance(CRYPTOGRAPHY_METHOD.toString());
        mac.init(secretKey);
        final byte[] macData = mac.doFinal(message.getBytes());
        byte[] hex = new Hex().encode(macData);
        result = new String(hex, "ISO-8859-1");
        return result.toUpperCase();
    }
}
