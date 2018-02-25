package it.polito.teaching.cv;
import java.io.*;
import java.net.*;

public class Sender {
	
	
	
	
  public static void main(String args[]) {
	  
	  
	  
    try {

      String host = "10.0.0.128";
      int port = 8001;

      byte[] message = "X: Y:".getBytes();

      // Get the internet address of the specified host
      InetAddress address = InetAddress.getByName(host);

      
      for(int i = 0; i < 10; i++){
    	  	
    	  	  String msgString = "int: "+i;
    	  	  message = msgString.getBytes();
		      // Initialize a datagram packet with data and address
		      DatagramPacket packet = new DatagramPacket(message, message.length, address, port);
		
		      // Create a datagram socket, send the packet through it, close it.
		      DatagramSocket dsocket = new DatagramSocket();
		      dsocket.send(packet);
		      dsocket.close();
      }
      
      
    } catch (Exception e) {
      System.err.println(e);
    }
  }
  
  public void send(double xVal, double yVal){
	  
	  
	    try {

	        String host = "10.0.0.128";
	        int port = 8001;

	        String stringMsg = "X: "+ xVal + " ---- Y: " + yVal;
	        byte[] message = stringMsg.getBytes();

	        // Get the internet address of the specified host
	        InetAddress address = InetAddress.getByName(host);

	  		      // Initialize a datagram packet with data and address
	  		      DatagramPacket packet = new DatagramPacket(message, message.length, address, port);
	  		
	  		      // Create a datagram socket, send the packet through it, close it.
	  		      DatagramSocket dsocket = new DatagramSocket();
	  		      dsocket.send(packet);
	  		      dsocket.close();
	        
	        
	      } catch (Exception e) {
	        System.err.println(e);
	      }
	    
	    
	  
  }
  
}