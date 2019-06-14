package com.niu.mapper;

import com.niu.entity.Institution;
import com.niu.service.InstitutionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by ami on 2019/6/14.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstitutionMapperTest {


    @Resource
    private InstitutionService institutionService;
    @Resource
    private InstitutionMapper institutionMapper;

    @Test
    public void count() throws Exception {
        System.out.println(institutionService);
        int c = institutionService.count();
        System.out.println(c);
    }

    @Test
    public void getById() throws Exception {
        Institution institution = institutionService.getById(1L);
        System.out.println(institution);
    }

    @Test
    public void test(){
        Institution institution = institutionMapper.aaa(2L);
        System.out.println(institution);
    }

}