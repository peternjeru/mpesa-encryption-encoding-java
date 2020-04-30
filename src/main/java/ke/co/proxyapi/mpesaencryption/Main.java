package ke.co.proxyapi.mpesaencryption;

public class Main
{
    public static void main(String args[]) throws Exception
    {
        //how to get initiator encrypted password
        InitiatorPasswordEncryption app = new InitiatorPasswordEncryption();
        String ciphertext = app.getEncryptedPasswd("Safcom121!");
        System.out.println("Encrypted password:\n" + ciphertext);
        System.out.println();

        //how to get API Authentication header
        ApiAuthenticationHeaderEncoding headerEncoding = new ApiAuthenticationHeaderEncoding();
        String headerEncodingEncoding = headerEncoding.getEncoding("mVjAxwuJd2xwtAFfaI6tjuffBNHCvVAi", "14HKuEbrj01psKRa");
        System.out.println("Auth Header: " + headerEncodingEncoding);
        System.out.println();

        StkPushPasskeyEncoding passkeyEncoding = new StkPushPasskeyEncoding();
        StkPushPasskeyEncoding.StkPassword passkeyEncodingEncoded = passkeyEncoding.getEncoded(
                "174379",
                "bfb279f9aa9bdbcf158e97dd71a467cd2e0c893059b10f78e6b72ada1ed2c919");
        System.out.println("LnM Password: " + passkeyEncodingEncoded.getPassword() + ", " + passkeyEncodingEncoded.getTimestamp());
    }
}
