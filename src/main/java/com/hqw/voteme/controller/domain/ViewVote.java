package com.hqw.voteme.controller.domain;

import com.hqw.voteme.domain.VoteContent;

import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 */
public class ViewVote extends VoteContent{
    List<ViewVoteOption> viewVoteOptions;

    public List<ViewVoteOption> getViewVoteOptions() {
        return viewVoteOptions;
    }

    public void setViewVoteOptions(List<ViewVoteOption> viewVoteOptions) {
        this.viewVoteOptions = viewVoteOptions;
    }
}
