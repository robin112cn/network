package com.whty.cms.tspm.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.whty.cms.base.pojo.BaseFields;
import com.whty.cms.base.service.BaseFieldsService;
import com.whty.cms.common.base.BaseController;

@Controller
@RequestMapping("/field")
public class FieldUtil extends BaseController {



	@Autowired
	private BaseFieldsService baseFieldsService;

	/**
	 * 根据字段英文名称查询字段集合
	 * @param request
	 * @param response
	 * @param name EN_FIELD_NAME 字段英文名称
	 */
	@RequestMapping(value = "/getFields", method = RequestMethod.POST)
	public void getFields(HttpServletRequest request, HttpServletResponse response,String fieldName) {
		if(StringUtils.isEmpty(fieldName)){
			return;
		}
		List<BaseFields> baseFields = baseFieldsService.selectEnabledByEnFieldName(fieldName);
		Map<String, String> fields = new LinkedHashMap<String, String>();
		for (BaseFields item : baseFields) {
			fields.put(item.getValueField(), item.getDisplayField());
		}
		writeJSONResult(fields, response);
	}
}
