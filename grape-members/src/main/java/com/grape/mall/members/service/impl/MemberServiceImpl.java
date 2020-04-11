package com.grape.mall.members.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.grape.mall.members.model.Member;
import com.grape.mall.members.mapper.MemberMapper;
import com.grape.mall.members.service.MemberService;
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService{

}
