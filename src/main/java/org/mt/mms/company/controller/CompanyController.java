package org.mt.mms.company.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mt.mms.company.common.dto.Result;
import org.mt.mms.company.service.CompanyService;
import org.mt.mms.company.vo.CompanyManagerVO;
import org.mt.mms.company.vo.CompanyVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    /* company 상세 조회 */
    @GetMapping("/company/{id}")
    public ResponseEntity<Result> one(@PathVariable String id) throws Exception {
            return ResponseEntity.ok()
                    .body(Result.resSuccess(companyService.one(id)));
    }

    /* company 목록 조회 */
    @GetMapping("/companys")
    public ResponseEntity<Result> all() throws Exception{
            return ResponseEntity.ok()
                    .body(Result.resSuccess(companyService.all()));
    }

    /* company 등록 */
    @PostMapping("/company")
    public ResponseEntity<Result> newCompany(@RequestBody CompanyVO companyVO) throws Exception {
        return ResponseEntity.ok()
                .body(Result.resSuccess(companyService.newCompany(companyVO)));
    }

    /* company 삭제 */
    @DeleteMapping("/company/{id}")
    public ResponseEntity<Result> deleteCompany(@PathVariable String id) throws Exception {
            return ResponseEntity.ok()
                    .body(Result.resSuccess(companyService.deleteCompany(id)));
    }

    /* company_manager 등록 */
    @PostMapping("/company/companyManager")
    public ResponseEntity<Result> newCompanyManager(@RequestBody CompanyManagerVO companyManagerVO) throws Exception {
        return ResponseEntity.ok()
                .body(Result.resSuccess(companyService.newCompanyManager(companyManagerVO)));
    }

    /* company_manager 삭제 */
    @DeleteMapping("/company/companyManager/{id}")
    public ResponseEntity<Result> deleteCompanyManager(@PathVariable String id) throws Exception {
        return ResponseEntity.ok()
                .body(Result.resSuccess(companyService.deleteCompanyManager(id)));
    }

}
