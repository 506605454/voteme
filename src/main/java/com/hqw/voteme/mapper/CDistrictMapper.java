package com.hqw.voteme.mapper;

import com.hqw.voteme.domain.CDistrict;

public interface CDistrictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_district
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer districtId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_district
     *
     * @mbggenerated
     */
    int insert(CDistrict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_district
     *
     * @mbggenerated
     */
    int insertSelective(CDistrict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_district
     *
     * @mbggenerated
     */
    CDistrict selectByPrimaryKey(Integer districtId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_district
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CDistrict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_district
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CDistrict record);
}