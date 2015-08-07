package com.whty.cms.network.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.whty.cms.common.base.BaseController;

@Controller
public class ApplyController extends BaseController {

	
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

}
