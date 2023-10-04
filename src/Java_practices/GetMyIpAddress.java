package Java_practices;

import java.net.InetAddress;

public class GetMyIpAddress {
	public static void main(String args[])throws Exception{
		/* public static InetAdress getLocalhost()throws
		 *  unknownHostexception: Returns the address of the local
		 *  host. this is achieved by retrieving the name of the host
		 *  from the system.then resolving that name into an InetAddress.
		 *  Note: The resolved address may be cached for a short period of time*/
		
		InetAddress myIP=InetAddress.getLocalHost();
		
		/*public string getHostAddress(); Returns the IP address* string in textual presentation.*/
		
		
		System.out.println("my IP Address is:");
		System.out.println(myIP.getHostAddress());
		
	}

}

