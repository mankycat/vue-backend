package brucewu.cc.church.common;
import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

public class CipherUtils {

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
}
