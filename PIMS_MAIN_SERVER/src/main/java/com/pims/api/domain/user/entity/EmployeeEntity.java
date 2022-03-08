package com.pims.api.domain.user.entity;

import com.pims.api.cont.Const;
import lombok.*;

import javax.persistence.*;

/**
 * EmployeeEntity
 * : employee_tb 테이블 entity
 *
 * @author hskim
 * @version 1.0.0
 * 작성일 2022-03-08
**/
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "employee_tb")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // TODO modify
    @Column(name = "emp_no", nullable = false)
    private Integer id;

    @Column(name = "emp_id", nullable = false, length = 45)
    private String empId;

    @Column(name = "emp_pwd", nullable = false, length = 200)
    private String empPwd;

    @Column(name = "emp_role", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Const.USER_ROLE role;

    @Column(name = "emp_nm", nullable = false, length = 10)
    private String empNm;

    @Column(name = "rank_cd", nullable = false)
    private String rankCd;

    @Column(name = "team_cd", nullable = false)
    private String teamCd;

    @Column(name = "emp_hp", length = 11)
    private String empHp;

    @Column(name = "is_developer", length = 2)
    private String isDeveloper;

    @Column(name = "dev_pos_cd")
    private String devPosCd;

    @Column(name = "dev_month")
    private Integer devMonth;

    @Column(name = "emp_st", nullable = false, length = 2)
    private String empSt;

    @Column(name = "reg_dt", nullable = false, length = 45)
    private String regDt;

    @Column(name = "mod_dt", nullable = false, length = 45)
    private String modDt;

}