package com.hqw.voteme.mapper;

import com.hqw.voteme.domain.CCity;

public interface CCityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_city
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer cityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_city
     *
     * @mbggenerated
     */
    int insert(CCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_city
     *
     * @mbggenerated
     */
    int insertSelective(CCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_city
     *
     * @mbggenerated
     */
    CCity selectByPrimaryKey(Integer cityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_city
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_city
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CCity record);
}