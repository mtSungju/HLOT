package org.mt.mms.company.service;

import org.mt.mms.company.vo.CompanyManagerVO;
import org.mt.mms.company.vo.CompanyVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {

    CompanyVO one(String id) throws Exception;

    List<CompanyVO> all() throws Exception;

    void newCompany(CompanyVO companyVO) throws Exception;

    void deleteCompany(String id) throws Exception;

    void newCompanyManager(CompanyManagerVO companyManagerVO) throws Exception;

    void deleteCompanyManager(String id) throws Exception;
}
