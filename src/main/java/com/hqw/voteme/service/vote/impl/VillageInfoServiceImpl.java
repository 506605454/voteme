package com.hqw.voteme.service.vote.impl;

import com.hqw.voteme.controller.domain.ViewVillageInfo;
import com.hqw.voteme.domain.VillageInfo;
import com.hqw.voteme.mapper.VillageInfoMapper;
import com.hqw.voteme.service.vote.VillageInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/11/27.
 */

@Service
public class VillageInfoServiceImpl implements VillageInfoService {

    @Autowired
    private VillageInfoMapper villageInfoMapper;

    @Override
    public ViewVillageInfo createVillageInfo(ViewVillageInfo viewVillageInfo) {

        if (viewVillageInfo == null){
            return null;
        }

        VillageInfo villageInfo = new VillageInfo();

        BeanUtils.copyProperties(viewVillageInfo,villageInfo);
        int result = villageInfoMapper.createVillageInfo(villageInfo);
        if (result != 0){
            BeanUtils.copyProperties(villageInfo,viewVillageInfo);
            return viewVillageInfo;
        }else {
            return null;
        }
    }
}
