package com.zeus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeus.dao.HostsMapper;
import com.zeus.dto.Pagination;
import com.zeus.model.Hosts;
import com.zeus.service.HostsService;

@Service
public class HostsServiceImpl implements HostsService {

	@Autowired
	HostsMapper hostsMapper;

	@Override
	public List<Hosts> listHosts(Pagination page) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (page != null && page.getFirstResult() != null && page.getRows() != null) {
			map.put("firstResult", page.getFirstResult());
			map.put("rows", page.getRows());
		}
		return hostsMapper.getHostsList(map);
	}

}
