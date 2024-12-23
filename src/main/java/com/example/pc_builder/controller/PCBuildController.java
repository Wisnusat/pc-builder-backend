package com.example.pc_builder.controller;

import com.example.pc_builder.models.PCBuild;
import com.example.pc_builder.models.PCBuildComponent;
import com.example.pc_builder.service.PCBuildComponentService;
import com.example.pc_builder.service.PCBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pc-builds")
public class PCBuildController {
    private final PCBuildService pcBuildService;

    @Autowired
    public PCBuildController(PCBuildService pcBuildService) {
        this.pcBuildService = pcBuildService;
    }

    @PostMapping
    public PCBuild createPCBuild(@RequestBody PCBuild pcBuild) {
        return pcBuildService.createPCBuild(pcBuild);
    }

    @GetMapping
    public List<PCBuild> getAllPCBuilds() {
        return pcBuildService.getAllPCBuilds();
    }

    @PutMapping("/{id}")
    public PCBuild updatePCBuild(@PathVariable Long id, @RequestBody PCBuild pcBuildDetails) {
        return pcBuildService.updatePCBuild(id, pcBuildDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePCBuild(@PathVariable Long id) {
        pcBuildService.deletePCBuild(id);
    }
}

