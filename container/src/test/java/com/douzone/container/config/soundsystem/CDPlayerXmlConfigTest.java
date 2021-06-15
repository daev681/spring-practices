package com.douzone.container.config.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.soundsystem.CDPlayer;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/douzone/container/config/soundsystem/CDPlayerConfigContext.xml"})
public class CDPlayerXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule();
	
	
	@Autowired
	private CDPlayer cdPlayer;
	
	
	@Test
	public void testCDPlayerNotNull() {
		assertNotNull(cdPlayer);		
	}
	
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("Playing 붕붕by김하은", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}