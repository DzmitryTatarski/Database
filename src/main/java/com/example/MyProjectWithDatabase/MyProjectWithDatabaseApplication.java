package com.example.MyProjectWithDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectWithDatabaseApplication {

	public static void main(String[] args) {

		int a = 64;  //8
		StringBuilder res = new StringBuilder("");
		for (int i = 0; i < a; i++) {
			res.append("a");
		}

//		String b = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
//		String[] bb = b.split("");
//		StringBuilder bbb = new StringBuilder("");
//		for (int i = 0; i < bb.length; i++) {
//			bbb.append(bb[i]).append(" ");
//		}

		System.out.println(res);
//		SpringApplication.run(MyProjectWithDatabaseApplication.class, args);
	}

}
