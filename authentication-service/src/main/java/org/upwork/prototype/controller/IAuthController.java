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

package org.upwork.prototype.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.upwork.prototype.authentication.JwtResponse;
import org.upwork.prototype.domain.dto.TokenBodyDTO;
import org.upwork.prototype.domain.dto.UserDTO;
import org.upwork.prototype.domain.response.ResponseWrapper;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Auth REST Controller
 *
 * @author prasadm
 * @since 14 June 2022
 */

@RequestMapping("/v1/auth")
public interface IAuthController {
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ResponseWrapper<JwtResponse>> login(HttpServletRequest request, @Valid @RequestBody UserDTO user);

    @PostMapping(value = "/validate", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ResponseWrapper<Authentication>> validate(@Valid @RequestBody TokenBodyDTO token);
}
