import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;

public class Secure {
  public static void main(String... args) {
    final PooledPBEStringEncryptor e = new PooledPBEStringEncryptor();
    e.setPoolSize(1);
    e.setPassword("123456");
    e.setKeyObtentionIterations(1000000);
    e.setAlgorithm("PBEWithMD5AndTripleDES");
    String encrypted = e.encrypt("test");
    System.out.println(encrypted);
    String decrypted = e.decrypt(encrypted);
    System.out.println(decrypted);
  }
}
