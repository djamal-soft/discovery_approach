package com.pfe.msDiscovery.service;

import com.pfe.msDiscovery.dto.query.MsQueryDto;

public interface IQueryService {

    MsQueryDto getMs(String keys, float version);
}
