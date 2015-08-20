package com.whty.cms.network.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import com.whty.cms.common.base.BaseController;

@Controller
public class GlobalController extends BaseController {

	
	/**
	 * 显示主列表页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/apply", method = RequestMethod.GET)
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView("/network/apply_wizard");
		return mv;
	}

	@RequestMapping(value = "/setLang")
	public String langChange(
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value = "langType", defaultValue = "zh") String langType) {
		if (langType.equals("zh")) {
			Locale locale = new Locale("zh", "CN");
			// request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,locale);
			(new CookieLocaleResolver()).setLocale(request, response, locale);
		} else if (langType.equals("en")) {
			Locale locale = new Locale("en", "US");
			// request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,locale);
			(new CookieLocaleResolver()).setLocale(request, response, locale);
		} else
			// request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,LocaleContextHolder.getLocale());
			(new CookieLocaleResolver()).setLocale(request, response,
					LocaleContextHolder.getLocale());
		
		return "login";
	}

}
