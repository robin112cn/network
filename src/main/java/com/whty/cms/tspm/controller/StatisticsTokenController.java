package com.whty.cms.tspm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import com.whty.cms.tspm.common.Constant;
import com.whty.cms.tspm.dto.Period;
import com.whty.cms.tspm.pojo.StatisticsToken;
import com.whty.cms.tspm.pojo.StatisticsTokenExample;
import com.whty.cms.tspm.service.StatisticsTokenService;
import com.whty.cms.tspm.util.ExcelUtil;

@Controller
@RequestMapping("/statisticsToken")
public class StatisticsTokenController extends BaseController {

	@Autowired
	private StatisticsTokenService statisticsTokenService;

	/**
	 * 显示主列表页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView("/tspm/statistics/statisticsTokenUI");
		return mv;
	}

	/**
	 * 查询
	 * 
	 * @param request
	 * @param response
	 * @param statisticsToken
	 * @throws IOException
	 */
	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public void find(HttpServletRequest request, HttpServletResponse response, Period period) throws IOException {
		DataTableQuery dt = new DataTableQueryMySQL(request);
		Map<String, Object> result = buildTableData(dt, period);
		writeJSONResult(result, response, DateUtil.yyyy_MM_dd_HH_mm_ss_EN);
	}

	/**
	 * 导出
	 * 
	 * @param request
	 * @param response
	 * @param statisticsToken
	 * @throws IOException
	 */
	@RequestMapping(value = "/export")
	public void export(HttpServletRequest request, HttpServletResponse response, Period period) throws IOException {

		StatisticsTokenExample example = buildExample(null, period);
		List<StatisticsToken> statisticsTokens = null;
		if(Constant.Period.MONTHS.equals(period.getPeriod())){
			statisticsTokens = statisticsTokenService.selectByExampleMonth(example);
		} else if(Constant.Period.QUARTERS.equals(period.getPeriod())) {
			statisticsTokens = statisticsTokenService.selectByExampleQuarter(example);
		} else if(Constant.Period.YEARS.equals(period.getPeriod())) {
			statisticsTokens = statisticsTokenService.selectByExampleYear(example);
		} else {
			statisticsTokens = statisticsTokenService.selectByExample(example);
		}
		//生成数据
		String[] headers = new String[3];
		headers[0] = "统计时间";
		headers[1] = "Token生成次数";
		headers[2] = "Token销毁次数";
		
		List<String[]> rows = new ArrayList<String[]>();
		for (StatisticsToken item : statisticsTokens) {
			String[] row = new String[3];
			row[0] = item.getStatisticsTime();
			row[1] = item.getTokenCreateSumNum().toString();
			row[2] = item.getTokenDestorySumNum().toString();
			rows.add(row);
		}
		
		String name = "Token信息统计";
		ExcelUtil excelUtil = new ExcelUtil();
		excelUtil.createWorkbook(name, headers, rows);
		excelUtil.export(response, name);
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
	private Map<String, Object> buildTableData(DataTableQuery dt, Period period) throws IOException {
		// 当前页数
		int currentNumber = dt.getPageStart() / dt.getPageLength() + 1;
		PageBounds pageBounds = new PageBounds(currentNumber, dt.getPageLength());
		StatisticsTokenExample example = buildExample(dt, period);

		PageList<StatisticsToken> statisticsTokens = null;
		if(Constant.Period.MONTHS.equals(period.getPeriod())){
			statisticsTokens = statisticsTokenService.selectByExamplePagingMonth(example, pageBounds);
		} else if(Constant.Period.QUARTERS.equals(period.getPeriod())) {
			statisticsTokens = statisticsTokenService.selectByExamplePagingQuarter(example, pageBounds);
		} else if(Constant.Period.YEARS.equals(period.getPeriod())) {
			statisticsTokens = statisticsTokenService.selectByExamplePagingYear(example, pageBounds);
		} else {
			statisticsTokens = statisticsTokenService.selectByExamplePaging(example, pageBounds);
		}
		Map<String, Object> records = new HashMap<String, Object>();
		records.put("data", statisticsTokens);
		records.put("draw", dt.getPageDraw());
		records.put("recordsTotal", statisticsTokens.getPaginator().getTotalCount());
		records.put("recordsFiltered", statisticsTokens.getPaginator().getTotalCount());
		return records;
	}

	/**
	 * 构建查询条件
	 * 
	 * @param dt
	 * @param statisticsToken
	 * @return
	 */
	private StatisticsTokenExample buildExample(DataTableQuery dt, Period period) {
		StatisticsTokenExample exmple = new StatisticsTokenExample();
		StatisticsTokenExample.Criteria criteria = exmple.createCriteria();
		// 查询条件
		if(Constant.Period.MONTHS.equals(period.getPeriod())){
			//按月统计
			if (CheckEmpty.isNotEmpty(period.getStartDate())) {
				criteria.andStatisticsTimeGreaterThanOrEqualTo(period.getStartDate());
			}
			if (CheckEmpty.isNotEmpty(period.getEndDate())) {
				criteria.andStatisticsTimeLessThanOrEqualTo(period.getEndDate());
			}
		} else if(Constant.Period.QUARTERS.equals(period.getPeriod())) {
			//按季统计
			if (CheckEmpty.isNotEmpty(period.getStartDate())) {
				criteria.andStatisticsTimeGreaterThanOrEqualTo(period.getStartDate() + "-1");
			}
			if (CheckEmpty.isNotEmpty(period.getEndDate())) {
				criteria.andStatisticsTimeLessThanOrEqualTo(period.getEndDate() + "-4");
			}
		} else if(Constant.Period.YEARS.equals(period.getPeriod())) {
			//按年统计
			if (CheckEmpty.isNotEmpty(period.getStartDate())) {
				criteria.andStatisticsTimeGreaterThanOrEqualTo(period.getStartDate());
			}
			if (CheckEmpty.isNotEmpty(period.getEndDate())) {
				criteria.andStatisticsTimeLessThanOrEqualTo(period.getEndDate());
			}
		} else {
			//按日统计
			if (CheckEmpty.isNotEmpty(period.getStartDate())) {
				criteria.andStatisticsTimeGreaterThanOrEqualTo(period.getStartDate());
			}
			if (CheckEmpty.isNotEmpty(period.getEndDate())) {
				criteria.andStatisticsTimeLessThanOrEqualTo(period.getEndDate());
			}
		}
		// if (statisticsToken.getColumnId() != null
		// && !statisticsToken.getColumnId().equalsIgnoreCase("")
		// && !statisticsToken.getColumnId().equals(
		// tathing_portal_column_root)) {
		// criteria.andColumnIdEqualTo(statisticsToken.getColumnId());
		// }
		// 排序条件
		if (dt!= null && CheckEmpty.isNotEmpty(dt.getOrderBy()) && CheckEmpty.isNotEmpty(dt.getOrderParam())) {
			//
			StringBuilder orderByClause = new StringBuilder("");
			orderByClause.append(dt.getOrderParam()).append(" ").append(dt.getOrderBy());
			exmple.setOrderByClause(orderByClause.toString());
		}
		
		return exmple;
	}

}
