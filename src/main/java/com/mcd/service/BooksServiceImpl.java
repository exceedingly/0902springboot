package com.mcd.service;

import com.mcd.mapper.UserMapper;
import com.mcd.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksServiceImpl implements BoosService{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<Books> selAll() {
        return userMapper.selAll();
    }
}
