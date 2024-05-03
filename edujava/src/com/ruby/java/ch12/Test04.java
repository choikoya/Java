package com.ruby.java.ch12;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("a.txt")); //input열고
				ByteArrayOutputStream out = new ByteArrayOutputStream();){ //output에 씀 버퍼에 계속 쌓임
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
			byte[] arr = out.toByteArray();
			String s = new String(arr);
			System.out.println(s);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
