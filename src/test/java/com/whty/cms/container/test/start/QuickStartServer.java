package com.whty.cms.container.test.start;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.eclipse.jetty.server.Server;

public class QuickStartServer {

	public static final int PORT = 8280;
	public static final String CONTEXT = "/network";
	static String hostName = null;
	static {
		InetAddress inet;
		try {
			inet = InetAddress.getLocalHost();
			hostName = inet.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		if (hostName == null) {
			hostName = "localhost";
		}
	}
	public static final String BASE_URL = "http://" + hostName + ":" + PORT
			+ CONTEXT;
	public static final String[] TLD_JAR_NAMES = new String[] { "spring-webmvc" };

	public static void main(String[] args) throws Exception {

		// use Eclipse JDT compiler
		System.setProperty("org.apache.jasper.compiler.disablejsr199", "true");

		// 启动Jetty
		Server server = JettyFactory.createServerInSource(PORT, CONTEXT);
		JettyFactory.setTldJarNames(server, TLD_JAR_NAMES);

		try {
			server.start();

			System.out.println("Server running at " + BASE_URL);
			System.out.println("Hit Enter to reload the application");

			// 等待用户输入回车重载应用.
			while (true) {
				char c = (char) System.in.read();
				if (c == '\n') {
					JettyFactory.reloadContext(server);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
