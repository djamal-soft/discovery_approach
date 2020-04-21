package com.pfe.msDiscovery.service;


import com.pfe.msDiscovery.dto.command.AddMsCommandDto;
import com.pfe.msDiscovery.dto.command.DeleteMsCommandDto;
import com.pfe.msDiscovery.dto.command.ReplaceMsCommandeDto;

public interface ICommandService {

    void addMs(AddMsCommandDto addMs);
    void deleteMs(DeleteMsCommandDto deleteMs);
    void replaceMs(ReplaceMsCommandeDto replaceMs);
}
