package com.brilliance.test;

import java.util.UUID;

public class TestUUID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
            for (int i = 0; i < 10; i++) {
				String id = UUID.randomUUID().toString().replaceAll("-", "");
				System.out.println(id);
			}
            
	}

}
