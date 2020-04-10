/**
 * Copyright (c) 2018-2019, Jie Li 李杰 (mqgnsds@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.momo.mapper.mapper.manual;

import com.momo.mapper.dataobject.DeptDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: DeptMapper
 * @Author: Jie Li
 * @Date 2019-11-15 14:37
 * @Description: 部门
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2019</p>
 **/
public interface DeptMapper {

    /**
     * 查询租户下面的所有部门
     * @param tenantId
     * @return
     */
    List<DeptDO> deptGetAll(@Param("tenantId") Long tenantId);

    int deleteByPrimaryKey(Long id);

    int insertSelective(DeptDO deptDO);

    DeptDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DeptDO deptDO);

}
