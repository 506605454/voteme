package com.hqw.voteme.controller.vote;

import com.hqw.voteme.controller.common.AjaxResult;
import com.hqw.voteme.controller.domain.ViewVote;
import com.hqw.voteme.controller.domain.ViewVoteOption;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 */

@RestController
public class VoteQueryController {

    private Logger logger = Logger.getLogger(Logger.class);

    @ApiOperation(value="查询小区投票", notes="根据小区ID查询投票列表")
    @RequestMapping(value = "area/{id}/votes",method = RequestMethod.GET)
    public AjaxResult createNewVote(@PathVariable Integer id){
        logger.info("查询投票");
        logger.info(id);
        if (id == null){
            return new AjaxResult("error",null,"the id is null");
        }

        List<ViewVote> viewVoteList = new ArrayList<ViewVote>();
        List<ViewVoteOption> viewVoteOptions = new ArrayList<ViewVoteOption>();
        ViewVote viewVote = new ViewVote();
        ViewVoteOption viewVoteOption = new ViewVoteOption();
        viewVoteOptions.add(viewVoteOption);
        viewVote.setViewVoteOptions(viewVoteOptions);
        viewVoteList.add(viewVote);

        return new AjaxResult("success",viewVoteList,null);
    }

}
