package org.mt.mms.company.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyManagerVO {

    private String companyManagerId;    // 업체 담당자 ID e
    private String companyId;           // 업체 ID
    private String companyManagerName;  // 업체담당자이름
    private String companyManagerTel;   // 업체담당자번호
    private String remark;              // 비고
    private String registUserName;      // 등록자
    private String registDate;          // 등록일자

}
