package com.exacttarget.subscribersearch.web;

import java.text.ParseException;

import net.minidev.json.JSONObject;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.MACVerifier;

public class JWTUtil {

	public static String decodeToString(String encodedValue, String secret) throws Exception {
		return decode(encodedValue, secret).toString();		
	}
	
	public static JSONObject decode(String encodedValue, String secret) throws Exception {

		JWSObject jwsObject = null;

		try {
			jwsObject = JWSObject.parse(encodedValue);

		} catch (ParseException e) {

			throw new Exception("Couldn't parse JWS object: " + e.getMessage());
		}

		System.out.println("JWS object successfully parsed");

		JWSVerifier verifier = new MACVerifier(secret.getBytes());

		boolean verifiedSignature = false;

		try {
			verifiedSignature = jwsObject.verify(verifier);

		} catch (JOSEException e) {

			System.err.println("Couldn't verify signature: " + e.getMessage());
		}

		if (verifiedSignature) {

			System.out.println("Verified JWS signature!");
		} else {
			throw new Exception("Bad JWS signature!");
		}

		return jwsObject.getPayload().toJSONObject();

	}

}
