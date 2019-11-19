package com.bendouthwaite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/reference")
public class ReferenceController {

    @Autowired
    private ReferenceService referenceService;

    @RequestMapping(value = "/directories")
    public List<String> listDirectories() {
        return referenceService.getDirectories();
    }

    @RequestMapping(value = "/directory/{directoryName}")
    public String getDirectoryReference(@PathVariable("directoryName") String directoryName) {
        return referenceService.getDirectoryReference(directoryName);
    }

}
