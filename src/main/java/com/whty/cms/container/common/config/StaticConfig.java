package com.whty.cms.container.common.config;

import org.springframework.beans.factory.annotation.Value;

public class StaticConfig {
	private static String ctxPath;

	public static String getCtxPath() {
		return ctxPath;
	}

	@Value("${ctxPath}")
	public static void setCtxPath(String ctxPath) {
		StaticConfig.ctxPath = ctxPath;
	}
}
