package ${basePackage}.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ${basePackage}.domain.entity.CrudDemoDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CrudDemoMapper extends BaseMapper<CrudDemoDO> {

}