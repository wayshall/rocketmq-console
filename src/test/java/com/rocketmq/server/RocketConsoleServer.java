package com.rocketmq.server;

import org.onetwo.common.web.tomcatmini.ServerConfig;
import org.onetwo.common.web.tomcatmini.TomcatServer;

public class RocketConsoleServer {

	public static void main(String[] args) {
		ServerConfig config = new ServerConfig();
		config.setPort(7080);
		TomcatServer.create(config).start();
	}
}
