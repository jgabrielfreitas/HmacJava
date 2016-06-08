package com.jgabrielfreitas.hmac;

import org.junit.Assert;
import org.junit.Test;

import static com.jgabrielfreitas.hmac.ShaHash.*;

/**
 * Created by JGabrielFreitas on 08/06/16.
 */
public class HmacCryptographyTest {

    /**
     * Site model to test HMAC SHA512 cryptography
     * http://billatnapier.com/security01.aspx
     */

    private final String MESSAGE = "http://www.google.com";
    private final String KEY     = "123456";

    @Test
    public void test_sha_md5() throws Exception {

        HmacCryptography cryptography = new HmacCryptography();
        cryptography.setCryptographyMethod(HmacMD5);
        String expected = "A8BC964104FC461A89FE3D7EEC8CA19C";
        Assert.assertEquals(expected, cryptography.cryptographyMessage(KEY, MESSAGE));
    }

    @Test
    public void test_sha_1() throws Exception {

        HmacCryptography cryptography = new HmacCryptography();
        cryptography.setCryptographyMethod(HmacSHA1);
        String expected = "6376564BC2581CEEED13F98CE44D4C59D8CFA930";
        Assert.assertEquals(expected, cryptography.cryptographyMessage(KEY, MESSAGE));
    }

    @Test
    public void test_sha_256() throws Exception {

        HmacCryptography cryptography = new HmacCryptography();
        cryptography.setCryptographyMethod(HmacSHA256);
        String expected = "16E60776EAC2A2D156791BEBD32340914D2B3B71660F79D3CDA37C6F1374CBAE";
        Assert.assertEquals(expected, cryptography.cryptographyMessage(KEY, MESSAGE));
    }


    @Test
    public void test_sha_384() throws Exception {

        HmacCryptography cryptography = new HmacCryptography();
        cryptography.setCryptographyMethod(HmacSHA384);
        String expected = "AB3D09A31B4864514B8249BF56B34FC755C090BD873B361773AC94B37371A467D4A9543DF2C1AA85B6A47192E9C3B76E";
        Assert.assertEquals(expected, cryptography.cryptographyMessage(KEY, MESSAGE));
    }

    @Test
    public void test_sha512_true() throws Exception {

        HmacCryptography cryptography = new HmacCryptography();
        String expected = "23DBAA38D1CB02AFD0E70AE916F80EADC97C4F70EE3D385825839D0A79051C03498986C8CB92AE00E0F48AAD64771A907B683C1C1B105AC32AB5CA66FDD24F0C";
        Assert.assertEquals(expected, cryptography.cryptographyMessage(KEY, MESSAGE));

    }
}
