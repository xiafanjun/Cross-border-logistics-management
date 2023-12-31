package com.neuedu.kjds.mapper;

import com.neuedu.kjds.pojo.BrdBrand;
import com.neuedu.kjds.pojo.BrdBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrdBrandMapper {
    long countByExample(BrdBrandExample example);

    int deleteByExample(BrdBrandExample example);

    int deleteByPrimaryKey(Integer brdId);

    int insert(BrdBrand record);

    int insertSelective(BrdBrand record);

    List<BrdBrand> selectByExample(BrdBrandExample example);

    BrdBrand selectByPrimaryKey(Integer brdId);

    int updateByExampleSelective(@Param("record") BrdBrand record, @Param("example") BrdBrandExample example);

    int updateByExample(@Param("record") BrdBrand record, @Param("example") BrdBrandExample example);

    int updateByPrimaryKeySelective(BrdBrand record);

    int updateByPrimaryKey(BrdBrand record);
}