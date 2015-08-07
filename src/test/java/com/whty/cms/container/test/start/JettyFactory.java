package com.whty.cms.container.test.start;

import java.util.List;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppClassLoader;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.xml.XmlConfiguration;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

public class JettyFactory {

  private static final String DEFAULT_WEBAPP_PATH = "src/main/webapp";
  private static final String WINDOWS_WEBDEFAULT_PATH = "jetty/webdefault-windows.xml";
  private static final String DEFAULT_SERVER_PATH = "jetty/jetty.xml";

  /**
   * 创建用于开发运行调试的Jetty Server, 以src/main/webapp为Web应用目录.
   */
  public static Server createServerInSource(int port, String contextPath) {

    Server server = null;
    try {
      Resource jettyConfig = Resource.newSystemResource(DEFAULT_SERVER_PATH);
      XmlConfiguration configuration = new XmlConfiguration(jettyConfig.getInputStream());
      server = (Server) configuration.configure();
    } catch (Exception e) {
      e.printStackTrace();
    }

    //设置在JVM退出时关闭Jetty的hook
    server.setStopAtShutdown(true);

    SelectChannelConnector connector = new SelectChannelConnector();
    connector.setPort(port);
    //解决Windows下重复启动Jetty居然不报告端口冲突的问题.
    connector.setReuseAddress(false);
    server.setConnectors(new Connector[] { connector });

    WebAppContext webContext = new WebAppContext(DEFAULT_WEBAPP_PATH, contextPath);
    //修改webdefault.xml，解决Windows下Jetty Lock住静态文件的问题.
    webContext.setDefaultsDescriptor(WINDOWS_WEBDEFAULT_PATH);
    server.setHandler(webContext);

    return server;
  }

  /**
   * 设置除jstl-*.jar外其他含tld文件的jar包的名称.
   * jar名称不需要版本号，如sitemesh, shiro-web
   */
  public static void setTldJarNames(Server server, String... jarNames) {
    WebAppContext context = (WebAppContext) server.getHandler();
    List<String> jarNameExprssions = Lists.newArrayList(".*/jstl-[^/]*\\.jar$", ".*/.*taglibs[^/]*\\.jar$");
    for (String jarName : jarNames) {
      jarNameExprssions.add(".*/" + jarName + "-[^/]*\\.jar$");
    }

    context.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern",
        StringUtils.join(jarNameExprssions, '|'));

  }

  /**
   * 快速重新启动application，重载target/classes与target/test-classes.
   */
  public static void reloadContext(Server server) throws Exception {
    WebAppContext context = (WebAppContext) server.getHandler();

    System.out.println("Application reloading");
    context.stop();

    WebAppClassLoader classLoader = new WebAppClassLoader(context);
    classLoader.addClassPath("target/classes");
    classLoader.addClassPath("target/test-classes");
    context.setClassLoader(classLoader);

    context.start();

    System.out.println("Application reloaded");
  }

}
