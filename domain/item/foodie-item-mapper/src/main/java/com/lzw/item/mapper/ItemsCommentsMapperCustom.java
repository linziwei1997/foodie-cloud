package com.lzw.item.mapper;

import com.lzw.item.pojo.ItemsComments;
import com.lzw.item.pojo.vo.MyCommentVO;
import com.lzw.my.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ItemsCommentsMapperCustom extends MyMapper<ItemsComments> {

    public void saveComments(Map<String, Object> map);

    public List<MyCommentVO> queryMyComments(@Param("paramsMap") Map<String, Object> map);
}