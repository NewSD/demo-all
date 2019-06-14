package com.niu.controller;


import com.niu.entity.Institution;
import com.niu.mapper.InstitutionMapper;
import com.niu.service.InstitutionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ami on 2018/11/21.
 */
@RestController
@RequestMapping(value = "/inst")
public class InstitutionController {

    @Resource
    private InstitutionMapper institutionMapper;
    @Resource
    InstitutionService institutionService;

    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    @ResponseBody
    List<Institution> getAll(){
        return institutionMapper.selectAll();
    }

    @RequestMapping(value = "/getbyid",method = RequestMethod.GET)
    @ResponseBody
    Institution getById(){
        Institution institution = institutionService.getById(1L);
        return institution;
    }
    @RequestMapping(value = "/aaa",method = RequestMethod.GET)
    @ResponseBody
    public Institution aaa(){
        Institution institution = institutionMapper.aaa(2L);
        System.out.println(institution);
        return institution;
    }

    @RequestMapping(value = "/id",method = RequestMethod.GET)
    @ResponseBody
    Institution id(){

        Institution institution = new Institution() ;
        institution.setInstId(1L);
        return institutionMapper.selectByPrimaryKey(institution);
    }

}
