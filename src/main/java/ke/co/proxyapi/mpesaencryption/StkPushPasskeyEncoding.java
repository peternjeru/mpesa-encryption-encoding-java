package ke.co.proxyapi.mpesaencryption;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class StkPushPasskeyEncoding
{
    public StkPassword getEncoded(String shortcode, String plainPasskey)
    {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String fullString = shortcode + plainPasskey + timeStamp;
        String encoded = Base64.getEncoder().encodeToString(fullString.getBytes(Charset.forName("UTF-8")));
        return new StkPassword(encoded, timeStamp);
    }

    @Getter
    @AllArgsConstructor
    public static class StkPassword
    {
        private String password;
        private String timestamp;
    }
}
