import java.util.*;
public class CustomCRC 
{
 private static final int CUSTOM_POLYNOMIAL = 0x8408; 
 public static int calculateCustomCRC(byte[] data) 
{ int crc = 0xFFFF; // Initial CRC value
 for (byte b : data)
{
 crc ^= (b & 0xFF) << 8;
 for (int i = 0; i < 8; i++)
{
 if ((crc & 0x8000) != 0)
{
 crc = (crc << 1) ^ CUSTOM_POLYNOMIAL;
 } else 
 {
 crc <<= 1; // Shift CRC left by 1 bit
 }
 }
 }
 crc &= 0xFFFF; // Finalize CRC calculation
 return crc;
 }
 public static void main(String[] args) 
{
 // Example data packet
 byte[] dataPacket = "Hello, Custom CRC!".getBytes();
 // Calculate custom CRC checksum
 int customCRC = calculateCustomCRC(dataPacket);
 System.out.println("Data packet: " + new String(dataPacket));
 System.out.println("Custom CRC checksum: " + Integer.toHexString
(customCRC).toUpperCase());
 }
}
