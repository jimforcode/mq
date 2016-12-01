package com.zeus.service;

import java.util.List;

import com.zeus.dto.Pagination;
import com.zeus.model.Hosts;

public interface HostsService {
	public List<Hosts> listHosts(Pagination page);
}
