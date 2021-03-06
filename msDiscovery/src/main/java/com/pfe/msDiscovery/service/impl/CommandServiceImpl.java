package com.pfe.msDiscovery.service.impl;

import com.pfe.msDiscovery.dto.command.AddMsCommandDto;
import com.pfe.msDiscovery.dto.command.DeleteMsCommandDto;
import com.pfe.msDiscovery.dto.command.ReplaceMsCommandeDto;
import com.pfe.msDiscovery.entity.Microservice;
import com.pfe.msDiscovery.exception.DuplicatedEntryException;
import com.pfe.msDiscovery.exception.NotFoundException;
import com.pfe.msDiscovery.repository.MicroserviceRepository;
import com.pfe.msDiscovery.service.ICommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandServiceImpl implements ICommandService {

    @Autowired
    private MicroserviceRepository mRepository;


    @Override
    public void addMs(AddMsCommandDto addMs) {

        Microservice microservice = new Microservice();
        microservice.setAddress(addMs.getAddress());
        microservice.setMkeys(addMs.getMkeys());
        microservice.setVersion(addMs.getVersion());

        mRepository.save(microservice);
    }

    @Override
    public void deleteMs(DeleteMsCommandDto deleteMs) {
        Microservice microservice = new Microservice();
        microservice.setId(deleteMs.getId());

        try {
            mRepository.save(microservice);
        }
        catch (Exception e) {
            throw new DuplicatedEntryException();
        }
    }

    @Override
    public void replaceMs(ReplaceMsCommandeDto replaceMs) {
        Microservice microservice = mRepository.findById(replaceMs.getId());
        if(microservice == null)
            throw  new NotFoundException();

        microservice.setAddress(replaceMs.getAddress());
        microservice.setMkeys(replaceMs.getMkeys());
        microservice.setVersion(replaceMs.getVersion());

        try {
            mRepository.save(microservice);
        }
        catch (Exception e) {
            throw new DuplicatedEntryException();
        }
    }
}
