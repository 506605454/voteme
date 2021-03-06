package com.hqw.voteme.mapper;

import com.hqw.voteme.domain.VillageInfo;

public interface VillageInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table village_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table village_info
     *
     * @mbggenerated
     */
    int insert(VillageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table village_info
     *
     * @mbggenerated
     */
    int insertSelective(VillageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table village_info
     *
     * @mbggenerated
     */
    VillageInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table village_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(VillageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table village_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(VillageInfo record);

    int createVillageInfo(VillageInfo villageInfo);
}