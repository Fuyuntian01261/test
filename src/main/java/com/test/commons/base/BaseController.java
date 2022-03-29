package com.test.commons.base;

import com.github.pagehelper.PageHelper;
import com.test.commons.entity.AxiosResult;
import com.test.commons.utils.ServletUtil;

import java.util.List;

public class BaseController {
    private static final String PAGE_NUM="pageNum";//页码参数名
    private static final String PAGE_SIZE="pageSize";//页码参数名

    public void startPage(){
        Integer pageNum = ServletUtil.getParameter(PAGE_NUM, 1);
        Integer pageSize = ServletUtil.getParameter(PAGE_SIZE, 10);
        PageHelper.startPage(pageNum,pageSize);
    }

    public AxiosResult suc(){
        return AxiosResult.suc();
    }

    public AxiosResult suc(Object data){
        return AxiosResult.suc(data);
    }

    public AxiosResult tabledatas(List list){
        return  suc(new TableDatas(list));
    }
}
