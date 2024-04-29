package org.mt.mms.company.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mt.mms.company.common.dto.Result;
import org.mt.mms.company.service.CompanyService;
import org.mt.mms.company.vo.CompanyManagerVO;
import org.mt.mms.company.vo.CompanyVO;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<CompanyVO> one(@PathVariable String id){
        try{
            return ResponseEntity.ok()
                    .body(companyService.one(id));
        } catch(Exception e){
            log.info(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    /* company 목록 조회 */
    @GetMapping("/companys")
    public ResponseEntity<Result> all() {
        try{
            return ResponseEntity.ok()
                    .body(Result.resSuccess(companyService.all()));
        } catch(Exception e){
            return ResponseEntity.ok()
                    .body(Result.resError("무슨무슨 에러입니다."));
        }
    }

    /* company 등록 */
    @PostMapping("/company")
    public ResponseEntity<String> newCompany(@RequestBody CompanyVO companyVO) {
        try{
            companyService.newCompany(companyVO);
            return ResponseEntity.ok().body("");
        } catch(Exception e) {
            log.info(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    /* company 삭제 */
    @DeleteMapping("/company/{id}")
    public ResponseEntity<String> deleteCompany(@PathVariable String id) {
        try{
            companyService.deleteCompany(id);
            return ResponseEntity.ok().body("");
        } catch(Exception e) {
            log.info(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    /* company_manager 등록 */
    @PostMapping("/company/companyManager")
    public ResponseEntity<String> newCompanyManager(@RequestBody CompanyManagerVO companyManagerVO){
        try{
           companyService.newCompanyManager(companyManagerVO);
           return ResponseEntity.ok().body("");
        } catch(Exception e) {
            log.info(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    /* company_manager 삭제 */
    @DeleteMapping("/company/companyManager/{id}")
    public ResponseEntity<String> deleteCompanyManager(@PathVariable String id){
        try{
            companyService.deleteCompanyManager(id);
            return ResponseEntity.ok().body("");
        } catch(Exception e) {
            log.info(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
