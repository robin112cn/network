package com.whty.uc.rest;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class UserRestTest {

	String baseUri = "http://localhost:8080/";

	static RestTemplate restTemplate;

	private static Server server;

	@BeforeClass
	public static void beforeClass() throws Exception {
		// 创建一个server
		server = new Server(8080);
		WebAppContext context = new WebAppContext();
		String webapp = "src/main/webapp";
		context.setDescriptor(webapp + "/WEB-INF/web.xml"); // 指定web.xml配置文件
		context.setResourceBase(webapp); // 指定webapp目录
		context.setContextPath("/");
		context.setParentLoaderPriority(true);

		server.setHandler(context);
		server.start();
		restTemplate = new RestTemplate();
//		restTemplate.getMessageConverters().add(
//				new MappingJackson2HttpMessageConverter());

	}

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop(); // 当测试结束时停止服务器
	}

	
	@Test
	public void testTRRegister() throws Exception {
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Content-Type", MediaType.TEXT_PLAIN_VALUE+ ";charset=UTF-8");
//		String json = "{\"version\":\"1\",\"fieldLimit\":\"111\",\"tag\":\"0304\",\"authLevel\":\"222\"}";
//		
//		String uu = restTemplate.postForObject("http://10.8.40.136:8088/tspapi/{data}", null, String.class ,json);
//		
//		System.out.println(uu);
		
//		String url = "http://10.8.40.136:8088/tspapi/";
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost method = new HttpPost("http://10.8.40.149:8180/psm/cardInfo/find/11");
        // 接收参数json列表  
//        JSONObject jsonParam = new JSONObject();
//        jsonParam.put("version", "1");
//        jsonParam.put("fieldLimit", "111");
//        jsonParam.put("tag", "0304");
//        jsonParam.put("authLevel", "222");
//        url += jsonParam.toString();
        
        //StringEntity entity = new StringEntity(jsonParam.toString(),"utf-8");//解决中文乱码问题
        //entity.setContentEncoding("UTF-8");
        //entity.setContentType("application/json");
        //method.setEntity(entity);
//        System.out.println(url);
        
        HttpResponse result = httpClient.execute(method);
        String resData = EntityUtils.toString(result.getEntity());
        System.out.println(resData);
	}
}
