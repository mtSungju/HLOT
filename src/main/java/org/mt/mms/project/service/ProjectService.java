package org.mt.mms.project.service;

import org.mt.mms.company.common.dto.Result;
import org.mt.mms.project.vo.ProjectVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface ProjectService {
    // 프로젝트 조회
    List<ProjectVO> all() throws Exception;
    
    // 프로젝트 등록
    int newProject(ProjectVO data) throws Exception;
    
    // 프로젝트 상세조회
    ProjectVO one(String projectId) throws Exception;

    int updateProject(ProjectVO data) throws Exception;

    int deleteProject(ArrayList<String> deldata) throws Exception;
}
