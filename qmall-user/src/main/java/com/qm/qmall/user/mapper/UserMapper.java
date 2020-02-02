package com.qm.qmall.user.mapper;


import com.qm.qmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> getAllUser();
}
