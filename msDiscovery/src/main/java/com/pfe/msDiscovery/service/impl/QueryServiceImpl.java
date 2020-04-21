package com.pfe.msDiscovery.service.impl;

import com.pfe.msDiscovery.dto.query.MsQueryDto;
import com.pfe.msDiscovery.repository.MicroserviceRepository;
import com.pfe.msDiscovery.service.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;

public class QueryServiceImpl implements IQueryService {

    @Autowired
    private MicroserviceRepository mRepository;

    @Override
    public MsQueryDto getMs(String keys, float version) {
        return null;
    }
}
