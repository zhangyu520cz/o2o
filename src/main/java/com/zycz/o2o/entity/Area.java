package com.zycz.o2o.entity;

import java.util.Date;

import com.alibaba.fastjson.JSONObject;
/**
 * 区域类
 * @author yu.zhang
 * @date 2017年11月16日
 */
public class Area {
	// ID
	private Integer areaId;
	// 名称
	private String areaName;
	// 权重（用于排序）
	private Integer priority;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date lastEditTime;

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	@Override
	public String toString(){
		return JSONObject.toJSONString(this);
	}
}
