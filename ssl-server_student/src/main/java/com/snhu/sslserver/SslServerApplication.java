package com.snhu.sslserver;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";


@RestController
class ServerController{
	
	@RequestMapping("/checksum")
	public String checkSum() {
		return "Hello World Check Sum!";
	}
	
    @RequestMapping("/hash")
    public String myHash() throws NoSuchAlgorithmException {
    	String data = "Sarah Harrison";
    	MessageDigest digest = MessageDigest.getInstance("SHA-256");
    	byte[] encoded = digest.digest(data.getBytes(StandardCharsets.UTF_8));
    	String hex = bytesToHex(encoded);
        return "<p>Data: " + data + "<br>Name of Cipher Algorithm Used: " + digest.getAlgorithm() + "<br>Value: " + hex;
    }
    
   
    private static String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b: bytes) {
          builder.append(String.format("%02x", b));
        }
        return builder.toString();
      }
}