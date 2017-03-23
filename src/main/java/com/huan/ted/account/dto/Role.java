package com.huan.ted.account.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.huan.ted.core.annotation.MultiLanguage;
import com.huan.ted.core.annotation.MultiLanguageField;
import com.huan.ted.mybatis.annotation.Condition;
import com.huan.ted.system.dto.BaseDTO;

/**
 * @author huanghuan
 */
@MultiLanguage
@Table(name = "sys_role_b")
public class Role extends BaseDTO {

    public static final String FIELD_ROLE_ID = "roleId";
    
    public static final String FIELD_ALL_ROLE_ID = "roleIds";

    @Id
    @Column
    @GeneratedValue(generator = GENERATOR_TYPE)
    private Long roleId;

    @Column
    private String roleCode;

    @Column
    @MultiLanguageField
    private String roleName;

    @Column
    @MultiLanguageField
    private String roleDescription;

    @Column
    @Condition(operator = ">=")
    private Date startActiveDate;

    @Column
    @Condition(operator = "<=")
    private Date endActiveDate;

    @Column
    private String enableFlag;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public static String getFIELD_ROLE_ID() {
        return FIELD_ROLE_ID;
    }

    public Date getStartActiveDate() {
        return startActiveDate;
    }

    public void setStartActiveDate(Date startActiveDate) {
        this.startActiveDate = startActiveDate;
    }

    public Date getEndActiveDate() {
        return endActiveDate;
    }

    public void setEndActiveDate(Date endActiveDate) {
        this.endActiveDate = endActiveDate;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }
}
