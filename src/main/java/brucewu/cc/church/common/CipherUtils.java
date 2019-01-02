package brucewu.cc.church.common;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

public class CipherUtils {

    private static final String AES_PASSWORD = "WeekReport2018";

    private static final String IV = "WeekReport2018";

    private static final String CIPHER_MODE = "AES/CBC/PKCS5Padding";

    private static StringBuffer str = new StringBuffer();
    /**
     * Encode with Base64
     */
    public static String encodeWithBase64(String origin){
        str.setLength(0);
        try {
            str.append(Base64.encodeBase64String(origin.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return str.toString();
    }

    /**
     * Decode with Base64
     */
    public static String decodeWithBase64(String origin){
        str.setLength(0);
        try {
            str.append(Base64.encodeBase64String(origin.getBytes("UTF-8")));
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }

        return str.toString();
    }

    /**
     * 加密(结果为16进制字符串)
     **/
    public static String AESEncrypt(String content) {
        byte[] data = null;
        try {
            data = content.getBytes("UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        data = encryptByte(data, AES_PASSWORD, IV);
        String result = encodeWithBase64(data.toString());
        return result;
    }

    /**
     * 加密字节数据
     **/
    public static byte[] encryptByte(byte[] content, String password, String iv) {
        try {
            SecretKeySpec key = createKey(password);
            Cipher cipher = Cipher.getInstance(CIPHER_MODE);
            cipher.init(Cipher.ENCRYPT_MODE, key, createIV(iv));
            byte[] result = cipher.doFinal(content);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密(输出结果为字符串)
     **/
    public static String AESDecrypt(String content) {
        byte[] data = null;
        try {
            data = decodeWithBase64(content).getBytes("UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        data = decryptByte(data, AES_PASSWORD, IV);
        if (data == null)
            return null;
        String result = null;
        try {
            result = new String(data, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 解密字节数组
     **/
    public static byte[] decryptByte(byte[] content, String password, String iv) {
        try {
            SecretKeySpec key = createKey(password);
            Cipher cipher = Cipher.getInstance(CIPHER_MODE);
            cipher.init(Cipher.DECRYPT_MODE, key, createIV(iv));
            byte[] result = cipher.doFinal(content);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 创建密钥
     **/
    private static SecretKeySpec createKey(String key) {
        byte[] data = null;
        if (key == null) {
            key = "";
        }
        StringBuffer sb = new StringBuffer(16);
        sb.append(key);
        while (sb.length() < 16) {
            sb.append("0");
        }
        if (sb.length() > 16) {
            sb.setLength(16);
        }
        try {
            data = sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new SecretKeySpec(data, "AES");
    }

    private static IvParameterSpec createIV(String password) {
        byte[] data = null;
        if (password == null) {
            password = "";
        }
        StringBuffer sb = new StringBuffer(16);
        sb.append(password);
        while (sb.length() < 16) {
            sb.append("0");
        }
        if (sb.length() > 16) {
            sb.setLength(16);
        }
        try {
            data = sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new IvParameterSpec(data);
    }

    /**
     * 字节数组转成16进制字符串
     **/
    public static String byte2hex(byte[] b) { // 一个字节的数，
        StringBuffer sb = new StringBuffer(b.length * 2);
        String tmp = "";
        for (int n = 0; n < b.length; n++) {
            // 整数转成十六进制表示
            tmp = (Integer.toHexString(b[n] & 0XFF));
            if (tmp.length() == 1) {
                sb.append("0");
            }
            sb.append(tmp);
        }
        return sb.toString().toUpperCase(); // 转成大写
    }

    /**
     * 将hex字符串转换成字节数组
     **/
    private static byte[] hex2byte(String inputString) {
        if (inputString == null || inputString.length() < 2) {
            return new byte[0];
        }
        inputString = inputString.toLowerCase();
        int l = inputString.length() / 2;
        byte[] result = new byte[l];
        for (int i = 0; i < l; ++i) {
            String tmp = inputString.substring(2 * i, 2 * i + 2);
            result[i] = (byte) (Integer.parseInt(tmp, 16) & 0xFF);
        }
        return result;
    }

//
//    public static string AESEncrypt(string text, string password, string iv)
//    {
//        RijndaelManaged rijndaelCipher = new RijndaelManaged();
//        rijndaelCipher.Mode = CipherMode.ECB;
//        rijndaelCipher.Padding = PaddingMode.PKCS7;
//        rijndaelCipher.KeySize = 128;
//        rijndaelCipher.BlockSize = 128;
//        byte[] pwdBytes = System.Text.Encoding.UTF8.GetBytes(password);
//        byte[] keyBytes = new byte[16];
//        int len = pwdBytes.Length;
//        if (len > keyBytes.Length) len = keyBytes.Length; System.Array.Copy(pwdBytes, keyBytes, len);
//        rijndaelCipher.Key = keyBytes; byte[] ivBytes = System.Text.Encoding.UTF8.GetBytes(iv);
//        rijndaelCipher.IV = new byte[16];
//        ICryptoTransform transform = rijndaelCipher.CreateEncryptor();
//        byte[] plainText = Encoding.UTF8.GetBytes(text);
//        byte[] cipherBytes = transform.TransformFinalBlock(plainText, 0, plainText.Length);
//        return Convert.ToBase64String(cipherBytes);
//    }
//
//
//    /// <summary>
//    /// AES解密
//    /// </summary>
//    /// <param name="text"></param>
//    /// <param name="password"></param>
//    /// <param name="iv"></param>
//    /// <returns></returns>
//    public static string AESDecrypt(string text, string password, string iv)
//    {
//        RijndaelManaged rijndaelCipher = new RijndaelManaged();
//        rijndaelCipher.Mode = CipherMode.ECB;
//        rijndaelCipher.Padding = PaddingMode.PKCS7;
//        rijndaelCipher.KeySize = 128;
//        rijndaelCipher.BlockSize = 128;
//        byte[] encryptedData = Convert.FromBase64String(text);
//        byte[] pwdBytes = System.Text.Encoding.UTF8.GetBytes(password);
//        byte[] keyBytes = new byte[16]; int len = pwdBytes.Length;
//        if (len > keyBytes.Length) len = keyBytes.Length;
//        System.Array.Copy(pwdBytes, keyBytes, len);
//        rijndaelCipher.Key = keyBytes;
//        byte[] ivBytes = System.Text.Encoding.UTF8.GetBytes(iv);
//        rijndaelCipher.IV = ivBytes; ICryptoTransform transform = rijndaelCipher.CreateDecryptor();
//        byte[] plainText = transform.TransformFinalBlock(encryptedData, 0, encryptedData.Length);
//        return Encoding.UTF8.GetString(plainText);
//    }



}
