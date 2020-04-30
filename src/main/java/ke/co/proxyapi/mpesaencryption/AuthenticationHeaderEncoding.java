package ke.co.proxyapi.mpesaencryption;

import java.nio.charset.Charset;
import java.util.Base64;

public class AuthenticationHeaderEncoding
{
    public String getEncoding(String consumerKey, String consumerSecret)
    {
        String fullString = consumerKey + ":" + consumerSecret;
        String encoded = Base64.getEncoder().encodeToString(fullString.getBytes(Charset.forName("UTF-8")));
        return encoded;
    }
}
