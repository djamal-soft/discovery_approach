package com.pfe.msDiscovery.controllers;

import com.pfe.msDiscovery.dto.command.AddMsCommandDto;
import com.pfe.msDiscovery.dto.command.DeleteMsCommandDto;
import com.pfe.msDiscovery.dto.command.ReplaceMsCommandeDto;
import com.pfe.msDiscovery.service.ICommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MsCommandController {

    @Autowired
    private ICommandService commandService;

    @PostMapping(value = "register")
    @ResponseStatus(HttpStatus.CREATED)
    public void addMs(@RequestBody AddMsCommandDto microservice){

        commandService.addMs(microservice);
    }

    @DeleteMapping(value = "unregister/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMs(@PathVariable("id") int id){

        DeleteMsCommandDto deleteMsCommandDto = new DeleteMsCommandDto();
        deleteMsCommandDto.setId(id);

        commandService.deleteMs(deleteMsCommandDto);
    }

    @PutMapping(value = "replace")
    @ResponseStatus(HttpStatus.CREATED)
    public void replaceMs(@RequestBody ReplaceMsCommandeDto microservice){
        commandService.replaceMs(microservice);
    }
}
