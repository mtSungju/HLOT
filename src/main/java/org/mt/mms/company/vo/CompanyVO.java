package org.mt.mms.company.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyVO {

    private String companyId;           // 업체ID
    private String companyName;         // 업체명
    private String businessRegistNumb;  // 사업자등록번호
    private String companyTel;          // 업체번호
    private String remark;              // 비고
    private String registUserName;      // 등록자
    private String registDate;          // 등록일자

    private List<CompanyManagerVO> companyManagers;
}
