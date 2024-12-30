package com.example.pc_builder.service;

import com.example.pc_builder.models.PCBuild;
import com.example.pc_builder.repositories.PCBuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PCBuildService {

    @Autowired
    private PCBuildRepository pcBuildRepository;

    public PCBuild createPCBuild(PCBuild pcBuild) {
        return pcBuildRepository.save(pcBuild);
    }

    public List<PCBuild> getAllPCBuilds() {
        return pcBuildRepository.findAll();
    }

    public PCBuild getPCBuildById(Long id) {
        return pcBuildRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PC Build not found"));
    }

    public PCBuild updatePCBuild(Long id, PCBuild pcBuildDetails) {
        PCBuild pcBuild = getPCBuildById(id);
        pcBuild.setBuildName(pcBuildDetails.getBuildName());
        pcBuild.setTotalPrice(pcBuildDetails.getTotalPrice());
        return pcBuildRepository.save(pcBuild);
    }

    public void deletePCBuild(Long id) {
        pcBuildRepository.deleteById(id);
    }

    public List<PCBuild> getPCBuildByPrice(Double price) {
        return pcBuildRepository.findByTotalPrice(price);
    }
}
