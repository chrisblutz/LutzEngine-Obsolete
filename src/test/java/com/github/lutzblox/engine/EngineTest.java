package com.github.lutzblox.engine;

import com.github.lutzblox.engine.debugging.DebugConfig;

public class EngineTest {

	public static void main(String[] args){
		
		DebugConfig.enable(true);
		//DebugConfig.setPrintResolutions(true);
		//DebugConfig.setPrintSettings(true);
		LutzEngine.setGameName("Test Game");
		LutzEngine.startEngine();
	}
}
