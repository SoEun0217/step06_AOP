package kosta.test.video;

import kosta.test.service.Player;

public class VideoImpl implements Player {
	public VideoImpl() {}
	@Override
	public void start(int i) {
		System.out.println("VideoImpl  start(int i) 호출..");
	}

	@Override
	public String pause() {
		System.out.println("VideoImpl  pause() 호출..");
		return "Video pause 리턴값!!";
	}

	@Override
	public void stop() {
		System.out.println("VideoImpl stop() 호출..");
	}

}
