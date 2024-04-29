package org.mt.mms.project.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;



@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProjectVO {


    private String projectId;
    private String projectName;
    private String projectStDate;
    private String projectEndDate;
    private String projectStatus;
    private String customer;
    private String remark;
    private String registUserName;
    private String registDate;



}
