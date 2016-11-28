package com.hqw.voteme.controller.vote;

import com.hqw.voteme.controller.common.AjaxResult;
import com.hqw.voteme.controller.domain.ViewVillageInfo;
import com.hqw.voteme.service.vote.impl.VillageInfoServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/11/27.
 */

@RestController
public class VillageCommitController {

    @Autowired
    private VillageInfoServiceImpl villageInfoService;

    private Logger logger = Logger.getLogger(VillageCommitController.class);

    @RequestMapping(value = "/village" ,method = RequestMethod.POST)
    public AjaxResult createVillage(@RequestBody ViewVillageInfo viewVillageInfo){

        logger.info("创建village");
        logger.info(viewVillageInfo.toString());
        if (viewVillageInfo == null){

            return new AjaxResult("error",null,"the viewVillageInfo is null");
        }

        ViewVillageInfo villageInfo = villageInfoService.createVillageInfo(viewVillageInfo);
        if (villageInfo == null){
            return new AjaxResult("error",null,"create villageInfo error");
        }
        return new AjaxResult("success",villageInfo,null);
    }

}
