package com.jgabrielfreitas;

import com.jgabrielfreitas.hmac.HmacCryptography;

/**
 * Created by JGabrielFreitas on 08/06/16.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        HmacCryptography hmacCryptography = new HmacCryptography();
        System.out.println("hmacCryptography.cryptographyMessage(\"123\", \"http://www.google.com\") = " + hmacCryptography.cryptographyMessage("123456", "http://www.google.com"));

    }
}
