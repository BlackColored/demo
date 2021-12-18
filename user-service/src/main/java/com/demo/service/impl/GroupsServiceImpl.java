package com.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.dao.GroupsMapper;
import com.demo.model.Groups;
import com.demo.service.GroupsService;
import org.springframework.stereotype.Service;

/**
 * @version: V1.0
 * @author: AIOps
 **/
@Service
public class GroupsServiceImpl extends ServiceImpl<GroupsMapper, Groups> implements GroupsService {
}
