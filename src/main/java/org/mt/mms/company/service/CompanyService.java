package org.mt.mms.company.service;

import org.mt.mms.company.vo.CompanyManagerVO;
import org.mt.mms.company.vo.CompanyVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {

    CompanyVO one(String id) throws Exception;

    List<CompanyVO> all() throws Exception;

    int newCompany(CompanyVO companyVO) throws Exception;

    int deleteCompany(String id) throws Exception;

    int newCompanyManager(CompanyManagerVO companyManagerVO) throws Exception;

    int deleteCompanyManager(String id) throws Exception;
}
