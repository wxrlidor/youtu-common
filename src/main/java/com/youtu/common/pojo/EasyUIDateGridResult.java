package com.youtu.common.pojo;

import java.util.List;

/**功能：返回商品列表,要返回一个EasyUIDateGrid支持的数据格式
 *@author:张晓芬
 *@date:2018年2月13日  下午10:47:58
**/
public class EasyUIDateGridResult {
	//定义分页参数，page，rows
	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	

}
