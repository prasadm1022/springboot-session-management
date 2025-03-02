/*
 * Copyright 2022 Prasad Madusanka Basnayaka
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.upwork.prototype.mapper;

import org.springframework.stereotype.Component;
import org.upwork.prototype.domain.dto.UserDTO;
import org.upwork.prototype.entity.OpUser;
import org.upwork.prototype.entity.OpUserRole;

/**
 * User Mapper
 *
 * @author prasadm
 * @since 14 June 2022
 */

@Component
public class UserMapper {
    public UserDTO toDto(OpUser opUser) {
        UserDTO user = new UserDTO();

        user.setId(opUser.getId());
        user.setName(opUser.getName());
        user.setUsername(opUser.getUsername());
        user.setEmail(opUser.getEmail());
        user.setPassword(opUser.getPassword());
        for (OpUserRole opUserRole : opUser.getOpUserRoles()) {
            user.getRoles().add(opUserRole.getOpRole().getName());
        }

        return user;
    }

    public OpUser toEntity(UserDTO user) {
        OpUser opUser = new OpUser();

        opUser.setId(user.getId());
        opUser.setName(user.getName());
        opUser.setUsername(user.getUsername());
        opUser.setEmail(user.getEmail());
        opUser.setPassword(user.getPassword());

        return opUser;
    }
}
