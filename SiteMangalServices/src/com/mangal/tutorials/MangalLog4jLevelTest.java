package com.mangal.tutorials;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import com.mangal.tutorials.MangalLog4jLevel;

public class MangalLog4jLevelTest {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(MangalLog4jLevelTest.class);
		logger.log(MangalLog4jLevel.MANGAL, "I am MANGALLog4jLevelTest log");
		logger.log(Level.DEBUG, "I am a DEBUG message");
	}

}
