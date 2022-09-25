package com.ck.chenkunet.springboot.mapper;

import com.ck.chenkunet.springboot.entity.Device;
import com.ck.chenkunet.springboot.entity.DeviceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeviceMapper extends BaseMapper<Device> {
    @Select("select * from lib_device")
    List<Device> selectAll();

    @Select("select * from lib_device where id = #{id}")
    Device selectOne();

    @Select({"<script>"
            + " SELECT a.id,a.owner,a.user,a.status,a.time,a.name ,a.model,b.name as type,c.phone ,c.name as s_name "
            + " FROM lib_device a  "
            + " left join lib_user_student c  "
            + " on a.user =c.id "
            + " left join lib_device_type b "
            + " on a.type = b.id "
            + "</script>"})
    List<DeviceInfo> selectAllDeviceInfo();
}
