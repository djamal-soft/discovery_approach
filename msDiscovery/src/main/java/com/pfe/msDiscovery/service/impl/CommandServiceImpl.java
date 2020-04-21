package com.pfe.msDiscovery.service.impl;

import com.pfe.msDiscovery.dto.command.AddMsCommandDto;
import com.pfe.msDiscovery.dto.command.DeleteMsCommandDto;
import com.pfe.msDiscovery.dto.command.ReplaceMsCommandeDto;
import com.pfe.msDiscovery.repository.MicroserviceRepository;
import com.pfe.msDiscovery.service.ICommandService;
import org.springframework.beans.factory.annotation.Autowired;

public class CommandServiceImpl implements ICommandService {

    @Autowired
    private MicroserviceRepository mRepository;


    @Override
    public void addMs(AddMsCommandDto addMs) {

    }

    @Override
    public void deleteMs(DeleteMsCommandDto deleteMs) {

    }

    @Override
    public void replaceMs(ReplaceMsCommandeDto replaceMs) {

    }
}
