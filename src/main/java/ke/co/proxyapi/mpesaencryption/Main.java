package ke.co.proxyapi.mpesaencryption;

public class Main
{
    public static void main(String args[]) throws Exception
    {
        //how to get initiator encrypted password
        InitiatorPasswordEncryption app = new InitiatorPasswordEncryption();
        String ciphertext = app.getEncryptedPasswd("Safcom121!");
        System.out.println(ciphertext);
        System.out.println();

        //how to get API Authentication header
        AuthenticationHeaderEncoding encoding = new AuthenticationHeaderEncoding();
        String encoded = encoding.getEncoding("mVjAxwuJd2xwtAFfaI6tjuffBNHCvVAi", "14HKuEbrj01psKRa");
        System.out.println(encoded);
    }
}
