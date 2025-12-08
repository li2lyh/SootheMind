package com.soothemind.mapper;


import com.soothemind.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
	List<UserVo> getUserList();
}
