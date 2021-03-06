package com.letv.cdn.monitor.dao;

import com.letv.cdn.monitor.pojo.ClusterSettings;
import com.letv.cdn.monitor.pojo.ClusterSettingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClusterSettingsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    int countByExample(ClusterSettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    int deleteByExample(ClusterSettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    int insert(ClusterSettings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    int insertSelective(ClusterSettings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    List<ClusterSettings> selectByExample(ClusterSettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    ClusterSettings selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    int updateByExampleSelective(@Param("record") ClusterSettings record, @Param("example") ClusterSettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    int updateByExample(@Param("record") ClusterSettings record, @Param("example") ClusterSettingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    int updateByPrimaryKeySelective(ClusterSettings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cluster_settings
     *
     * @mbggenerated Mon Mar 09 14:17:23 CST 2015
     */
    int updateByPrimaryKey(ClusterSettings record);
}