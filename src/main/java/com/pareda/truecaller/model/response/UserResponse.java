package com.pareda.truecaller.model.response;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.pareda.truecaller.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    @JsonUnwrapped
    User user;
}
