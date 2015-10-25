package com.wandoujia.baobab.webapp.controller;

import com.wandoujia.baobab.constant.MachineRequestParameter;
import com.wandoujia.baobab.service.common.MachineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by niuli on 15-10-21.
 */
public class AdminController {
    private static final Logger LOG = LoggerFactory.getLogger(AdminController.class);

    @Resource
    private MachineService machineService;

    @RequestMapping("/api/v1/admin/update")
    public String getVideoBeanList(
            @RequestParam(value = MachineRequestParameter.VERSION,
                    required = false, defaultValue = "") String version,
            @RequestParam(value = MachineRequestParameter.MACHINE_ID,
                    required = false, defaultValue = "") String machineId) {

        //TODO: check param

        //TODO: update mysql where version management.

        return "result";
    }

}