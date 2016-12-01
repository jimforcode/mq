package com.zeus.dao;

import java.util.List;
import java.util.Map;

import com.zeus.model.Hosts;

public interface HostsMapper {
	int deleteByPrimaryKey(Long hostid);

	int insert(Hosts record);

	int insertSelective(Hosts record);

	Hosts selectByPrimaryKey(Long hostid);

	int updateByPrimaryKeySelective(Hosts record);

	int updateByPrimaryKeyWithBLOBs(Hosts record);

	int updateByPrimaryKey(Hosts record);

	List<Hosts> getHostsList(Map<String, Object> map);

}