package com.abhishek;

import java.util.Base64;
import java.util.Base64.Encoder;

public class pwdEncode {
	
	public String encode(String str) {
		
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(str.getBytes());
		return encode.toString();
	}

}
