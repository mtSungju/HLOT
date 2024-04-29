package org.mt.mms.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.mt.mms.company.common.dto.Result;
import org.mt.mms.project.vo.ProjectVO;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectMapper {

    List<ProjectVO> getProjects() throws Exception;

    int newProject(ProjectVO data) throws Exception;

    ProjectVO one(String projectId) throws Exception;

    int updateProject(ProjectVO data) throws Exception;

    int deleteProject(ArrayList<String> deldata) throws Exception;
}
