package p.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		int port = 4000;
		try {
			DatagramSocket doc = new DatagramSocket(port);

			byte[] data = new byte[60000];

			DatagramPacket dp = new DatagramPacket(data, data.length);

		} catch (SocketException e) {
			e.printStackTrace();
		}

	}

}
