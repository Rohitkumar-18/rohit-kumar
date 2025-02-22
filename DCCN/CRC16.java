public class CRC16 
	{
 private static final int POLYNOMIAL = 0x1021;
 public static int calculateCRC16(byte[] data) 
	 {
 int crc = 0xFFFF; for (byte b : data) 
	 {
 crc ^= (b & 0xFF) << 8;
 for (int i = 0; i < 8; i++) 
	 {
 if ((crc & 0x8000) != 0) 

 crc = (crc << 1) ^ POLYNOMIAL;
 } else 
{
 crc <<= 1; // Shift CRC left by 1 bit
 }
 }
 }
 crc ^= 0xFFFF; // Finalize CRC calculation
 return crc;
 }
 public static void main(String[] args) 
	 {
 // Example data packet
 byte[] dataPacket = "Hello, CRC!".getBytes();
 // Calculate CRC-16 checksum
 int crc16Checksum = calculateCRC16(dataPacket);
 System.out.println("Data packet: " + new String(dataPacket));
 System.out.println("CRC-16checksum:"+Integer.toHexString 
crc16Checksum).toUpperCase());
 }
}