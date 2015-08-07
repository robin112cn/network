package com.whty.cms.tspm.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.cms.base.common.DataTableQueryMySQL;
import com.whty.cms.common.base.BaseController;
import com.whty.cms.common.base.DataTableQuery;
import com.whty.cms.common.util.CheckEmpty;
import com.whty.cms.common.util.DateUtil;
import com.whty.cms.tspm.pojo.TokenInfo;
import com.whty.cms.tspm.pojo.TokenInfoExample;
import com.whty.cms.tspm.service.TokenInfoService;

@Controller
@RequestMapping("/tokenManage")
public class TokenManageController extends BaseController {

	@Autowired
	private TokenInfoService tokenInfoService;

	/**
	 * 显示主列表页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView("/tspm/tokenManage/tokenInfoUI");
		return mv;
	}

	/**
	 * 查询
	 * 
	 * @param request
	 * @param response
	 * @param tokenInfo
	 * @throws IOException
	 */
	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public void find(HttpServletRequest request, HttpServletResponse response, TokenInfo tokenInfo) throws IOException {
		DataTableQuery dt = new DataTableQueryMySQL(request);
		Map<String, Object> result = buildTableData(dt, tokenInfo);
		writeJSONResult(result, response, DateUtil.yyyy_MM_dd_HH_mm_ss_EN);

	}

	/**
	 * 构建数据
	 * 
	 * @param length
	 * @param start
	 * @param draw
	 * @param modules
	 * @return
	 * @throws IOException
	 */
	private Map<String, Object> buildTableData(DataTableQuery dt, TokenInfo tokenInfo) throws IOException {
		// 当前页数
		int currentNumber = dt.getPageStart() / dt.getPageLength() + 1;
		PageBounds pageBounds = new PageBounds(currentNumber, dt.getPageLength());
		TokenInfoExample exmple = buildExample(dt, tokenInfo);
		PageList<TokenInfo> tokenInfos = tokenInfoService.selectByExamplePaging(exmple, pageBounds);
		Map<String, Object> records = new HashMap<String, Object>();
		records.put("data", tokenInfos);
		records.put("draw", dt.getPageDraw());
		records.put("recordsTotal", tokenInfos.getPaginator().getTotalCount());
		records.put("recordsFiltered", tokenInfos.getPaginator().getTotalCount());
		return records;
	}

	/**
	 * 构建查询条件
	 * 
	 * @param dt
	 * @param tokenInfo
	 * @return
	 */
	private TokenInfoExample buildExample(DataTableQuery dt, TokenInfo tokenInfo) {
		TokenInfoExample exmple = new TokenInfoExample();
		TokenInfoExample.Criteria criteria = exmple.createCriteria();
		// 查询条件
		if (CheckEmpty.isNotEmpty(tokenInfo.getPan())) {
			criteria.andPanLike("%" + tokenInfo.getPan() + "%");
		}
		if (CheckEmpty.isNotEmpty(tokenInfo.getBin())) {
			criteria.andBinLike("%" + tokenInfo.getBin() + "%");
		}
		if (CheckEmpty.isNotEmpty(tokenInfo.getTrId())) {
			criteria.andTrIdLike("%" + tokenInfo.getTrId() + "%");
		}
		// if (tokenInfo.getColumnId() != null
		// && !tokenInfo.getColumnId().equalsIgnoreCase("")
		// && !tokenInfo.getColumnId().equals(
		// tathing_portal_column_root)) {
		// criteria.andColumnIdEqualTo(tokenInfo.getColumnId());
		// }
		// 排序条件
		if (CheckEmpty.isNotEmpty(dt.getOrderBy()) && CheckEmpty.isNotEmpty(dt.getOrderParam())) {
			//
			StringBuilder orderByClause = new StringBuilder("");
			orderByClause.append(dt.getOrderParam()).append(" ").append(dt.getOrderBy());
			exmple.setOrderByClause(orderByClause.toString());
		}
		return exmple;
	}

}
