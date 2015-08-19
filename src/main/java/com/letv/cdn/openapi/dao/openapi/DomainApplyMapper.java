package com.letv.cdn.openapi.dao.openapi;

import com.letv.cdn.openapi.pojo.DomainApply;
import com.letv.cdn.openapi.pojo.DomainApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DomainApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    int countByExample(DomainApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    int deleteByExample(DomainApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    int insert(DomainApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    int insertSelective(DomainApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    List<DomainApply> selectByExample(DomainApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    DomainApply selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    int updateByExampleSelective(@Param("record") DomainApply record, @Param("example") DomainApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    int updateByExample(@Param("record") DomainApply record, @Param("example") DomainApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    int updateByPrimaryKeySelective(DomainApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain_apply
     *
     * @mbggenerated Fri Dec 12 16:51:49 CST 2014
     */
    int updateByPrimaryKey(DomainApply record);
}