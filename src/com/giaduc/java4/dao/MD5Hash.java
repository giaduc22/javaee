package com.giaduc.java4.dao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class MD5Hash {

	public String hashingPassword(String password) {

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			byte[] digest = md.digest();
			String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
			return myHash;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return null;

	}
}
