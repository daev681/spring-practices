package com.douzone.container.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Autowire  할려면 사용해야함
@Component
public class CDPlayer{
		
    @Autowired
	private CompactDisc cd;
	
	public void play() {
		 cd.play();
	}
}
