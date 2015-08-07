package com.whty.cms.tspm.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFHeader;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

public class ExcelUtil {
	
	/**
	 * 报表对象
	 */
	private HSSFWorkbook workBook;
	/**
	 * 表头样式
	 */
	private HSSFCellStyle headerStyle;
	/**
	 * 列表项样式
	 */
	private HSSFCellStyle rowStyle;
	
	/**
	 * 创建表格对象
	 * @param name 报表名称
	 * @param headers 表头
	 * @param dataRows 行数据
	 */
	public HSSFWorkbook createWorkbook(String name, String[] headers, List<String[]> dataRows){
		workBook = new HSSFWorkbook();
		headerStyle = createTitleStyle(workBook);
		rowStyle = createRowStyle(workBook);
		
		//设置标题
		HSSFSheet sheet = workBook.createSheet();
		workBook.setSheetName(0, name);
		HSSFHeader header = sheet.getHeader();
		header.setCenter(name);

		//设置列表头
		double height= 18*20;
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = null;
		for (int i = 0; i < headers.length; i++) {
			cell = row.createCell(i);
			row.setHeight((short)height);//设置行高
			cell.setCellStyle(headerStyle);
		    sheet.setColumnWidth(i, 9000);//设置列宽
		    cell.setCellValue(headers[i]);//设置表头名
		}
		
		for (int i = 0; i < dataRows.size(); i++) {
			String[] dataRow = dataRows.get(i);
			row = sheet.createRow(i + 1);
			row.setHeight((short)height);//设置行高
			for (int j = 0; j < dataRow.length; j++) {
				cell = row.createCell(j);
				cell.setCellStyle(rowStyle);
				cell.setCellValue(dataRow[j]);
				cell.setCellType(HSSFCell.CELL_TYPE_STRING);//设置表格数据类型
			}
		}
		return workBook;
	}
	
	/**
	 * 创建标题样式：居中、灰色背景、黑色边框、宋体加粗
	 * @param workBook
	 * @return
	 */
	public HSSFCellStyle createTitleStyle(HSSFWorkbook workBook){
		// 创建表头样式
		HSSFCellStyle headerStyle = workBook.createCellStyle();
		//创建字体
		HSSFFont headerFont = (HSSFFont) workBook.createFont(); 
		headerFont.setFontName("宋体");
		headerFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//加粗
		
		headerStyle.setFont(headerFont);
		headerStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 垂直居中
		headerStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);//水平居中
		headerStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND); // 填充单元格
		headerStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);//背景色
		// 设置表头边框样式
		headerStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
		headerStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		headerStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		headerStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
		// 设置表头边框颜色
		headerStyle.setTopBorderColor(HSSFColor.BLACK.index);
		headerStyle.setBottomBorderColor(HSSFColor.BLACK.index);
		headerStyle.setLeftBorderColor(HSSFColor.BLACK.index);
		headerStyle.setRightBorderColor(HSSFColor.BLACK.index);
		return headerStyle;
	}
	
	public HSSFCellStyle createRowStyle(HSSFWorkbook workBook){
		// 创建一个样式
		HSSFCellStyle rowStyle = workBook.createCellStyle();
		rowStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 垂直居中
		rowStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);//水平居中
		// 设置边框样式
		rowStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
		rowStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		rowStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		rowStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
		// 设置边框颜色
		rowStyle.setTopBorderColor(HSSFColor.BLACK.index);
		rowStyle.setBottomBorderColor(HSSFColor.BLACK.index);
		rowStyle.setLeftBorderColor(HSSFColor.BLACK.index);
		rowStyle.setRightBorderColor(HSSFColor.BLACK.index);
		return rowStyle;
	}

	public void export(HttpServletResponse response, String name) {
		// 导出
		response.reset();
		response.setContentType("application/msexcel;charset=UTF-8");
		OutputStream out = null;
		try {
			try {
				response.addHeader("Content-Disposition", "attachment;filename=\"" + new String((name + ".xls").getBytes("GBK"), "ISO8859_1") + "\"");
				out = response.getOutputStream();
				workBook.write(out);
				out.flush();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
