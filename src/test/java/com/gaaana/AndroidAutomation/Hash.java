package com.gaaana.AndroidAutomation;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.testng.annotations.Test;

public class Hash {

	@Test
	public void hashgen() {
		String regtoken,
		email ="ankur13@grr.la",
		name="Ankur",
		dob="1990-01-23",
		pwd="123456",
		salt = "771417c6bf5f834e4b31491df3506128",
		track_id="17297779",
		//saltst="gaana.tatasky.streaming.key-d5be4bb9f75c4f749d64d1df689bc3bc-f34c944ae10e954ce282e3284a86bc35-V7";
		saltst="gaana.chromecast.streaming.key-60a01f6d236e3171f6c85ff65e5d54a3-a09c26583ae7a721ca425a8536e3b61e-V7";
		
//		//String key = "123df";
//		String regsig = email.concat(name).concat(dob).concat(pwd).concat(salt);
//		System.out.println("reg sign is " + regsig);
//		
//		String md5 = getmd5(regsig);
//		System.out.println(md5);
		
	//	String base64 = enBase64(regtoken);
		String md5hmac = hmacDigest("HMACMD5", enBase64("17637647"), getmd5(saltst));
		System.out.println("Hash hmac is " + md5hmac);
		
	}

	public static String hmacDigest(final String algo, final String msg, final String keyString) {
		String digest = null;
		try {
			SecretKeySpec key = new SecretKeySpec((keyString).getBytes("UTF-8"), algo);
			Mac mac = Mac.getInstance(algo);
			mac.init(key);

			byte[] rawHmac = mac.doFinal(msg.getBytes("UTF-8"));
			byte[] hexBytes = new Hex().encode(rawHmac);
			digest = new String(hexBytes, "UTF-8");

		} catch (Exception ignored) {
		}
		return digest;
	}
	
	public String getmd5(String key){
		String fin = DigestUtils.md5Hex(key.getBytes());
		System.out.println("MD5 of " + key + " is " + fin);
		return fin;
	}
	
	public String enBase64(String key){
		String fin = Base64.encodeBase64String(key.getBytes());
		System.out.println("Base 64 encode of " + key + " is" + fin);
		return fin;
	}
	
}
