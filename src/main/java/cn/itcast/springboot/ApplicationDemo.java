package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationDemo {

	public static void main(String[] args) {
		// springboot开发的程序的入口方法
//		SpringApplication.run(ApplicationDemo.class, args);
		SpringApplication application = new SpringApplication(ApplicationDemo.class);
		application.setBannerMode(Mode.OFF);
		application.run(args); // 发布服务
	}
}
