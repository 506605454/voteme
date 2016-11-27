package com.hqw.voteme.controller.vote;

import com.hqw.voteme.controller.common.AjaxResult;
import com.hqw.voteme.controller.domain.ViewVote;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2016/11/27.
 */

@RestController
public class VoteCommitController {

    private Logger logger = Logger.getLogger(Logger.class);

    @ApiOperation(value="新增投票", notes="根据小区ID新增投票")
    @RequestMapping(value = "/votes",method = RequestMethod.POST)
    public AjaxResult createNewVote(@RequestBody ViewVote viewVote){
        logger.info("新增投票");
        logger.info(viewVote);
        if (viewVote == null){
            return new AjaxResult("error",null,"the viewVote is null");
        }
        return new AjaxResult("success",viewVote,null);
    }

}
