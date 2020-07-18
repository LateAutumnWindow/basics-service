package com.yan.basics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yan.basics.pojo.BasicsDict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasicsDictMapper extends BaseMapper<BasicsDict> {

    List<BasicsDict> getDictByGroup(String typeGroup);

}
