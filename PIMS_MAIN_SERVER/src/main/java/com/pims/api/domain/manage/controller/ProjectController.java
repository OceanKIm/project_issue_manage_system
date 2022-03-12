package com.pims.api.domain.manage.controller;


import com.pims.api.cont.ResultCode;
import com.pims.api.domain.manage.controller.dto.ProjectCreateDto;
import com.pims.api.domain.manage.entity.Project;
import com.pims.api.domain.manage.service.ProjectService;
import com.pims.api.utils.ResponseUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * ProjectController
 * : 프로젝트 컨트롤러
 * 
 * @author hskim
 * @version 1.0.0
 * 작성일 2022-03-10
**/
@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("manage")
public class ProjectController {

    private final ResponseUtils responseUtils;

    private final ProjectService projectService;

    /**
     * Controller
     * : 프로젝트 생성 API
     *
     * @authLevel 1
     * @method  POST
     * @uriPath /manage/project
     *
     * @param   projectCreateDto 프로젝트 생성 DTO
     * @return  org.springframework.http.ResponseEntity<?>
     */
    @RequestMapping(value = "/project", method = RequestMethod.POST)
    public ResponseEntity<?> createProject(@RequestBody @Valid final ProjectCreateDto projectCreateDto) {

        // TODO 각종 유효성 체크

        // 프로젝트 생성
        if (!projectService.createProject(projectCreateDto)) {
            return responseUtils.getResponse(ResultCode.FAILURE);
        }
        return responseUtils.getSuccess(ResultCode.SUCCESS);
    }

    /**
     * Controller
     * : 프로젝트 리스트 조회 API
     *
     * @authLevel 1
     * @method  GET
     * @uriPath /manage/project
     *
     * @return  org.springframework.http.ResponseEntity<?>
     */
    @RequestMapping(value = "/project", method = RequestMethod.GET)
    public ResponseEntity<?> selectProjectInfoList() {
        List<Project> resultList = projectService.selectProjectInfoList();
        if (null == resultList) {
            return responseUtils.getResponse(ResultCode.NON_EXISTENT);
        }
        return responseUtils.getSuccess(resultList);
    }

    /**
     * Controller
     * : 프로젝트 단건 조회 API
     *
     * @authLevel 1
     * @method  GET
     * @uriPath /manage/project/{projectCd}
     *
     * @return  org.springframework.http.ResponseEntity<?>
     */
    @RequestMapping(value = "/project/{projectCd}", method = RequestMethod.GET)
    public ResponseEntity<?> selectProjectInfoDetail(@PathVariable("projectCd") String projectCd) {
        Project result = projectService.selectProjectInfoDetail(projectCd);
        return responseUtils.getSuccess(result);
    }

}