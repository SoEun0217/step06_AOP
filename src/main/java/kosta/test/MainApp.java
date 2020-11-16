package kosta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kosta.test.service.Player;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("kosta/test/applicationContext.xml");
		Player tv = context.getBean("tvImpl",Player.class);
		Player video = context.getBean("videoImpl",Player.class);
		Player audio = context.getBean("audioImpl",Player.class);
		tv.start(2);
		tv.pause();
		tv.stop();
		System.out.println("----------------------");
		audio.start(2);
		audio.pause();
		audio.stop();
		System.out.println("----------------------");
		video.start(2);
		video.pause();
		video.stop();
	}

}
