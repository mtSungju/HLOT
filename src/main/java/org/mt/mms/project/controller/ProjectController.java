package org.mt.mms.project.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.mt.mms.company.common.dto.Result;
import org.mt.mms.project.service.ProjectService;

import org.mt.mms.project.vo.ProjectVO;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@Slf4j // log용도
@RequestMapping(value = "/api")
@RequiredArgsConstructor // autowired 대체자
public class ProjectController {


    private final ProjectService projectService;

    @GetMapping("/project")
    public ResponseEntity<Result> all() throws Exception{

     log.info("selectProjectList");
    log.info("test");
     /* 프로젝트 리스트 조회*/
     return ResponseEntity.ok()
             .body(Result.resSuccess(projectService.all()));

    }

    @PostMapping("/project")
    public ResponseEntity<Result> newProject(@RequestBody ProjectVO data) throws Exception{
        log.info("newProject-Controller");
        log.info(data.toString());
        
        // 프로젝트 Id
        String projectId = data.getProjectId();

        // 수정
        if(!projectId.isEmpty()){
            log.info("프로젝트 수정");
            return ResponseEntity.ok()
                    .body(Result.resSuccess(projectService.updateProject(data)));
        }else{
            /* 프로젝트 단건 등록*/
            return ResponseEntity.ok()
                    .body(Result.resSuccess(projectService.newProject(data)));
        }

    }

    @GetMapping("/project/{projectId}")
    public ResponseEntity<Result> one(@PathVariable String projectId) throws Exception{
        log.info("projectId ==>" + projectId);

        return ResponseEntity.ok()
                .body(Result.resSuccess(projectService.one(projectId)));
    }

    @PutMapping("/project")
    public void updateProject(@RequestBody ProjectVO data) throws Exception{
        log.info("update-project");
        log.info("info {}", data.toString());

        // 프로젝트 관리 수정
        projectService.updateProject(data);

    }

    @DeleteMapping("/project")
    public void deleteProject(@RequestBody ArrayList<String> deldata) throws Exception{
        log.info("delete-project");
        log.info("info {}", deldata.toString());


        projectService.deleteProject(deldata);
    }

}
