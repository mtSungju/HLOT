package org.mt.mms.company.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.mt.mms.company.vo.CompanyManagerVO;
import org.mt.mms.company.vo.CompanyVO;

import java.util.List;

@Mapper
public interface CompanyMapper {

    CompanyVO selectCompany(String companyId) throws Exception;

    List<CompanyVO> selectCompanys() throws Exception;

    int insertCompany(CompanyVO companyVO) throws Exception;

    int updateCompany(CompanyVO companyVO) throws Exception;

    int deleteCompany(String id) throws Exception;

    List<CompanyManagerVO> selectCompanyManagers(String companyId) throws Exception;

    int insertCompanyManager(CompanyManagerVO companyManagerVO) throws Exception;

    int updateCompanyManager(CompanyManagerVO companyManagerVO) throws Exception;

    int deleteCompanyManager(String id) throws Exception;

    int deleteCompanyManagerAll(String id) throws Exception;
}
