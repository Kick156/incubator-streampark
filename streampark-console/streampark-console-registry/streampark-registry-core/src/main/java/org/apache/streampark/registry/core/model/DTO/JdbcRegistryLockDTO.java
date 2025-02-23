/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.streampark.registry.core.model.DTO;

import org.apache.streampark.registry.core.model.DO.JdbcRegistryLock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JdbcRegistryLockDTO {

    private Long id;
    private String lockKey;
    private String lockOwner;
    private Long clientId;
    private Date createTime;

    public static JdbcRegistryLockDTO fromJdbcRegistryLock(JdbcRegistryLock jdbcRegistryLock) {
        return JdbcRegistryLockDTO.builder()
            .id(jdbcRegistryLock.getId())
            .lockKey(jdbcRegistryLock.getLockKey())
            .lockOwner(jdbcRegistryLock.getLockOwner())
            .clientId(jdbcRegistryLock.getClientId())
            .createTime(jdbcRegistryLock.getCreateTime())
            .build();
    }

    public static JdbcRegistryLock toJdbcRegistryLock(JdbcRegistryLockDTO jdbcRegistryLock) {
        return JdbcRegistryLock.builder()
            .id(jdbcRegistryLock.getId())
            .lockKey(jdbcRegistryLock.getLockKey())
            .lockOwner(jdbcRegistryLock.getLockOwner())
            .clientId(jdbcRegistryLock.getClientId())
            .createTime(jdbcRegistryLock.getCreateTime())
            .build();
    }

}
