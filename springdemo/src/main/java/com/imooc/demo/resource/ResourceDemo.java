package com.imooc.demo.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.*;

/**
 * @ Author     ：zhoule
 * @ Date       ：Created in 14:56 2020-09-30
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
public class ResourceDemo {
	public static void main(String[] args) throws IOException {
		FileSystemResource fileSystemResource = new FileSystemResource("/Users/zhoule/gitlibrary/spring-framework-5.1" +
				".x/springdemo/src/main/java/com/imooc/demo/resource/test.txt");
		File file = fileSystemResource.getFile();
		System.out.println(file.length());
		try(OutputStream outputStream = fileSystemResource.getOutputStream();
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream))
			) {
			bufferedWriter.write("Hello World");
			bufferedWriter.flush();
		}
	}
}
