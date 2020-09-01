package com.mcd.mapper;

import com.mcd.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from books")
    List<Books> selAll();

}
