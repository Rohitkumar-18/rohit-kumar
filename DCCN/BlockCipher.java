import java.util.Scanner;
public class BlockCipher {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the plaintext block (8 bits): ");
 String plaintextBlock = scanner.nextLine();
 System.out.print("Enter the key (8 bits): ");
 String key = scanner.nextLine();
 String ciphertextBlock = blockCipherEncrypt(plaintextBlock, key);
 System.out.println("Plaintext Block: " + plaintextBlock);
 System.out.println("Ciphertext Block: " + ciphertextBlock);
 scanner.close();
 }
 public static String blockCipherEncrypt(String plaintextBlock, String key) {
 String[] roundKeys = keyExpansion(key); 
 String cipherBlock = initialPermutation(plaintextBlock); 
 
 for (String roundKey : roundKeys) {
 cipherBlock = roundFunction(cipherBlock, roundKey); 
 }
 
 String ciphertextBlock = finalPermutation(cipherBlock); 
 return ciphertextBlock;
 }
 
 public static String[] keyExpansion(String key) {
 String[] roundKeys = new String[3];
 roundKeys[0] = key;
 roundKeys[1] = key + "1";
 roundKeys[2] = key + "2";
 return roundKeys;
 }
 
 public static String initialPermutation(String block) {
 return block.substring(4) + block.substring(0, 4);
 }
 
 public static String roundFunction(String block, String roundKey) {
 return xorOperation(block, roundKey);
 }
 
 public static String finalPermutation(String block) {
 return block.substring(4) + block.substring(0, 4);
 }
 
 public static String xorOperation(String block, String key) {
 int length = Math.min(block.length(), key.length());
 StringBuilder result = new StringBuilder();
 
 for (int i = 0; i < length; i++) {
 result.append((char) (block.charAt(i) ^ key.charAt(i)));
 }
 
 return result.toString();
 }
}
