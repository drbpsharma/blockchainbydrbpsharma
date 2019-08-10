/**
 * Example by Dr B P Sharma
 * Using Cryptography in Java
 * A program to convert a string to SHA256 cipher
 */
import java.security.MessageDigest;
import java.util.Scanner;
public class HashingTest {
    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to encrypt : ");
        String s=sc.nextLine();
        
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] sha256digest = digest.digest(s.getBytes());
        String sha256cipher=bytesToHex(sha256digest);
        System.out.println("SHA-256 cipher is "+sha256cipher);
    }
}
