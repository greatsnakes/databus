package com.linkedin.databus.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Utils {
	public static long getUnsignedInt(ByteBuffer buffer, int index) {
		return (buffer.getInt(index) & 0xffffffffL);
	}

	public static void putUnsignedInt(ByteBuffer buffer, int index, long value) {
		buffer.putInt(index, (int) (value & 0xffffffffL));
	}


	/**
	 * Translate the given buffer into a string
	 * @param buffer The buffer to translate
	 * @param encoding The encoding to use in translating bytes to characters
	 * @throws UnsupportedEncodingException 
	 */
	public static String byteBufferToString(ByteBuffer buffer, String encoding) throws UnsupportedEncodingException {
		byte[] bytes = new byte[buffer.remaining()];
		buffer.get(bytes);
		return (new String(bytes, encoding)	);
	}

	public static String byteBufferToString(ByteBuffer buffer)  {
		return (new String(byteBufferToBytes(buffer)));
	}

	public static byte[] byteBufferToBytes(ByteBuffer buffer)  {
		byte[] bytes = null;
		if (buffer.hasArray())
		{
			bytes = buffer.array();
		}
		else
		{
			bytes = new byte[buffer.remaining()];
			buffer.get(bytes);
		}
		return bytes;
	}

	/**
	 * Open a channel for the given file
	 * @throws FileNotFoundException 
	 */
	 public static FileChannel openChannel(File file, boolean mutable) throws FileNotFoundException  {
		 if(mutable)
			 return (new RandomAccessFile(file, "rw").getChannel());
		 else
			 return (new FileInputStream(file).getChannel());
	 }

		/*
		 * Utility method to convert an InetSocketAdress (ipAddress + port) to BigInteger
		 * Useful for ordering objects like DatabusServerCoordinates which are based on INetSocketAddresses 
		 */
		public static BigInteger ipToBigInt(InetSocketAddress ipAddr)
		{
			final int BYTES_IN_INTEGER = 4;
			
			byte[] addrBytes = ipAddr.getAddress().getAddress();
			
			int port = ipAddr.getPort();
			
			
			byte[] addrPlusPortBytes = new byte[addrBytes.length + BYTES_IN_INTEGER];
			ByteBuffer destBuf = ByteBuffer.wrap(addrPlusPortBytes);
			destBuf.put(addrBytes);
			destBuf.putInt(port);
			
			BigInteger bigInt = new BigInteger(destBuf.array());
			
		    return bigInt;
		}
		
		
		
		public static synchronized int getAvailablePort(int startPort)
		{
			int port = startPort;

			while (! portAvailable(port))
			{
				port++;
			}

			return port;
		}


		/**
		 * Checks to see if a specific port is available.
		 *
		 * @param port the port to check for availability
		 */
		public static boolean portAvailable(int port) {
			if (port < 1200 || port > 65000) {
				throw new IllegalArgumentException("Invalid start port: " + port);
			}

			ServerSocket ss = null;
			DatagramSocket ds = null;
			try {
				ss = new ServerSocket(port);
				ss.setReuseAddress(true);
				ds = new DatagramSocket(port);
				ds.setReuseAddress(true);
				return true;
			} catch (IOException e) {
			} finally {
				if (ds != null) {
					ds.close();
				}

				if (ss != null) {
					try {
						ss.close();
					} catch (IOException e) {
						/* should not be thrown */
					}
				}
			}

			return false;
		}
}
